/**
 * Created by Jallermax on 30.10.2015.
 */
public class Task5_OOP {
    public static long run(int nums){
        Visual.name("\u21165_OOP. \u041d\u0430\u0439\u0434\u0438\u0442\u0435 \u0441\u0443\u043c\u043c\u0443 \u0432\u0441\u0435\u0445 \u043f\u0440\u043e\u0441\u0442\u044b\u0445 \u0447\u0438\u0441\u0435\u043b \u043c\u0435\u043d\u044c\u0448\u0435 \u0434\u0432\u0443\u0445 \u043c\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432.");
        Time timer = new Time();
        timer.setStart();
        timer.printStart();
        long sum=0;
        for(int i=2; i<nums; i++)
            if (Meth.isPrime(i))
                sum+=i;
        timer.setFinish();
        timer.printFinish();
        timer.printAmmount();
        return sum;
    }
}
