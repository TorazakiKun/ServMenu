package com.example.menu;
import org.springframework.data.repository.CrudRepository;
import com.example.menu.*;
/**
 * Imenu
 */
public interface Imenu extends CrudRepository<Menu, Integer> {
    Menu findBynombreProducto(String nombreProducto);
    Iterable<Menu> findBytipoProducto(String tipoProducto);
    Menu findByPrecio(float precio);
    
}