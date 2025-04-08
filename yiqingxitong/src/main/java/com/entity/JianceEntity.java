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
 * 核酸检测
 *
 * @author 
 * @email
 */
@TableName("jiance")
public class JianceEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JianceEntity() {

	}

	public JianceEntity(T t) {
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
     * 检测时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 检测结果
     */
    @TableField(value = "jiance_types")

    private Integer jianceTypes;


    /**
     * 备注
     */
    @TableField(value = "jiance_content")

    private String jianceContent;


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
	 * 设置：检测时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：检测时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：检测结果
	 */
    public Integer getJianceTypes() {
        return jianceTypes;
    }


    /**
	 * 获取：检测结果
	 */

    public void setJianceTypes(Integer jianceTypes) {
        this.jianceTypes = jianceTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getJianceContent() {
        return jianceContent;
    }


    /**
	 * 获取：备注
	 */

    public void setJianceContent(String jianceContent) {
        this.jianceContent = jianceContent;
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
        return "Jiance{" +
            "id=" + id +
            ", zhuhuId=" + zhuhuId +
            ", gongzuoId=" + gongzuoId +
            ", insertTime=" + insertTime +
            ", jianceTypes=" + jianceTypes +
            ", jianceContent=" + jianceContent +
            ", createTime=" + createTime +
        "}";
    }
}
