package com.dao;

import com.entity.DengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DengjiView;

/**
 * 出入登记 Dao 接口
 *
 * @author 
 */
public interface DengjiDao extends BaseMapper<DengjiEntity> {

   List<DengjiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
