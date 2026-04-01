import java.util.HashMap;

public class App {
    public static void main(String[] args){

        HashMap<Integer,String> clave = new HashMap<>();

        clave.put(5,"Karim");
        clave.put(2,"Albert");
        clave.put(3, "Rocki");



        System.out.println(obtenerListaDeClaves(clave));




    }

    /**
     * Metodo para obenter las claves de un HashMap
     * @param clave ingresa el objeto HashMap que contiene la información
     * @return Lista concatenada con los elementos sacados del hashMap
     */
    public static String obtenerListaDeClaves(HashMap<Integer,String> clave){
        String lista="";
        int[ ] clavesoptenidas = new int[clave.size()];
        int j = 0;

            for (int cl : clave.keySet()){
                clavesoptenidas[j] = cl;
                j++;
            }

            for (int i = 0 ; i<clavesoptenidas.length;i++){
                lista += "Nombre: " + clave.get(clavesoptenidas[i])+ " Clave: " + clavesoptenidas[i] + "\n";
            }
        return lista;

    }

    public static String ingresarElementoAHashMap(String nombre, int nclave, HashMap<Integer,String> clave){
        String mensajeCofirmacion = "";
        Contenedor<String> nuevoNombre = new Contenedor<>();
        nuevoNombre.setContenido(nombre);
        Contenedor<Integer> nuevaClave = new Contenedor<>();
        nuevaClave.setContenido(nclave);
        clave.put(nclave,nombre);





        return mensajeCofirmacion;
    }


}
