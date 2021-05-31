package com.example.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import me.tell.menu.AgregarRequest;
import me.tell.menu.AgregarResponse;
import me.tell.menu.BuscarNombreRequest;
import me.tell.menu.BuscarNombreResponse;
import me.tell.menu.BuscarPrecioRequest;
import me.tell.menu.BuscarPrecioResponse;
import me.tell.menu.BuscarTipoRequest;
import me.tell.menu.BuscarTipoResponse;
import me.tell.menu.EliminarResponse;
import me.tell.menu.EliminarRequest;
import me.tell.menu.ModificarRequest;
import me.tell.menu.ModificarResponse;
import me.tell.menu.MostrarRequest;
import me.tell.menu.MostrarResponse;

@Endpoint
public class MenuEndPoint {
    @Autowired
    private Imenu imenu;

    @PayloadRoot(namespace="http://tell.me/menu", localPart="AgregarRequest")

    @ResponsePayload
    public AgregarResponse agregarMenu(@RequestPayload AgregarRequest peticion){
        AgregarResponse respuesta = new AgregarResponse();
        float flotante = Float.parseFloat(peticion.getPrecio());
        respuesta.setRespuesta(peticion.getNombreProducto() + " ha sido agregado!");
        Menu menu = new Menu();
        menu.setNombreProducto(peticion.getNombreProducto());
        menu.setTipoProducto(peticion.getTipoProducto());
        menu.setPrecio(flotante);
        imenu.save(menu);
        return respuesta;
    }
    
    @PayloadRoot(namespace="http://tell.me/menu", localPart="ModificarRequest")

    @ResponsePayload
    public ModificarResponse modificarMenu(@RequestPayload ModificarRequest peticion){
        ModificarResponse respuesta = new ModificarResponse();
        int id = peticion.getId();
        float flotante = Float.parseFloat(peticion.getPrecio());
        Menu menu = imenu.findById(id).orElse(null);
        menu.setNombreProducto(peticion.getNombreProducto());
        menu.setTipoProducto(peticion.getTipoProducto());
        menu.setPrecio(flotante);
        imenu.save(menu);
        respuesta.setRespuesta("Actualizado con exito!");
        return respuesta;
    }

    @PayloadRoot(namespace="http://tell.me/menu", localPart="EliminarRequest")
    
    @ResponsePayload
    public EliminarResponse eliminarMenu(@RequestPayload EliminarRequest peticion){
        EliminarResponse respuesta = new EliminarResponse();
        int id = peticion.getId();
        Menu menu = imenu.findById(id).orElse(null);
        imenu.delete(menu);
        respuesta.setRespuesta("Eliminado con exito");
        return respuesta;
    }

    @PayloadRoot(namespace = "http://tell.me/menu", localPart = "MostrarRequest")

    @ResponsePayload
    public MostrarResponse mostrarMenu(){
        MostrarResponse respuesta = new MostrarResponse();
        
        Iterable<Menu> listaMenu = imenu.findAll();

        for(Menu is : listaMenu){
            MostrarResponse.Menu e = new MostrarResponse.Menu();
            e.setId(is.getId());
            e.setNombreProducto(is.getNombreProducto());
            e.setPrecio(is.getPrecio());
            respuesta.getMenu().add(e);
        }
        return respuesta;
    }

    @PayloadRoot(namespace="http://tell.me/menu", localPart="BuscarNombreRequest")
    
    @ResponsePayload
    public BuscarNombreResponse buscarNombre(@RequestPayload BuscarNombreRequest peticion){
        BuscarNombreResponse respuesta = new BuscarNombreResponse();
        Menu menu = new Menu();
        menu = imenu.findBynombreProducto(peticion.getNombre());
        respuesta.setId(menu.getId());
        respuesta.setNombreProducto(menu.getNombreProducto());
        respuesta.setPrecio(menu.getPrecio());
        return respuesta;
    }

}