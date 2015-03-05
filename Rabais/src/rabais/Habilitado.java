/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.sql.Date;
import java.util.Iterator;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 */
public class Habilitado implements State{
    
    public void doAction(Oferta offer, Date date){
        System.out.println("Promocion vigente!");
        
        Iterator iter = offer.getFecha_de_vigencia().iterator();
        
        while (iter.hasNext()){
            Object fecha = iter.next();
            DateTuple vigencia = (DateTuple) fecha; 
            
            //System.out.println(vigencia.toString());
            //System.out.println(date.toString());
            
            if (vigencia.getFechaInic().after(date) || vigencia.getFechaFin().before(date)){
                offer.setState(new Deshabilitado());
                System.out.println("Se cambia a Deshabilitado");
                break;
            }
            else 
                System.out.println("Se mantiene habilitado");
        }
    }
    
}
