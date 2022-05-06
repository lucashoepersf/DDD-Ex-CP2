package Ex34;

import java.util.Scanner;

import Ex32.Cliente;

public class Programa {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Cliente [] ListaClientes = new Cliente[5];
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		String atualizaEmail;
		
		String PossuiConta;
		
		for (int i = 0 ; i<5 ; i++) {

			
			System.out.println("Digite seu id: ");
			id= ler.nextInt();
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu nome: ");
			nome = ler.next();
			
			System.out.println("Digite seu email: ");
			email = ler.next();
			
			System.out.println("Voc� possui conta banc�ria (S/N) ? ");
			PossuiConta =  ler.next().toUpperCase();
			
			if (PossuiConta.equals("S")) {
				ContaBancaria cb = new ContaBancaria();
				
							
				System.out.println("Digite sua ag�ncia: ");
				cb.agencia = ler.next();
				System.out.println("Digite o n�mero da conta: ");
				cb.numero = ler.next();
				System.out.println("Digite o seu saldo: ");
				cb.saldo = ler.nextDouble();
				
				conta = cb;
			}else {	
				conta = null;	
			}
			
			Cliente c = new Cliente(id,nome,idade,email,conta);
			ListaClientes[i] = c ;
			
		}
		for (int i = 0 ; i<5 ; i++) {
			
			System.out.printf("\n %s ", ListaClientes[i].ExibirNomeIdade());
			System.out.printf("\n %s ", ListaClientes[i].exibirDadosConta());
			System.out.println("Deseja atualizar o email (S/N) ? ");
			atualizaEmail =  ler.next().toUpperCase();
			
			if(atualizaEmail.equals("S")) {
				System.out.println("Digite o email do cliente");
				email = ler.next();
				
				ListaClientes[i].AtualizarEmail(email);
				
			}
		}
	}

}

