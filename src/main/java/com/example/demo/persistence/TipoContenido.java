package com.example.demo.persistence;

import com.example.demo.persistence.dtos.TipoContenidoDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoContenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoTipoContenido;
    @Column(name= "nombre",nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "tipoContenido", cascade = CascadeType.ALL)
    private List<ContAudioVisual> contAudioVisuals;

    public Integer getCodigoTipoContenido() {
        return codigoTipoContenido;
    }

    public void setCodigoTipoContenido(Integer codigoTipoContenido) {
        this.codigoTipoContenido = codigoTipoContenido;
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

    public TipoContenidoDTO toDTO(){
        TipoContenidoDTO dto = new TipoContenidoDTO();

        dto.setCodigoTipoContenido(this.codigoTipoContenido);
        dto.setNombre(this.nombre);

        return dto;
    }
}
