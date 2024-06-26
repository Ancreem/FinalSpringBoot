package com.example.demo.persistence;

import com.example.demo.persistence.dtos.GeneroDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoGenero;
    @Column(name= "nombre",nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private List<ContAudioVisual> contAudioVisuals;

    public Integer getCodigoGenero() {
        return codigoGenero;
    }

    public void setCodigoGenero(Integer codigoGenero) {
        this.codigoGenero = codigoGenero;
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

    public GeneroDTO toDTO(){
        GeneroDTO dto = new GeneroDTO();

        dto.setCodigoGenero(this.codigoGenero);
        dto.setNombre(this.nombre);

        return dto;

    }

    @Override
    public String toString() {
        return "Genero{" +
                "codigoGenero=" + codigoGenero +
                ", nombre='" + nombre + '\'' +
                ", contAudioVisuals=" + contAudioVisuals +
                '}';
    }
}
