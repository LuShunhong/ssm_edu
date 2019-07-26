package org.hong.edu.service;

import org.hong.edu.model.User;
import org.hong.edu.service.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

public interface IUserService extends IBaseService<User> {

    //特有的方法

    public User login(String username, String passwod);
}
