package com.eImpuestos;

import java.sql.*;
 
/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */
public class DBConnection {
   /**Parametros de conexion*/
   static String db = "IVA_ESTUDIO";
   static String login = "sa";
   static String password = "";
   static String host = "localhost:1433";
   static String url = "jdbc:microsoft:sqlserver://"+host+";DatabaseName="+db;
 
   Connection connection = null;
 
   /** Constructor de DbConnection */
   public void DbConnection() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection!=null){
            System.out.println("Conexión a base de datos "+db+" OK\n");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
}