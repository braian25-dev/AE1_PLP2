package com.example;

public class Departamento {

    private static int CAPACIDAD_EMPLEADOS = 20;

    private String nombre;
    private double presupuesto;
    private Empleado responsable;
    private Empleado[] empleados;
    private int cantidadEmpleados;

    public Departamento(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.empleados = new Empleado[CAPACIDAD_EMPLEADOS];
        this.cantidadEmpleados = 0;
    }

    public void asignarResponsable(Empleado empleado) {
        this.responsable = empleado;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (cantidadEmpleados < empleados.length) {
            empleados[cantidadEmpleados] = empleado;
            cantidadEmpleados++;
        } else {
            System.out.println("No se puede agregar el empleado: departamento completo.");
        }
    }


}
