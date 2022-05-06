package CP2;


import java.util.Scanner;

public class Ex22W {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		
		int num1, num2 ;
		
		System.out.println ("Digite o primeiro valor: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor:");
		num2 = ler.nextInt();
		
		while (num1 >= num2) {
			System.out.println ("Primeiro valor maior ou igual ao segundo valor, digite o segundo valor novamente:");
			num2 = ler.nextInt();
		}
		
		System.out.printf("Primeiro valor: %d. Segundo valor: %d", num1, num2);
		
		}
		
	}
