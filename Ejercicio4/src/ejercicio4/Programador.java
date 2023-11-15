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
public class Programador extends Empleado implements Fecha{
    
    float extraMensual;
    int anosTrabajados;

    public Programador(int numero, String nombre, float sueldo, float sueldo_max, int diaAlta, int mesAlta, int anoAlta, float extraMensual, int anosTrabajados) {
        super(numero, nombre, sueldo, sueldo_max, diaAlta, mesAlta, anoAlta);
        this.extraMensual = extraMensual;
        this.anosTrabajados = anosTrabajados;
    }

    @Override
    public String toString() {
        
        return "Programador{" + "numero=" + numero + ", nombre=" + nombre + ", sueldo=" + sueldo + ", sueldo_max=" + sueldo_max + ", diaAlta=" + diaAlta + ", mesAlta=" + mesAlta + ", anoAlta=" + anoAlta + ", extraMensual=" + extraMensual + ", anosTrabajados=" + anosTrabajados + '}';
    }
    
    public void cumpleMes()
    {
        if(diaAlta == día())
        {
            System.out.println("Este programador cumple meses");
           
            if((sueldo + 100) < sueldo_max)
            {
                sueldo = sueldo + 100;
            }
            else{
                System.out.println("No se puede cobrar el cumplemes porque se supera el sueldo máximo");
            }
        }
        else
        {
            System.out.println("No cumplemes");
        }
    }
    
    
    
    public float getExtraMensual() {
        return extraMensual;
    }

    public void setExtraMensual(float extraMensual) {
        this.extraMensual = extraMensual;
    }

    public int getAnosTrabajados() {
        return anosTrabajados;
    }

    public void setAnosTrabajados(int añosTrabajados) {
        this.anosTrabajados = añosTrabajados;
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
