import java.util.Scanner;


public class HesapMakinesi {
	public static void main (String[] args){
	    Scanner giris = new Scanner(System.in);    // kullanýcýdan sayiyi istedik
		System.out.println("Hesaplanacak ilk sayiyi giriniz: ");
		int sayi1 = giris.nextInt();
		System.out.println("Hesaplanacak ikinci sayiyi giriniz : ");
		int sayi2 = giris.nextInt();
		
		System.out.println("------HESAP MAKÝNESÝ------");
		int toplama = sayi1 + sayi2;
		System.out.println("Toplam :" + toplama);
		
		System.out.println("Fark :" + (sayi1 - sayi2));
		System.out.println("Carpým :" + (sayi1 * sayi2));
		
		double bolum =  (double) sayi1 / sayi2 ;
		System.out.println("Bolum :" + bolum);
		
		int kalan = sayi1 % sayi2;
		System.out.println("Kalan :" + kalan);

		}
	}
