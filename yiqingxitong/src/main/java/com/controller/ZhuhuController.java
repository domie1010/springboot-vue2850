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

import com.entity.ZhuhuEntity;

import com.service.ZhuhuService;
import com.entity.view.ZhuhuView;
import com.service.GongzuoService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 住户
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhuhu")
public class ZhuhuController {
    private static final Logger logger = LoggerFactory.getLogger(ZhuhuController.class);

    @Autowired
    private ZhuhuService zhuhuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
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
        PageUtils page = zhuhuService.queryPage(params);

        //字典表数据转换
        List<ZhuhuView> list =(List<ZhuhuView>)page.getList();
        for(ZhuhuView c:list){
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
        ZhuhuEntity zhuhu = zhuhuService.selectById(id);
        if(zhuhu !=null){
            //entity转view
            ZhuhuView view = new ZhuhuView();
            BeanUtils.copyProperties( zhuhu , view );//把实体数据重构到view中

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
    public R save(@RequestBody ZhuhuEntity zhuhu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhuhu:{}",this.getClass().getName(),zhuhu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        Wrapper<ZhuhuEntity> queryWrapper = new EntityWrapper<ZhuhuEntity>()
            .eq("username", zhuhu.getUsername())
            .or()
            .eq("zhuhu_phone", zhuhu.getZhuhuPhone())
            .or()
            .eq("zhuhu_id_number", zhuhu.getZhuhuIdNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhuhuEntity zhuhuEntity = zhuhuService.selectOne(queryWrapper);
        if(zhuhuEntity==null){
            zhuhu.setInsertTime(new Date());
            zhuhu.setCreateTime(new Date());
            zhuhu.setPassword("123456");
            zhuhuService.insert(zhuhu);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuhuEntity zhuhu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zhuhu:{}",this.getClass().getName(),zhuhu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<ZhuhuEntity> queryWrapper = new EntityWrapper<ZhuhuEntity>()
            .notIn("id",zhuhu.getId())
            .andNew()
            .eq("username", zhuhu.getUsername())
            .or()
            .eq("zhuhu_phone", zhuhu.getZhuhuPhone())
            .or()
            .eq("zhuhu_id_number", zhuhu.getZhuhuIdNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhuhuEntity zhuhuEntity = zhuhuService.selectOne(queryWrapper);
        if("".equals(zhuhu.getZhuhuPhoto()) || "null".equals(zhuhu.getZhuhuPhoto())){
                zhuhu.setZhuhuPhoto(null);
        }
        if(zhuhuEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      zhuhu.set
            //  }
            zhuhuService.updateById(zhuhu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        zhuhuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        ZhuhuEntity zhuhu = zhuhuService.selectOne(new EntityWrapper<ZhuhuEntity>().eq("username", username));
        if(zhuhu==null || !zhuhu.getPassword().equals(password))
            return R.error("账号或密码不正确");
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(yonghu.getRoleTypes());
        String token = tokenService.generateToken(zhuhu.getId(),username, "zhuhu", "住户");
        R r = R.ok();
        r.put("token", token);
        r.put("role","住户");
        r.put("username",zhuhu.getZhuhuName());
        r.put("tableName","zhuhu");
        r.put("userId",zhuhu.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody ZhuhuEntity zhuhu){
    //    	ValidatorUtils.validateEntity(user);
        if(zhuhuService.selectOne(new EntityWrapper<ZhuhuEntity>().eq("username", zhuhu.getUsername()).orNew().eq("zhuhu_phone",zhuhu.getZhuhuPhone()).orNew().eq("zhuhu_id_number",zhuhu.getZhuhuIdNumber())) !=null)
            return R.error("账户已存在或手机号或身份证号已经被使用");
        zhuhu.setCreateTime(new Date());
        zhuhuService.insert(zhuhu);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        ZhuhuEntity zhuhu = new ZhuhuEntity();
        zhuhu.setPassword("123456");
        zhuhu.setId(id);
        zhuhuService.updateById(zhuhu);
        return R.ok();
    }

    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrZhuhu(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        ZhuhuEntity zhuhu = zhuhuService.selectById(id);
        if(zhuhu !=null){
            //entity转view
            ZhuhuView view = new ZhuhuView();
            BeanUtils.copyProperties( zhuhu , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }






}

