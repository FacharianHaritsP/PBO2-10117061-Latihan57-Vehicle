/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan57.vehicle;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menampilkan status
 * 
 */
public class PBO210117061Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Bicycle bcl = new Bicycle();
        System.out.println("Bicycle");
        bcl.setMyBrand("Trek Bike");
        bcl.setMyModel("7.4FX");
        System.out.println("Brand : " + bcl.getMyBrand());
        System.out.println("Model : " + bcl.getMyModel());
        
        
        System.out.println("\nSkateBoard");
        Skateboard skt = new Skateboard();
        skt.setMyBrand("Ally Skate");
        skt.setMyModel("Rocket");
        System.out.println("Brand : " +skt.getMyBrand());
        System.out.println("Model : " +skt.getMyModel() );
    }

}
