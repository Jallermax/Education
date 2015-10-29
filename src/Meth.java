import java.util.ArrayList;

/**
 * Created by Jallermax on 29.10.2015.
 */
public class Meth {
    public static boolean isPrime(long x){
        for (long i=2; i<x; i++)
            if (x%i==0){
                return false;}
        return true;
    }

    public static boolean isRightPrime(long prime, long num){
        return num % prime == 0;
    }

    public static boolean isPolindrom(String original) {
        int length = original.length();
        String reverse = "";
        for ( int j = length - 1; j >= 0; j-- )
            reverse = reverse + original.charAt(j);
        return original.equals(reverse);
    }

    public static int maximum(ArrayList<Integer> arr){
        int max = 0;
        for (Integer anArr : arr) {
            if (anArr > max)
                max = anArr;
        }
        return max;
    }

    public static boolean isDivided(int num, int all) {
        System.out.println(num);
        for (int alln=1; alln<=all; alln++)
            if (num%alln!=0)
                return false;
        return true;
    }
}
