/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Calendar;

/**
 *
 * @author albit
 */
public interface Fecha {
    
    public final static int DIA_DEL_MES = Calendar.DAY_OF_MONTH;
    public final static int MES_DEL_AÑO = Calendar.MONTH;
    public final static int AÑO = Calendar.YEAR;

    public abstract int día();
    public abstract int mes();
    public abstract int año();
    
}
