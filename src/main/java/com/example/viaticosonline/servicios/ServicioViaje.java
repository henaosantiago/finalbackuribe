package com.example.viaticosonline.servicios;

import com.example.viaticosonline.entidades.Viaje;
import com.example.viaticosonline.repositorios.RepositorioViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioViaje implements ServicioBase<Viaje>{

    @Autowired
    RepositorioViaje repositorioViaje;

    @Override
    public List<Viaje> buscarTodos() throws Exception {

        try {

            List<Viaje> viajes = repositorioViaje.findAll();
            return viajes;

        }catch(Exception error){

            throw new Exception(error.getMessage());

        }
    }

    @Override
    public Viaje buscarPorId(Integer id) throws Exception {

        try{

           Optional<Viaje> viajeBuscado= repositorioViaje.findById(id);
           return viajeBuscado.get();

        }catch(Exception error){

            throw new Exception(error.getMessage());

        }

    }

    @Override
    public Viaje registrar(Viaje entidad) throws Exception {
        try{

            entidad=repositorioViaje.save(entidad);
            return entidad;

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Viaje editar(Integer id, Viaje entidad) throws Exception {
        return null;
    }
}
