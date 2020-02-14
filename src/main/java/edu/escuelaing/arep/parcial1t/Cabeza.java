/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.parcial1t;

/**
 *
 * @author sergio.pena
 */
public class Cabeza<V> {
    private Nodo<V> pri;
    private Nodo<V> ult;

    /**
     * Constructor para la cabeza de la lista encadenada
     * @param pri primer nodo de la lista
     * @param ult ultimo nodo de la lista
     */
    public Cabeza(Nodo<V> pri, Nodo<V> ult){
        this.pri = pri;
        this.ult = ult;
    }
    
    /**
     * Metodo que retorna el valor del primero
     * @return Nodo valor del nodo que actualmente desea
     */
    public Nodo<V> getPrimero(){
        return pri;
    }
    
    /**
     * Metodo que cambia el nodo primero a uno nuevo
     * @param nodo el nodo a definir como primero
     */
    public void setPrimero(Nodo<V> nodo){
        pri = nodo;
    }
    
    /**
     * Metodo que retorna el valor del ultimo
     * @return Nodo valor del nodo que actualmente desea
     */
    public Nodo<V> getUltimo(){
        return ult;
    }
    
    /**
     * Metodo que cambia el nodo ultimo a uno nuevo
     * @param nodo el nodo a definir como ultimo
     */
    public void setUltimo(Nodo<V> nodo){
        ult = nodo;
    }
}
