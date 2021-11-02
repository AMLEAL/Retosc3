/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aleal.aleal.interfaces;

import org.springframework.data.repository.CrudRepository;
import aleal.aleal.modelo.Mensaje;

/**
 *
 * @author USUARIO
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
