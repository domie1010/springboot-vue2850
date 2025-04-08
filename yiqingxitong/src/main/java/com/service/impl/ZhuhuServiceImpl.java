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

import com.dao.ZhuhuDao;
import com.entity.ZhuhuEntity;
import com.service.ZhuhuService;
import com.entity.view.ZhuhuView;

/**
 * 住户 服务实现类
 */
@Service("zhuhuService")
@Transactional
public class ZhuhuServiceImpl extends ServiceImpl<ZhuhuDao, ZhuhuEntity> implements ZhuhuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZhuhuView> page =new Query<ZhuhuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
