
public class Main {
	public static void main(String[] args) {
		
		int sayi1=24;
		int sayi2=25;
		int sayi3 =26;
		int enbuyuksayi=sayi1;
		if (enbuyuksayi<sayi2) {
			
			enbuyuksayi=sayi2;
		}
		if (enbuyuksayi<sayi3) {
			enbuyuksayi=sayi3;			
		}
		System.out.println("En büyük sayi :"+ enbuyuksayi);
	}

}
