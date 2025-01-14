public class HerramientaTabla {
    public static void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar de " + numero);
        for (int i = 0; i < 11; i++) {
            System.out.println(mostrarMensaje(numero, i, " por "));
        }
    }
    private static String mostrarMensaje(int numero, int i, String sep) {
        return (numero + sep + i + " = " + (i * numero));
    }
}
