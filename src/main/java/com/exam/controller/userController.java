package com.exam.controller;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.userRole;
import com.exam.repo.userRepository;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class userController {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserService userService;

    private com.exam.repo.userRepository userRepository;
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
       user.setProfile("default.png");

       user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        Role role = new Role();
        role.setRoleName("NORMAL");
        Set<userRole> userRoleSet=new HashSet<>();
        userRole userRole=new userRole();
        userRole.setRole(role);
        userRole.setUser(user);
        userRoleSet.add(userRole);
        return  this.userService.createUser(user,userRoleSet);
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String uname)
    {
        System.out.println(uname);

        return this.userService.getUser(uname);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long uid)
    {
        System.out.println(uid);
         this.userService.deleteUser(uid);
    }

}
