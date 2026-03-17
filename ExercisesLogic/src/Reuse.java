import java.util.Scanner;

public class Reuse {


    public static void showText(String text){
        System.out.println(text);
    }

    public static String enterText(String input){
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
        return scanner.nextLine();
    }

    public static int enterInt(String input){
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
        return scanner.nextInt();
    }

    public static double enterDouble(String input){
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
        return scanner.nextDouble();
    }

    public static boolean enterBoolean(String input){
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
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
            nuevoArreglo[i]=enterText(mensaje+"(" + (i+1) + " de " + cantidad+ "):");
        }
        return nuevoArreglo;
    }

    // Método para ingresar arreglos de Entero

    public static int[] ingresarArregloEntero(int cantidad,String mensaje){
        int[] nuevoArreglo = new int[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]=enterInt(mensaje+"(" + (i+1) + " de " + cantidad+ "):");
        }
        return nuevoArreglo;
    }

    // Método para ingresar arreglos de double

    public static double[] ingresarArregloDecimal(int cantidad,String mensaje){
        double[] nuevoArreglo = new double[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]=enterDouble(mensaje+"(" + (i+1) + " de " + cantidad+ "):");
        }
        return nuevoArreglo;
    }

    public static boolean validateVowels(char letter){
        boolean vowel=false;

        if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
            vowel = true;
        }

        return vowel;
    }

}
