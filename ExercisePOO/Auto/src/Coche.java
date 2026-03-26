import java.util.ArrayList;
import java.util.List;

public class Coche extends Vehiculo {
    private List<Coche> listCoche;

    public Coche(String modelo, double velocidad){

        super(modelo, velocidad);
        this.listCoche= new ArrayList<>();
    }

    //CRUD
    public boolean searchCoche(String modelo){
        boolean flag = false;

        for (Coche coche : listCoche){
            if (coche.getModelo().equals(modelo)){
                flag = true;
            }
        }

        return flag;
    }

    public Coche encontrarCoche(String modelo){
        Coche coche = null;

        for (Coche c : listCoche){
            if (c.getModelo().equals(modelo)){
                coche=c;
                break;
            }
        }
        return coche;
    }

    public String encontrarCocheRapido(){
        Coche masRapido = new Coche("Prueba", 0);

        String mensajeSalida = "El mas rapido es : ";
        String listaDeCoches = "Modelo" + "velocidad \n";

        for (Coche ch : listCoche){
            listaDeCoches += "modelo : " + ch.getModelo()  + "Vel: " + ch.getVelocidad() +"\n";

            if(ch.getVelocidad()> masRapido.getVelocidad()){
                masRapido = ch;
            }

        }
        mensajeSalida+= "Modelo : " + masRapido.getModelo() + "\n" +
                listaDeCoches;

        return mensajeSalida;
    }


    public void createCoche(Coche coche){


        if (searchCoche(coche.getModelo())){
            System.out.println("Este modelo ya se registró ");

        }else {
            listCoche.add(coche);
            System.out.println("Se registro el coche modelo " + coche.getModelo());
        }

    }





    public List<Coche> getListCoche() {
        return listCoche;
    }

    public void setListCoche(List<Coche> listCoche) {
        this.listCoche = listCoche;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "listCoche=" + listCoche +
                '}';
    }
}
