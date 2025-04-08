package com.dao;

import com.entity.ZhuhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuhuView;

/**
 * 住户 Dao 接口
 *
 * @author 
 */
public interface ZhuhuDao extends BaseMapper<ZhuhuEntity> {

   List<ZhuhuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
