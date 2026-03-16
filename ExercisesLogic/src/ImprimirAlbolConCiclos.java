public class ImprimirAlbolConCiclos {

    public static void main(String[] args){
        int altura = Reutilizacion.ingresarEntero("Ingrese altura: ");
        String arbol = crearArbol(altura);
        Reutilizacion.mostrarTexto(arbol);



    }

    public static String crearArbol(int altura){
        String diagonal ="";

        for(int i = 1; i<=altura; i++){

            for(int j= 1; j<=altura*2-1; j++){

                if(altura- i<j && altura+i>j){
                    diagonal +="*";

                }else{
                    diagonal+= " ";

                }


            }
            diagonal+= "\n";
        }

        return diagonal;
    }

}
