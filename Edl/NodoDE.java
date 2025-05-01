package Edl;
public class NodoDE<T>{
     private T dato;
     private NodoDE<T> sig;
     private NodoDE<T> ant;
     public NodoDE(){
        dato = null;
        sig = null;
        ant = null;
     }
     
     public NodoDE(T valor){
        dato = valor;
        sig = new NodoDE<T>();
        ant = new NodoDE<T>();
    }
    
    
    public T getDato(){
        return dato;
    }
    
     public NodoDE<T> getSig(){
        return sig;
    }
    
     public NodoDE<T> getAnt(){
        return ant;
    }
    public void setDato(T valor){
        dato = valor;
    }
    
    public void setSig(NodoDE<T> otro){
        sig = otro;
    }
    public void setAnt(NodoDE<T> otro){
        ant = otro;
    }
    public boolean vacio(){
        boolean res = false;
        if(dato == null){
            res = true;
        }
        return res;
    }

}
