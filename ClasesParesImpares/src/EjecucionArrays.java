import java.util.Scanner;

public class EjecucionArrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos números quiere sumar?");
        int elementos = teclado.nextInt();
        int [] numeros = JuegoArrays.numeros(elementos);
        
        // for (int i = 0; i < numeros.length; i++) 
        // teclado = new Scanner(System.in);
        // System.out.println("Introduzca el número " + (i + 1)+":");
        // String valor = teclado.nextLine();
        // int numeroArray = Integer.parseInt(valor);
        // numeros[i] = numeroArray;
        // }
        
        int suma = JuegoArrays.sumarNumerosArray(numeros);
        System.out.println("-----------------");
        System.out.println("La suma es " + suma);
    }
}
