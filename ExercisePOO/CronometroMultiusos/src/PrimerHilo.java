public class PrimerHilo extends Thread{

    @Override
    public void run() {
        System.out.println("Corriendo primer ");
        for (int i = 5; i >= 1; i--) {
            System.out.println(" t - menos :  " + i + " seg ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("one moment please..");

            }

        }
        System.out.println("Fireeeeeeeee");
    }

}
