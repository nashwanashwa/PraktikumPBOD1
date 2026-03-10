public class MataKuliah {
    /***************ATRIBUT***************/
    private String idMatkul;
    private String nama;
    private int sks;

    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getidMatkul(){
        return idMatkul;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public void nama(String nama){
        this.nama = nama;
    }

    public int getSks(){
        return sks;
    }

    public void sks(int sks){
        this.sks = sks;
    }

    public void printMatKul(){
        System.out.println(idMatkul + "-" + nama + " (" + sks + "SKS)");
    }

}
