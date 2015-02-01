/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.sql.*; 

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Rabais {
    
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";

    //  Database credentials
    static final String USER = "username";
    static final String PASS = "password";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        System.out.println("Rabais!");
    }
    
    public void createDB(){
        
    }
    
}

