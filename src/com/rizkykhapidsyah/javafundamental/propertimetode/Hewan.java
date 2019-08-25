package com.rizkykhapidsyah.javafundamental.propertimetode;

public class Hewan {
    // Inisiasi dengan nilai inisial
    double Tinggi = 30, Berat = 3;

    // Inisiasi melalui konstruktor
    int Umur;

    // Konstruktor dengan parameter
    Hewan(int Umur) {
        this.Umur = Umur;
    }

    void Lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void Jalan() {
        System.out.println("Berjalan dengan pelan..");
    }

    void Makan() {
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double GetBerat() {
        return Berat;
    }

    double GetTinggi() {
        return Tinggi;
    }

    int GetUmur() {
        return Umur;
    }
}
