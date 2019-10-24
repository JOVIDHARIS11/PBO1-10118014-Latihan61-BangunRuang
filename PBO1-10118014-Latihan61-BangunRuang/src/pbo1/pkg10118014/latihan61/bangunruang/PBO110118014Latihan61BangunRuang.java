/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118014.latihan61.bangunruang;



/**
 *
 * @author 
 * NAMA  : Jovi D Haris
 * KELAS : IF 1
 * NIM   : 10118014
 * Deskripsi Program : Program ini untuk menghitung volume bangun ruang.
 */
public class PBO110118014Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Hasil : V = "+Math.ceil(bola.hitungVolume()));
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Hasil V = "+Math.ceil(tabung.hitungVolume()));
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Hasil : V = "+Math.ceil(kerucut.hitungVolume()));
    }
    
}
