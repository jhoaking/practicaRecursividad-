
//este ejercicio trata sobre la manera de reescribir una potenci en base 2 a
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
                res  =  "(2" + ")" +"^" + mostrarNotacion(k/2) ;
            
        }
        
        return res;
    }
  
    
        
}