package com.ssm.service.impl;

import com.ssm.dao.mapping.T_userMapper;
import com.ssm.pojo.T_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {


    @Autowired
    T_userMapper t_userMapper;



    public List<T_user> test(){
       return t_userMapper.selectAll();
    }
}
