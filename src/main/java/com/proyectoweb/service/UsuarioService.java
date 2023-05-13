/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.service;

import com.proyectoweb.entity.UsuarioEntity;
import com.proyectoweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MIKE-PC
 */
@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void saveUser(UsuarioEntity usuarioentity ) {
        usuarioRepository.save(usuarioentity);
    }
    
}
