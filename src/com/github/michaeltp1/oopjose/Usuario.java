package com.github.michaeltp1.oopjose;

public class Usuario {

    private  String nombre;
    private  String email;
    private  String password;



    public Usuario(String nombre, String email, String password){
        this.nombre=nombre;
        this.email=email;
        this.password=password;

    }
    public Usuario(){
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //codigo
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //comprobar que email sea valido
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
