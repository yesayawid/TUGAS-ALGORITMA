

import src.Model.Perhitungan;

public class JalankanPerhitungan {

    public static void main(String[] args) {


        Perhitungan s = new Perhitungan(4, 6, 0) ;
        s.PrintJudul();
        int Hasilpertambahan = s.Hasilpertambahan(4, 7);
        System.out.println("Hasil Tambah = "+ Hasilpertambahan);
        int Hasilperkalian = s.Hasilperkalian(5, 5);
        System.out.println("Hasil Kali = "+Hasilperkalian);
    }
}