/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdaftarpelajaran;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felix ryan
 */
public class guru {

    public String wjm;

    void dataguru() {
        Scanner scan = new Scanner(System.in);

        System.out.println("berapa guru yang akan didaftarkan");
        int guru = scan.nextInt();
        String nama[] = new String[guru];
        String alamat[] = new String[guru];
        String jenisKelamin[] = new String[guru];
        int nomorGuru[] = new int[guru];
        String mataPelajaran[] = new String[guru];
        int a = guru + 1;
        for (int i = 0; i < guru; i++) {
            System.out.print("Masukkan nama : ");
            nama[i] = scan.next();
            System.out.println("");
            System.out.print("alamat:");
            alamat[i] = scan.next();
            System.out.println("");
            System.out.print("jenis kelamin:");
            jenisKelamin[i] = scan.next();
            System.out.println("");
            System.out.print("nomor guru:");
            nomorGuru[i] = scan.nextInt();
            System.out.println("");
            System.out.print("mata pelajaran:");
            mataPelajaran[i] = scan.next();
        }
        System.out.println("ingin mengeluarkan informasi guru yang keberapa?");
        int b = scan.nextInt();
        int d = b - 1;
        System.out.println(nama[d]);
        System.out.println(alamat[d]);
        System.out.println(jenisKelamin[d]);
        System.out.println(nomorGuru[d]);
        System.out.println(mataPelajaran[d]);

    }

    public void mengajar() {
    }
}
