import java.util.Scanner;
public class kd {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("ücret tutarınızı giriniz :");
        tutar = inp.nextDouble();

        kdvOran = tutar >= 1000 ? 0.8 : 0.18; 
        
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV siz tutar :" + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV tutar :" + kdvTutar);
        System.out.println("KDV li tutar : " + kdvliTutar);

        


    }
}