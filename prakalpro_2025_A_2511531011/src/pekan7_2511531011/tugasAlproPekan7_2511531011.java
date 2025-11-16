package pekan7_2511531011;

import java.util.Scanner;

public class tugasAlproPekan7_2511531011 {

	public static void main(String[] args) {
		Akun_2511531011 a= new Akun_2511531011();
		
		Scanner input = new Scanner(System.in);
		System.out.println("===== REGISTRASI AKUN BARU =====");
		System.out.print("Masukkan Username\t: ");
		String u=input.nextLine();
		System.out.print("Masukkan Password\t: ");
		String p=input.nextLine();
		System.out.print("Masukkan Email\t\t: ");
		String e=input.nextLine();
		System.out.print("Masukkan PIN (6 digit)\t: ");
		int n=input.nextInt();
		int pint=n+10;
		String pins=Integer.toString(n)+10;
		
		
		a.setUsn(u);
		a.setPw(p);
		a.setEmail(e);
		a.setPin(n);
		
		if ((a.isPasswordValid())&&(a.isEmailValid())) {
			System.out.println("\n--- REGISTRASI BERHASIL ---");
			System.out.println("Akun untuk \""+a.getUsn()+"\" telah berhasil dibuat.");
			System.out.println("\n--- DETAIL AKUN ---");
			System.out.println("Username (Lowercase)\t: "+a.getUsn().toLowerCase());
			System.out.println("Email (Uppercase)\t: "+a.getEmail().toUpperCase());
			System.out.println("ID Pengguna (Gabungan)\t: "+a.getUsn()+a.getPin());
			System.out.println("\n--- Uji Tipe Data (PIN Anda: "+a.getPin()+") ---");
			System.out.println("PIN (int) + 10\t\t= "+pint);
			System.out.println("PIN (string) + 10\t= "+pins);
		} else if (!a.isPasswordValid()) {
			System.out.println("\n--- REGISTRASI GAGAL ---");
			System.out.println("Password Anda kurang dari 8 karekter! \nSilahkan Coba Lagi.");
		} else if (!a.isEmailValid()) {
			System.out.println("\n--- REGISTRASI GAGAL ---");
			System.out.println("Email Anda \""+a.getEmail()+"\" tidak valid! (harus mengandung '@' dan '.') \nSilahkan Coba Lagi.");
		}
		input.close();

	}

}
