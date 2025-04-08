package com.entity.view;

import com.entity.LaifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 来访登记
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("laifang")
public class LaifangView extends LaifangEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 zhuhu
			/**
			* 住户编号
			*/
			private String zhuhuDanhaoNumber;
			/**
			* 住户姓名
			*/
			private String zhuhuName;
			/**
			* 住户手机号
			*/
			private String zhuhuPhone;
			/**
			* 住户身份证号
			*/
			private String zhuhuIdNumber;
			/**
			* 现住地址
			*/
			private String zhuhuAddress;
			/**
			* 住户照片
			*/
			private String zhuhuPhoto;
			/**
			* 年龄
			*/
			private Integer zhuhuAge;
			/**
			* 是否注射疫苗
			*/
			private Integer zhuhuYimiaoTypes;
				/**
				* 是否注射疫苗的值
				*/
				private String zhuhuYimiaoValue;
			/**
			* 来源地
			*/
			private String zhuhuLaiyuandi;
			/**
			* 是否有7日内核酸证明
			*/
			private Integer zhuhuHesuanTypes;
				/**
				* 是否有7日内核酸证明的值
				*/
				private String zhuhuHesuanValue;
			/**
			* 行程轨迹
			*/
			private String zhuhuXingcheng;
			/**
			* 备注
			*/
			private String zhuhuContent;
			/**
			* 类型
			*/
			private Integer zhuhuTypes;
				/**
				* 类型的值
				*/
				private String zhuhuValue;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 入住时间
			*/
			private Date zhuhuTime;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 统计时间
			*/
			private Date insertTime;

	public LaifangView() {

	}

	public LaifangView(LaifangEntity laifangEntity) {
		try {
			BeanUtils.copyProperties(this, laifangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}























				//级联表的get和set zhuhu
					/**
					* 获取： 住户编号
					*/
					public String getZhuhuDanhaoNumber() {
						return zhuhuDanhaoNumber;
					}
					/**
					* 设置： 住户编号
					*/
					public void setZhuhuDanhaoNumber(String zhuhuDanhaoNumber) {
						this.zhuhuDanhaoNumber = zhuhuDanhaoNumber;
					}
					/**
					* 获取： 住户姓名
					*/
					public String getZhuhuName() {
						return zhuhuName;
					}
					/**
					* 设置： 住户姓名
					*/
					public void setZhuhuName(String zhuhuName) {
						this.zhuhuName = zhuhuName;
					}
					/**
					* 获取： 住户手机号
					*/
					public String getZhuhuPhone() {
						return zhuhuPhone;
					}
					/**
					* 设置： 住户手机号
					*/
					public void setZhuhuPhone(String zhuhuPhone) {
						this.zhuhuPhone = zhuhuPhone;
					}
					/**
					* 获取： 住户身份证号
					*/
					public String getZhuhuIdNumber() {
						return zhuhuIdNumber;
					}
					/**
					* 设置： 住户身份证号
					*/
					public void setZhuhuIdNumber(String zhuhuIdNumber) {
						this.zhuhuIdNumber = zhuhuIdNumber;
					}
					/**
					* 获取： 现住地址
					*/
					public String getZhuhuAddress() {
						return zhuhuAddress;
					}
					/**
					* 设置： 现住地址
					*/
					public void setZhuhuAddress(String zhuhuAddress) {
						this.zhuhuAddress = zhuhuAddress;
					}
					/**
					* 获取： 住户照片
					*/
					public String getZhuhuPhoto() {
						return zhuhuPhoto;
					}
					/**
					* 设置： 住户照片
					*/
					public void setZhuhuPhoto(String zhuhuPhoto) {
						this.zhuhuPhoto = zhuhuPhoto;
					}
					/**
					* 获取： 年龄
					*/
					public Integer getZhuhuAge() {
						return zhuhuAge;
					}
					/**
					* 设置： 年龄
					*/
					public void setZhuhuAge(Integer zhuhuAge) {
						this.zhuhuAge = zhuhuAge;
					}
					/**
					* 获取： 是否注射疫苗
					*/
					public Integer getZhuhuYimiaoTypes() {
						return zhuhuYimiaoTypes;
					}
					/**
					* 设置： 是否注射疫苗
					*/
					public void setZhuhuYimiaoTypes(Integer zhuhuYimiaoTypes) {
						this.zhuhuYimiaoTypes = zhuhuYimiaoTypes;
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
					* 获取： 来源地
					*/
					public String getZhuhuLaiyuandi() {
						return zhuhuLaiyuandi;
					}
					/**
					* 设置： 来源地
					*/
					public void setZhuhuLaiyuandi(String zhuhuLaiyuandi) {
						this.zhuhuLaiyuandi = zhuhuLaiyuandi;
					}
					/**
					* 获取： 是否有7日内核酸证明
					*/
					public Integer getZhuhuHesuanTypes() {
						return zhuhuHesuanTypes;
					}
					/**
					* 设置： 是否有7日内核酸证明
					*/
					public void setZhuhuHesuanTypes(Integer zhuhuHesuanTypes) {
						this.zhuhuHesuanTypes = zhuhuHesuanTypes;
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
					* 获取： 行程轨迹
					*/
					public String getZhuhuXingcheng() {
						return zhuhuXingcheng;
					}
					/**
					* 设置： 行程轨迹
					*/
					public void setZhuhuXingcheng(String zhuhuXingcheng) {
						this.zhuhuXingcheng = zhuhuXingcheng;
					}
					/**
					* 获取： 备注
					*/
					public String getZhuhuContent() {
						return zhuhuContent;
					}
					/**
					* 设置： 备注
					*/
					public void setZhuhuContent(String zhuhuContent) {
						this.zhuhuContent = zhuhuContent;
					}
					/**
					* 获取： 类型
					*/
					public Integer getZhuhuTypes() {
						return zhuhuTypes;
					}
					/**
					* 设置： 类型
					*/
					public void setZhuhuTypes(Integer zhuhuTypes) {
						this.zhuhuTypes = zhuhuTypes;
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
					/**
					* 获取： 入住时间
					*/
					public Date getZhuhuTime() {
						return zhuhuTime;
					}
					/**
					* 设置： 入住时间
					*/
					public void setZhuhuTime(Date zhuhuTime) {
						this.zhuhuTime = zhuhuTime;
					}
					/**
					* 获取： 统计时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 统计时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}


}
