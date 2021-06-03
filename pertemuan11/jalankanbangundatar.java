/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;

/**
 *
 * @author Gunawan
 */
public class jalankanbangundatar {
    public static void main(String[] args) {

        //
        persegipanjang panggil = new persegipanjang(1);
//        panggil.getPanjang();
//        panggil.getLebar();
//        System.out.println("Luas kotak adalah = "+panggil.getLuasKotak()+" cm^2");
//        System.out.println("Keliling kotak adalah = "+panggil.getKelilingKotak()+" cm");

        System.out.println("====pelebaran persegi panjang====");
        panggil.panjang=4;
        panggil.lebar=5;
        System.out.println("panjang sebelum pelebaran = "+panggil.panjang+" cm");
        System.out.println("lebar sebelum pelebaran = "+panggil.lebar+" cm");
        System.out.println();
        System.out.println("Luas sebelum pelebaran = "+panggil.getLuasKotak()+" cm^2");
        System.out.println("Keliling sebelum pelebaran = "+panggil.getKelilingKotak()+" cm");
        System.out.println();
        System.out.println("panjang setelah pelebaran = "+2*panggil.panjang+" cm");
        System.out.println("lebar setelah pelebaran = "+2*panggil.lebar+" cm");
        System.out.println();
        System.out.println("Luas setelah pelebaran = "+panggil.Resize(2)+" cm^2");
        System.out.println("Keliling setelah pelebaran = "+panggil.resizeKeliling(2)+" cm");
        System.out.println("====akhir dari pelebaran persegi panjang====");


        //
//        System.out.println();
//
//        Segitiga buatSegitiga = new Segitiga(1);
//        buatSegitiga.getAlas();
//        buatSegitiga.getSisiB();
//        buatSegitiga.getSisiC();
//        buatSegitiga.getTinggi();
//        System.out.println("Luas kotak adalah = "+buatSegitiga.getLuasSegi3()+" cm^2");
//        System.out.println("Keliling kotak adalah = "+buatSegitiga.getKeliling()+" cm");
    }
}