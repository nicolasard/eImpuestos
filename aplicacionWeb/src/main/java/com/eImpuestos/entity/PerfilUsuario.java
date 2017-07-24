package com.eImpuestos.entity;

public class PerfilUsuario {
    
    private int id;
    private String nombreCompleto;
    private String email;
    private String telefono;
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
        
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}