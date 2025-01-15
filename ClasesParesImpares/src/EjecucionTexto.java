public class EjecucionTexto {
    public static void main(String[] args) {
        String isbn = "8441513929";
        boolean validacion = JuegoTextos.validarISBN(isbn);
        if(validacion){
            System.out.println("ISBN correcto");
        } else {
            System.out.println("ISBN incorrecto");
        }

        String narcisista = "153";
        validacion = JuegoTextos.narcisista(narcisista);
        if(validacion){
            System.out.println("Número narcisista");
        } else {
            System.out.println("Número no narcisista");
        }
        //String texto = "123456";
        //int suma = JuegoTextos.getSumaTexto(texto);
        //System.out.println(suma);
    }
}
