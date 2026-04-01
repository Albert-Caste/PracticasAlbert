import javax.swing.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args ){
        Tarea tarea1 = new Tarea("Proyecto1","Crear Calculadora de descuentros" );
        Tarea tarea2 = new Tarea("Ejercicio1", "Dominar ciclos for");
        Tarea tarea3 = new Tarea("Taller" , "Terminar ejercicios de la guia");

        //Agregar tareas a la lista de tareas
        tarea1.crearTarea(tarea1);
        tarea1.crearTarea(tarea2);
        tarea1.crearTarea(tarea3);





        String indice = "-------Opciones----------\n" +
                "Ingrese una de las opciones \n " +
                "1. Crear Tarea \n " +
                "2. Borrar Tarea \n" +
                "3. Salir";

        String input = "";
        int option= 0;

        while (option!=3){
            input = JOptionPane.showInputDialog(indice);

            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Debe ingresar un número entero");
                continue;
            }

            switch (option){

                case 1 : {
                    String nombre = JOptionPane.showInputDialog("Ingrese nombre de la tarea");
                    String descripcion = JOptionPane.showInputDialog("Ingrese breve descripción ");
                    Tarea nuevaTarea = new Tarea(nombre,descripcion);
                    tarea1.crearTarea(nuevaTarea);
                    continue;

                }
                case  2 : {
                    JOptionPane.showMessageDialog(null, tarea1.toString());
                    String indiceTarea = JOptionPane.showInputDialog("Ingrese el indice de la tarea que desea borrar");
                    try {
                        int indiceT = Integer.parseInt(indiceTarea);
                        JOptionPane.showMessageDialog(null,tarea1.borrarUsandoIndice(indiceT));

                    }catch (IndexOutOfBoundsException e){
                        JOptionPane.showMessageDialog(null, "Indice  no encontrado");

                    }
                    continue;


                }

                case 3 : break;

                default: JOptionPane.showMessageDialog(null, "Opción  no valida");
                            break;
            }
        }







    }
}
