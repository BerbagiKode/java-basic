package javabasic;

import java.util.Scanner;

public class LuasSegitiga {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan alas = ");
		Double alas = input.nextDouble();
		
		System.out.print("Masukkan tinggi = ");
		Double tinggi = input.nextDouble();
		
		Double luas = (alas * tinggi)/2;
		System.out.print("Luas segitiga = " + luas);
	}
}
