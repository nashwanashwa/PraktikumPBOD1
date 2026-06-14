/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : Kucing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Kucing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Kucing) Bersuara: Meong");
    }

    @Override
    public String toString() {
        return "Kucing";
    }
}   