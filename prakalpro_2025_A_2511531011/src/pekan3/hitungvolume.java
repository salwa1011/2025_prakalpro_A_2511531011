package pekan3;

import java.util.Scanner;

public class hitungvolume {

	public static void main(String[] args) {
		// Menghitung volume kerucut
		int a; //alas
		int ts; //tinggi segitiga
		int t; //tinggi prisma
		double la; //luas alas
		double volume;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukkan alas segitiga : ");
		a = keyboard.nextInt();
		System.out.println("Masukkan tinggi segitga : ");
		ts = keyboard.nextInt();
		System.out.println("Masukkan tinggi prisma : ");
		t = keyboard.nextInt();
		keyboard.close();
		
		la = 0.5 * a * ts;
		volume = la*t;
		System.out.println("Volume prisma segitiga : "+volume);

	}

}
