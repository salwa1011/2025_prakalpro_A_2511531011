package pekan2;

import java.util.Scanner;

public class tugasAlproPekan2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Deklarasi variabel
		int kode;
		float harga;
		char inisial;
		boolean kondisi;
		
		// Meminta input user
		System.out.println("Masukkan kode barang 6 digit = ");
		kode = input.nextInt();
		
		
		// Tentukan harga berdasarkan kode
		if (kode <= 99999) {
			harga = 0.0f;
		}
		else if (kode <= 299999) {
			harga = 20000.55f;
		}
		else if (kode <= 399999) {
			harga = 30000.55f;
		}
		else if (kode <= 499999) {
			harga = 40000.55f;
		}
		else {
			harga = 550000.55f;
		}
		
		input.nextLine(); // Konsumsi sisa newline

		// Input inisial (char)
		System.out.print("Masukkan inisial penerima : ");
		inisial = input.nextLine().charAt(0); // Ambil karakter pertama dari input
		
		// Tentukan kondisi berdasarkan kode
		kondisi = (kode > 99999);
		
		// Output
		System.out.println("");
		System.out.println("==== Status Pemesanan Barang ====");
		System.out.println("Kode pesanan : "+ kode);
		System.out.println("Harga barang : "+ harga);
		System.out.println("Inisial penerima : "+ inisial);
		System.out.println("Sudah diterima user : "+ kondisi);
		
	input.close();
	}

}
