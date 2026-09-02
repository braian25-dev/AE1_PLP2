package com.example;

/**
 * Clase abstracta base para roda persona vinculada a la empresa.
 * No se intancia directamente: siempre a través de Cliente, Empleado o Proveedor 
 */

public abstract class Persona {
    
    private String nombre;
    private String domicilio;
    private String DNI;
    private String telefono;

    public Persona(String nombre, String domicilio, String DNI, String telefono){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getDNI() {
        return DNI;
    }

    public String getTelefono() {
        return telefono;
    }
}
