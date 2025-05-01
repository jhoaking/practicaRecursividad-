// todos los ejercicios de aca los hago correr en BLUEJ
//este ejercicio trata sobre hacer el metodo de ordenamiento burbuja
import java.util.*;
public class Burbuja
{
   public ArrayList<Integer> metodo(ArrayList<Integer>numeros){
    return metodo(numeros,0,false);
    }
    
    private ArrayList<Integer> metodo(ArrayList<Integer>numeros, int pos, boolean hayCambio){
        
        if(pos <= numeros.size()){
            if(!hayCambio){
                return numeros;
            }
            return metodo(numeros,0,false);
        }
        if(numeros.get(pos) > numeros.get(pos +1)){
            int aux = numeros.get(pos);
            numeros.set(pos,numeros.get(pos+1));
            numeros.set(pos+ 1, aux);
            hayCambio = true;
        }
        
        return metodo(numeros, pos+1,hayCambio);
    }
}


public class triangulo{
    public int cantRombo(int n) {
        if (n <= 1) {
            return 0; 
        } else {
            return rombits(n - 1) + (int)Math.pow(3, n - 1);
        }
    }
}