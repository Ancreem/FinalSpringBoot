package com.example.demo.persistence;



import com.example.demo.persistence.dtos.ContAudioVisualDTO;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.awt.*;
import java.util.List;

@Entity
@Table(name = "cont_audio_visual")
public class ContAudioVisual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoContAudioVisual;
    @Column(name= "nombre",nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "estado_visualizacion_id")
    private EstadoVisualizacion estadoVisualizacions;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_contenido_id")
    private TipoContenido tipoContenido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plataforma_id")
    private Plataforma plataforma;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genero_id")
    private Genero genero;


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

    public EstadoVisualizacion getEstadoVisualizacions() {
        return estadoVisualizacions;
    }

    public void setEstadoVisualizacions(EstadoVisualizacion estadoVisualizacions) {
        this.estadoVisualizacions = estadoVisualizacions;
    }

    public TipoContenido getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(TipoContenido tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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
