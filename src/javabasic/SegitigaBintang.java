package javabasic;

public class SegitigaBintang {

	public static void main(String[] args) {
		int i = 1;
		int tinggi = 5;
		
		for (int baris = 1; baris <= tinggi; baris++) {
			for (int spasi = (tinggi-baris); spasi >= 1; spasi--) {
				System.out.print(" ");
			}
			
			for (int bintang = 1; bintang <= i; bintang++) {
				System.out.print("*");
			}
			
			i+=2;
			System.out.println();
		}
	}
}
