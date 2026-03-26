import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Coche coche2 = new Coche( "a",1);
        int option = 0;






        String menu = "----Menu Vehiculo----\n" +
                "Por favor ingrese un opción\n" +
                "1. Crear coche \n" +
                "2. Acelerar \n" +
                "3. Buscar Coche\n" +
                "4. Saber que coche es el mas rápido \n" +
                "6. Salir";

        while (option !=6){
            System.out.println(menu);

            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1 :
                    System.out.println("Ingrese modelo");
                    String modelochoce = sc.nextLine();
                    System.out.println("Ingrese velocidad del modelo");
                    double velocidadInicial = sc.nextDouble();
                    Coche coche = new Coche(modelochoce, velocidadInicial);
                    coche2.createCoche(coche);

                    continue;

                case 2:
                    System.out.println("Ingrese el modelo del coche que quiere acelerar: ");
                    String modeloABuscar = sc.nextLine();
                    Coche cocheAcelerar = coche2.encontrarCoche(modeloABuscar);


                    if(cocheAcelerar==null){
                        System.out.println("NO existe este coche");
                    } else {
                        System.out.println("Ingrese la nueva velocidad");
                        double velocidad = sc.nextDouble();

                        cocheAcelerar.setVelocidad(velocidad);
                    }

                    continue;

                case 3 : System.out.println("Ingrese el modelo de coche que desea buscar");
                    System.out.println(coche2.getListCoche());
                    String modeloBuscado = sc.nextLine();
                    Coche cocheBuscado = coche2.encontrarCoche(modeloBuscado);;


                    if(cocheBuscado==null){
                        System.out.println("NO existe este coche");
                    } else {
                        System.out.println("Coche " + cocheBuscado.getModelo() + " Su velocidad es " + cocheBuscado.getVelocidad());
                    }

                    continue;
                case 4: System.out.println(coche2.encontrarCocheRapido());
                    continue;



                case 5: System.out.println("Adios ");
                    break;

                default:System.out.println("Marcación erronea");





            }

        }










    }
}
