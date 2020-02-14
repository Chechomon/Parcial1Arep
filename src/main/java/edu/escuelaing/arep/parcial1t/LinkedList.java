package edu.escuelaing.arep.parcial1t;

/**
 *
 * @author sergio.pena
 */
public class LinkedList<V> {
    
    private Cabeza<V> cab;
    private int tam;

    public LinkedList() {
        cab = new Cabeza<V>(null, null);
    }

    /**
     * Metodo que agrega un nuevo nodo a la linkedList
     * @param valor valor del nodo que se va a agregar
     */
    public void add(V valor) {
        Nodo<V> node = new Nodo<V>(valor, null);
        if (cab.getPrimero() == null)
            cab.setPrimero(node);
        else {
            Nodo<V> pointer = cab.getPrimero();
            while (pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(node);
        }
        tam++;
        cab.setUltimo(node);

    }
    
    /**
     * Metodo que elimina un nodo de la linkedList
     * @param valor valor del nodo que se va a eliminar
     */
    public void delete(V valor){
        if(cab!=null){
            if(cab.getPrimero()==valor){
                Nodo<V> pointer = cab.getPrimero();
            }
            else{
                Nodo<V> actual= cab.getPrimero();
                Nodo<V> anterior=cab.getUltimo();
                while(actual !=null){
                    if(actual.getValor()==valor){
                        anterior.setSiguiente(actual.getSiguiente());
                        break;
                    }
                actual=actual.getSiguiente();
                anterior=anterior.getSiguiente();
                }
            }
        }
        
    }
    
    /**
     * Metodo que retorna el valor del primero
     * @return Nodo valor del nodo que actualmente desea
     */
    public Nodo<V> getPrimero(){
        return cab.getPrimero();
    }
    
    /**
     * Metodo que retorna el tamaño de la linkedList
     * @return int valor del tamaño 
     */
    public int  getTamano(){
        return tam;
    }
}