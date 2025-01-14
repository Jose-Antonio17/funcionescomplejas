import java.util.Scanner;

public class EjecucionParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza el número inicial");
        String entrada = teclado.nextLine();
        int inicio = Integer.parseInt(entrada);
        System.out.println("Introduzca el número final");
        entrada = teclado.nextLine();
        int fin = Integer.parseInt(entrada);
        ClaseParesImpares.getRangoNumeros(inicio, fin, true);
        ClaseParesImpares.getRangoNumeros(inicio, fin, false);
    }
}
