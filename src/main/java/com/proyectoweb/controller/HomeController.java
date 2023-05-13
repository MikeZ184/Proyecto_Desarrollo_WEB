/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.controller;
import com.proyectoweb.entity.UsuarioEntity;
import com.proyectoweb.service.IUsuarioService;
import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author MIKE-PC
 */
@Controller
public class HomeController {
    
    @Autowired 
    private IUsuarioService usuarioService;
    
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
    
  @GetMapping("/register")
  public String showRegisterForm() {
  
  
  return "registro";
}
  @PostMapping("/register")
public String register(@RequestParam String username, 
                       @RequestParam String email, 
                       @RequestParam String password, 
                       @RequestParam String confirm_password,
                       Model model) {
  // Lógica de registro
}
    
}
