import java.util.ArrayList;

/**
 * Created by Jallermax on 29.10.2015.
 */
public class Task4 {
    public static int run(){
        Visual.name("\u21162. \u041d\u0430\u0439\u0434\u0438\u0442\u0435 \u0441\u0430\u043c\u044b\u0439 \u0431\u043e\u043b\u044c\u0448\u043e\u0439 \u043f\u0430\u043b\u0438\u043d\u0434\u0440\u043e\u043c, \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u043d\u044b\u0439 \u0443\u043c\u043d\u043e\u0436\u0435\u043d\u0438\u0435\u043c \u0434\u0432\u0443\u0445 \u0442\u0440\u0451\u0445\u0437\u043d\u0430\u0447\u043d\u044b\u0445 \u0447\u0438\u0441\u0435\u043b.");
        Time timer = new Time();
        timer.setStart();
        timer.printStart();
        int num;
        ArrayList<Integer> paliList = new ArrayList<>();
        for (int i=999; i>99; i--)
            for (int k=i; k>99; k--){
                num = i*k;
                if (Meth.isPolindrom(String.valueOf(num))) {
                    paliList.add(num);
                    //System.out.println("num: "+num); // паллиндромы
                }
            }
        timer.setFinish();
        timer.printFinish();
        timer.printAmmount();
        return Meth.maximum(paliList);
    }
}
