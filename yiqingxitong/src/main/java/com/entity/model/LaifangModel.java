package com.entity.model;

import com.entity.LaifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 来访登记
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LaifangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 被访者
     */
    private Integer zhuhuId;


    /**
     * 姓名
     */
    private String laifangName;


    /**
     * 手机号
     */
    private String laifangPhone;


    /**
     * 身份证号
     */
    private String laifangIdNumber;


    /**
     * 体温
     */
    private Double tiwen;


    /**
     * 来访事由
     */
    private String laifangShiyou;


    /**
     * 备注
     */
    private String laifangContent;


    /**
     * 来访时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：被访者
	 */
    public Integer getZhuhuId() {
        return zhuhuId;
    }


    /**
	 * 设置：被访者
	 */
    public void setZhuhuId(Integer zhuhuId) {
        this.zhuhuId = zhuhuId;
    }
    /**
	 * 获取：姓名
	 */
    public String getLaifangName() {
        return laifangName;
    }


    /**
	 * 设置：姓名
	 */
    public void setLaifangName(String laifangName) {
        this.laifangName = laifangName;
    }
    /**
	 * 获取：手机号
	 */
    public String getLaifangPhone() {
        return laifangPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setLaifangPhone(String laifangPhone) {
        this.laifangPhone = laifangPhone;
    }
    /**
	 * 获取：身份证号
	 */
    public String getLaifangIdNumber() {
        return laifangIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setLaifangIdNumber(String laifangIdNumber) {
        this.laifangIdNumber = laifangIdNumber;
    }
    /**
	 * 获取：体温
	 */
    public Double getTiwen() {
        return tiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setTiwen(Double tiwen) {
        this.tiwen = tiwen;
    }
    /**
	 * 获取：来访事由
	 */
    public String getLaifangShiyou() {
        return laifangShiyou;
    }


    /**
	 * 设置：来访事由
	 */
    public void setLaifangShiyou(String laifangShiyou) {
        this.laifangShiyou = laifangShiyou;
    }
    /**
	 * 获取：备注
	 */
    public String getLaifangContent() {
        return laifangContent;
    }


    /**
	 * 设置：备注
	 */
    public void setLaifangContent(String laifangContent) {
        this.laifangContent = laifangContent;
    }
    /**
	 * 获取：来访时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：来访时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
