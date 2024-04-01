package com.example.demo.persistence.dtos;

public class ContAudioVisualDTO {
    private Integer codigoContAudioVisual;
    private String nombre;
    private double calificacion;
    private String comentario;

    private Integer estadoVisualizacionId;

    private Integer tipoContenidoId;

    private Integer plataformaId;

    private Integer generoId;


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

    public Integer getEstadoVisualizacionId() {
        return estadoVisualizacionId;
    }

    public void setEstadoVisualizacionId(Integer estadoVisualizacionId) {
        this.estadoVisualizacionId = estadoVisualizacionId;
    }

    public Integer getTipoContenidoId() {
        return tipoContenidoId;
    }

    public void setTipoContenidoId(Integer tipoContenidoId) {
        this.tipoContenidoId = tipoContenidoId;
    }

    public Integer getPlataformaId() {
        return plataformaId;
    }

    public void setPlataformaId(Integer plataformaId) {
        this.plataformaId = plataformaId;
    }

    public Integer getGeneroId() {
        return generoId;
    }

    public void setGeneroId(Integer generoId) {
        this.generoId = generoId;
    }
}
