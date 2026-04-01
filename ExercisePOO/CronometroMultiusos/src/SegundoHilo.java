public class SegundoHilo implements Runnable{


    @Override
    public void run() {
        System.out.println("Corriendo segundo hilo");
        for(int i = 1; i<=5; i++){
            System.out.println(i+" Seg ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Esperaaaa...");

            }

        }

    }
}
