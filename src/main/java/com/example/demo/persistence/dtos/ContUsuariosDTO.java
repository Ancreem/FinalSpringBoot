package com.example.demo.persistence.dtos;

public class ContUsuariosDTO {

    private Integer codigoUsuarios;

    private Integer codigoContAudioVisual;

    private Integer cantidad;


    public ContUsuariosDTO() {
    }

    public Integer getCodigoUsuarios() {
        return codigoUsuarios;
    }

    public void setCodigoUsuarios(Integer codigoUsuarios) {
        this.codigoUsuarios = codigoUsuarios;
    }

    public Integer getCodigoContAudioVisual() {
        return codigoContAudioVisual;
    }

    public void setCodigoContAudioVisual(Integer codigoContAudioVisual) {
        this.codigoContAudioVisual = codigoContAudioVisual;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
