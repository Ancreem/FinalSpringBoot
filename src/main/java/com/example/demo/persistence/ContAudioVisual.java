package com.example.demo.persistence;



import com.example.demo.persistence.dtos.ContAudioVisualDTO;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.awt.*;
import java.util.List;

@Entity
public class ContAudioVisual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoContAudioVisual;
    @Column(name= "nombre",nullable = false)
    private String nombre;

    @OneToMany(fetch = FetchType.EAGER)
    @Column(name= "estado_visualizacion_id",nullable = false)
    private EstadoVisualizacion estadoVisualizacion;

//    @OneToMany(mappedBy = "cont_audio_visual", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @Column(name= "tipo_contenido_id",nullable = false)
//    private List<TipoContenido> tipoContenido;
//
//    @OneToMany(mappedBy = "cont_audio_visual", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @Column(name= "plataforma_id",nullable = false)
//    private List<Plataforma> plataforma;
//
//    @OneToMany(mappedBy = "cont_audio_visual", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @Column(name= "genero_id",nullable = false)
//    private List<Genero> genero;

    @Column(name= "calificacion",nullable = true)
    private double calificacion;

    @Column(name= "comentario",nullable = true)
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

    public EstadoVisualizacion getEstadoVisualizacion() {
        return estadoVisualizacion;
    }

    public void setEstadoVisualizacion(EstadoVisualizacion estadoVisualizacion) {
        this.estadoVisualizacion = estadoVisualizacion;
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

    //    public ContAudioVisualDTO toDTO(){
//        ContAudioVisualDTO dto = new ContAudioVisualDTO();
//        dto.setCodigoContAudioVisual(this.codigoContAudioVisual);
//        dto.setNombre(this.nombre);
//        dto.setCalificacion(this.calificacion);
//        dto.setComentario(this.comentario);
//        return dto;
//    }


}
