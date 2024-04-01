package com.example.demo.persistence.contUsuarios;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ContUsuariosId implements Serializable {
    @Column(name = "codigo_usuarios")
    private Integer codigoUsuarios;

    @Column(name = "codigo_cont_audio_visual")
    private Integer codigoContAudioVisual;

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
}
