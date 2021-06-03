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
public class sepeda extends kendaraan{
    private boolean isAuto;

    //override
    @Override
    public void nyalakan() {
        int kecepatanSepeda = 0;
        System.out.println("yuk, kita gowes sepedanya! ");
        System.out.println("sekarang kecepatan sepedamu adalah "+kecepatanSepeda+" km/jam");
    }

    //
    void jenis(){
        if (isAuto){
            System.out.println("Sepeda otomatis");
        }else {
            System.out.println("Sepeda kayuh");
        }
    }
}