public class ExtendsThread extends Thread{
    ExtendsThread(String name){
        System.out.println(name);
    }


    public void run(){
        System.out.println("My Thread!");
    }

    public static void main(String [] args){

        int x = Integer.parseInt(args[0]);
        for (int i = 0; i < x; i++){
            ExtendsThread myThread = new ExtendsThread("Nombre : " + i);
            myThread.start();
        }


    }
}