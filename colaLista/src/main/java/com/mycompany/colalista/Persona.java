package com.mycompany.colalista;

public class Persona {
private String nombre;
private int edad;
private int turno;

public Persona (String nombre, int edad, int turno){
    this.nombre = nombre;
    this.edad = edad;
    this.turno = turno;
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "(" + nombre +"("+ turno+ "))";
    }
    }
