package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat , fizik, sayac = 0;
        double toplam, sonuc;

        System.out.println("Mat notu gir");
        mat = input.nextInt();
        sayac++;

        System.out.println("fizik notu gir");
        fizik = input.nextInt();
        sayac++;

        toplam = (mat + fizik);
        sonuc = toplam / sayac;

        System.out.println("Ortalama : " + sonuc);










    }
}
