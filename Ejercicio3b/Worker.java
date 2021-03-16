public class Worker extends Thread{
    public int id;
    public Matrix m;
    public Worker(int id, Matrix m){
        this.id = id;
        this.m = m;
    }

    public void run(){
        for(int i = 0; i< m.getWidth();i++){
            m.setValPos(id, i);
        }
    }

}