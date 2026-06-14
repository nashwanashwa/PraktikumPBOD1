package PBO09_24060124140150;

import java.util.*;

public class Teman<T> {
    private int nbelm;
    private ArrayList<String> Lnama;

    public Teman () {
        nbelm = 0;
        Lnama = new ArrayList<String>();
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks) {
        if(indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    public void setNama(int indeks, String nama) {
        if(indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = Lnama.size();
    }

    public void delNama(String nama) {
        if(Lnama.remove(nama)) {
            nbelm = Lnama.size();
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) {
        int idx = Lnama.indexOf(nama);
        if(idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for(String n : Lnama) {
            if(n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        for(String n : Lnama) {
            System.out.println("- " + n);
        }
    }
}




