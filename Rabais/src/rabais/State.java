/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.sql.Date;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 */
public interface State {
    
    public void doAction(Oferta offer, Date date);
    
}
