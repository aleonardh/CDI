import java.util.ArrayList;

public class RunnableMio implements Runnable{

    @Override
    public void run() {
        System.out.println(" My name is " + Thread.currentThread().getName());
        System.out.println(" 2nd name! By: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        int nT = Integer.parseInt(args[0]);
        ArrayList<Thread> threads = new ArrayList<>(nT);

        for(int i = 0; i < nT; i++) {
            Thread t = new Thread(new RunnableMio(), "R"+i);
            threads.add(t);
        }

        for(Thread t : threads) t.start();

        System.out.println("Fin del programa.");
    }



}