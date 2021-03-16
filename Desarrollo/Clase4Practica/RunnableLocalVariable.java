public class RunnableLocalVariable implements Runnable{
    private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>(){
        @Override protected Integer initialValue() {
            return 0;
        }};

    public void run(){
        for (int i = 0; i < 5; i++){

            System.out.println("Started  ID: "+ Thread.currentThread().getName() + " ThreadLocal<>: " + threadId.get());
          try{
                Thread.sleep(100);
            }catch(InterruptedException e ){}
            threadId.set(threadId.get() + 1);
        }
        System.out.println("Finished: ID" + Thread.currentThread().getName() + " ThreadLocal: " + threadId.get());
    }
}