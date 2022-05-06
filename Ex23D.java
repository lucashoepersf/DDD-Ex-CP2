import java.util.Scanner;

public class Ex23D {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		
		String sexo;
				
		do {
		
			System.out.println ("Digite o sexo utilizando o F ou M: ");
			sexo = ler.next().toUpperCase();
		
		}while (sexo == "F" || sexo == "M");
		
		if (sexo != "F" || sexo != "M") {
			System.out.printf("O sexo escolhido foi o: " + sexo);
		
		
	
	
		}
	
	}
}
