import java.util.Scanner;
public class tabung {
     static double luasPermukaan(double r, double t){
        double hasil = (2 * 3.14 * r *(r+t));
        return hasil;
    }
    static double volume(double r, double t){
        double hasil =(3.14*r*r*t);
        return hasil;
    }
     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari_jari : ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double t = input.nextDouble();
        System.out.println("Luas Permukaan tabung adalah: " + luasPermukaan(r,t));
        System.out.println("Volume tabung adalah: " + volume(r, t));
}
}
