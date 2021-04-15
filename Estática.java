public class Estática {

	private int doObjeto;

	private static final int imexível = 1;

	private static int daClasse;

	private static int contador = 0;

	public Estática() {
		contador++;
	}

	public static void main(String[] args) {
		System.out.println("Alô!");

		Estática obj1, obj2, obj3;


		obj1 = new Estática();
		obj2 = new Estática();
		obj3 = new Estática();

		obj1.doObjeto = 30;
		obj2.doObjeto = 15;
		obj3.doObjeto = 100;

		obj1.daClasse = 1000000;

		Estática.daClasse = -999999;


		System.out.println(obj1.doObjeto);
		System.out.println(obj2.doObjeto);
		System.out.println(obj3.doObjeto);

		System.out.println(obj3.imexível);

		System.out.printf("Quantidade de objetos é: %d\n", Estática.contador);

		Única u1, u2;

		u1 = Única.cria(); // Retorna um ojeto do tipo Única

		u2 = Única.cria(); // Não retorna, retorna null

		u1.faz();
		u2.faz(); // u2 é null

	}
}
