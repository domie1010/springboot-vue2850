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

import com.entity.GongzuoEntity;

import com.service.GongzuoService;
import com.entity.view.GongzuoView;
import com.service.ZhuhuService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 工作人员
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/gongzuo")
public class GongzuoController {
    private static final Logger logger = LoggerFactory.getLogger(GongzuoController.class);

    @Autowired
    private GongzuoService gongzuoService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
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
        PageUtils page = gongzuoService.queryPage(params);

        //字典表数据转换
        List<GongzuoView> list =(List<GongzuoView>)page.getList();
        for(GongzuoView c:list){
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
        GongzuoEntity gongzuo = gongzuoService.selectById(id);
        if(gongzuo !=null){
            //entity转view
            GongzuoView view = new GongzuoView();
            BeanUtils.copyProperties( gongzuo , view );//把实体数据重构到view中

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
    public R save(@RequestBody GongzuoEntity gongzuo, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,gongzuo:{}",this.getClass().getName(),gongzuo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        Wrapper<GongzuoEntity> queryWrapper = new EntityWrapper<GongzuoEntity>()
            .eq("username", gongzuo.getUsername())
            .or()
            .eq("gongzuo_phone", gongzuo.getGongzuoPhone())
            .or()
            .eq("gongzuo_id_number", gongzuo.getGongzuoIdNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GongzuoEntity gongzuoEntity = gongzuoService.selectOne(queryWrapper);
        if(gongzuoEntity==null){
            gongzuo.setCreateTime(new Date());
            gongzuo.setPassword("123456");
            gongzuoService.insert(gongzuo);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GongzuoEntity gongzuo, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,gongzuo:{}",this.getClass().getName(),gongzuo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<GongzuoEntity> queryWrapper = new EntityWrapper<GongzuoEntity>()
            .notIn("id",gongzuo.getId())
            .andNew()
            .eq("username", gongzuo.getUsername())
            .or()
            .eq("gongzuo_phone", gongzuo.getGongzuoPhone())
            .or()
            .eq("gongzuo_id_number", gongzuo.getGongzuoIdNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GongzuoEntity gongzuoEntity = gongzuoService.selectOne(queryWrapper);
        if("".equals(gongzuo.getGongzuoPhoto()) || "null".equals(gongzuo.getGongzuoPhoto())){
                gongzuo.setGongzuoPhoto(null);
        }
        if(gongzuoEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      gongzuo.set
            //  }
            gongzuoService.updateById(gongzuo);//根据id更新
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
        gongzuoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        GongzuoEntity gongzuo = gongzuoService.selectOne(new EntityWrapper<GongzuoEntity>().eq("username", username));
        if(gongzuo==null || !gongzuo.getPassword().equals(password))
            return R.error("账号或密码不正确");
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(yonghu.getRoleTypes());
        String token = tokenService.generateToken(gongzuo.getId(),username, "gongzuo", "工作人员");
        R r = R.ok();
        r.put("token", token);
        r.put("role","工作人员");
        r.put("username",gongzuo.getGongzuoName());
        r.put("tableName","gongzuo");
        r.put("userId",gongzuo.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody GongzuoEntity gongzuo){
    //    	ValidatorUtils.validateEntity(user);
        if(gongzuoService.selectOne(new EntityWrapper<GongzuoEntity>().eq("username", gongzuo.getUsername()).orNew().eq("gongzuo_phone",gongzuo.getGongzuoPhone()).orNew().eq("gongzuo_id_number",gongzuo.getGongzuoIdNumber())) !=null)
            return R.error("账户已存在或手机号或身份证号已经被使用");
        gongzuo.setCreateTime(new Date());
        gongzuoService.insert(gongzuo);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        GongzuoEntity gongzuo = new GongzuoEntity();
        gongzuo.setPassword("123456");
        gongzuo.setId(id);
        gongzuoService.updateById(gongzuo);
        return R.ok();
    }

    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrGongzuo(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        GongzuoEntity gongzuo = gongzuoService.selectById(id);
        if(gongzuo !=null){
            //entity转view
            GongzuoView view = new GongzuoView();
            BeanUtils.copyProperties( gongzuo , view );//把实体数据重构到view中

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

