// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numerosAleatorios[] = new int[100];

        Utilidades.rellenarConAleatorios(numerosAleatorios);
        long inicio = System.nanoTime(); //aqui empieza a medir el tiempo

        for(int num: numerosAleatorios)  { //recorre el array con el int
            System.out.println(num);

            if(Utilidades.naive(num) == true) {
                System.out.println("El número "+num+" es primo.");
            }
            else {
                System.out.println("El número "+num+" no es primo.");
            }
        }
        long fin = System.nanoTime();
        long tiempoTranscurrido = fin - inicio;
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoTranscurrido);
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoTranscurrido / 1000000);
        System.out.println("Tiempo de ejecución en segundos: " + tiempoTranscurrido / 1000000000);
    }
}