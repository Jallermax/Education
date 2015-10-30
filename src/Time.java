import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jallermax on 29.10.2015.
 */
public class Time {

    private long start;
    private long finish;

    public static long printTime(){
        Date time = new Date();//
        long millis = time.getTime();
        System.out.println("---"+millis+"ms---");
        return millis;
    }

    public void setStart(){
        Date time = new Date();//
        this.start = time.getTime();
    }
    public void setFinish(){
        Date time = new Date();//
        this.finish = time.getTime();
    }
    public void printStart(){
        DateFormat df = new SimpleDateFormat("HH:mm:ss,SSS");
        System.out.println("Start time: " + df.format(start));

        //System.out.println(" Start time:\n---"+formatDate+"ms---");
        //System.out.println(" Start time:\n---"+start+"ms---");
    }
    public void printFinish(){
        DateFormat df = new SimpleDateFormat("HH:mm:ss,SSS");
        System.out.println("Finish time: " + df.format(finish));
        //System.out.println(" Finish time:\n---"+finish+"ms---");
    }
    public void printAmmount(){
        DateFormat df = new SimpleDateFormat("mm:ss,SSS");
        System.out.print("\nExecution time: " + df.format(finish - start));

        //System.out.println(" Execution time:\n-----"+(finish-start)+"ms-----");
    }
}
