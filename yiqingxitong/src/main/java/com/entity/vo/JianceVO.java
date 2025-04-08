package com.entity.vo;

import com.entity.JianceEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 核酸检测
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiance")
public class JianceVO implements Serializable {
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
     * 检测时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
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

}
