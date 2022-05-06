package CP2;

import java.util.Scanner;

public class Ex22D {


	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);	
	
	int num1, num2 ;
	
	
	System.out.println ("Digite o primeiro valor: ");
	num1 = ler.nextInt();
		
	do  {
		
		System.out.println("Digite o segundo valor:");
		num2 = ler.nextInt();
		
		}
	
	while (num1 > num2); {
	
	}
		System.out.printf("Primeiro valor: %d. Segundo valor: %d", num1, num2);
	
		
		
	}
	
}

	
	
	