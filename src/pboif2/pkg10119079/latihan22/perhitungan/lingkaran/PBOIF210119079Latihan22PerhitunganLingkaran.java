package pboif2.pkg10119079.latihan22.perhitungan.lingkaran;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI: coding untung menghitung lingkaran
 *
 */
public class PBOIF210119079Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jari, diameter, keliling, luas, phi = 3.14;
        System.out.println("====Perhitungan Lingkaran====");
        System.out.printf("Masukkan nilai diameter lingkaran : ");
        
        while (!input.hasNextDouble()){
            System.out.println("Nilai diameter tidak sesuai");
            System.out.println("");
            System.out.printf("Masukan Nilai diameter Lingkaran : ");
            input.next();
        }
        diameter = input.nextDouble();
        
        jari     = diameter/2;
        luas     = phi * (jari * jari);
        keliling = ((2 * phi) * jari);
        System.out.println("====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = "+jari+" cm");
        System.out.println("Luas Lingkaran = "+luas+" cm");
        System.out.println("Keliling Lingkaran = "+keliling+" cm");
        
       
    }
    
}
