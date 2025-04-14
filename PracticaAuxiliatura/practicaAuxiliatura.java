// a todos los ejercicios de aca los hago correr en BLUEJ

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

