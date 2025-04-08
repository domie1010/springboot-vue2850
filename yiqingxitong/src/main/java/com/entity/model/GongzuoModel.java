package com.entity.model;

import com.entity.GongzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作人员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：工作人员编号
	 */
    public String getGongzuoDanhaoNumber() {
        return gongzuoDanhaoNumber;
    }


    /**
	 * 设置：工作人员编号
	 */
    public void setGongzuoDanhaoNumber(String gongzuoDanhaoNumber) {
        this.gongzuoDanhaoNumber = gongzuoDanhaoNumber;
    }
    /**
	 * 获取：工作人员姓名
	 */
    public String getGongzuoName() {
        return gongzuoName;
    }


    /**
	 * 设置：工作人员姓名
	 */
    public void setGongzuoName(String gongzuoName) {
        this.gongzuoName = gongzuoName;
    }
    /**
	 * 获取：工作人员手机号
	 */
    public String getGongzuoPhone() {
        return gongzuoPhone;
    }


    /**
	 * 设置：工作人员手机号
	 */
    public void setGongzuoPhone(String gongzuoPhone) {
        this.gongzuoPhone = gongzuoPhone;
    }
    /**
	 * 获取：工作人员身份证号
	 */
    public String getGongzuoIdNumber() {
        return gongzuoIdNumber;
    }


    /**
	 * 设置：工作人员身份证号
	 */
    public void setGongzuoIdNumber(String gongzuoIdNumber) {
        this.gongzuoIdNumber = gongzuoIdNumber;
    }
    /**
	 * 获取：现住地址
	 */
    public String getGongzuoAddress() {
        return gongzuoAddress;
    }


    /**
	 * 设置：现住地址
	 */
    public void setGongzuoAddress(String gongzuoAddress) {
        this.gongzuoAddress = gongzuoAddress;
    }
    /**
	 * 获取：工作人员照片
	 */
    public String getGongzuoPhoto() {
        return gongzuoPhoto;
    }


    /**
	 * 设置：工作人员照片
	 */
    public void setGongzuoPhoto(String gongzuoPhoto) {
        this.gongzuoPhoto = gongzuoPhoto;
    }
    /**
	 * 获取：职务
	 */
    public Integer getZhiwuTypes() {
        return zhiwuTypes;
    }


    /**
	 * 设置：职务
	 */
    public void setZhiwuTypes(Integer zhiwuTypes) {
        this.zhiwuTypes = zhiwuTypes;
    }
    /**
	 * 获取：负责区域
	 */
    public String getQuyu() {
        return quyu;
    }


    /**
	 * 设置：负责区域
	 */
    public void setQuyu(String quyu) {
        this.quyu = quyu;
    }
    /**
	 * 获取：备注
	 */
    public String getGongzuoContent() {
        return gongzuoContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGongzuoContent(String gongzuoContent) {
        this.gongzuoContent = gongzuoContent;
    }
    /**
	 * 获取：类型
	 */
    public Integer getGongzuoTypes() {
        return gongzuoTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setGongzuoTypes(Integer gongzuoTypes) {
        this.gongzuoTypes = gongzuoTypes;
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
