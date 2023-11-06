

import java.util.Scanner;
public class kubus {
    static double luasPermukaan(double s){
        double hasil = 6*s*s;
        return hasil;
    }
    static double volume(double s){
        double hasil = s*s*s;
        return hasil;
    }
     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        double s = input.nextDouble();
        
        System.out.println("Luas Permukaan kubus adalah: " + luasPermukaan(s));
        System.out.println("Volume kubus adalah: " + volume(s));
    }
}
