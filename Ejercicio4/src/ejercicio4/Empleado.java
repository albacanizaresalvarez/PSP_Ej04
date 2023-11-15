/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author albit
 */
public class Empleado implements Serializable{
    
    int numero;
    transient String nombre;
    float sueldo;
    float sueldo_max;
    int diaAlta;
    int mesAlta;
    int anoAlta;

    public Empleado(int numero, String nombre, float sueldo, float sueldo_max, int diaAlta, int mesAlta, int anoAlta) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.sueldo_max = sueldo_max;
        this.diaAlta = diaAlta;
        this.mesAlta = mesAlta;
        this.anoAlta = anoAlta;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numero=" + numero + ", nombre=" + nombre + ", sueldo=" + sueldo + ", sueldo_max=" + sueldo_max + ", diaAlta=" + diaAlta + ", mesAlta=" + mesAlta + ", anoAlta=" + anoAlta + '}';
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo_max() {
        return sueldo_max;
    }

    public void setSueldo_max(float sueldo_max) {
        this.sueldo_max = sueldo_max;
    }

    public int getDiaAlta() {
        return diaAlta;
    }

    public void setDiaAlta(int diaAlta) {
        this.diaAlta = diaAlta;
    }

    public int getMesAlta() {
        return mesAlta;
    }

    public void setMesAlta(int mesAlta) {
        this.mesAlta = mesAlta;
    }

    public int getAnoAlta() {
        return anoAlta;
    }

    public void setAnoAlta(int anoAlta) {
        this.anoAlta = anoAlta;
    }

//    @Override
//    public int día() {
//        
//        GregorianCalendar fechaActual = new GregorianCalendar();
//        return fechaActual.get(DIA_DEL_MES);
//    }
//
//    @Override
//    public int mes() {
//        
//        GregorianCalendar fechaActual = new GregorianCalendar();
//        return fechaActual.get(MES_DEL_AÑO)+1;
//    }
//
//    @Override
//    public int año() {
//        
//        GregorianCalendar fechaActual = new GregorianCalendar();
//        return fechaActual.get(AÑO);
//    }
    
    
    
}
