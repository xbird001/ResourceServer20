package com.dse.web.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dse.web.test.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author subiao_zhou
 * @since 2019-01-17
 */
public interface UserService extends IService<User> {

    void saveAll();

    List<String> testAPI();

}
