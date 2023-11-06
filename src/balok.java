
import java.util.Scanner;

public class balok {
    static double luasPermukaan(double p, double l, double t){
        double hasil = 2 *((p*l)+(p*t)+(l*t));
        return hasil;
        
    }
    static double volume(double p, double l, double t){
        double hasil = p*l*t;
        return hasil;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar : ");
        double l = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double t = input.nextDouble();
        
        
        System.out.println("Luas permukaan balok adalah: " + luasPermukaan(p,l,t));
        System.out.println("Volume balok adalah: " + volume(p,l,t));
    }
    
}
