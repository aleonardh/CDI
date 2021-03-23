import java.util.ArrayList;
public class Principal {

    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("Not enough arguments!");
        }else {

            int nT = Integer.parseInt(args[0]);
            Timer timer = new Timer(nT);
            Counter c = new Counter();
            ArrayList<MyTask> threads = new ArrayList<>(nT);

            for (int i = 0; i < nT; i++) {
                MyTask t = new MyTask(i, c, timer);
                threads.add(t);
            }

            for (Thread t : threads) {
                t.start();
            }

            for (Thread t : threads) {

                try{
                    t.join();
                }catch (InterruptedException e){
                    System.out.println("Exception!");
                }
            }
            System.out.println(nT + " " + timer.Elapsed()  );

//            System.out.println("Valor del contador:" + c.getCounter());

    }

}

}