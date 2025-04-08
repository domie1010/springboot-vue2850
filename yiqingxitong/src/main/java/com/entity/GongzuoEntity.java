package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 工作人员
 *
 * @author 
 * @email
 */
@TableName("gongzuo")
public class GongzuoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongzuoEntity() {

	}

	public GongzuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 工作人员编号
     */
    @TableField(value = "gongzuo_danhao_number")

    private String gongzuoDanhaoNumber;


    /**
     * 工作人员姓名
     */
    @TableField(value = "gongzuo_name")

    private String gongzuoName;


    /**
     * 工作人员手机号
     */
    @TableField(value = "gongzuo_phone")

    private String gongzuoPhone;


    /**
     * 工作人员身份证号
     */
    @TableField(value = "gongzuo_id_number")

    private String gongzuoIdNumber;


    /**
     * 现住地址
     */
    @TableField(value = "gongzuo_address")

    private String gongzuoAddress;


    /**
     * 工作人员照片
     */
    @TableField(value = "gongzuo_photo")

    private String gongzuoPhoto;


    /**
     * 职务
     */
    @TableField(value = "zhiwu_types")

    private Integer zhiwuTypes;


    /**
     * 负责区域
     */
    @TableField(value = "quyu")

    private String quyu;


    /**
     * 备注
     */
    @TableField(value = "gongzuo_content")

    private String gongzuoContent;


    /**
     * 类型
     */
    @TableField(value = "gongzuo_types")

    private Integer gongzuoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：工作人员编号
	 */
    public String getGongzuoDanhaoNumber() {
        return gongzuoDanhaoNumber;
    }


    /**
	 * 获取：工作人员编号
	 */

    public void setGongzuoDanhaoNumber(String gongzuoDanhaoNumber) {
        this.gongzuoDanhaoNumber = gongzuoDanhaoNumber;
    }
    /**
	 * 设置：工作人员姓名
	 */
    public String getGongzuoName() {
        return gongzuoName;
    }


    /**
	 * 获取：工作人员姓名
	 */

    public void setGongzuoName(String gongzuoName) {
        this.gongzuoName = gongzuoName;
    }
    /**
	 * 设置：工作人员手机号
	 */
    public String getGongzuoPhone() {
        return gongzuoPhone;
    }


    /**
	 * 获取：工作人员手机号
	 */

    public void setGongzuoPhone(String gongzuoPhone) {
        this.gongzuoPhone = gongzuoPhone;
    }
    /**
	 * 设置：工作人员身份证号
	 */
    public String getGongzuoIdNumber() {
        return gongzuoIdNumber;
    }


    /**
	 * 获取：工作人员身份证号
	 */

    public void setGongzuoIdNumber(String gongzuoIdNumber) {
        this.gongzuoIdNumber = gongzuoIdNumber;
    }
    /**
	 * 设置：现住地址
	 */
    public String getGongzuoAddress() {
        return gongzuoAddress;
    }


    /**
	 * 获取：现住地址
	 */

    public void setGongzuoAddress(String gongzuoAddress) {
        this.gongzuoAddress = gongzuoAddress;
    }
    /**
	 * 设置：工作人员照片
	 */
    public String getGongzuoPhoto() {
        return gongzuoPhoto;
    }


    /**
	 * 获取：工作人员照片
	 */

    public void setGongzuoPhoto(String gongzuoPhoto) {
        this.gongzuoPhoto = gongzuoPhoto;
    }
    /**
	 * 设置：职务
	 */
    public Integer getZhiwuTypes() {
        return zhiwuTypes;
    }


    /**
	 * 获取：职务
	 */

    public void setZhiwuTypes(Integer zhiwuTypes) {
        this.zhiwuTypes = zhiwuTypes;
    }
    /**
	 * 设置：负责区域
	 */
    public String getQuyu() {
        return quyu;
    }


    /**
	 * 获取：负责区域
	 */

    public void setQuyu(String quyu) {
        this.quyu = quyu;
    }
    /**
	 * 设置：备注
	 */
    public String getGongzuoContent() {
        return gongzuoContent;
    }


    /**
	 * 获取：备注
	 */

    public void setGongzuoContent(String gongzuoContent) {
        this.gongzuoContent = gongzuoContent;
    }
    /**
	 * 设置：类型
	 */
    public Integer getGongzuoTypes() {
        return gongzuoTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setGongzuoTypes(Integer gongzuoTypes) {
        this.gongzuoTypes = gongzuoTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gongzuo{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", gongzuoDanhaoNumber=" + gongzuoDanhaoNumber +
            ", gongzuoName=" + gongzuoName +
            ", gongzuoPhone=" + gongzuoPhone +
            ", gongzuoIdNumber=" + gongzuoIdNumber +
            ", gongzuoAddress=" + gongzuoAddress +
            ", gongzuoPhoto=" + gongzuoPhoto +
            ", zhiwuTypes=" + zhiwuTypes +
            ", quyu=" + quyu +
            ", gongzuoContent=" + gongzuoContent +
            ", gongzuoTypes=" + gongzuoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
