package latihanpbo;

public class Latihanpbo {

    public static void main(String[] args) {
        Kalkulator ben = new Kalkulator();
        ben.angka1(12);
        ben.angka2(4);
        
        
        
        System.out.println("Hasil Jumlah = " + ben.getHasiljumlah());
        
        System.out.println("Hasil kali = " + ben.getHasilkali());
        
        System.out.println("Hasil Bagi = " + ben.getHasilbagi());
        
        System.out.println("Hasil Kurang = " + ben.getHasilkurang());
    }
    
}
