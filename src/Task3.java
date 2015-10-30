/**
 * Created by Jallermax on 29.10.2015.
 */

import static java.lang.Math.*;

public class Task3 {
    public static int run(long number){
        Visual.name("\u21163. \u041a\u0430\u043a\u043e\u0432 \u0441\u0430\u043c\u044b\u0439 \u0431\u043e\u043b\u044c\u0448\u043e\u0439 \u0434\u0435\u043b\u0438\u0442\u0435\u043b\u044c \u0447\u0438\u0441\u043b\u0430 600851475143, \u044f\u0432\u043b\u044f\u044e\u0449\u0438\u0439\u0441\u044f \u043f\u0440\u043e\u0441\u0442\u044b\u043c \u0447\u0438\u0441\u043b\u043e\u043c?");
        Time timer = new Time();
        timer.setStart();
        timer.printStart();

        long maxPrime = 0;
        for (long k=3; k<=(sqrt(number)); k++)
            if (Meth.isPrime(k)){
                if (Meth.isRightPrime(k, number)){
                    System.out.println(k);
                    maxPrime=k;
                }
            }
        timer.setFinish();
        timer.printFinish();
        timer.printAmmount();
        return (int) maxPrime;
    }
}
