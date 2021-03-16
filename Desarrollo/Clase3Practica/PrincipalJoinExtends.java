import java.util.ArrayList;
//extends Thread y utiliza join()
public class PrincipalJoinExtends {

    public static void main(String [] args) {
        if (args.length == 0){
            System.out.println("Not enough arguments!");
        }else {

            int nT = Integer.parseInt(args[0]);
            Timer time = new Timer(nT);
            ArrayList<Thread> threads = new ArrayList<>(nT);

        for (int i = 0; i < nT; i++) {
            ExtendsThread t = new ExtendsThread(i, time);
//            System.out.println("He creado ");
            threads.add(t);
        }

            for (Thread t : threads) {
//                System.out.println("State Before start: State: " + t.getState() );
                t.start();
//                System.out.println("State after start: State: " + t.getState() + " Name: " + t.getName() + "." );
                //RUNNABLE QUIERE DECIR EJECUTABLE, NO QUE SE EST EJECUTANDO
            }
            for (Thread t : threads) {

                try{
//                    System.out.println("STATE: before join " + t.getState() + " Name: " + t.getName() + ".");
                    t.join();
//                    System.out.println("STATE: after join " + t.getState() + " Name: " + t.getName() + ".");
                }catch (InterruptedException e){
                    System.out.println("Exception!");
                }
            }
//            for (Thread t : )
            System.out.println(nT + " " + time.Elapsed()  );
//            System.out.println("Fin del programa!");



        }
    }
}