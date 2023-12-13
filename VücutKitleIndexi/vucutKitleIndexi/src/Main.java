import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Girdi değerleri tamamlanır.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:"); 
        double boy = input.nextDouble(); //Boy bilgisi girilir.

        System.out.print("Lütfen kilonuzu giriniz:");
        double kilo = input.nextDouble();//Kilo bilgisi girilir.

        double index = kilo / (boy * boy);//Sonuç hesaplanır.

        System.out.println("Vücut kitle indexiniz : " + index);//.sonuç ekrana yazdırılır.
    }
}
