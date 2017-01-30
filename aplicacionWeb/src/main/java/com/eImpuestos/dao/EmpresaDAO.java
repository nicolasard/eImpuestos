package com.eImpuestos.dao;

import com.eImpuestos.entity.Empresa;
import com.eImpuestos.DBConnection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpresaDAO {

public ArrayList< Empresa> lista() {
  ArrayList<Empresa> empresas = new ArrayList<Empresa>();
  DBConnection conex = new DBConnection();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empresa");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
    Empresa persona= new Empresa();
    persona.setNombre(res.getString("nombre"));
    persona.setCuit(res.getString("cuit"));
    persona.setId(res.getInt("empresaID"));
    empresas.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
      e.printStackTrace(System.out);
  }
  return empresas;
 }
    
public Empresa obtieneEmpresa(int empresaID) {
  Empresa empresa = new Empresa();
  DBConnection conex = new DBConnection();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empresa where empresaId='"+empresaID+"'");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
    empresa.setNombre(res.getString("nombre"));
    empresa.setCuit(res.getString("cuit"));
    empresa.setId(res.getInt("empresaID"));
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
      e.printStackTrace(System.out);
  }
  return empresa;
 }
 
}