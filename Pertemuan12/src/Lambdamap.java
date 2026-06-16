/**File: LambdaMap.java
*   Deskripsi: Menampilkan key (NIM) dan value (Nama) dari Map menggunakan ekspresi lambda 
*/

import java.util.HashMap;
import java.util.Map;

public class Lambdamap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        mahasiswaMap.put("24060124140150", "Nashwa Aldebaran"); 
        mahasiswaMap.put("24060124140001", "Adi");
        mahasiswaMap.put("24060124140002", "Bambang");
        mahasiswaMap.put("24060124140003", "Cici");
        
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " Nama: " + nama);
        });
    }
}
