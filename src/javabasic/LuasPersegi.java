package javabasic;

import java.util.Scanner;

public class LuasPersegi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan sisi = ");
		int sisi = input.nextInt();
		
		int luas = sisi * sisi;
		System.out.print("Luas persegi = " + luas);
	}
}
