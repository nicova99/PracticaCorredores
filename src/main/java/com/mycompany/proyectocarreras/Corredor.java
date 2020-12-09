/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocarreras;



/**
 *
 * @author nico_
 */
public class Corredor {
    private String nombre;
    private String DNI;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;

    public Corredor(String nombre, String DNI, String fechaNacimiento, String direccion, String telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
   public String[] toArrayString(){
    
    String [] s= new String [5];
    s[0] = nombre;
    s[1] = DNI;
    s[2] = fechaNacimiento;
    s[3] = direccion;
    s[4] = telefono;
    return s;}
}

