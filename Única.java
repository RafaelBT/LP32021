public final class Única {

	private static boolean existe = false;

	public void faz() {
		System.out.println("Fazendo!");
	}

	public static Única cria() {
		Única novo;

		if (existe) return null;
		else {
		   existe = true;
		   return new Única();
		}
	}

	//Construtor privado
	private Única() {
	}
}
