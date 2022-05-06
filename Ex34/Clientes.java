package Ex34;

public class Clientes {

	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	Cliente(){
		
	}
	Cliente (int id , String nome , int idade, String email , ContaBancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void AtualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String ExibirNomeIdade() {
		return (this.nome + "-" + this.idade + "anos") ;
	}
	
	public String exibirDadosConta() {
		if (this.conta!=null) {
			return ("Ag�ncia: "+ this.conta.agencia + " N�mero: " + this.conta.numero + " Saldo: " + this.conta.saldo);
		}else { 
			return "N�o tem conta";
		}
	}
}
