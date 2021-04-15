import processing.core.PApplet;
import java.util.ArrayList;

public class TestaAnimável extends PApplet {
	private ArrayList<Animável> coisas;

	public void settings() {
		size(1000, 1000);
		coisas = new ArrayList<Animável>();
	}

	public void draw(){
		background(64);
		int i = 0;
		for (i = 0; i < coisas.size(); i++) {
			Animável coisa = coisas.get(i);
			coisa.desenha();
			coisa.move();

		}

	}

	public void mousePressed() {
		if (mouseButton == LEFT) {
			SuperBola bola = new SuperBola(50, mouseX, mouseY, this);
			bola.setaDX(1);
			bola.setaDY(1);
			coisas.add(bola);
		} else if (mouseButton == RIGHT) {
			SuperQuadrado quad = new SuperQuadrado(50, mouseX, mouseY, this);
			quad.setaDX(1);
			quad.setaDY(1);
			coisas.add(quad);
		}
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "TestaAnimável" };
		PApplet.main(appletArgs);
    }
}
