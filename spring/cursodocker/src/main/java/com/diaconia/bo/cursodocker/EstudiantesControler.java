package com.diaconia.bo.cursodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class EstudiantesControler {

    private List<EstudianteModel> listaEstudiantes = List.of(
            new EstudianteModel(1,"Wilge Normando","Pucho Turpo",31,"M",new Date(1994,2,9)),
            new EstudianteModel(2,"Jorge Luis","Coronel Aruquipa",30,"M",new Date(1995,12,29)),
            new EstudianteModel(3,"Eliana","Marquez Tintaya",35,"F",new Date(1990,10,13))
    );

    @GetMapping("/")
    public String prueba() {
        return "Saludos desde docker ";
    }

    @GetMapping("/api/students")
    public List<EstudianteModel> estudiantes() {
        return listaEstudiantes;
    }

    @GetMapping("/api/student/{id}")
    public EstudianteModel estudiantes(@PathVariable Long id) {
        for (EstudianteModel estudiante:listaEstudiantes){
            if(estudiante.getId()==id)
                return estudiante;
        }
        return null;
    }


}
