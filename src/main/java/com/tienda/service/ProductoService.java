package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author JuanDMH
 */
public interface ProductoService {
    
    // Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);
    
    //Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    //Se inserta un nuevo producto si el id del producto esta vacio
    //Se actualiza un producto si el id del producto NO esta vacio
    public void save(Producto producto);
    
    //Se elimina el producto que tiene el id pasado por parametro
    public void delete(Producto producto);
 
}