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
 * 隔离监控
 *
 * @author 
 * @email
 */
@TableName("geli")
public class GeliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GeliEntity() {

	}

	public GeliEntity(T t) {
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
     * 住户
     */
    @TableField(value = "zhuhu_id")

    private Integer zhuhuId;


    /**
     * 工作人员
     */
    @TableField(value = "gongzuo_id")

    private Integer gongzuoId;


    /**
     * 隔离开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "geli_start_time",fill = FieldFill.UPDATE)

    private Date geliStartTime;


    /**
     * 隔离结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "geli_end_time",fill = FieldFill.UPDATE)

    private Date geliEndTime;


    /**
     * 隔离地点
     */
    @TableField(value = "geli_address")

    private String geliAddress;


    /**
     * 身体状况
     */
    @TableField(value = "shenti_types")

    private Integer shentiTypes;


    /**
     * 备注
     */
    @TableField(value = "geli_content")

    private String geliContent;


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
	 * 设置：住户
	 */
    public Integer getZhuhuId() {
        return zhuhuId;
    }


    /**
	 * 获取：住户
	 */

    public void setZhuhuId(Integer zhuhuId) {
        this.zhuhuId = zhuhuId;
    }
    /**
	 * 设置：工作人员
	 */
    public Integer getGongzuoId() {
        return gongzuoId;
    }


    /**
	 * 获取：工作人员
	 */

    public void setGongzuoId(Integer gongzuoId) {
        this.gongzuoId = gongzuoId;
    }
    /**
	 * 设置：隔离开始时间
	 */
    public Date getGeliStartTime() {
        return geliStartTime;
    }


    /**
	 * 获取：隔离开始时间
	 */

    public void setGeliStartTime(Date geliStartTime) {
        this.geliStartTime = geliStartTime;
    }
    /**
	 * 设置：隔离结束时间
	 */
    public Date getGeliEndTime() {
        return geliEndTime;
    }


    /**
	 * 获取：隔离结束时间
	 */

    public void setGeliEndTime(Date geliEndTime) {
        this.geliEndTime = geliEndTime;
    }
    /**
	 * 设置：隔离地点
	 */
    public String getGeliAddress() {
        return geliAddress;
    }


    /**
	 * 获取：隔离地点
	 */

    public void setGeliAddress(String geliAddress) {
        this.geliAddress = geliAddress;
    }
    /**
	 * 设置：身体状况
	 */
    public Integer getShentiTypes() {
        return shentiTypes;
    }


    /**
	 * 获取：身体状况
	 */

    public void setShentiTypes(Integer shentiTypes) {
        this.shentiTypes = shentiTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getGeliContent() {
        return geliContent;
    }


    /**
	 * 获取：备注
	 */

    public void setGeliContent(String geliContent) {
        this.geliContent = geliContent;
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
        return "Geli{" +
            "id=" + id +
            ", zhuhuId=" + zhuhuId +
            ", gongzuoId=" + gongzuoId +
            ", geliStartTime=" + geliStartTime +
            ", geliEndTime=" + geliEndTime +
            ", geliAddress=" + geliAddress +
            ", shentiTypes=" + shentiTypes +
            ", geliContent=" + geliContent +
            ", createTime=" + createTime +
        "}";
    }
}
