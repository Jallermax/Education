/**
 * Created by Jallermax on 17.10.2015.
 */
public class Task2 {
    public static void run(){
        int nums = 1000;
        int sum = 0;
        for (int i=1; i<nums; i++){
            if((i%3==0)||(i%5==0))
                sum+=i;
        }
        String str = "\u21162. \u0421\u0443\u043c\u043c\u0430 \u0432\u0441\u0435\u0445 \u0447\u0438\u0441\u0435\u043b \u043c\u0435\u043d\u044c\u0448\u0435 1000, \u043a\u0440\u0430\u0442\u043d\u044b\u0445 3 \u0438\u043b\u0438 5: ";
        System.out.print(str+sum);
    }
}
