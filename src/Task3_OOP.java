/**
 * Created by Jallermax on 30.10.2015.
 */
public class Task3_OOP {
    public static long run(int ammount){
        Visual.name("\u21163_OOP. \u041d\u0430\u0439\u0434\u0438\u0442\u0435 \u043d\u0430\u0438\u0431\u043e\u043b\u044c\u0448\u0435\u0435 \u043f\u0440\u043e\u0438\u0437\u0432\u0435\u0434\u0435\u043d\u0438\u0435 " +ammount+ " \u043f\u043e\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u043d\u044b\u0445 \u0446\u0438\u0444\u0440 \u0432 \u0434\u0430\u043d\u043d\u043e\u043c \u0447\u0438\u0441\u043b\u0435.");
        Time timer = new Time();
        timer.setStart();
        timer.printStart();
        long maxmultiply = 1;
        String number = "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450";

        for(int end=ammount, strt=0;end<=number.length(); end++, strt++){
            long multiply =1;
            String strbuf = "";
            char[] buf = new char[ammount];
            number.getChars(strt, end, buf, 0);
            for (char n:buf)
            strbuf +=n;
            System.out.println("--"+strbuf);
            for (char n:buf){
                multiply*=Character.digit(n,10);
                System.out.println(multiply);
            }
            System.out.println(multiply);
            if (multiply>maxmultiply)
                maxmultiply=multiply;
        }
        timer.setFinish();
        timer.printFinish();
        timer.printAmmount();
        return maxmultiply;
    }
}
