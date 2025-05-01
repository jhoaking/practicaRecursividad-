package Edl;

public class ListaDE<T>{
     private NodoDE<T> ini;
    private NodoDE<T> fin;
    private int size;

    public ListaDE() {
        ini = null;
        fin = null;
        size = 0;
    }
   
    public boolean vacio() {
        return ini == null;
    }

     
    public ListaDE(NodoDE<T> nodo) {
        ini = nodo;
        fin = nodo;
        size = 1;
    }
    
    
    public void insertar(T dato){
        NodoDE<T> nuevo = new NodoDE<T>(dato);
        if(vacio()){
            ini = null;
            fin = null;
        }else if(ini == fin){
            ini.setSig(nuevo);
            fin.setAnt(nuevo);
            fin = nuevo;
        }else {
            nuevo.setAnt(fin);
            fin.setSig(nuevo);
            fin = nuevo;
        }
    } 
    
    public NodoDE<T> buscar( T dato){
        NodoDE<T> act = ini;
        if(vacio()){
            return null;
        }else{
            while(act != null){
                if(act.getDato() != null && act.getDato().equals(dato)){
                     return  act;
                }
                act = act.getSig(); 
            }
        }
        return null;
    }
}
