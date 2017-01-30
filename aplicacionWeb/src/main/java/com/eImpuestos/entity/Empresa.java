package com.eImpuestos.entity;

public class Empresa {
    
    private int id;
    private String nombre;
    private String cuit;
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCuit(){
        return this.cuit;
    }
    
    public void setCuit(String cuit){
        this.cuit = cuit;
    }
}