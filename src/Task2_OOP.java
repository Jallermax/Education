/**
 * Created by Jallermax on 30.10.2015.
 */
public class Task2_OOP {
    public static int run(int nums){
        Visual.name("\u21162_OOP. \u041a\u0430\u043a\u043e\u0435 \u0447\u0438\u0441\u043b\u043e \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f 10001-\u044b\u043c \u043f\u0440\u043e\u0441\u0442\u044b\u043c \u0447\u0438\u0441\u043b\u043e\u043c?");
        Time timer = new Time();
        timer.setStart();
        timer.printStart();
        int flag=0;
        for (int prime=2;; prime++){
            if(Meth.isPrime(prime))
                flag++;
            if(flag==nums) {
                timer.setFinish();
                timer.printFinish();
                timer.printAmmount();
                return prime;
            }
        }
    }
}
