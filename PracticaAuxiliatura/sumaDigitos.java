  
public class Ejercicio{
   public int cantidadDigito(int n){
       return cantidadDigito(n, 0);
    }
    
   private int cantidadDigito (int n , int suma){
        int res  = 0;
        if(n == 0){
             if(suma < 10){
                res = suma;
            }else {
                res = cantidadDigito(suma,0);
                }
        }else {
            int digi = n %10;
            res = cantidadDigito(n/10, suma + digi);
        }
        return res;
    } 
    
}
    
     /

