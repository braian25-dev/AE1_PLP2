package com.example;

public class Cliente extends Persona {

    private static final int CAPACIDAD_HISTORIAL = 20; // Capacidad máxima del historial de facturas
    
    private double limiteCredito;
    private String categoria;
    private Factura[] historialFacturas;
    private int cantidadFacturas; // Contador de facturas en el historial

    public Cliente(String nombre, String domicilio, String DNI, String telefono,
                   double limiteCredito, String categoria) {
        super(nombre, domicilio, DNI, telefono);
        this.limiteCredito = limiteCredito;
        this.categoria = categoria;
        this.historialFacturas = new Factura[CAPACIDAD_HISTORIAL];
        this.cantidadFacturas = 0;
    }

}
