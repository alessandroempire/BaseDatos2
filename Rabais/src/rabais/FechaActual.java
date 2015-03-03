/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.sql.Date; 
import java.util.Calendar;
/**
 *
 * @author alessandro
 */
public class FechaActual {
    private Date fecha_actual;

    //Constructor
    public FechaActual(Date fecha_actual) {
        this.fecha_actual = fecha_actual;
    }
    
    //Getters y setters
    public Date getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(Date fecha_actual) {
        this.fecha_actual = fecha_actual;
    }
    
    //Metodo
    public void nextDay(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.fecha_actual);
        cal.roll(Calendar.DATE, true);
        this.fecha_actual = new Date(cal.getTime().getTime());
    }

    @Override
    public String toString() {
        return "FechaActual{" + "fecha_actual=" + fecha_actual.toString() + '}';
    }
}
