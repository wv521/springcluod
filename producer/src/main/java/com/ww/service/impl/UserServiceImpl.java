package com.ww.service.impl;

import com.ww.dao.UserMapper;
import com.ww.model.UserDO;
import com.ww.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ww
 * @date 2020-02-15
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired(required=false)
    private UserMapper userMapper;

    @Override
    public UserDO getList() {
//        List<UserDO> listUser =  new ArrayList<>();
        UserDO userDO = new UserDO();
        userDO.setId(1);
//        listUser.add(userDO);
//        List<UserDO> listUser = userMapper.getList();
        return userDO;
    }

    @Override
    public UserDO getFeignList() {
        UserDO result =  userMapper.sayFeign();
        return result;
    }

    @Override
    public void getcc(String ... cc) {

    }
}
