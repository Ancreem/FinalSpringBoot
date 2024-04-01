package com.example.demo.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estado_visualizacion")
public class EstadoVisualizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEstadoVisualizacion;
    @Column(name= "nombre",nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "estadoVisualizacions", cascade = CascadeType.ALL)
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

    public List<ContAudioVisual> getContAudioVisuals() {
        return contAudioVisuals;
    }

    public void setContAudioVisuals(List<ContAudioVisual> contAudioVisuals) {
        this.contAudioVisuals = contAudioVisuals;
    }
}
