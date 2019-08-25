package com.rizkykhapidsyah.javafundamental.propertimetode;

public class Main {
    public static void main(String[] agrs) {
        // Menambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel Umur

        Hewan Kucing = new Hewan(2);

        Kucing.Makan();
        Kucing.Jalan();
        Kucing.Lari();

        // Contoh penggunaan fungsi GetUmur
        System.out.println("Umurnya adalah " + Kucing.GetUmur());

        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double BMI = Kucing.GetBerat() / ((Kucing.GetTinggi() * 0.01) * (Kucing.GetTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + BMI);
    }
}
