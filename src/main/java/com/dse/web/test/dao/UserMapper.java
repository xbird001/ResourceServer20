package com.dse.web.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dse.web.test.entity.User;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author subiao_zhou
 * @since 2019-01-17
 */
public interface UserMapper extends BaseMapper<User> {

    List<Map<String,Object>> queryUser(Map<String, Object> queryM);

}
