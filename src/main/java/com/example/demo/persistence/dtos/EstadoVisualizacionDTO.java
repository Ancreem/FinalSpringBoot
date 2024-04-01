package com.example.demo.persistence.dtos;

public class EstadoVisualizacionDTO {
    private Integer codigoEstadoVisualizacion ;

    private String nombre;

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
