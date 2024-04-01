package com.example.demo.persistence;

import com.example.demo.persistence.dtos.PlataformaDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoPlataforma;
    @Column(name= "nombre",nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "plataforma", cascade = CascadeType.ALL)
    private List<ContAudioVisual> contAudioVisuals;

    public Integer getCodigoPlataforma() {
        return codigoPlataforma;
    }

    public void setCodigoPlataforma(Integer codigoPlataforma) {
        this.codigoPlataforma = codigoPlataforma;
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

    public PlataformaDTO toDTO(){
        PlataformaDTO dto = new PlataformaDTO();

        dto.setCodigoPlataforma(this.codigoPlataforma);
        dto.setNombre(this.nombre);

        return dto;

    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "codigoPlataforma=" + codigoPlataforma +
                ", nombre='" + nombre + '\'' +
                ", contAudioVisuals=" + contAudioVisuals +
                '}';
    }
}
