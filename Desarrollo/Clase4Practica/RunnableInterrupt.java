import java.util.ArrayList;

public class RunnableInterrupt implements Runnable{
      public double pi = 0.0;
      public boolean negative;
      public int id;
    public RunnableInterrupt(int id){
        this.id = id;
    }
    @Override
    public void run() {
        negative = false;
        pi = 0.0;
        for(int i = 1; i<100000; i+=2) {
            System.out.println("Started: ID " + Thread.currentThread().getName() + " Calculo de PI: " + pi);
            if(negative) pi -= 1.0/i;
            else pi += 1.0/i;
            negative = !negative;
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Thread Interrupted");
                break;
            }
        }
        pi*=4.0;
        System.out.println("Finished: ID " + Thread.currentThread().getName() + " Calculo de PI: " + pi);
    }





}