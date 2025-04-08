package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.GeliDao;
import com.entity.GeliEntity;
import com.service.GeliService;
import com.entity.view.GeliView;

/**
 * 隔离监控 服务实现类
 */
@Service("geliService")
@Transactional
public class GeliServiceImpl extends ServiceImpl<GeliDao, GeliEntity> implements GeliService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<GeliView> page =new Query<GeliView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

    @Override
    public Integer countTodayNumber() {
        return baseMapper.countTodayNumber();
    }


}
