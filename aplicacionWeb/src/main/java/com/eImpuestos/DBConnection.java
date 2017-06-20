package com.eImpuestos;

import java.sql.*;
 
/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */
public class DBConnection {
   /**Parametros de conexion*/
   static String db = "IVA_Prod";
   static String login = "sa";
   static String password = "qtimportaA1";
   static String host = "localhost";
   //static String url = "jdbc:sqlserver://"+host+";DatabaseName="+db+";integratedSecurity=true";
   //static String url = "jdbc:sqlserver://PC-NICO;databaseName=IVA_ESTUDIO;instanceName=SQLEXPRESS;integratedSecurity=true";
   //static String url = "jdbc:jtds:sqlserver://191.85.165.47/IVA_Prod;";
    static String url = "jdbc:jtds:sqlserver://PC-NICO/IVA_ESTUDIO;instance=SQLEXPRESS;user=sa;password=s3cr3t";
    
   Connection connection = null;
 
   /** Constructor de DbConnection */
   public DBConnection() {
      try{
         System.out.println("Intentando conectar a la base SQL...");
         //obtenemos el driver de para mysql
         Class.forName("net.sourceforge.jtds.jdbc.Driver");
         //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         //obtenemos la conexión
          System.out.println("Getting connection...");
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection!=null){
            System.out.println("Conexión a base de datos "+db+" OK\n");
         }
      }
      catch(SQLException e){
         e.printStackTrace(System.out);
      }catch(ClassNotFoundException e){
         e.printStackTrace(System.out);
      }catch(Exception e){
         e.printStackTrace(System.out);
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