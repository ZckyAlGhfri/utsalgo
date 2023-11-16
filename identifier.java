/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alpro6;

/**
 *
 * @author ZckyAlGhfri
 */
public class identifier{
    public static void main (String [] args) {
     
        String namaDepan, namaBelakang, NIM, jurusan, alamat, tempatLahir;
        int tanggalLahir, nohp;
        float nilai, ipk;
    
        namaDepan = "Muhammad Zacky";
        namaBelakang = "Alghifari";
        NIM = "I.2310702";
        alamat = "Kec. Darangdan, Kab. Purwakarta, Jawa barat";
        tempatLahir = "Purwakarta";
        nohp = 911;
        tanggalLahir = 27042005;
        nilai = 95.5f;
        ipk = 3.8f;
        
       
        System.out.println();
        System.out.println("\t========================================================================");
        System.out.println("\t\t\t\tBIODATA MAHASISWA");
        System.out.println("\t========================================================================");
        System.out.println("\tNama Lengkap\t\t: "+namaDepan+" "+namaBelakang);
        System.out.println("\tNIM\t\t\t: "+NIM);
        System.out.println("\tAlamat\t\t\t: "+alamat);
        System.out.println("\tNo HP\t\t\t: "+nohp);
        System.out.println("\tTempat/Tanggal Lahir\t: "+tempatLahir+", "+tanggalLahir);
        System.out.println("\tNilai\t\t\t: " + nilai);
        System.out.println("\tIPK\t\t\t: " + ipk);
        System.out.println("\t========================================================================");
    }
}
