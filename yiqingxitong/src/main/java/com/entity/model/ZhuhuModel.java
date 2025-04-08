package com.entity.model;

import com.entity.ZhuhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 住户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuhuModel implements Serializable {
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
     * 住户编号
     */
    private String zhuhuDanhaoNumber;


    /**
     * 住户姓名
     */
    private String zhuhuName;


    /**
     * 住户手机号
     */
    private String zhuhuPhone;


    /**
     * 住户身份证号
     */
    private String zhuhuIdNumber;


    /**
     * 现住地址
     */
    private String zhuhuAddress;


    /**
     * 住户照片
     */
    private String zhuhuPhoto;


    /**
     * 年龄
     */
    private Integer zhuhuAge;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 是否注射疫苗
     */
    private Integer zhuhuYimiaoTypes;


    /**
     * 来源地
     */
    private String zhuhuLaiyuandi;


    /**
     * 是否有7日内核酸证明
     */
    private Integer zhuhuHesuanTypes;


    /**
     * 行程轨迹
     */
    private String zhuhuXingcheng;


    /**
     * 备注
     */
    private String zhuhuContent;


    /**
     * 类型
     */
    private Integer zhuhuTypes;


    /**
     * 入住时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhuhuTime;


    /**
     * 统计时间
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
	 * 获取：住户编号
	 */
    public String getZhuhuDanhaoNumber() {
        return zhuhuDanhaoNumber;
    }


    /**
	 * 设置：住户编号
	 */
    public void setZhuhuDanhaoNumber(String zhuhuDanhaoNumber) {
        this.zhuhuDanhaoNumber = zhuhuDanhaoNumber;
    }
    /**
	 * 获取：住户姓名
	 */
    public String getZhuhuName() {
        return zhuhuName;
    }


    /**
	 * 设置：住户姓名
	 */
    public void setZhuhuName(String zhuhuName) {
        this.zhuhuName = zhuhuName;
    }
    /**
	 * 获取：住户手机号
	 */
    public String getZhuhuPhone() {
        return zhuhuPhone;
    }


    /**
	 * 设置：住户手机号
	 */
    public void setZhuhuPhone(String zhuhuPhone) {
        this.zhuhuPhone = zhuhuPhone;
    }
    /**
	 * 获取：住户身份证号
	 */
    public String getZhuhuIdNumber() {
        return zhuhuIdNumber;
    }


    /**
	 * 设置：住户身份证号
	 */
    public void setZhuhuIdNumber(String zhuhuIdNumber) {
        this.zhuhuIdNumber = zhuhuIdNumber;
    }
    /**
	 * 获取：现住地址
	 */
    public String getZhuhuAddress() {
        return zhuhuAddress;
    }


    /**
	 * 设置：现住地址
	 */
    public void setZhuhuAddress(String zhuhuAddress) {
        this.zhuhuAddress = zhuhuAddress;
    }
    /**
	 * 获取：住户照片
	 */
    public String getZhuhuPhoto() {
        return zhuhuPhoto;
    }


    /**
	 * 设置：住户照片
	 */
    public void setZhuhuPhoto(String zhuhuPhoto) {
        this.zhuhuPhoto = zhuhuPhoto;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getZhuhuAge() {
        return zhuhuAge;
    }


    /**
	 * 设置：年龄
	 */
    public void setZhuhuAge(Integer zhuhuAge) {
        this.zhuhuAge = zhuhuAge;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：是否注射疫苗
	 */
    public Integer getZhuhuYimiaoTypes() {
        return zhuhuYimiaoTypes;
    }


    /**
	 * 设置：是否注射疫苗
	 */
    public void setZhuhuYimiaoTypes(Integer zhuhuYimiaoTypes) {
        this.zhuhuYimiaoTypes = zhuhuYimiaoTypes;
    }
    /**
	 * 获取：来源地
	 */
    public String getZhuhuLaiyuandi() {
        return zhuhuLaiyuandi;
    }


    /**
	 * 设置：来源地
	 */
    public void setZhuhuLaiyuandi(String zhuhuLaiyuandi) {
        this.zhuhuLaiyuandi = zhuhuLaiyuandi;
    }
    /**
	 * 获取：是否有7日内核酸证明
	 */
    public Integer getZhuhuHesuanTypes() {
        return zhuhuHesuanTypes;
    }


    /**
	 * 设置：是否有7日内核酸证明
	 */
    public void setZhuhuHesuanTypes(Integer zhuhuHesuanTypes) {
        this.zhuhuHesuanTypes = zhuhuHesuanTypes;
    }
    /**
	 * 获取：行程轨迹
	 */
    public String getZhuhuXingcheng() {
        return zhuhuXingcheng;
    }


    /**
	 * 设置：行程轨迹
	 */
    public void setZhuhuXingcheng(String zhuhuXingcheng) {
        this.zhuhuXingcheng = zhuhuXingcheng;
    }
    /**
	 * 获取：备注
	 */
    public String getZhuhuContent() {
        return zhuhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setZhuhuContent(String zhuhuContent) {
        this.zhuhuContent = zhuhuContent;
    }
    /**
	 * 获取：类型
	 */
    public Integer getZhuhuTypes() {
        return zhuhuTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setZhuhuTypes(Integer zhuhuTypes) {
        this.zhuhuTypes = zhuhuTypes;
    }
    /**
	 * 获取：入住时间
	 */
    public Date getZhuhuTime() {
        return zhuhuTime;
    }


    /**
	 * 设置：入住时间
	 */
    public void setZhuhuTime(Date zhuhuTime) {
        this.zhuhuTime = zhuhuTime;
    }
    /**
	 * 获取：统计时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：统计时间
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
