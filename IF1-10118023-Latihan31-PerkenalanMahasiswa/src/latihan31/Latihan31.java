/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan31;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : (Object Oriented) Perkenalan Mahasiswa
 */

public class Latihan31 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.nim = "10118023";
        mahasiswa.nama = "Zaenal Anzarry";
        mahasiswa.perkenalkanDiri();
        
        mahasiswa.nim = "10118037";
        mahasiswa.nama = "Muhammad Ihsan";
        mahasiswa.perkenalkanDiri();
        
        mahasiswa.nim = "10118039";
        mahasiswa.nama = "Fathahillah Satria Bima Seno";
        mahasiswa.perkenalkanDiri();
        
    }
    
}
