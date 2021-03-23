import java.util.concurrent.atomic.AtomicInteger;
public class CounterAtomicInteger {
    private AtomicInteger atomicInteger;
    public CounterAtomicInteger(){
        this.atomicInteger = new AtomicInteger(0);
    }

    public void increment(){
        this.atomicInteger.incrementAndGet();
    }


    public int getAtomicInteger(){
        return atomicInteger.intValue();
    }
}