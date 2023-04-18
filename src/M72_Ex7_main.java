import java.util.Scanner;

public class M72_Ex7_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bi = true;
		int any = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix un any per saber si era de traspas:  ");
		any = entrada.nextInt();
		
		bi = traspas(any);
		
		System.out.println((bi)? "Es un any de traspas" : "No es un any de traspas");
	
	}
	
	public static boolean traspas(int any) {
			
			boolean bi = false;
		
			if(any%400 == 0) {
				bi = true;
			}else if((any%400 == 0) && (any%100 != 0)) {
				bi = true;
			}else {
				bi = false;
			}
			
			return bi;
	
	}

}
