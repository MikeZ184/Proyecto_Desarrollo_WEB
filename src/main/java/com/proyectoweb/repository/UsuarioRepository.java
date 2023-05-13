/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoweb.repository;

import com.proyectoweb.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author MIKE-PC
 */
public interface UsuarioRepository extends CrudRepository<UsuarioEntity,Long>{
    
}
