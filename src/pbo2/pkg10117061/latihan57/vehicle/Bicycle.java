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
public class Bicycle extends Vehicle{
    
    private int myGearCount=23;

    public Bicycle(){
        System.out.println("Jumlah Gear : " +myGearCount );
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }

    public int getMyGearCount() {
        return myGearCount;
    }
    
}
