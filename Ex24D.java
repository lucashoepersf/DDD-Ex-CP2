package CP2;

import java.util.Scanner;

public class Ex24D {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		int num, tab, i;
		
		num = 5;
		i = 1;
		
		System.out.printf("TABUADA DO 5");
		
		do { 
			
			tab = num * i;
			System.out.printf("\n%d x %d", num, i, tab);
			i++;
		}
	
		while (i<=10);
		
	
	}
}