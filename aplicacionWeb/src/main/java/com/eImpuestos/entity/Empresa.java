package com.eImpuestos.entity;

public class Empresa {
    
    private String nombre;
    private String cuit;
    
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