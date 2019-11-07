/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.luthfiazizalpaqih.latihan44.hukumohm;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */
public class PBOUlang10116435LuthfiAzizAlPaqihLatihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here
        Baterai batt1 = new Baterai(3,12);
        Baterai batt2 = new Baterai();

        System.out.println("\nKuat Arus : "+batt1.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+batt1.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+batt1.hitungTegangan()+" volt");
    }
    
}
