package CP2;

import java.util.Scanner;

public class Ex21W {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
	
		int num;
		
		
		System.out.println("Digite um valor:");
		num = ler.nextInt();
		
		while (num <= 0) {
			System.out.println ("N�mero invalido, digite um n�mero positivo!");
			num = ler.nextInt();
			
		System.out.printf("N�mero v�lido %d", num);
		
		}	
		
		
	}
	
}
