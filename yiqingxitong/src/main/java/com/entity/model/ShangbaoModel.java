package com.entity.model;

import com.entity.ShangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 疫情上报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShangbaoModel implements Serializable {
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
     * 上报详情
     */
    private String shangbaoContent;


    /**
     * 上报时间
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
	 * 获取：上报详情
	 */
    public String getShangbaoContent() {
        return shangbaoContent;
    }


    /**
	 * 设置：上报详情
	 */
    public void setShangbaoContent(String shangbaoContent) {
        this.shangbaoContent = shangbaoContent;
    }
    /**
	 * 获取：上报时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：上报时间
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
