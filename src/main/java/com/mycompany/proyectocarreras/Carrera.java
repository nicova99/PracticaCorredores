/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocarreras;

import java.util.Date;

/**
 *
 * @author nico_
 */

public class Carrera {

  
   
private String nombre;
private String fechaCarrera;
private String lugar;
private String nMaximo;
private Corredor[] listaCorredores;
private int[] dorsales;


  public Carrera(String nombre, String fechaCarrera, String lugar, String nMaximo) {
        this.nombre = nombre;
        this.fechaCarrera = fechaCarrera;
        this.lugar = lugar;
        this.nMaximo = nMaximo;
    }






 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(String fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getnMaximo() {
        return nMaximo;
    }

    public void setnMaximo(String nMaximo) {
        this.nMaximo = nMaximo;
    }

    public Corredor[] getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(Corredor[] listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    public int[] getDorsales() {
        return dorsales;
    }

    public void setDorsales(int[] dorsales) {
        this.dorsales = dorsales;
    }
    
      public String[] toArrayString(){
    
    String [] s= new String [4];
    s[0] = nombre;
    s[1] = fechaCarrera;
    s[2] = lugar;
    s[3] = nMaximo;

    return s;}
}
