public class ClaseParesImpares {
    public static void getRangoNumeros(int inicio, int fin, boolean dato){
        if(dato == true ){
            getNumerosPares(inicio, fin);
        } else {
            getNumerosImpares(inicio, fin);
        }
    }
    private static void getNumerosImpares (int inicio,int fin) {
        for(int i = inicio; i <=fin; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    private static void getNumerosPares (int inicio,int fin) {
        for(int i = inicio; i <=fin; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
