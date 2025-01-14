import java.util.Scanner;

public class EjecucionTabla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insertar numero: ");
        String entrada = teclado.nextLine();
        int numero = Integer.parseInt(entrada);
        HerramientaTabla.mostrarTablaMultiplicar(numero);
    }
}
