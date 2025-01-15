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

    public static boolean validarISBN(String isbn) {
        int suma = 0;
        for (int i = 0; i < isbn.length(); i++) {
            String numero = String.valueOf(isbn.charAt(i));
            int numeroCovertido = Integer.parseInt(numero);
            suma += (numeroCovertido*(i+1));
        }
        if (suma % 11 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean narcisista (String num){
        int numeroTexto = Integer.parseInt(num);
        int suma = 0;
        for (int i = 0; i < num.length(); i++) {
            String numero = String.valueOf(num.charAt(i));
            int numeroCovertido = Integer.parseInt(numero);
            suma += ((int) Math.pow(numeroCovertido, 3));
        }
        System.out.println(suma);
        if (numeroTexto == suma){
            return true;
        } else {
            return false;
        }
    }
}
