import java.util.Scanner;

public class JuegoArrays {
    public static int sumarNumerosArray(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            System.out.println(numeros[i]);
        }
        return suma;
    }

    public static int[] numeros(int elementos) {
        int[] numeros = new int[elementos];
        for (int i = 0; i < numeros.length; i++) {
            int numeroRandom = (int) (Math.random() * 100);
            numeros[i] = numeroRandom;
        }
        return numeros;
    }
}
