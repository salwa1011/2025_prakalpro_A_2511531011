package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511531011 {

	public static void main(String[] args) {
		// sistem pembelian tiket bioskop
		
		String nama; //nama pembeli
		int hari;
		int jumlah; //jumlah tiket
		int waktu; //waktu tayang
		int studio; //jenis studio
		double harga=30000.0; //harga dasar
		double subtotal;
		double hhari; //harga hari
		double hwaktu; //harga waktu
		double hstudio; //harga studio
		double hargapertiket;
		double diskon;
		double total;
		
		//variabel untuk menyimpan dari switch
		String nhari = "";
		String nwaktu = "";
		String nstudio = "";
		
		//masukkan input
		Scanner input = new Scanner(System.in);
		System.out.print("Nama Pembeli	: ");
		nama = input.nextLine();
		System.out.print("Jumlah Tiket	: ");
		jumlah = input.nextInt();
		System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu) 	: ");
		hari = input.nextInt();
		System.out.print("Waktu tayang (1=Pagi, 2=Siang, 3=Malam)		: ");
		waktu = input.nextInt();
		System.out.print("Jenis studio (1=Reguler, 2=Deluxe, 3=Premium)	: ");
		studio = input.nextInt();
		input.close();
		
		//menentukan harga berdasarkan hari
		switch (hari) {
		case 1:
			nhari="Senin-Kamis";
			hhari=0.0; 
		break;
		case 2:
			nhari="Jumat";
			hhari=0.1; //+10%
		break;
		case 3:
			nhari="Sabtu-Minggu";
			hhari=0.3; //+30%
		break;
		default:
			System.out.print("Hari tidak valid!");
		return;
		}
		
		//menentukan harga berdasarkan waktu
		switch (waktu) {
		case 1:
			nwaktu="Pagi (10.00-12.00)";
			hwaktu=0.0;
		break;
		case 2:
			nwaktu="Siang (12.00-17.00)";
			hwaktu=0.0;
		break;
		case 3:
			nwaktu="Malam (17.00-22.00)";
			hwaktu=0.3; //+30%
		break;
		default:
			System.out.print("Waktu tidak valid!");
		return;
		}
		
		//menentukan harga berdasarkan studio
		switch (studio) {
		case 1:
			nstudio="Reguler";
			hstudio=0.0;
		break;
		case 2:
			nstudio="Deluxe";
			hstudio=0.2;
		break;
		case 3:
			nstudio="Premium";
			hstudio=0.5;
		break;
		default:
			System.out.print("Studio tidak valid!");
		return;
		}
		
		//hitung total harga
		hargapertiket = harga*(1+hhari+hwaktu+hstudio);
		subtotal = hargapertiket*jumlah;
		
		//Output
		System.out.println("");
		System.out.println("====PEMBELIAN TIKET BIOSKOP====");
		System.out.println("Nama Pembeli	: "+nama);
		System.out.println("Jumlah Tiket	: "+jumlah);
		System.out.println("Hari		: "+nhari);
		System.out.println("Waktu tayang	: "+nwaktu);
		System.out.println("Jenis studio	: "+nstudio);
		System.out.println("==============================");
		System.out.println("Harga Dasar	: Rp "+harga+"/tiket");
		System.out.println("Biaya Hari	: +"+(int)(hhari*100)+"%");
		System.out.println("Biaya Waktu	: +"+(int)(hwaktu*100)+"%");
		System.out.println("Biaya Studio	: +"+(int)(hstudio*100)+"%");
		System.out.println("Harga per Tiket	: "+hargapertiket);
		//diskon 20% jika tiket lebih dari 5
				if (jumlah>=5) {
					diskon=subtotal*0.2;
					System.out.println("Diskon		: "+diskon);
				} else 
					diskon=0.0;
		System.out.println("==============================");
		//total semuanya + diskon
				total=subtotal-diskon;
		System.out.println("Total Pembayaran	: "+total);
		
	}

}
