public class Worker extends Thread{
    int id;
    Matrix m;
    Timer time;
    public Worker(int id, Matrix m, Timer time){
        this.id = id;
        this.m = m;
        this.time = time;
    }

    public void run(){
        time.Start(id);
        for(int i = 0; i< m.getSize();i++){
            m.setValPos(id, i);
        }
        time.Stop(id);
    }
}