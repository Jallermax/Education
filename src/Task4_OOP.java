import static java.lang.Math.pow;

/**
 * Created by Jallermax on 30.10.2015.
 */
public class Task4_OOP {
    public static int run(int sum){
        Visual.name("\u21164_OOP. \u041d\u0430\u0439\u0434\u0438\u0442\u0435 \u043f\u0440\u043e\u0438\u0437\u0432\u0435\u0434\u0435\u043d\u0438\u0435 abc");
        Time timer = new Time();
        timer.setStart();
        timer.printStart();
        int a=1;
        int b=1;
        int c=1;
        for (a=1; a<sum+1; a++){
            for(b=a; b<sum+1; b++){
                for (c=1; c<sum+1; c++){
                    if ((pow(a,2)+pow(b,2)==pow(c,2)) &
                        (a + b + c == sum)){
                        timer.setFinish();
                        timer.printFinish();
                        timer.printAmmount();
                        return a * b * c;
                    }
                }
            }
        }
        timer.setFinish();
        timer.printFinish();
        timer.printAmmount();
        return 0;
    }
}
