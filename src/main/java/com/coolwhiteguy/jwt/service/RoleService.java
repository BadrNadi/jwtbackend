package com.coolwhiteguy.jwt.service;

import com.coolwhiteguy.jwt.dao.RoleDao;
import com.coolwhiteguy.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
