import java.util.Scanner;

public class TugasNo1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyakElemen;
        double rata2 ;

        System.out.println("Masukkan jumlah elemen : ");
        banyakElemen = sc.nextInt();

        int[] elemen = new int[banyakElemen];

        for (int i = 0; i < elemen.length; i++) {
            System.out.println("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
            elemen[i] = sc.nextInt();
        }

        int nilaiTertinggi = elemen [0], nilaiTerendah = elemen [0], total = elemen [0];
        for (int i = 1; i < banyakElemen; i++) {
            if (elemen[i] > nilaiTertinggi) {
                nilaiTertinggi = elemen[i];
                // System.out.println("Nilai tertingginya yaitu"+nilaiTertinggi);
            }
            if (elemen[i] < nilaiTerendah) {
                nilaiTerendah = elemen[i];
                // System.out.println("Nilai terendah yaitu "+nilaiTerendah);
            }
            total += elemen[i];
        }

        rata2 = (double) total / banyakElemen;
        System.out.println("Nilai tertingginya yaitu " + nilaiTertinggi);
        System.out.println("Nilai terendah yaitu " + nilaiTerendah);
        System.out.println("Nilai rata-rata : " + rata2);
    }
}
