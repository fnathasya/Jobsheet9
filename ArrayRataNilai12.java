import java.util.Scanner;

public class ArrayRataNilai12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double total= 0;
       double rata2, rata2MhsLulus = 0, rata2MhsTdkLulus = 0;
       int jmlMhs, jmlLulus =0, jmlTdkLulus = 0;

       System.out.println("Masukkan Jumlah Mahasiswa : ");
       jmlMhs = sc.nextInt();
       int [] nilaiMhs = new int [jmlMhs];

       for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.println("Masukkan Nilai Mahasiswa Ke-"+(i+1)+":");
        nilaiMhs[i] = sc.nextInt();
       }

       for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
        if (nilaiMhs[i] > 70) {
            System.out.println("Mahasiswa ke-"+i+" dinyatakan LULUS!");
            rata2MhsLulus+=nilaiMhs[i];
            jmlLulus++;
        } else {
            System.out.println("Mahasiswa ke-"+i+" dinyatakan TIDAK LULUS!");
            rata2MhsTdkLulus+=nilaiMhs[i];
            jmlTdkLulus++;
        }
       }

       rata2MhsLulus /= jmlLulus;
       System.out.println("Rata-rata nilai lulus = "+rata2MhsLulus);

       rata2MhsTdkLulus /= jmlTdkLulus;
       System.out.println("Rata-rata nilai tidak lulus = "+rata2MhsTdkLulus);

       rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+ rata2);
       
    }
}


