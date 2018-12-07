/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Edgar
 */
public class Conexion {
    
    public Connection getConexionBD(){
        Connection cn= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/modulo_pedidos","root","");
            System.out.println("SE HA CONECTADO :)");
        }catch(Exception e){
            System.out.println("NO LOGRÓ CONECTARSE :(");
        }
        return cn;
    }
    
    public static void main(String[] args){
       Conexion conectando= new Conexion();
       conectando.getConexionBD();
    }
}
