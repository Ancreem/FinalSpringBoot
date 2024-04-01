package com.example.demo.persistence.dtos;

public class ContAudioVisualDTO {
    private Integer codigoContAudioVisual;
    private String nombre;
    private double calificacion;
    private String comentario;

    public Integer getCodigoContAudioVisual() {
        return codigoContAudioVisual;
    }

    public void setCodigoContAudioVisual(Integer codigoContAudioVisual) {
        this.codigoContAudioVisual = codigoContAudioVisual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
