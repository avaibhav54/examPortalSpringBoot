package com.exam.services;

import com.exam.model.User;
import com.exam.model.userRole;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface UserService {
    public User createUser(User user, Set<userRole> userRoles) throws Exception;
    public User getUser(String uname);
    public void deleteUser(Long userId);
}
