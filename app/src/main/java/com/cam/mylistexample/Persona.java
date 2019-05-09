package com.cam.mylistexample;

public class Persona {

    private String nombre;
    private String fechaNac;
    private String sexo;
    private String descripcion;

    public Persona() {
    }

    public Persona(String nombre, String fechaNac, String sexo, String descripcion) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
