package com.gnr.pm.kubernetesdeploy.service;

import com.gnr.pm.kubernetesdeploy.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getUsers();
}
