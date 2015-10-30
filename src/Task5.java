/**
 * Created by Jallermax on 29.10.2015.
 */
public class Task5 {
    public static int run(int all){
        Visual.name("\u041a5\u043a\u043e\u0435 \u0441\u0430\u043c\u043e\u0435 \u043c\u0430\u043b\u0435\u043d\u044c\u043a\u043e\u0435 \u0447\u0438\u0441\u043b\u043e \u0434\u0435\u043b\u0438\u0442\u0441\u044f \u043d\u0430\u0446\u0435\u043b\u043e \u043d\u0430 \u0432\u0441\u0435 \u0447\u0438\u0441\u043b\u0430 \u043e\u0442 1 \u0434\u043e 20?");
        Time timer = new Time();
        timer.setStart();
        timer.printStart();
        for (int num=all;; num+=all)
            if(Meth.isDivided(num, all)) {
                timer.setFinish();
                timer.printFinish();
                timer.printAmmount();
                return num;
            }

    }
}
