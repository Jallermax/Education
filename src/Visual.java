/**
 * Created by Jallermax on 29.10.2015.
 */
public class Visual {
    public static void name(){System.out.println("\nUnnamed task\n");}
    public static void name(String n){
        System.out.println("\n____________________________________________________________________\n" + n + "\n" + "____________________________________________________________________");}
    public static void result(){
        System.out.println("**Done**");}
    public static void result(String res){
        System.out.println("\n**************\n   *"+res+"*\n****Answer****");}
    public static void result(int res){
        System.out.println("\n**************\n   *"+res+"*\n****Answer****");    }
    public static void result(double res){
        System.out.println("\n****************************\n       *"+res+"*\n***********Answer***********");}
    public static void result(long res){
        System.out.println("\n****************************\n       *"+res+"*\n***********Answer***********");}
    public static void result(Object res){
        System.out.println("\n**************\n   *"+res+"*\n****Answer****");}
}
