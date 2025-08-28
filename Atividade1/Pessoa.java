package Atividade1;
public class Pessoa {
	String nome;
	int idade; 
	
	public Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		
	}
	public String getNome(String nome) {
		return nome;
	}
	public int getIdade(int idade) {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
