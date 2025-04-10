// todos los ejercicios de aca los hago correr en BLUEJ

public class Potencia
{
   public String mostrarNotacion(int k){
      String res = "";
             
        if(k == 0){
             res = "1";
        }else if(k == 1){
            res = "2";
        }else {
            if(k % 2  != 0){
                res = "(2 *" + ")" +"^" + mostrarNotacion(k-1) ;
            }else 
                 res = "(" + res + ")"+ "^" + generarNotacion(k/2);
            
        }
        
        return res;
    }
  
    
        
}

// este ejercicio trata de dar una plabra y mediante las posiciones pares va obteniendo los caracteres y va creando una nueva palabra
public class Etimology {

    public String nuevaPalabra(String s, int k) {
        if(k <= 0){
            return s;
        }else{
         return nuevaPalabra(s+s,k,0,"");
        }
        
    }

    private String nuevaPalabra(String s,  int k,int pos, String res) {
        if(pos < s.length() -1){
            return nuevaPalabra(s,k,pos+2, res + s.charAt(pos));
        }else{
            return nuevaPalabra(res, k - 1);
        }
    }
}