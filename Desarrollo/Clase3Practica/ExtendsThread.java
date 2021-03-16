import static java.lang.Math.tan;
import static java.lang.Math.atan;
import static java.lang.Math.cbrt;
public class ExtendsThread extends Thread{
    Timer time;
    int id;
    public ExtendsThread(int id, Timer time){
        this.id = id;
        this.time = time;
    }


    public void run(){
        time.Start(id);
        for(int i=0; i<1000000; ++i) {
            double d = tan(atan(
                    tan(atan(
                            tan(atan(
                                    tan(atan(
                                            tan(atan(123456789.123456789))
                                    ))
                            ))
                    ))
            ));
            cbrt(d);
        }
        time.Stop(id);
        //System.out.println("Tiempo: " + time.Elapsed() + ".");
    }
//




}