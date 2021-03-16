public class Principal extends Thread{
    private int id;
    public Principal(int id){
        this.id = id;
    }
    public void run(){
        System.out.println("Soy el hilo: " + id);
    }

    public static  void main (String[] args){
        Principal[] vec = new Principal[5];
        for(int i = 0; i < vec.length; i++){
            vec[i] = new Principal(i+1);
        }

        for (int i = 0; i < vec.length; i++){

            vec[i].start();

        }
        for (int i = 0; i < vec.length; i++){
            try{
                vec[i].join();
            }catch (Exception e){
                System.out.println("Excepción");
            }
        }
        System.out.println("Soy el hilo principal");
    }
}