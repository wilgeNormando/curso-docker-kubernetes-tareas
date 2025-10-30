package com.diaconia.bo.cursodocker;

import java.util.Date;

public class EstudianteModel {
    private long id;
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String Genero;
    private Date FechaNacimiento;

    public EstudianteModel(long id, String nombres, String apellidos, int edad, String genero, Date fechaNacimiento) {
        this.id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        Edad = edad;
        Genero = genero;
        FechaNacimiento = fechaNacimiento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
