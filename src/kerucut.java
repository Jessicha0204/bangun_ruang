import java.util.Scanner;
public class kerucut {
     static double luasPermukaan(double r, double s){
        double hasil =( 3.14*r*(r+s));
        return hasil;
    }
    static double volume(double r, double t){
        double hasil = ((1.0/3.0)*3.14*r*r*t);
        return hasil;
    }
     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari_jari : ");
        double r = input.nextDouble();
        System.out.print("Masukkan garis pelukis : ");
        double s = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double t = input.nextDouble();
        System.out.println("Luas Permukaan kerucut adalah: " + luasPermukaan(r,s));
        System.out.println("Volume kerucut adalah: " + volume(r,t));
}
}
