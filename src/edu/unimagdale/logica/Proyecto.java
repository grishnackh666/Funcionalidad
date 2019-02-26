/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unimagdale.logica;


public class Proyecto {
    private String nombre;
    private Tarea[] tareas;
    private Tarea[] tareasfinal;
    private int duracion;
    
    public Tarea[] consultarTareas(Fases fase){
        Tarea[] tareasporfase = null;
        int i=0;
        for(tarea t: this.tareas){
            if(t.getFase().equals(fase)){
                tareasporfase[i]=t;
                i++;
            }
        }
        return tareasporfase;
    }
    
    public Tarea añadirtarea(String nombre,Fases fase, int duracion){
        Tarea nuevaTarea;
        nuevaTarea = new Tarea(nombre,duracion,fase);
        return nuevaTarea;
    }
    
    public boolean borrartarea(Tarea tarea){
        boolean borrado=false;
        int i=0;
        for(Tarea t: this.tareas){
            if(t.getDescripcion().equals(tarea.getDescripcion())
            && t.getDuracion()==tarea.getDuracion()
            && t.getFase().equals(tarea.getFase()));
            for(int k=0; k<tareas.length-1;k++){
                tareas[k]=tareas[k+1];
            }
            borrado=true;
        }
        return borrado;
    }
    
    public boolean finalizar(Tarea tarea){
        boolean finalizado= false;
        int pos=buscartareas(tarea, tareas);
        if(pos!=-1 && buscartareas(tarea, tareasfinal)==-1){
            int k;
            for(k=0;k<tareasfinal.length; k++){
                if(tareasfinal[k]!=null){
                    k++;
                }
            }
            tareasfinal[k]=tarea;
            finalizado=true;
        }
                return false;
    }
    
    private int buscartareas(Tarea tarea, Tarea[] listaTarea){
        int pos=-1;
        int i=0;
        for(Tarea t: listaTarea){
            if(t.getDescripcion().equals(tarea.getDescripcion())
            && t.getDuracion()==tarea.getDuracion()
            && t.getFase().equals(tarea.getFase()));{
            pos =i;
        }
         i++;   
        }
        return pos;
    }
}
