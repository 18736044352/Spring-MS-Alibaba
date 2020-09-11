package com.java.controllers;

import com.java.provider.dao.entitys.user.UserDO;
import com.java.provider.dao.mappers.user.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class IndexController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        UserDO userDO =  userDAO.selectByPrimaryKey(1L);
        return "first nacos micro service";
    }
}
