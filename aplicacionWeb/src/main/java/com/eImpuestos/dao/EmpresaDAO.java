package com.eImpuestos.dao;

import com.eImpuestos.entity.Empresa;
import com.eImpuestos.DBConnection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpresaDAO {
/**
 * permite consultar la lista de empleados
 * @return
 */
public ArrayList< Empresa> lista() {
  ArrayList<Empresa> empresas = new ArrayList<Empresa>();
  DBConnection conex= new DBConnection();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empresa");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
    Empresa persona= new Empresa();
    persona.setNombre(res.getString("nombre"));
    persona.setCuit(res.getString("cuit"));
    empresas.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
   //JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
  }
  return empresas;
 }
 
}