package com.dse.web.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dse.web.test.dao.UserMapper;
import com.dse.web.test.entity.User;
import com.dse.web.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author subiao_zhou
 * @since 2019-01-17
 */
@Service(value = "UserServiceImpl")
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public void saveAll() {
        for (int i = 0; i < 10; i++) {
            User entity = new User();
            entity.setId(10 + Long.valueOf(i));
            entity.setAge(i);
            entity.setName("name:" + i);
            this.save(entity);
        }
        logger.info("exception is coming " + 2/0);
    }

    @Override
    public List<String> testAPI() {
        List<String> rs = new ArrayList<>();
        for(int i=0; i<10; i++) {
            rs.add(String.valueOf(i));
        }
        return rs;
    }
}
