/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unimagdale.logica;


public class Tarea {
    private final String descripcion;
    private final int duracion;
    private final Fases fase;

    public Tarea(String descripcion, int duracion, Fases fase) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.fase = fase;
    }

    public Tarea(String descripcion, Fases fase) {
        this(descripcion, 10, fase);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public Fases getFase() {
        return fase;
    }
    
    
    
}
