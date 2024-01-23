package berkAir;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // km birim fiyati = 0.10$
        // 12 yasindan kucukse toplam fiyata %50 indirim
        // 12 ve 24 yaş arasındayda %10 indirim
        // 65 yaşından büyükse %30 indirim
        // Gidiş dönüş alırsa %20 indirim

        Scanner scan = new Scanner(System.in);
        int km, yas, tip;
        System.out.print("Mesafeyi giriniz : ");
        km = scan.nextInt();
        System.out.print("Yasinizi giriniz : ");
        yas = scan.nextInt();
        System.out.print("Yolculuk tipini seciniz (1-Tek gidis , 2- Gidis - Donus) : ");
        tip = scan.nextInt();
        double normalFiyat, yasIndirimi;

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            normalFiyat = km * 0.10;

            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.5;
                normalFiyat -= yasIndirimi;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalFiyat * 0.10;
                normalFiyat -= yasIndirimi;
            } else if (yas >= 65) {
                yasIndirimi = normalFiyat * 0.30;
                normalFiyat -= yasIndirimi;
            }

            if (tip == 2) {
                double gidisDonusIndirimi = normalFiyat * 0.20;
                normalFiyat -= gidisDonusIndirimi;
            }

            System.out.println("Toplam fiyat : $" + normalFiyat);
        } else {
            System.out.println("Girdiler degerler eksik veya yanlis lütfen tekrar deneyiniz!");
        }
    }
}

