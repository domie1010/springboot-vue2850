package com.entity.vo;

import com.entity.GeliEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 隔离监控
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("geli")
public class GeliVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "geli_start_time")
    private Date geliStartTime;


    /**
     * 隔离结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "geli_end_time")
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

    @TableField(value = "create_time")
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

}
