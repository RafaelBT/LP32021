//Classe para testar a classe Pessoa
public class TestaPessoa {

	public static void main(String[] args) {
		// Declaração das pessoas
		Pessoa eu;
		Pessoa outro;

		// Inicialização dos objetos;
		eu = new Pessoa("Rafael"); // Chamada ao construtor
		outro = new Pessoa();

		outro.dáNome("Alguém");

		eu.dizNome();
		outro.dizNome();

		System.out.println(eu.pegaNome());
	}
}
