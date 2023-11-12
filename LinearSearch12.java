import java.util.Scanner;

public class LinearSearch12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlElemen, key, hasil;

        System.out.println("Masukkan jumlah elemen array : ");
        jmlElemen = sc.nextInt();

        int[] elemenArray = new int[jmlElemen];
        for (int i = 0; i < elemenArray.length; i++) {
            System.out.println("Masukkan elemen array ke-" + i + " : ");
            elemenArray[i] = sc.nextInt();
        }

        System.out.println("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        hasil = -1;
        for (int i = 0; i < elemenArray.length; i++) {
            if (elemenArray[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        }

        sc.close();
    }
}


