package CP2;



import java.util.Scanner;

public class Ex21D {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		
		int num;
		
		
		do {
			System.out.println("Digite um valor postivo:");
			num = ler.nextInt();
		}
		
		while (num <= 0) ;

			
		System.out.printf("Número válido %d", num);
		
		}
		
	}

