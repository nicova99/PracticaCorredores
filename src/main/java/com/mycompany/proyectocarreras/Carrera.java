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

public class Carrera {

  
   
private String nombre;
private Date fechaCarrera;
private String lugar;
private int nMaximo;
 private ArrayList<Corredor> listaCorredores;


  public Carrera(String nombre, Date fechaCarrera, String lugar, int nMaximo) {
        this.nombre = nombre;
        this.fechaCarrera = fechaCarrera;
        this.lugar = lugar;
        this.nMaximo = nMaximo;
     
    }
    
    

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }



 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getnMaximo() {
        return nMaximo;
    }

    public void setnMaximo(int nMaximo) {
        this.nMaximo = nMaximo;
    }


 

    
      public String[] toArrayString(){
    
    String [] s= new String [4];
    s[0] = nombre;
    s[1] = fechaCarrera.toString();
    s[2] = lugar;
    s[3] = Integer.toString(nMaximo);

    return s;}
}
