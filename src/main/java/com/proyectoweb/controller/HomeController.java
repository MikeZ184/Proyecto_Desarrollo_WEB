/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author MIKE-PC
 */
@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String index(){
        return "home";
    }
    
    @GetMapping("/login")
    public String xdlol(){
        return "login";
    }
    
    @GetMapping("/homeInfo1")
    public String homeInfo1(){
        return "homeInfo1";
    }
    @GetMapping("/homeInfo2")
    public String homeInfo2(){
        return "homeInfo2";
    }
    @GetMapping("/homeInfo3")
    public String homeInfo3(){
        return "homeInfo3";
    }
    
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    
}
