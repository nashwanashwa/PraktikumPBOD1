/* Nama File    : Mahasiswa.java
 * Deskipsi     : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Nashwa Aldebaran / 24060124140150  
 * Tanggal      : 03 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /***************ATRIBUT***************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***************METHOD***************/

    //konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>(); //Inisialisasi ArrayList kosong
        
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul (MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }   

    public int getJumlahSKS() {
    int totalSKS = 0;
        for(int i = 0; i < listMatkul.size(); i++) {
            totalSKS = totalSKS + listMatkul.get(i).getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatkul() {

    return listMatkul.size();

    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        
        int i;
        for (i = 0; i<listMatkul.size();i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    } 
}//end class Mahasiswa
