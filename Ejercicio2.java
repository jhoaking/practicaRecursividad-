import java.util.*;

public class Ejercicio2 {

    public  String desencriptar(String mensaje) {
        String res;
        if (mensaje.length() == 0) {
            res= "";
        } else {
            char actual = mensaje.charAt(0);
            int repetido = buscarRepetido(mensaje, actual, 1); 

            if (repetido == -1) {
                res = "" + actual;
            } else {
                String siguiente = mensaje.substring(repetido + 1);
                res = actual + desencriptar(siguiente);
            }
        }
        return res;
    }

    private  int buscarRepetido(String texto, char buscarLetra, int pos) {
        int res;
        if (pos < texto.length()) {
            if (texto.charAt(pos) == buscarLetra) {
                res =  pos;
            } else {
                res =  buscarRepetido(texto,buscarLetra, pos + 1);
            }
        } else {
            res= -1;
        }
        return res;
    }
}