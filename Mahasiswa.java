
import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final ArrayList<tampilMahasiswa> daftarMahasiswa = new ArrayList<>();

        int pilih;
        do {
            System.out.println("Pilih:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilihan anda: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tampilMahasiswa tambahMahasiswa = new tampilMahasiswa();
                    tambahMahasiswa.tambahData();
                    daftarMahasiswa.add(tambahMahasiswa);
                    break;
                case 2:
                    tampilkanDataMahasiswa(daftarMahasiswa);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Maaf inputan anda salah");
                    break;
            }
        } while (pilih != 3);
    }

    private static void tampilkanDataMahasiswa(ArrayList<tampilMahasiswa> daftarMahasiswa) {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("\nBelum ada data mahasiswa.");
        } else {
            System.out.println("\nData Mahasiswa:");
            tampilMahasiswa tambahMahasiswa = new tampilMahasiswa();
            tambahMahasiswa.tampilUniversitas();
            for (tampilMahasiswa mahasiswa : daftarMahasiswa) {
                mahasiswa.tampilDataMahasiswa();
            }
        }
    }
}

class tampilMahasiswa {
    String nama;
    String nim;
    String jurusan;

    void tambahData() {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = inp.nextLine();
        System.out.print("Masukkan Nim Mahasiswa: ");
        nim = inp.nextLine();
        long length = String.valueOf(nim).length();
        while (length != 15) {
            System.out.println("Nim harus 15 digit!!!");
            System.out.print("Masukkan Nim mahasiswa: ");
            nim = inp.nextLine();
            length = String.valueOf(nim).length();
        }
        // consume newline
        System.out.print("Masukkan jurusan mahasiswa: ");
        jurusan = inp.nextLine();
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan);
    }

    void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }
}