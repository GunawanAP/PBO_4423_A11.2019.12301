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
public class jalankankendaraan extends kendaraan {
    private int kondisiAwal;

    @Override
    public void nyalakan() {
        kondisiAwal=0;
        System.out.println("Kecepatan awal sebelum dinyalakan adalah "+kondisiAwal+" km/jam");
    }

    public static void main(String[] args) {
        jalankankendaraan panggil=new jalankankendaraan();
        panggil.nyalakan();

        //
        sepeda ambilSepeda=new sepeda();
        ambilSepeda.nyalakan();
        System.out.print("Tipe sepeda kita adalah ");
        ambilSepeda.jenis();
        System.out.println();
    }
}