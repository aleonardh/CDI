import java.util.Random;
public class MyTask extends Thread{
    Counter counter;
    Timer timer;
    int id;
    public MyTask(int id, Counter counter, Timer timer){
        this.id = id;
        this.counter = counter;
        this.timer = timer;
    }

    public void run() {
        timer.Start(id);
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(101));
            synchronized (counter){
                counter.increment();    //Critical section!!
            }
        } catch (Exception e) {
            System.out.println("Exception!!");
        }
        timer.Stop(id);
    }
}