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
public class Skateboard extends Vehicle{
 
    private double myBoardLegth=54.5;
    
    public Skateboard(){
        System.out.println("Panjangnya Board : " +myBoardLegth );
    }

    public double getMyBoardLegth() {
        return myBoardLegth;
    }

    public void setMyBoardLegth(double myBoardLegth) {
        this.myBoardLegth = myBoardLegth;
    }
    
}
