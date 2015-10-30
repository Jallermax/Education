import static java.lang.Math.*;

/**
 * Created by Jallermax on 29.10.2015.
 */
public class Task1_OOP {
    public static int run(int nums){
        Visual.name("\u21161_OOP. \u041d\u0430\u0439\u0434\u0438\u0442\u0435 \u0440\u0430\u0437\u043d\u043e\u0441\u0442\u044c \u043c\u0435\u0436\u0434\u0443 \u0441\u0443\u043c\u043c\u043e\u0439 \u043a\u0432\u0430\u0434\u0440\u0430\u0442\u043e\u0432 \u0438 \u043a\u0432\u0430\u0434\u0440\u0430\u0442\u043e\u043c \u0441\u0443\u043c\u043c\u044b \u043f\u0435\u0440\u0432\u044b\u0445 \u0441\u0442\u0430 \u043d\u0430\u0442\u0443\u0440\u0430\u043b\u044c\u043d\u044b\u0445 \u0447\u0438\u0441\u0435\u043b.");

        int sumsqr=0;
        int sqrsum=0;
        for (int i=1; i<=nums; i++){
            sumsqr+=pow(i, 2);
            sqrsum+=i;
        }
        return ((int) pow(sqrsum, 2))-sumsqr;

    }
}
