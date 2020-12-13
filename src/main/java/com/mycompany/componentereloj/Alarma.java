/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.componentereloj;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 34605
 */
public class Alarma implements Serializable
{
    private Date horaAlarma;
    private boolean activa;

    public Alarma(Date horaAlarma, boolean activa) {
        this.horaAlarma = horaAlarma;
        this.activa = activa;
    }

    public Date getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(Date horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
