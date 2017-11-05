package io.fliu.core.dao;

import io.fliu.core.model.User;

/**
 * Created by liulingfeng on 2017/11/5.
 */

public interface UserDao {
    long save(User user);
}
