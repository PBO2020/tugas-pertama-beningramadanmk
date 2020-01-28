package latihanpbo;

public class Kalkulator {
    int angka1;
    int angka2;
    int hasilJumlah;
    int hasilKali;
    int hasilBagi;
    int hasilKurang;
    
    public int angka1(){
        return angka1;
    }
    public void angka1(int angka1){
        this.angka1 = angka1;
    }
    public int angka2(){
        return angka2;
    }
    public void angka2(int angka2){
        this.angka2 = angka2;
    }
    
    public int getHasiljumlah(){
        hasilJumlah = angka1 + angka2;
        return hasilJumlah;
    }
    public void setHasiljumlah(int hasilJumlah){
        this.hasilJumlah = hasilJumlah;
    }
    public int getHasilkali(){
        hasilKali = angka1*angka2;
        return hasilKali;
    }
    public void setHasilkali(int hasilKali){
        this.hasilKali = hasilKali;
    }
    public int getHasilbagi(){
        hasilBagi = angka1 / angka2;
        return hasilBagi;
    }
    public void setHasilbagi(int hasilBagi){
        this.hasilBagi = hasilBagi;
    }
    public int getHasilkurang(){
        hasilKurang = angka1 - angka2;
        return hasilKurang;
    }
    public void setHasilkurang(int hasilKurang){
        this.hasilKurang = hasilKurang;
    }
}
