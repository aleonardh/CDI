import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MyTaskAtomic extends Thread{
    CounterAtomicInteger counter;
    int id;
    Timer timer;
    public MyTaskAtomic(int id, CounterAtomicInteger counter, Timer timer){
        this.id = id;
        this.counter = counter;
        this.timer = timer;
    }

    public void run() {
        timer.Start(id);
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(101));
                counter.increment();    //Critical section!!
        } catch (Exception e) {
            System.out.println("Exception!!");
        }
        timer.Stop(id);
    }
}