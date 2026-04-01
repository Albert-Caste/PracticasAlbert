import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private String descripcion;
    private List<Tarea> listTareas;

    public Tarea (String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listTareas = new ArrayList<>();

    }

    //CRUD

    /**
     * Metodo para crear una tarea, primero busca si ya existe para no registrarla dos veces
     * @param tarea es la tarea que se pretende
     * @return mesaje de retroalimentación del proceso
     */
    public String crearTarea (Tarea tarea){
        String mensajeCreacion= "";

        if (buscarTarea(tarea.getNombre())){
            mensajeCreacion = "La tarea ya existe";

        }else {
            listTareas.add(tarea);
            mensajeCreacion = "Se registró la tarea: " + tarea.getNombre();
        }
        return mensajeCreacion;
    }

    /**
     * Metodo para buscar una tarea por su nombre
     * @param nombre nombre la tarea buscada
     * @return boolean que conffirma su existencia
     */
    public boolean buscarTarea(String nombre){
        boolean flag = false;
        for (Tarea t : listTareas){
            if (t.getNombre().equals(nombre)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Tarea extraerTarea(String nombre){
        Tarea tareaBuscada = null;

        if (buscarTarea(nombre)){
            for (Tarea tb : listTareas){
                if (tb.getNombre().equals(nombre)){
                    tareaBuscada = tb;
                    break;
                }
            }
        }

        return  tareaBuscada;
    }

    /**
     * Metodo para borrar tarea al buscar su indice
     * @param nombreTarea
     * @return
     */
    public String borrarTarea(String nombreTarea){
        String mensajeDeBorrado = "";

        if (extraerTarea(nombreTarea)==null){
            mensajeDeBorrado = "La tarea que intenta borrar no existe";
        }else {
            listTareas.remove(extraerTarea(nombreTarea));
            mensajeDeBorrado =  extraerTarea(nombreTarea).getNombre() + " Ha sido borrada ";

        }

        return  mensajeDeBorrado;


    }

    public String borrarUsandoIndice(int indice){
        String mensajeSalida = "";
            for (int i = 0 ; i<=listTareas.size();i++){
                if (i == indice-1){
                    mensajeSalida = "Será borrado " + listTareas.get(i).getNombre();
                    listTareas.remove(i);

                    break;
                }
            }
        return  mensajeSalida;
    }



    //Geterrs and Setters


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarea> getListTareas() {
        return listTareas;
    }

    public void setListTareas(List<Tarea> listTareas) {
        this.listTareas = listTareas;
    }

    public String imprimirLista(){
        String tareas = "";
        int contador = 1;
        for (Tarea tb : listTareas){

            tareas+= "indice: " + contador + " Tarea: " + tb.getNombre() + " Descripción: " + tb.getDescripcion() + "\n";
            contador++;
        }
        return tareas;
    }

    @Override
    public String toString() {
        return imprimirLista();
    }
}
