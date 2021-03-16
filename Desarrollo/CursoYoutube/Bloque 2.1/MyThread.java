public class MyThread extends Thread{
    private static int tam = 8;
    private static int [] vec = new int[tam];

    private int ini, fin;

    public MyThread(int ini, int fin){
        this.ini = ini;
        this.fin = fin;
    }

    public void run(){
        for(int i = 0; i < vec.length; i++){
            vec[i] *=10;
        }
    }
}