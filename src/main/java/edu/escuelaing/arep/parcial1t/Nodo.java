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
public class Nodo<V> {
    private Nodo<V> sig;
    private V valor;
    
    /**
     * Constructor para los nodos que forman parte de la lista
     * 
     * @param valor numero que va a tener esa posicion de la lista
     * @param sig siguiente nodo en la lista, si es nulo este es el ultimo elemento
     */
    public Nodo(V valor, Nodo<V> sig) {
        this.valor = valor;
        this.sig = sig;
    }
    
    /**
     * Metodo que retorna el valor actual del nodo
     * @return V valor asignado al nodo
     */
    public V getValor() {
        return valor;
    }
    
    /**
     * Metodo que retorna el nodo siguiente
     * @return Nodo siguiente en la linked list
     */
    public Nodo<V> getSiguiente() {
        return sig;
    }
    
    /**
     * Metodo que cambia el nodo siguiente a uno nuevo
     * @param nodo el nodo a definir como siguiente
     */
    public void setSiguiente(Nodo<V> nodo) {
        this.sig = nodo;
    }
}
