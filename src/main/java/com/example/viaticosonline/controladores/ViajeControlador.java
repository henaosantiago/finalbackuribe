package com.example.viaticosonline.controladores;



import com.example.viaticosonline.entidades.Viaje;

import com.example.viaticosonline.servicios.ServicioViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/uribe/viajes")
public class ViajeControlador {

    @Autowired
    ServicioViaje servicioViaje;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Viaje viaje){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioViaje.registrar(viaje));
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:Revise su peticion }");
        }
    }

    @GetMapping
    public ResponseEntity<?>buscarViajes(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioViaje.buscarTodos());
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Datos no encontrados }");
        }
    }


}
