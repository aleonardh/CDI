public class Worker extends Thread{
    public int id;
    public Matrix m;
    public Worker(int id, Matrix m){
        this.id = id;
        this.m = m;
    }

    public void run(){
        int posFila = (int) Thread.currentThread.getName();
        for(int i = 0; i< m.getWidth();i++){
            m.setValPos(posFila, i);
        }
    }

}