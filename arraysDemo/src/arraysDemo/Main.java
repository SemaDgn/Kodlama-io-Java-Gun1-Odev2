package arraysDemo;

public class Main {
	public static void main(String[] args) {
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]="Lokman";
		ogrenciler[1]="Sema";
		ogrenciler[2]="Yüsra";
		ogrenciler[3]="Aybars";
		for (int i = 0; i < ogrenciler.length; i++) {
			
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-------------------");
		for (String ogr : ogrenciler) {
			System.out.println(ogr);
			
		}
		
		
		
 		
	}

}
