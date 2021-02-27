package com.company;


public class Cliente {

    private String nombreUsuario;
    private String dni;

    public Cliente(String nombreUsuario, String dni) {
        this.nombreUsuario = nombreUsuario;
        this.dni = dni;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
