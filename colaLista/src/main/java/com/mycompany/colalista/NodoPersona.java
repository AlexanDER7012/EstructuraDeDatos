    package com.mycompany.colalista;

    public class NodoPersona {
    private Persona persona;
    private NodoPersona siguiente;

    public NodoPersona(Persona persona){
        this.persona = persona;
        this.siguiente = null;
    }

        public Persona getPersona() {
            return persona;
        }

        public void setPersona(Persona persona) {
            this.persona = persona;
        }

        public NodoPersona getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoPersona siguiente) {
            this.siguiente = siguiente;
        }

    }
