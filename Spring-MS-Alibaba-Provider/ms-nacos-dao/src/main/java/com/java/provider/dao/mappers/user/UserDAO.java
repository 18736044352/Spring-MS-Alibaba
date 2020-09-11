package com.java.provider.dao.mappers.user;

import com.java.provider.dao.entitys.user.UserDO;
import java.util.List;

public interface UserDAO {
    int deleteByPrimaryKey(Long id);

    int insert(UserDO record);

    UserDO selectByPrimaryKey(Long id);

    List<UserDO> selectAll();

    int updateByPrimaryKey(UserDO record);
}