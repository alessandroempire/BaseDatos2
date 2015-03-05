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
public class Deshabilitado implements State{
    
    public void doAction(Oferta offer, Date date){
        System.out.println("Promocion no vigente!");
        
        Iterator iter = offer.getFecha_de_vigencia().iterator();
        
        while (iter.hasNext()){
            Object fecha = iter.next();
            DateTuple vigencia = (DateTuple) fecha; 
            
            System.out.println(vigencia.toString());
            System.out.println(date.toString());
            
 
            if (vigencia.getFechaInic().before(date) && vigencia.getFechaFin().after(date)){
                offer.setState(new Habilitado());
                System.out.println("Se cambia a habilitado");
                break; 
            }
            else 
                System.out.println("Se mantiene Deshabilitado");
        }
        
    }    
}

/*
      if(vigencia.getFechaInic().before(date))
                System.out.println("INIC after1");
            else
                System.out.println("INICotro1");
            
            if(vigencia.getFechaInic().after(date))
                System.out.println("INIC after1");
            else
                System.out.println("INIC otro1");
            
            
            if(vigencia.getFechaFin().after(date))
                System.out.println("FIN after1");
            else
                System.out.println("FIN otro1");
            
            if(vigencia.getFechaFin().before(date))
                System.out.println("FIN after1");
            else
                System.out.println("FIN otro1");
*/
