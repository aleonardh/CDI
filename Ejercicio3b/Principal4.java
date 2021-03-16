import java.util.ArrayList;
public class Principal4{


    public static void main (String[] args ){

    if (args.length == 0){
            System.out.println("Not enough arguments!");
    }else {
        int nT = Integer.ParseInt(args[0]);
        ArrayList<Worker> threads = new ArrayList<>(nT);
        Matrix m = new Matrix(nT);
        for (int i = 0; i < nT;i++){
            MyThread t = new MyThread(i, m);
            threads.add(t);
        }

        for (Thread t : threads){
                t.start();
        }
        try{
            for(thread)

        }catch(InterruptedException e){
            System.out.println("Interrupted!!");
        }


        System.out.println("End of Program!!");


        }
    }

}