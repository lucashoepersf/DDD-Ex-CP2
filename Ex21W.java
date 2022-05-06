package CP2;

import java.util.Scanner;

public class Ex21W {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
	
		int num;
		
		
		System.out.println("Digite um valor:");
		num = ler.nextInt();
		
		while (num <= 0) {
			System.out.println ("Número invalido, digite um número positivo!");
			num = ler.nextInt();
			
		System.out.printf("Número válido %d", num);
		
		}	
		
		
	}
	
}
