import processing.core.PApplet;
import java.util.ArrayList;

public class TestaDesenhável extends PApplet {
	private ArrayList<Desenhável> coisas;

	public void settings() {
		size(1000, 1000);
		coisas = new ArrayList<Desenhável>();
	}

	public void draw(){
		background(64);
		int i = 0;
		for (i = 0; i < coisas.size(); i++) {
			Desenhável coisa = coisas.get(i);
			coisa.desenha();
		}

	}

	public void mousePressed() {
		if (mouseButton == LEFT) {
			SuperBola bola = new SuperBola(50, mouseX, mouseY, this);
			bola.setaDX(1);
			bola.setaDY(1);
			coisas.add(bola);
		} else if (mouseButton == RIGHT) {
			Quadrado quad = new Quadrado(50, mouseX, mouseY, this);
			quad.setaDX(1);
			quad.setaDY(1);
			coisas.add(quad);
		}
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "TestaDesenhável" };
		PApplet.main(appletArgs);
    }
}
