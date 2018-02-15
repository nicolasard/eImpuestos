package com.nicard.dao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tiporesponsable")
public class TipoResponsable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoResponsableID")
    private int tipoResponsableID;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public int getTipoResponsableID() {
        return tipoResponsableID;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
