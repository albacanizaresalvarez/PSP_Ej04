/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.GregorianCalendar;



/**
 *
 * @author albit
 */
public class Analista extends Empleado implements Fecha{
    
    float plusAnual;
    int edad;
    
    public Analista(int numero, String nombre, float sueldo, float sueldo_max, int diaAlta, int mesAlta, int anoAlta, float plusAnual, int edad) {
        super(numero, nombre, sueldo, sueldo_max, diaAlta, mesAlta, anoAlta);
        this.plusAnual = plusAnual;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Analista{" + "numero=" + numero + ", nombre=" + nombre + ", sueldo=" + sueldo + ", sueldo_max=" + sueldo_max + ", diaAlta=" + diaAlta + ", mesAlta=" + mesAlta + ", anoAlta=" + anoAlta + ", plusAnual= " + plusAnual + ", edad= " + edad + '}';

    }
    
    public void cumpleAños()
    {
         
        if(diaAlta == día() && mesAlta == mes())
        {
            System.out.println("Este analista cumple años");
           
            if((sueldo + 100) < sueldo_max)
            {
                sueldo = sueldo + 100;
            }
            else{
                System.out.println("No se puede cobrar el cumpleaños porque se supera el sueldo máximo");
            }
        }
        else
        {
            System.out.println("No cumpleAños");
        }
        
    }
    
    
    
    public float getPlusAnual() {
        return plusAnual;
    }

    public void setPlusAnual(float plusAnual) {
        this.plusAnual = plusAnual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int día() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(DIA_DEL_MES);
    }

    @Override
    public int mes() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(MES_DEL_AÑO)+1;
    }

    @Override
    public int año() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(AÑO); 
    }

  

    
    
}
