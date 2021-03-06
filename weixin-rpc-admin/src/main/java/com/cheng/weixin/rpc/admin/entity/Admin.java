package com.cheng.weixin.rpc.admin.entity;

import com.cheng.common.entity.DataEntity;

import java.util.Date;
import java.util.List;

/**
 * 用户实体
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public class Admin extends DataEntity<Admin> {
    /** 用户名 **/
    private String username;
    /** 密码（盐值和密匙） **/
    private String password;
    /** 真实姓名 **/
    private String realname;

    private String mobile;      // 手机
    private String photo;       // 头像URI
    private String loginIp;     // 登录IP
    private Date loginDate;     // 登录时间
    private String oldLoginIp;  // 上次登录IP
    private Date oldLoginDate;  // 上次登录时间

    private List<Role> roles;   // 角色

    /** 冗余字段 **/
    private String newLoginIp;  // 新登录的IP


    public Admin() {}

    public Admin(String id, String username) {
        super.id = id;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getOldLoginIp() {
        return oldLoginIp;
    }

    public void setOldLoginIp(String oldLoginIp) {
        this.oldLoginIp = oldLoginIp;
    }

    public Date getOldLoginDate() {
        return oldLoginDate;
    }

    public void setOldLoginDate(Date oldLoginDate) {
        this.oldLoginDate = oldLoginDate;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public Admin setRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    public String getNewLoginIp() {
        return newLoginIp;
    }

    public void setNewLoginIp(String newLoginIp) {
        this.newLoginIp = newLoginIp;
    }

    /** 判断是否是超级管理员 **/
    public boolean isSuperAdmin() {
        return isSuperAdmin(this.getId());
    }

    public static boolean isSuperAdmin(String id) {
        return id != null && "1".equals(id);
    }
}
