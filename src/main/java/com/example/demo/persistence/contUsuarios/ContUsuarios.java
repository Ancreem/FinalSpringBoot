package com.example.demo.persistence.contUsuarios;

import com.example.demo.persistence.ContAudioVisual;
import com.example.demo.persistence.Usuarios;
import com.example.demo.persistence.dtos.ContUsuariosDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "cont_usuarios")
public class ContUsuarios {

    @EmbeddedId
    private ContUsuariosId id;

    @ManyToOne
    @MapsId("codigoUsuarios")
    @JoinColumn(name = "codigo_usuarios")
    private Usuarios usuarios;

    @ManyToOne
    @MapsId("codigoContAudioVisual")
    @JoinColumn(name = "codigo_cont_audio_visual")
    private ContAudioVisual contAudioVisual;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    public ContUsuariosId getId() {
        return id;
    }

    public void setId(ContUsuariosId id) {
        this.id = id;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public ContAudioVisual getContAudioVisual() {
        return contAudioVisual;
    }

    public void setContAudioVisual(ContAudioVisual contAudioVisual) {
        this.contAudioVisual = contAudioVisual;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ContUsuariosDTO toDTO(){
        ContUsuariosDTO dto = new ContUsuariosDTO();

        dto.setCodigoUsuarios(this.getUsuarios().getCodigoUsuarios());
        dto.setCodigoContAudioVisual(this.getContAudioVisual().getCodigoContAudioVisual());
        dto.setCantidad(this.cantidad);

        return dto;
    }

    @Override
    public String toString() {
        return "ContUsuarios{" +
                "id=" + id +
                ", usuarios=" + usuarios +
                ", contAudioVisual=" + contAudioVisual +
                ", cantidad=" + cantidad +
                '}';
    }
}
