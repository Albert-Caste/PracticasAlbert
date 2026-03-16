import java.util.Scanner;

public class Reutilizacion {


    public static void mostrarTexto(String texto){
        System.out.println(texto);
    }

    public static String ingresarTexto(String entrada){
        Scanner scanner = new Scanner(System.in);
        System.out.println(entrada);
        return scanner.nextLine();
    }

    public static int ingresarEntero(String entrada){
        Scanner scanner = new Scanner(System.in);
        System.out.println(entrada);
        return scanner.nextInt();
    }

    public static double ingresarDecimal(String entrada){
        Scanner scanner = new Scanner(System.in);
        System.out.println(entrada);
        return scanner.nextDouble();
    }

    public static boolean ingresarBoolean(String entrada){
        Scanner scanner = new Scanner(System.in);
        System.out.println(entrada);
        return scanner.nextBoolean();
    }

    //Método para ingresar caracter char

    public static  char ingresarChar(String entrada){
        Scanner scanner = new Scanner(System.in);
        System.out.println(entrada);
        return scanner.next().charAt(0);

    }

    // Método para ingresar arreglos de texto

    public static String[] ingresarArregloString(int cantidad,String mensaje){
        String[] nuevoArreglo = new String[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]=ingresarTexto(mensaje+"(" + (i+1) + " de " + cantidad+ "):");
        }
        return nuevoArreglo;
    }

    // Método para ingresar arreglos de Entero

    public static int[] ingresarArregloEntero(int cantidad,String mensaje){
        int[] nuevoArreglo = new int[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]=ingresarEntero(mensaje+"(" + (i+1) + " de " + cantidad+ "):");
        }
        return nuevoArreglo;
    }

    // Método para ingresar arreglos de double

    public static double[] ingresarArregloDecimal(int cantidad,String mensaje){
        double[] nuevoArreglo = new double[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]=ingresarDecimal(mensaje+"(" + (i+1) + " de " + cantidad+ "):");
        }
        return nuevoArreglo;
    }

    public static boolean validarVocales(char letra){
        boolean vocal=false;

        if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
            vocal = true;
        }

        return vocal;
    }

}
