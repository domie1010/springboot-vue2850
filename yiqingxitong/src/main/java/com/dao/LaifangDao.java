package com.dao;

import com.entity.LaifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LaifangView;

/**
 * 来访登记 Dao 接口
 *
 * @author 
 */
public interface LaifangDao extends BaseMapper<LaifangEntity> {

   List<LaifangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
