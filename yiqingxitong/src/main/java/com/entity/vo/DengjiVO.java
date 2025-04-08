package com.entity.vo;

import com.entity.DengjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 出入登记
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dengji")
public class DengjiVO implements Serializable {
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
     * 出入类型
     */

    @TableField(value = "dengji_types")
    private Integer dengjiTypes;


    /**
     * 体温
     */

    @TableField(value = "tiwen")
    private Double tiwen;


    /**
     * 从哪来
     */

    @TableField(value = "lai_address")
    private String laiAddress;


    /**
     * 到哪去
     */

    @TableField(value = "qu_address")
    private String quAddress;


    /**
     * 备注
     */

    @TableField(value = "dengji_content")
    private String dengjiContent;


    /**
     * 登记时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：出入类型
	 */
    public Integer getDengjiTypes() {
        return dengjiTypes;
    }


    /**
	 * 获取：出入类型
	 */

    public void setDengjiTypes(Integer dengjiTypes) {
        this.dengjiTypes = dengjiTypes;
    }
    /**
	 * 设置：体温
	 */
    public Double getTiwen() {
        return tiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setTiwen(Double tiwen) {
        this.tiwen = tiwen;
    }
    /**
	 * 设置：从哪来
	 */
    public String getLaiAddress() {
        return laiAddress;
    }


    /**
	 * 获取：从哪来
	 */

    public void setLaiAddress(String laiAddress) {
        this.laiAddress = laiAddress;
    }
    /**
	 * 设置：到哪去
	 */
    public String getQuAddress() {
        return quAddress;
    }


    /**
	 * 获取：到哪去
	 */

    public void setQuAddress(String quAddress) {
        this.quAddress = quAddress;
    }
    /**
	 * 设置：备注
	 */
    public String getDengjiContent() {
        return dengjiContent;
    }


    /**
	 * 获取：备注
	 */

    public void setDengjiContent(String dengjiContent) {
        this.dengjiContent = dengjiContent;
    }
    /**
	 * 设置：登记时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：登记时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
