package com.example.swp_mvc.controller;

import com.example.swp_mvc.model.Users;
import com.example.swp_mvc.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/resetpassword")
public class ForgotPasswordController {
    @Autowired
    public IUserService userService;
    @Autowired
    public PasswordEncoder passwordEncoder;
    @GetMapping("/verify")
    public String view(){
        return "verify_username";
    }

    @PostMapping("/verify")
    public ModelAndView verify(@ModelAttribute Users users){
        users = userService.findByUserName(users.getUserName());
        ModelAndView m = new ModelAndView("reset_password", "users", users);
        return m;
    }

    @PostMapping("/reset")
    public String reset(@RequestParam String passWord, @RequestParam Long id){
        String encoderPassword = passwordEncoder.encode(passWord);
        Users users = userService.findById(id).get();
        users.setPassWord(encoderPassword);
        userService.save(users);
        return "redirect:/login";
    }
}
