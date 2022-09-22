/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Intan2
 */
public class aplikasi {
    public static void main(String[] args) {
        Scanner kelompok7 = new Scanner(System.in);

        // deklarasi variable
        String kategori_buku1;
        String kategori_buku2;
        String kategori_buku3;
        int kategori_buku;
        int hasil_bulan1, hasil_bulan2, hasil_bulan3, hasil_bulan4, hasil_bulan5, hasil_bulan6;
        int harga_buku1, harga_buku2, harga_buku3;
        int stok, stok1 = 135, stok2 = 100, stok3 = 50;

        // inisialisasi nilai x, y, z
        int X1, X2, X3, X4, X5, X6, X7;
        int Y1, Y3, X, Y, Z;

        System.out.println();
        System.out.println("==============================================");
        System.out.println("Penjualan Buku Berdasarkan Kategori");
        System.out.println("==============================================");
        System.out.println();

        // input jumlah kategori buku yang akan dibeli
        System.out.print("Masukan jumlah kategori buku    : ");
        kategori_buku = kelompok7.nextInt();

        if (kategori_buku >= 0) {
            // kategori buku 1
            System.out.println("-------------------------");
            System.out.println("KATEGORI BUKU 1");
            System.out.print("Masukan jenis buku        : ");
            kategori_buku1 = kelompok7.next();
            System.out.print("Harga Satuan Buku         : ");
            harga_buku1 = kelompok7.nextInt();
            System.out.print("Laku di Bulan Pertama     : ");
            hasil_bulan1 = kelompok7.nextInt();
            System.out.print("Laku di Bulan Kedua       : ");
            hasil_bulan2 = kelompok7.nextInt();
            System.out.println();

            // kategori buku 2
            System.out.println("-------------------------");
            System.out.println("KATEGORI BUKU 2");
            System.out.print("Masukan jenis buku        : ");
            kategori_buku2 = kelompok7.next();
            System.out.print("Harga Satuan Buku         : ");
            harga_buku2 = kelompok7.nextInt();
            System.out.print("Laku di Bulan Pertama     : ");
            hasil_bulan3 = kelompok7.nextInt();
            System.out.print("Laku di Bulan Kedua       : ");
            hasil_bulan4 = kelompok7.nextInt();
            System.out.println();

            // kategori buku 3
            System.out.println("-------------------------");
            System.out.println("KATEGORI BUKU 3");
            System.out.print("Masukan jenis buku        : ");
            kategori_buku3 = kelompok7.next();
            System.out.print("Harga Satuan Buku         : ");
            harga_buku3 = kelompok7.nextInt();
            System.out.print("Laku di Bulan Pertama     : ");
            hasil_bulan5 = kelompok7.nextInt();
            System.out.print("Laku di Bulan Kedua       : ");
            hasil_bulan6 = kelompok7.nextInt();
            System.out.println();

            // fungsi
            System.out.println(hasil_bulan1 + "x + " + hasil_bulan2 + "y = " + stok1);
            System.out.println(hasil_bulan3 + "x + " + hasil_bulan4 + "y = " + stok2);
            System.out.println(hasil_bulan5 + "x + " + hasil_bulan6 + "y = " + stok3);

            // eliminasi setiap fungsi baris 1
            X1 = hasil_bulan1 * hasil_bulan2;
            X2 = hasil_bulan3 * hasil_bulan2;
            X3 = stok1 * hasil_bulan2;

            // eliminasi setiap fungsi baris ke-2
            X4 = hasil_bulan2 * hasil_bulan1;
            X5 = hasil_bulan3 * hasil_bulan1;
            X6 = stok2 * hasil_bulan1;

            // hitung hasil
            System.out.println();
            System.out.println(X1 + "x +" + X2 + "y = " + X3);
            System.out.println(X4 + "x +" + X5 + "y = " + X6);

            // cari nilai y
            Y1 = X2 - X5;
            stok = X3 - X6;
            System.out.println("            " + Y1 + "y = " + stok);
            Y = stok / Y1;
            System.out.println("Jadi nilai y = " + Y);

            // cari nilai x
            System.out.println(hasil_bulan1 + "x + " + hasil_bulan3 + "y = " + stok1);
            Y3 = hasil_bulan3 * Y;
            System.out.println(hasil_bulan1 + "x + " + Y3 + " = " + stok1);
            System.out.println(hasil_bulan1 + "x + " + stok1 + " = " + Y3);
            X7 = stok1 - Y3;
            System.out.println("x = " + X7 + " / " + hasil_bulan1);
            X = X7 / hasil_bulan1;
            System.out.println("Jadi nilai x = " + X);

            // cari nilai z (substitusi nilai x & y)
            System.out.println("-------------------------------");
            System.out.println("z = " + harga_buku1 + "x + " + harga_buku2 + " y");
            Z = (harga_buku1 * X) + (harga_buku2 * Y);
            System.out.println("-------------------------------");
            System.out.println("z = " + Z);
            System.out.println();

        }
    }
}
