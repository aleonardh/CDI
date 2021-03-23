import java.util.ArrayList;
public class Principal4{


    public static void main (String[] args ){

    if (args.length == 0){
            System.out.println("Not enough arguments!");
    }else {
        int nT = Integer.parseInt(args[0]);
        ArrayList<Worker> threads = new ArrayList<>(nT);
        Matrix m = new Matrix(nT);
        Timer timer = new Timer(nT);
//        System.out.println("Matrix before changing values: \n");
//        m.printMatrix();
        for (int i = 0; i < nT;i++){
            Worker t = new Worker(i, m, timer);
            threads.add(t);
        }

        for (Worker t : threads){
                t.start();
        }
        try{
            for(Worker t : threads){
                t.join();
            }

        }catch(InterruptedException e){
            System.out.println("Interrupted!!");
        }
//
//        System.out.println("Matrix after changing values: \n");
//        m.printMatrix();
//
//        System.out.println("End of Program!!");
        System.out.println(nT + " " + timer.Elapsed()  );


        }
    }

}