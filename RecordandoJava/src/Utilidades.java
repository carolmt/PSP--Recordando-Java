import java.util.Random;

public class Utilidades {

    public static void rellenarConAleatorios(int[] numerosAleatorios ) {
        Random numRandom = new Random();
        int numAleatorio;
            for(int i = 0; i < numerosAleatorios.length; i++) {
                numAleatorio = numRandom.nextInt(Integer.MAX_VALUE); //el max_Value es para el rango de valores permitidos
                numerosAleatorios[i] = numAleatorio;
            }
    }
    public static Boolean naive (int numAleatorio) {

            for(int i = 2; i < numAleatorio ; i++) {
                if(numAleatorio % i == 0) {
                    return false;
                }
            }
            return true;
    }
}
