package com.example.viaticosonline.servicios;


import com.example.viaticosonline.entidades.Empleado;
import com.example.viaticosonline.repositorios.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServicioEmpleado implements ServicioBase<Empleado> {

    @Autowired
    RepositorioEmpleado repositorioEmpleado;

    @Override
    public List<Empleado> buscarTodos() throws Exception {

        try{
            List<Empleado> empleados = repositorioEmpleado.findAll();
            return empleados;

        }catch(Exception error){

            throw new Exception(error.getMessage());

        }
    }

    @Override
    public Empleado buscarPorId(Integer id) throws Exception {

        try{
            Optional<Empleado> empleadoBuscado= repositorioEmpleado.findById(id);
            return empleadoBuscado.get();

        }catch(Exception error){

            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Empleado registrar(Empleado entidad) throws Exception {
        try{

            entidad=repositorioEmpleado.save(entidad);
            return entidad;

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Empleado editar(Integer id, Empleado entidad) throws Exception {
        try {
            Optional<Empleado> empleadoBuscado=repositorioEmpleado.findById(id);
            Empleado empleado=empleadoBuscado.get();
            empleado=repositorioEmpleado.save(entidad);
            return empleado;
        }catch(Exception error){

            throw new Exception(error.getMessage());
        }
    }
}
