/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocarreras;

import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author nico_
 */
public class Corredor {
    private String nombre;
    private String DNI;
    private Date fechaNacimiento;
    private String direccion;
    private int telefono;
    private ArrayList<Carrera> listaCarreras;

    public Corredor(String nombre, String DNI, Date fechaNacimiento, String direccion, int telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public ArrayList<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(ArrayList<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
   public String[] toArrayString(){
    
    String [] s= new String [5];
    s[0] = nombre;
    s[1] = DNI;
    s[2] = fechaNacimiento.toString();
    s[3] = direccion;
    s[4] = Integer.toString(telefono);
    return s;}
}

