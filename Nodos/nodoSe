package Edl;
public class NodoSE <T>{
     private T dato;
     private NodoSE<T> sig;
     
     public NodoSE(){
        dato = null;
        sig = null;
     }
     
     public NodoSE(T valor){
        dato = valor;
        sig = new NodoSE<T>();
    }
    
    
    public T getDato(){
        return dato;
    }
    
     public NodoSE<T> getSig(){
        return sig;
    }
    
    public void setDato(T valor){
        dato = valor;
    }
    
    public void setSig(NodoSE<T> otro){
        sig = otro;
    }
    
    public boolean vacio(){
        boolean res = false;
        if(dato == null){
            res = true;
        }
        return res;
    }
}
