package com.entity.model;

import com.entity.GeliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 隔离监控
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GeliModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 住户
     */
    private Integer zhuhuId;


    /**
     * 工作人员
     */
    private Integer gongzuoId;


    /**
     * 隔离开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date geliStartTime;


    /**
     * 隔离结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date geliEndTime;


    /**
     * 隔离地点
     */
    private String geliAddress;


    /**
     * 身体状况
     */
    private Integer shentiTypes;


    /**
     * 备注
     */
    private String geliContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：住户
	 */
    public Integer getZhuhuId() {
        return zhuhuId;
    }


    /**
	 * 设置：住户
	 */
    public void setZhuhuId(Integer zhuhuId) {
        this.zhuhuId = zhuhuId;
    }
    /**
	 * 获取：工作人员
	 */
    public Integer getGongzuoId() {
        return gongzuoId;
    }


    /**
	 * 设置：工作人员
	 */
    public void setGongzuoId(Integer gongzuoId) {
        this.gongzuoId = gongzuoId;
    }
    /**
	 * 获取：隔离开始时间
	 */
    public Date getGeliStartTime() {
        return geliStartTime;
    }


    /**
	 * 设置：隔离开始时间
	 */
    public void setGeliStartTime(Date geliStartTime) {
        this.geliStartTime = geliStartTime;
    }
    /**
	 * 获取：隔离结束时间
	 */
    public Date getGeliEndTime() {
        return geliEndTime;
    }


    /**
	 * 设置：隔离结束时间
	 */
    public void setGeliEndTime(Date geliEndTime) {
        this.geliEndTime = geliEndTime;
    }
    /**
	 * 获取：隔离地点
	 */
    public String getGeliAddress() {
        return geliAddress;
    }


    /**
	 * 设置：隔离地点
	 */
    public void setGeliAddress(String geliAddress) {
        this.geliAddress = geliAddress;
    }
    /**
	 * 获取：身体状况
	 */
    public Integer getShentiTypes() {
        return shentiTypes;
    }


    /**
	 * 设置：身体状况
	 */
    public void setShentiTypes(Integer shentiTypes) {
        this.shentiTypes = shentiTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getGeliContent() {
        return geliContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGeliContent(String geliContent) {
        this.geliContent = geliContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
