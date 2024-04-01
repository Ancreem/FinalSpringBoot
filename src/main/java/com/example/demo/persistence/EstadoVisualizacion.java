package com.example.demo.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EstadoVisualizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEstadoVisualizacion;
    @Column(name= "nombre",nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    private List<ContAudioVisual> contAudioVisuals;

    public Integer getCodigoEstadoVisualizacion() {
        return codigoEstadoVisualizacion;
    }

    public void setCodigoEstadoVisualizacion(Integer codigoEstadoVisualizacion) {
        this.codigoEstadoVisualizacion = codigoEstadoVisualizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
