/* Introdução ao uso de objetos e classes
   Objetos do mundo real possuem características e comportamentos, na programação
   orientada a objetos usamos esse conceito do mundo real e aplica aos nossos
   problemas que queremos resolver usando computação. */

public class Pessoa {
	// Atributo nome do tipo String
	public String nome;

	// Construtor
	public Pessoa() {
		this.nome = "Ninguém";
	}

	// Construtor com argumento
	public Pessoa(String nome) {
		this.nome = nome;
	}

	// Método que dá um comportamento
	public void dizNome() {
		System.out.printf("Oi, eu sou %s!\n", this.nome);
	}
}
