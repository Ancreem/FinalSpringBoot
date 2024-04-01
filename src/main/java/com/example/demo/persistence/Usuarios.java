package com.example.demo.persistence;

import com.example.demo.persistence.dtos.UsuariosDTO;
import jakarta.persistence.*;

@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoUsuarios;

    @Column(name= "nombre",nullable = false)
    private String nombre;
    @Column(name= "apellido", nullable = false)
    private String apellido;

    @Column(name= "email",nullable = false, unique = true)
    private String email;

    public Integer getCodigoUsuarios() {
        return codigoUsuarios;
    }

    public void setCodigoUsuarios(Integer codigoUsuarios) {
        this.codigoUsuarios = codigoUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //    public UsuariosDTO toDTO(){
//        UsuariosDTO dto = new UsuariosDTO();
//        dto.setCodigoUsuarios(this.codigoUsuarios);
//        dto.setNombre(this.nombre);
//        dto.setApellido(this.apellido);
//        dto.setEmail(this.email);
//        return dto;
//    }
}
