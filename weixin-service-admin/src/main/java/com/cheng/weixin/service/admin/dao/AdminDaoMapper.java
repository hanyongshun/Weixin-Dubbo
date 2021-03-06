package com.cheng.weixin.service.admin.dao;

import com.cheng.weixin.common.core.dao.BaseDaoMapper;
import com.cheng.weixin.rpc.admin.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * Desc: 管理员mapper
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
@Repository
public interface AdminDaoMapper extends BaseDaoMapper<Admin> {
    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
//    Admin loadUserByUsername(String username);

}
