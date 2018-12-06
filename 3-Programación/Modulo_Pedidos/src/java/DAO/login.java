/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Edgar
 */
public class login {
    
    Connection cn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
   public int validarUsuario(String correo,String clave){
       int idUsuario=-1;
       try{
           Conexion conexion= new Conexion();
           cn=conexion.getConexionBD();
           String sql="SELECT usuario FROM usuario_empleado WHERE usuario=? AND clave=?";
           ps=cn.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, clave);
            rs=ps.executeQuery();
            rs.next();
            idUsuario=rs.getInt(1);
            System.out.println(idUsuario);
       }catch (Exception e) {
           
       }
       return idUsuario;
   }
}
