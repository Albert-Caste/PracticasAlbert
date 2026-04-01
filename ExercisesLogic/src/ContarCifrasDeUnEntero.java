public class ContarCifrasDeUnEntero {

    public static void main(String[] args){
        int num = Reuse.enterInt("Ingrese un número para contar sus cifras");
        int numCifras = contarCifras(num);

        System.out.println("El núermo ingresado tiene: " + numCifras + " cifras");

    }

    public static int contarCifras(int numero){
        int contador =0;
        for (int i = numero ; i>0; i/=10 ){
            contador++;

        }
        return  contador;
    }
}
