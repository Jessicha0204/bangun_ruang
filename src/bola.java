import java.util.Scanner;
public class bola {
    static double luasPermukaan(double r){
        double hasil = 4*(22.0/7.0)*r*r;
        return hasil;
    }
    static double volume(double r){
        double hasil = ((4.0/3.0)*(22.0/7.0)*(r*r*r));
        return hasil;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        double r = input.nextDouble();
        
        System.out.println("Luas Permukaan bola adalah: " + luasPermukaan(r));
        System.out.println("Volume bola adalah: " + volume(r));
}
}