package com.entity.view;

import com.entity.ZhuhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 住户
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhuhu")
public class ZhuhuView extends ZhuhuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 是否注射疫苗的值
		*/
		private String zhuhuYimiaoValue;
		/**
		* 是否有7日内核酸证明的值
		*/
		private String zhuhuHesuanValue;
		/**
		* 类型的值
		*/
		private String zhuhuValue;



	public ZhuhuView() {

	}

	public ZhuhuView(ZhuhuEntity zhuhuEntity) {
		try {
			BeanUtils.copyProperties(this, zhuhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 是否注射疫苗的值
			*/
			public String getZhuhuYimiaoValue() {
				return zhuhuYimiaoValue;
			}
			/**
			* 设置： 是否注射疫苗的值
			*/
			public void setZhuhuYimiaoValue(String zhuhuYimiaoValue) {
				this.zhuhuYimiaoValue = zhuhuYimiaoValue;
			}
			/**
			* 获取： 是否有7日内核酸证明的值
			*/
			public String getZhuhuHesuanValue() {
				return zhuhuHesuanValue;
			}
			/**
			* 设置： 是否有7日内核酸证明的值
			*/
			public void setZhuhuHesuanValue(String zhuhuHesuanValue) {
				this.zhuhuHesuanValue = zhuhuHesuanValue;
			}
			/**
			* 获取： 类型的值
			*/
			public String getZhuhuValue() {
				return zhuhuValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setZhuhuValue(String zhuhuValue) {
				this.zhuhuValue = zhuhuValue;
			}












}
