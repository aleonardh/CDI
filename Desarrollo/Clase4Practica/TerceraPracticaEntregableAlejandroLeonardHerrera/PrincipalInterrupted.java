import java.util.ArrayList;
public class PrincipalInterrupted {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Not enough arguments!");
        }else {


            int nT = Integer.parseInt(args[0]);
            ArrayList<Thread> threads = new ArrayList<>(nT);
//            MyThread runnable = new MyThread();
            for (int i = 0; i < nT; i++) {
                Thread t = new Thread(new MyThread(i), "R " + i);
                threads.add(t);
            }


            for (Thread t : threads){
                t.start();
            }
            for (Thread t: threads){
                try{
                    t.sleep(1000);
                }catch(InterruptedException e){}
            }
            //poner un sleep random
            for (Thread t : threads) {
                try{
                    t.interrupt();
                }catch (Exception e){
                    System.out.println("Exception!!");
                }
            }
            for (Thread t : threads) {
                try{
                    t.join();
                }catch (InterruptedException e){
                    System.out.println("Exception!!");
                }
            }

            System.out.println("Fin del programa.");
        }
    }
}
