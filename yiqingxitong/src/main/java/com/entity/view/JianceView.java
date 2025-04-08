package com.entity.view;

import com.entity.JianceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 核酸检测
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiance")
public class JianceView extends JianceEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 检测结果的值
		*/
		private String jianceValue;



		//级联表 gongzuo
			/**
			* 工作人员编号
			*/
			private String gongzuoDanhaoNumber;
			/**
			* 工作人员姓名
			*/
			private String gongzuoName;
			/**
			* 工作人员手机号
			*/
			private String gongzuoPhone;
			/**
			* 工作人员身份证号
			*/
			private String gongzuoIdNumber;
			/**
			* 现住地址
			*/
			private String gongzuoAddress;
			/**
			* 工作人员照片
			*/
			private String gongzuoPhoto;
			/**
			* 职务
			*/
			private Integer zhiwuTypes;
				/**
				* 职务的值
				*/
				private String zhiwuValue;
			/**
			* 负责区域
			*/
			private String quyu;
			/**
			* 备注
			*/
			private String gongzuoContent;
			/**
			* 类型
			*/
			private Integer gongzuoTypes;
				/**
				* 类型的值
				*/
				private String gongzuoValue;

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

	public JianceView() {

	}

	public JianceView(JianceEntity jianceEntity) {
		try {
			BeanUtils.copyProperties(this, jianceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 检测结果的值
			*/
			public String getJianceValue() {
				return jianceValue;
			}
			/**
			* 设置： 检测结果的值
			*/
			public void setJianceValue(String jianceValue) {
				this.jianceValue = jianceValue;
			}

















				//级联表的get和set gongzuo
					/**
					* 获取： 工作人员编号
					*/
					public String getGongzuoDanhaoNumber() {
						return gongzuoDanhaoNumber;
					}
					/**
					* 设置： 工作人员编号
					*/
					public void setGongzuoDanhaoNumber(String gongzuoDanhaoNumber) {
						this.gongzuoDanhaoNumber = gongzuoDanhaoNumber;
					}
					/**
					* 获取： 工作人员姓名
					*/
					public String getGongzuoName() {
						return gongzuoName;
					}
					/**
					* 设置： 工作人员姓名
					*/
					public void setGongzuoName(String gongzuoName) {
						this.gongzuoName = gongzuoName;
					}
					/**
					* 获取： 工作人员手机号
					*/
					public String getGongzuoPhone() {
						return gongzuoPhone;
					}
					/**
					* 设置： 工作人员手机号
					*/
					public void setGongzuoPhone(String gongzuoPhone) {
						this.gongzuoPhone = gongzuoPhone;
					}
					/**
					* 获取： 工作人员身份证号
					*/
					public String getGongzuoIdNumber() {
						return gongzuoIdNumber;
					}
					/**
					* 设置： 工作人员身份证号
					*/
					public void setGongzuoIdNumber(String gongzuoIdNumber) {
						this.gongzuoIdNumber = gongzuoIdNumber;
					}
					/**
					* 获取： 现住地址
					*/
					public String getGongzuoAddress() {
						return gongzuoAddress;
					}
					/**
					* 设置： 现住地址
					*/
					public void setGongzuoAddress(String gongzuoAddress) {
						this.gongzuoAddress = gongzuoAddress;
					}
					/**
					* 获取： 工作人员照片
					*/
					public String getGongzuoPhoto() {
						return gongzuoPhoto;
					}
					/**
					* 设置： 工作人员照片
					*/
					public void setGongzuoPhoto(String gongzuoPhoto) {
						this.gongzuoPhoto = gongzuoPhoto;
					}
					/**
					* 获取： 职务
					*/
					public Integer getZhiwuTypes() {
						return zhiwuTypes;
					}
					/**
					* 设置： 职务
					*/
					public void setZhiwuTypes(Integer zhiwuTypes) {
						this.zhiwuTypes = zhiwuTypes;
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
					* 获取： 负责区域
					*/
					public String getQuyu() {
						return quyu;
					}
					/**
					* 设置： 负责区域
					*/
					public void setQuyu(String quyu) {
						this.quyu = quyu;
					}
					/**
					* 获取： 备注
					*/
					public String getGongzuoContent() {
						return gongzuoContent;
					}
					/**
					* 设置： 备注
					*/
					public void setGongzuoContent(String gongzuoContent) {
						this.gongzuoContent = gongzuoContent;
					}
					/**
					* 获取： 类型
					*/
					public Integer getGongzuoTypes() {
						return gongzuoTypes;
					}
					/**
					* 设置： 类型
					*/
					public void setGongzuoTypes(Integer gongzuoTypes) {
						this.gongzuoTypes = gongzuoTypes;
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
