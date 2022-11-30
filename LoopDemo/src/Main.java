
public class Main {

	public static void main(String[] args) {
		// for
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");

		// while döngüsü
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü Bitti.");
		
		
		// do-while döngüsü
		// kosul saglanmasa bıle bır kereye mahsus dongu calısır
		int j =100;
		do {
			//System.out.println("Loglandı.");
			System.out.println(j);
			j+=2;
			
		} while (j<10);
		System.out.println("do-While Döngüsü Bitti.");
		
	}
}
