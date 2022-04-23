package src.Model;
import src.Interfaces.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;
       
    public Perhitungan(int _a, int _b, int _hasil){
        this.a = _a;
         this.b = _b;
        this.hasil = _hasil;
        printJudulClass( "Print judul dalam Class Perhitungan ");

    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);

    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul menggunakan interface");
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
    
    }

    //method rekursif dari hasil tambah
    public int Hasilpertambahan(int a1, int b1){
        this.a=a1;
        this.b=b1;
        HitungTambah();
        return this.hasil;
    }

    //method rekursif dari hasil Kali
    public int Hasilperkalian(int a_, int b_){
        this.a=a_;
        this.b=b_;
        HitungKali();
        return this.hasil;
    }
}
