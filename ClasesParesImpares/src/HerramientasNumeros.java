public class HerramientasNumeros {
    public static void mostrarCollatz (int numero){
        while (numero != 1){
            String mensaje = getNumeroCollatz(numero);
            System.out.println(mensaje);
        }
    }
    private static String getNumeroCollatz (int numero){
        String mensaje = "";
        if (numero%2==0 ){
            numero = numero /2;
            mensaje = "Par: " + numero;
        } else {
            numero = numero * 3 + 1;
            mensaje = "Impar: " + numero;
        }
        return mensaje;
    }
}
