/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.sql.Date;

/**
 *
 * @author alessandro
 */
public class DateTuple {
    private Date fechaInic;
    private Date fechaFin;

    public DateTuple() {
    }

    public DateTuple(Date fechaInic, Date fechaFin) {
        this.fechaInic = fechaInic;
        this.fechaFin = fechaFin;
    }

    public Date getFechaInic() {
        return fechaInic;
    }

    public void setFechaInic(Date fechaInic) {
        this.fechaInic = fechaInic;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "DateTuple{" + "fechaInic=" + fechaInic.toString() + 
                ", fechaFin=" + fechaFin.toString() + '}';
    }
    
}
