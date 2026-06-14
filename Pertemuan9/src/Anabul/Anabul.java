/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : Anabul.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;
public abstract class Anabul {
    /* 2. a) atribut panggilan */
    protected String panggilan;

    public Anabul() {

    }

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    /* 2. a) fungsi getNama */
    public String getNama() {
        return panggilan;
    }

    /* 2. a) prosedur setNama */
    public void setNama(String panggilan) {
        this.panggilan = panggilan;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}