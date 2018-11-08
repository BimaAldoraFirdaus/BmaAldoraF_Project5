import java.util.Scanner;
class Anyar{
	public static int fungsi(int n){
		Scanner bm = new Scanner (System.in);

		System.out.println("Berapa Tiket Ekonomi Yang Masuk?:"); 
		int kapeko =bm.nextInt(); 
		if (kapeko>= 0 && kapeko<= 500){ 
			System.out.println("Tiket Resmi dari panpel");  
			System.out.println("Tiket resmi yang terjual = " + kapeko); 
		}

		else if (kapeko > 500){ 
			System.out.println("ADA TIKET PALSU!!!"); 
			System.out.println("Tiket Palsu berjumlah " + (kapeko - 500) ); 
		}
		else { 
			System.out.println("INPUTAN SALAH"); 
		}
		System.out.println("Berapa Tiket VIP Yang Masuk?:"); 
		int kapvip =bm.nextInt(); 
		if (kapvip>= 0 && kapvip<= 250){
			System.out.println("Tiket Resmi dari panpel"); 
			System.out.println("Tiket resmi yang terjual = " + kapvip);

		}

		else if (kapvip > 250){ 
			System.out.println("ADA TIKET PALSU!!!"); 
			System.out.println("Tiket Palsu berjumlah " + (kapvip-250));

		}
		else {
			System.out.println("INPUTAN SALAH");
		}


		
		System.out.println("Berapa Tiket VVIP Yang Masuk?:"); 
		int kapvvip =bm.nextInt();
		if (kapvvip>= 0 && kapvvip<= 250){ 
			System.out.println("Tiket Resmi dari panpel"); 
			System.out.println("Tiket resmi yang terjual = " + kapvvip);

		}

		else if (kapvvip > 250){ 
			System.out.println("ADA TIKET PALSU!!!");
			System.out.println("Tiket Palsu berjumlah " + (kapvvip-250)); 
		}
		else { 
			System.out.println("INPUTAN SALAH"); 

		}

		System.out.println("___________________________________________");

		int tolpal = (kapeko-500) + (kapvip-250) + (kapvvip-250); 
		if(tolpal>0){ 
		System.out.println("Total tiket palsu ada 		:"+ tolpal); 
		}
		else{
			System.out.println("Tidak ada tiket yang palsu");	
		}
		int[] harga = new int[3];
		harga[0]= 35000;
		harga[1]= 50000;
		harga[2]= 70000;

		int total1 = harga[0] * kapeko; 
		System.out.println("Total penjualan tiket Ekonomi 	:"  + total1); 
		int total2 = harga[1] * kapvip; 
		System.out.println("Total penjualan tiket VIP 	:"  + total2);
		int total3 = harga[2] * kapvvip; 
		System.out.println("Total penjualan tiket VVIP 	:"  + total3); 
		
		System.out.println("___________________________________________");
		System.out.println("Apa anda ingin mengecek kembali?\n1.YA\n2.TIDAK\nMASUKKAN ANGKA(1/2)");
		System.out.println("___________________________________________");
		
		int cekkembali = bm.nextInt();
		if(cekkembali==1)
		{
			return fungsi(0);
		}
		else
		{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int totalseluruh = total1 + total2 + total3; 
		System.out.println("HASIL SEMUA PENDAPATAN:" + totalseluruh);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		if (totalseluruh>=20000000){ 
			System.out.println("Seminar Sudah Mencapai Target! Good Jobs:) ");
		}

		else { 
			System.out.println("Seminar kurang untuk mencapai target pendapatan");
			}
		}
		return 0;
		
	}
	public static void main(String[] args){
		Scanner bm = new Scanner (System.in);
		System.out.println("Apakah anda mau mengecek tiket?\nMasukkan angka (1.Ya/2.Tidak)"); 
		int cek = bm.nextInt();
		if(cek == 1)
		{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 
		System.out.println("-------PENJUALAN TIKET SEMINAR-------"); 
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		fungsi(0);
		}
		else{
		System.out.println("Terima kasih"); 			
		}
		
	}
}
