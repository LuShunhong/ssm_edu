package org.hong.edu.service.base;


import org.hong.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    //统一管咯dao
    @Autowired
    protected UserMapper userMapper;

}
