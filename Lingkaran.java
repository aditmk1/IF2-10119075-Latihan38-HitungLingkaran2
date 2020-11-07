/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan38;

/**
 *
 * @author
 * NAMA     : aditiya musthafa kamil
 * KELAS    : IF-2
 * NIM      : 10119075
 * Deskripsi Program : Class untuk objek Lingkaran
 * 
 * 
 */
public class Lingkaran {
    public int diameter;
    private double jari, luas, keliling, phi;
    
    private double hitungJari() {
        return (double)diameter / 2;
    }
    
    private double hitungLuas() {
        return phi * (jari*jari);
    }
    
    private double hitungKeliling() {
        return 2 * phi * jari;
    }
    
    public void hitungLingkaran() {
        phi = Math.PI;
        jari = hitungJari();
        luas = hitungLuas();
        keliling = hitungKeliling();
        
        String jari_T = (jari % 1 == 0)?
                Integer.toString((int)jari) : Double.toString(jari);
        String luas_T = String.format("%.2f", luas);
        luas_T = luas_T.replace('.', ',');
        String keliling_T = String.format("%.2f", keliling);
        keliling_T = keliling_T.replace('.', ',');
        
        System.out.println("======Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = ".
                concat(jari_T).concat(" cm"));
        System.out.println("Luas Lingkaran = ".
                concat(luas_T).concat(" cm"));
        System.out.println("Keliling Lingkaran = ".
                concat(keliling_T).concat(" cm"));
    }
}
