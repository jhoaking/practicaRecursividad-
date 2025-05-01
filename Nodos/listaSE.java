package Edl;
public class ListaSE<T>{ 
    private  NodoSE<T> ini;
    private int size;
    
    public ListaSE(){
        ini = new NodoSE<T>();
        size = 0;
    }
    
    
    public T get(int pos){
        T res = null;
        if(pos >= 0 && pos <= size){
            NodoSE<T> actual = ini ;
            while(pos > 0){
                actual = actual.getSig();
                pos --;
            }
            res = actual.getDato();
        }
        return res;
    }
    
    public int size(){
        return size;
    }
    
    public void add(T valor){
        NodoSE<T> aux = ini;
        while(!aux.vacio()){
          aux = aux.getSig(); 
        }
        aux.setDato(valor);
        aux.setSig(new NodoSE<T>());
        size ++;
    }
    
    public T remove (int pos){
        T res = null;
        if(pos >= 0 && pos < size){
            NodoSE<T> anterior = null;
            NodoSE<T> ac = ini;
            while(pos > 0){
                anterior = ac;
                ac = ac.getSig();
                pos--;
            }
            res = ac.getDato();
            if(anterior == null){
                ini = ini.getSig();
            }else{
                anterior.setSig(ac.getSig());
            }
            size --;
        }
        return res;
    }
    
   
    
    public boolean remove (T dato){
        int index = indexOf(dato);
        boolean res = false;
        if(index >= 0 ){
            remove(index);
            res = true;
        }
        return res;
    }
    
     public  int indexOf(T dato){
        int pos = -1;
        if(!ini.vacio()){
            NodoSE<T> act = ini;
            pos = 0;
            while(pos < size && !act.getDato().equals(dato)){
                act = act.getSig();
                pos++;
            }
            if(pos == size){
                pos = -1;
            }
        }
        return pos;
    }
}
