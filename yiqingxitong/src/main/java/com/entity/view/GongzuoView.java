package com.entity.view;

import com.entity.GongzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 工作人员
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongzuo")
public class GongzuoView extends GongzuoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 职务的值
		*/
		private String zhiwuValue;
		/**
		* 类型的值
		*/
		private String gongzuoValue;



	public GongzuoView() {

	}

	public GongzuoView(GongzuoEntity gongzuoEntity) {
		try {
			BeanUtils.copyProperties(this, gongzuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 职务的值
			*/
			public String getZhiwuValue() {
				return zhiwuValue;
			}
			/**
			* 设置： 职务的值
			*/
			public void setZhiwuValue(String zhiwuValue) {
				this.zhiwuValue = zhiwuValue;
			}
			/**
			* 获取： 类型的值
			*/
			public String getGongzuoValue() {
				return gongzuoValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setGongzuoValue(String gongzuoValue) {
				this.gongzuoValue = gongzuoValue;
			}












}
