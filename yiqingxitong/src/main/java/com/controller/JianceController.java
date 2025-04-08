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

import com.entity.JianceEntity;

import com.service.JianceService;
import com.entity.view.JianceView;
import com.service.GongzuoService;
import com.entity.GongzuoEntity;
import com.service.ZhuhuService;
import com.entity.ZhuhuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 核酸检测
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jiance")
public class JianceController {
    private static final Logger logger = LoggerFactory.getLogger(JianceController.class);

    @Autowired
    private JianceService jianceService;


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
        PageUtils page = jianceService.queryPage(params);

        //字典表数据转换
        List<JianceView> list =(List<JianceView>)page.getList();
        for(JianceView c:list){
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
        JianceEntity jiance = jianceService.selectById(id);
        if(jiance !=null){
            //entity转view
            JianceView view = new JianceView();
            BeanUtils.copyProperties( jiance , view );//把实体数据重构到view中

            //级联表
            GongzuoEntity gongzuo = gongzuoService.selectById(jiance.getGongzuoId());
            if(gongzuo != null){
                BeanUtils.copyProperties( gongzuo , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setGongzuoId(gongzuo.getId());
            }
            //级联表
            ZhuhuEntity zhuhu = zhuhuService.selectById(jiance.getZhuhuId());
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
    public R save(@RequestBody JianceEntity jiance, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiance:{}",this.getClass().getName(),jiance.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("住户".equals(role))
            jiance.setZhuhuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("工作人员".equals(role))
            jiance.setGongzuoId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
//        Wrapper<JianceEntity> queryWrapper = new EntityWrapper<JianceEntity>()
//            .eq("zhuhu_id", jiance.getZhuhuId())
//            .eq("gongzuo_id", jiance.getGongzuoId())
//            .eq("jiance_types", jiance.getJianceTypes())
//            ;
//        logger.info("sql语句:"+queryWrapper.getSqlSegment());
//        JianceEntity jianceEntity = jianceService.selectOne(queryWrapper);
//        if(jianceEntity==null){
            jiance.setInsertTime(new Date());
            jiance.setCreateTime(new Date());
            jianceService.insert(jiance);
            return R.ok();
//        }else {
//            return R.error(511,"表中有相同数据");
//        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JianceEntity jiance, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jiance:{}",this.getClass().getName(),jiance.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("住户".equals(role))
            jiance.setZhuhuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("工作人员".equals(role))
            jiance.setGongzuoId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
//        Wrapper<JianceEntity> queryWrapper = new EntityWrapper<JianceEntity>()
//            .notIn("id",jiance.getId())
//            .andNew()
//            .eq("zhuhu_id", jiance.getZhuhuId())
//            .eq("gongzuo_id", jiance.getGongzuoId())
//            .eq("jiance_types", jiance.getJianceTypes())
//            ;
//        logger.info("sql语句:"+queryWrapper.getSqlSegment());
//        JianceEntity jianceEntity = jianceService.selectOne(queryWrapper);
//        if(jianceEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      jiance.set
            //  }
            jianceService.updateById(jiance);//根据id更新
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
        jianceService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

