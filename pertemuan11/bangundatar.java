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
public abstract class bangundatar {
    int x,y;
    int jumlahSisi;
    double Luas,Keliling;

    //konstruktor
    bangundatar (int sisi){
     this.jumlahSisi=sisi;
    }

    public int getJumlahSisi(){
        return jumlahSisi;
    }
    public double getLuas(){
        return Luas;
    }
    public double getKeliling(){
        return Keliling;
    }
    public void pindahkan(int a, int b)
    {
        x = a;
        y = b;
    }

    public abstract void draw();
    public abstract void resize();
}