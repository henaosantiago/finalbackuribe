package com.example.viaticosonline.repositorios;

import com.example.viaticosonline.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpleado extends JpaRepository<Empleado,Integer> {
}
