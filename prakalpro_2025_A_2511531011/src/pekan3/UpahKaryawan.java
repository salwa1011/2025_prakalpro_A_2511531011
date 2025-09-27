package pekan3;

import java.util.Scanner;

public class UpahKaryawan {

	public static void main(String[] args) {
		String nama;
		char golongan;
		int jam;
		int gaji=0;
		int bonus=0;
		int totgaji;
		
		// Masukkan input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukkan Nama Karyawan : ");
		nama = keyboard.nextLine();
		
		System.out.println("Masukkan golongan : ");
		golongan = keyboard.next().charAt(0);
		
		System.out.println("Masukkan jumlah jam kerja : ");
		jam = keyboard.nextInt();
		keyboard.close();
		
		//Analisis upah
		if (golongan == 'A') {
			gaji = 1000;
		} else if (golongan == 'B') {
			gaji = 2000;
		} else if (golongan == 'C') {
			gaji = 3000;
		} else if (golongan == 'D') {
			gaji = 4000;
		} else {
			System.out.println("Golongan tidak valid!");
			return; //hentikan program
		} 
		
		//Hitung bonus gaji
		if (jam > 60) {
			bonus = (jam-60)*5000;
		}
		
		//Hitung total upah
		totgaji = jam * gaji + bonus;
		
		//Tampilkan hasil
		System.out.println("\n==== Gaji Karyawan ====");
		System.out.println("Nama Karyawan : "+nama);
		System.out.println("Upah mingguan : "+totgaji);
	}

}
