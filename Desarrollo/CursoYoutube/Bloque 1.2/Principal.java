//Los hilos se lanzan desde objetos que heredan de Thread
//con start() se lanzan los hilos
//los hilos no se tiene que ejecutar cuando se lanza
//No sabemos el orden de ejecución de los hilos
public class Principal extends Thread{
    private int id;

    public Principal(int id){
        this.id = id;
    }

    public void run(){
        System.out.println("Soy el hilo: "+id);
    }

    public static void main(String[] args){

        Principal h1 = new Principal(1);
        Principal h2 = new Principal(2);
        Principal h3 = new Principal(3);

        h1.start(); //estamos lanzando el hilo
        h2.start(); //estamos lanzando el hilo
        h3.start(); //estamos lanzando el hilo
        System.out.println("Soy el hilo principal");
    }
}