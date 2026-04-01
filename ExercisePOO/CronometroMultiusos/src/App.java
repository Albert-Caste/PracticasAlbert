public class App {
    public static void main (String [] args){


        Thread hilo1 = new PrimerHilo();
        Thread hilo2 = new Thread(new SegundoHilo() );
        Thread hiloRepetido = new Thread(new SegundoHilo());

        hilo1.start();
        hilo2.start();
        hiloRepetido.start();

    }
}
