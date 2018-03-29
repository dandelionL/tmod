package org.yunrich.model;

import java.util.Date;

public class ClassMateInfo {
    /**
     * 学号
     */
    private String stuId;

    /**
     * 微信操作员号
     */
    private String wxOperId;

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 省份
     */
    private String provId;

    /**
     * 地区
     */
    private String areaId;

    /**
     * 工作状态  S--学习 W--工作 U-- 待业
     */
    private String workFlag;

    /**
     * 工作地址
     */
    private String comName;

    /**
     * 婚否 U -- 未婚 M -- 已婚
     */
    private String selfFlag;

    /**
     * 学号
     * @return STU_ID 学号
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * 学号
     * @param stuId 学号
     */
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    /**
     * 微信操作员号
     * @return WX_OPER_ID 微信操作员号
     */
    public String getWxOperId() {
        return wxOperId;
    }

    /**
     * 微信操作员号
     * @param wxOperId 微信操作员号
     */
    public void setWxOperId(String wxOperId) {
        this.wxOperId = wxOperId;
    }

    /**
     * 姓名
     * @return STU_NAME 姓名
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * 姓名
     * @param stuName 姓名
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * 生日
     * @return BIRTHDAY 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 生日
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 省份
     * @return PROV_ID 省份
     */
    public String getProvId() {
        return provId;
    }

    /**
     * 省份
     * @param provId 省份
     */
    public void setProvId(String provId) {
        this.provId = provId;
    }

    /**
     * 地区
     * @return AREA_ID 地区
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 地区
     * @param areaId 地区
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * 工作状态  S--学习 W--工作 U-- 待业
     * @return WORK_FLAG 工作状态  S--学习 W--工作 U-- 待业
     */
    public String getWorkFlag() {
        return workFlag;
    }

    /**
     * 工作状态  S--学习 W--工作 U-- 待业
     * @param workFlag 工作状态  S--学习 W--工作 U-- 待业
     */
    public void setWorkFlag(String workFlag) {
        this.workFlag = workFlag;
    }

    /**
     * 工作地址
     * @return COM_NAME 工作地址
     */
    public String getComName() {
        return comName;
    }

    /**
     * 工作地址
     * @param comName 工作地址
     */
    public void setComName(String comName) {
        this.comName = comName;
    }

    /**
     * 婚否 U -- 未婚 M -- 已婚
     * @return SELF_FLAG 婚否 U -- 未婚 M -- 已婚
     */
    public String getSelfFlag() {
        return selfFlag;
    }

    /**
     * 婚否 U -- 未婚 M -- 已婚
     * @param selfFlag 婚否 U -- 未婚 M -- 已婚
     */
    public void setSelfFlag(String selfFlag) {
        this.selfFlag = selfFlag;
    }
}