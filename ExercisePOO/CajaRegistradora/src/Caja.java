import java.util.ArrayList;
import java.util.List;

public class Caja {

    private int id;
    private String nombre;

    private List<Cajero> listCajero;
    private List<Producto> listProducto;
    private List<Caja> listCaja;


    public Caja (int id, String nombre){
        this.id = id;
        this.listCajero = new ArrayList<>();
        this.listProducto = new ArrayList<>();
        this.listCaja = new ArrayList<>();

    }

    // CRUD

    public boolean buscarCajero(int id){
        boolean flag = false;

        for(Cajero cajero: listCajero){
            if (cajero.getId()==id){
                flag = true;
                break;
            }

        }
        return  flag;

    }

    public String crearCajero(String nombre, int id, double baseDinero){
        String mensajeRegistro = "";
        Cajero cajero = null;
        if (buscarCajero(id)){
            mensajeRegistro = "El cajero ya se registró";

        }else {
            cajero = new Cajero(nombre, id, baseDinero);
            listCajero.add(cajero);
            mensajeRegistro = "Se registró " + cajero.getNombre();
        }
        return mensajeRegistro;

    }

    public boolean buscarCaja(int id){
        boolean flag = false;
        for (Caja caja:listCaja){
            if(caja.id == id){
                flag = true;
            }
        }
        return  flag;
    }

    public String crearCajero(int id,String nombre){
        String mensaje = "";
        Caja nuevaCaja = null;
        if (buscarCaja(id)){
            mensaje = "La caja ya está registrada";
        } else {
            nuevaCaja = new Caja(id, nombre);
            listCaja.add(nuevaCaja);
            mensaje = "Se registró " +nuevaCaja.nombre;
        }
        return mensaje;

    }









    //Methods get and set

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }



    public List<Producto> getListProducto() {
        return listProducto;
    }

    public List<Cajero> getListCajero() {
        return listCajero;
    }

    public void setListProducto(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public void setListCajero(List<Cajero> listCajero) {
        this.listCajero = listCajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Caja> getListCaja() {
        return listCaja;
    }

    public void setListCaja(List<Caja> listCaja) {
        this.listCaja = listCaja;
    }
}
