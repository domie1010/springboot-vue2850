package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangbaoEntity;
import java.util.Map;

/**
 * 疫情上报 服务类
 */
public interface ShangbaoService extends IService<ShangbaoEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

    Integer countTodayNumber();
}