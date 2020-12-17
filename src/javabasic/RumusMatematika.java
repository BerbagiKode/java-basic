package javabasic;

import java.util.Scanner;

public class RumusMatematika {

	public static void main(String[] args) {
		System.out.println("Kode Rumus :");
		System.out.println("1. Luas Persegi");
		System.out.println("2. Luas Persegi Panjang");
		System.out.println("3. Luas Segitiga");
		System.out.println("---------------------");
		System.out.print("Pilihan kode rumus : ");
		
		Scanner input = new Scanner(System.in);
		int kode = input.nextInt();
		System.out.println("---------------------");
		
		if (kode == 1) {
			luasPersegi(input);
		} else if (kode == 2) {
			luasPersegiPanjang(input);
		} else if (kode == 3) {
			luasSegitiga(input);
		} else {
			System.out.println("Kode tidak valid");
		}
	}

	private static void luasSegitiga(Scanner input) {
		System.out.print("Masukkan alas = ");
		Double alas = input.nextDouble();
		
		System.out.print("Masukkan tinggi = ");
		Double tinggi = input.nextDouble();
		
		Double luas = (alas * tinggi)/2;
		System.out.print("Luas segitiga = " + luas);
	}

	private static void luasPersegiPanjang(Scanner input) {
		System.out.print("Masukkan panjang = ");
		int panjang = input.nextInt();
		
		System.out.print("Masukkan lebar = ");
		int lebar = input.nextInt();
		
		int luas = panjang * lebar;
		System.out.print("Luas persegi panjang = " + luas);
	}
	
	private static void luasPersegi(Scanner input) {
		System.out.print("Masukkan sisi = ");
		int sisi = input.nextInt();
		
		int luas = sisi * sisi;
		System.out.print("Luas persegi = " + luas);
	}
}
