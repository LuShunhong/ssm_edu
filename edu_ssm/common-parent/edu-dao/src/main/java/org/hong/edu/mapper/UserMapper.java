package org.hong.edu.mapper;

import org.hong.edu.mapper.base.BaseMapper;
import org.hong.edu.model.User;

public interface UserMapper extends BaseMapper<User> {

    /**
     * 通过id 查找用户
     * @param id
     * @return
     */
    public User findById(Integer id);
    /**
     * 通过id 删除用户
     * @param id
     * @return
     */
    public void deleteById(Integer id);
    /**
     * 更新用户
     * @param user
     * @return
     */
    public void update(User user);

    /**
     *
     * @param user
     */
    public void insert(User user);




}
