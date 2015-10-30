/**
 * Created by Jallermax on 17.10.2015.
 */
public class Task1 {
    public static void run(){
        int fib1 = 1;
        int fib = 2;
        int sum =0;
        while(fib < 4000000) {
            if(fib%2==0)
                sum+=fib;
            int fiblast = fib;
            fib += fib1;
            fib1 = fiblast;
        }
        String str = "\u21161. \u0421\u0443\u043c\u043c\u0430 \u0432\u0441\u0435\u0445 \u0447\u0435\u0442\u043d\u044b\u0445 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0440\u044f\u0434\u0430 \u0424\u0438\u0431\u043e\u043d\u0430\u0447\u0447\u0438, \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u043d\u0435 \u043f\u0440\u0435\u0432\u044b\u0448\u0430\u044e\u0442 \u0447\u0435\u0442\u044b\u0440\u0435 \u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430: ";
        System.out.println(str+sum);
    }


}
