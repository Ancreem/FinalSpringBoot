package com.example.demo.persistence.dtos;

public class UsuariosDTO {

    private Integer codigoUsuarios;
    private String nombre;
    private String apellido;
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
}
