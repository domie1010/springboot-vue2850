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

import com.entity.DengjiEntity;

import com.service.DengjiService;
import com.entity.view.DengjiView;
import com.service.ZhuhuService;
import com.entity.ZhuhuEntity;
import com.service.GongzuoService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 出入登记
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/dengji")
public class DengjiController {
    private static final Logger logger = LoggerFactory.getLogger(DengjiController.class);

    @Autowired
    private DengjiService dengjiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private ZhuhuService zhuhuService;
    @Autowired
    private GongzuoService gongzuoService;


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
        PageUtils page = dengjiService.queryPage(params);

        //字典表数据转换
        List<DengjiView> list =(List<DengjiView>)page.getList();
        for(DengjiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DengjiEntity dengji = dengjiService.selectById(id);
        if(dengji !=null){
            //entity转view
            DengjiView view = new DengjiView();
            BeanUtils.copyProperties( dengji , view );//把实体数据重构到view中

            //级联表
            ZhuhuEntity zhuhu = zhuhuService.selectById(dengji.getZhuhuId());
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
    public R save(@RequestBody DengjiEntity dengji, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,dengji:{}",this.getClass().getName(),dengji.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("住户".equals(role))
            dengji.setZhuhuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
//        Wrapper<DengjiEntity> queryWrapper = new EntityWrapper<DengjiEntity>()
//            .eq("zhuhu_id", dengji.getZhuhuId())
//            .eq("dengji_types", dengji.getDengjiTypes())
//            .eq("tiwen", dengji.getTiwen())
//            .eq("lai_address", dengji.getLaiAddress())
//            .eq("qu_address", dengji.getQuAddress())
//            ;
//        logger.info("sql语句:"+queryWrapper.getSqlSegment());
//        DengjiEntity dengjiEntity = dengjiService.selectOne(queryWrapper);
//        if(dengjiEntity==null){
            dengji.setInsertTime(new Date());
            dengji.setCreateTime(new Date());
            dengjiService.insert(dengji);
            return R.ok();
//        }else {
//            return R.error(511,"表中有相同数据");
//        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DengjiEntity dengji, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,dengji:{}",this.getClass().getName(),dengji.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("住户".equals(role))
            dengji.setZhuhuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
//        //根据字段查询是否有相同数据
//        Wrapper<DengjiEntity> queryWrapper = new EntityWrapper<DengjiEntity>()
//            .notIn("id",dengji.getId())
//            .andNew()
//            .eq("zhuhu_id", dengji.getZhuhuId())
//            .eq("dengji_types", dengji.getDengjiTypes())
//            .eq("tiwen", dengji.getTiwen())
//            .eq("lai_address", dengji.getLaiAddress())
//            .eq("qu_address", dengji.getQuAddress())
//            ;
//        logger.info("sql语句:"+queryWrapper.getSqlSegment());
//        DengjiEntity dengjiEntity = dengjiService.selectOne(queryWrapper);
//        if(dengjiEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      dengji.set
            //  }
            dengjiService.updateById(dengji);//根据id更新
            return R.ok();
//        }else {
//            return R.error(511,"表中有相同数据");
//        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        dengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

