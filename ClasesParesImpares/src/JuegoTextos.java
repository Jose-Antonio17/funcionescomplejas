public class JuegoTextos {
    public static int getSumaTexto(String texto) {
        int suma = 0;
        for (int i = 0; i < texto.length(); i++) {
            String numero = String.valueOf(texto.charAt(i));
            int numeroCovertido = Integer.parseInt(numero);
            suma += numeroCovertido;
        }
        return suma;
    }
}
