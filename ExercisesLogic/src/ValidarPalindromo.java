
public class ValidarPalindromo {

    public static void main(String[] args){
        String palabra = Reutilizacion.ingresarTexto("Ingrese la palabra para verificar si es un palindromo: ");
        boolean palindromo = validarPalindromo(palabra);
        Reutilizacion.mostrarTexto("La palabra es palindromo: " + palindromo);
    }

    public static boolean validarPalindromo(String palabra){
        int numLetras = palabra.length();
        char primera = ' ';
        char ultima =' ';
        boolean condicion = true;

        for(int i = 0; i < numLetras;  i++){
            primera = palabra.charAt(i);
            ultima = palabra.charAt(numLetras - 1 - i);


            if (primera !=  ultima) {
                condicion = false;
                break;

            }
        }

        return condicion;

    }


}
