public class RunnableNormal implements Runnable{
    public int id;
    private static  Integer mySum = 0;
    public RunnableNormal(int id){
        this.id = id;
    }

    public void run(){
        for (int i = 0; i < 5; i++){

            System.out.println("Started  ID: "+ Thread.currentThread().getName() + " MySum: " + mySum);
            mySum++;
            try{
                Thread.sleep(100);
            }catch(InterruptedException e ){}
        }
        
        System.out.println("Finished: ID" + Thread.currentThread().getName() + " MySum: " + mySum);

    }
}