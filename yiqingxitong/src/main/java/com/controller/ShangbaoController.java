package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShangbaoEntity;

import com.service.ShangbaoService;
import com.entity.view.ShangbaoView;
import com.service.GongzuoService;
import com.entity.GongzuoEntity;
import com.service.ZhuhuService;
import com.entity.ZhuhuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 疫情上报
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shangbao")
public class ShangbaoController {
    private static final Logger logger = LoggerFactory.getLogger(ShangbaoController.class);

    @Autowired
    private ShangbaoService shangbaoService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private GongzuoService gongzuoService;
    @Autowired
    private ZhuhuService zhuhuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("住户".equals(role))
            params.put("zhuhuId",request.getSession().getAttribute("userId"));
        else if("工作人员".equals(role))
            params.put("gongzuoId",request.getSession().getAttribute("userId"));
        params.put("orderBy","id");
        PageUtils page = shangbaoService.queryPage(params);

        //字典表数据转换
        List<ShangbaoView> list =(List<ShangbaoView>)page.getList();
        for(ShangbaoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        R ok = R.ok();
        ok.put("data", page);
        Integer countTodayNumber = shangbaoService.countTodayNumber();
        if(countTodayNumber != null){
            ok.put("countTodayNumber",countTodayNumber);
        }

        return ok;
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShangbaoEntity shangbao = shangbaoService.selectById(id);
        if(shangbao !=null){
            //entity转view
            ShangbaoView view = new ShangbaoView();
            BeanUtils.copyProperties( shangbao , view );//把实体数据重构到view中

            //级联表
            GongzuoEntity gongzuo = gongzuoService.selectById(shangbao.getGongzuoId());
            if(gongzuo != null){
                BeanUtils.copyProperties( gongzuo , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setGongzuoId(gongzuo.getId());
            }
            //级联表
            ZhuhuEntity zhuhu = zhuhuService.selectById(shangbao.getZhuhuId());
            if(zhuhu != null){
                BeanUtils.copyProperties( zhuhu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setZhuhuId(zhuhu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShangbaoEntity shangbao, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shangbao:{}",this.getClass().getName(),shangbao.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("住户".equals(role))
            shangbao.setZhuhuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("工作人员".equals(role))
            shangbao.setGongzuoId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        Wrapper<ShangbaoEntity> queryWrapper = new EntityWrapper<ShangbaoEntity>()
            .eq("zhuhu_id", shangbao.getZhuhuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangbaoEntity shangbaoEntity = shangbaoService.selectOne(queryWrapper);
        if(shangbaoEntity==null){
            shangbao.setInsertTime(new Date());
            shangbao.setCreateTime(new Date());
            shangbaoService.insert(shangbao);
            return R.ok();
        }else {
            return R.error(511,"该人员已经上报过");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShangbaoEntity shangbao, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shangbao:{}",this.getClass().getName(),shangbao.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("住户".equals(role))
            shangbao.setZhuhuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("工作人员".equals(role))
            shangbao.setGongzuoId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ShangbaoEntity> queryWrapper = new EntityWrapper<ShangbaoEntity>()
            .notIn("id",shangbao.getId())
            .andNew()
            .eq("zhuhu_id", shangbao.getZhuhuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangbaoEntity shangbaoEntity = shangbaoService.selectOne(queryWrapper);
        if(shangbaoEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      shangbao.set
            //  }
            shangbaoService.updateById(shangbao);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"该人员已经上报过");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shangbaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

