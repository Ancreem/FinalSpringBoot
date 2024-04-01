package com.example.demo.persistence.contUsuarios;

import com.example.demo.persistence.ContAudioVisual;
import com.example.demo.persistence.Usuarios;
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


}
