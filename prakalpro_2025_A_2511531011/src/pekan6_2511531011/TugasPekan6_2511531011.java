package pekan6_2511531011;

import java.util.Random;
import java.util.Scanner;

public class TugasPekan6_2511531011 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		int coba=0;
		boolean lempar=true;
		String jawab;
		
		System.out.println("Permainan Tebak Lempar Dadu");
		System.out.println("============================");
		
		while (lempar) {
			coba++;
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
			sum = dadu1 + dadu2;
			System.out.println(dadu1+" + "+dadu2+" = "+sum);
			
			if (sum==7) {
				System.out.println("Tebakan Anda Benar");
				System.out.println("Anda menang setelah "+coba+" percobaan!");
				break;
			} else {
				System.out.println("Tebakan Anda Salah");
				System.out.print("Apakah mau lempar dadu? (ya/tidak) = ");
				jawab=scan.nextLine();
				
				if (jawab.equalsIgnoreCase("tidak")) {
					lempar=false;
					System.out.println("Anda gagal menang");
				}
			}
		}
		scan.close();
	}

}