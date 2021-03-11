import processing.core.PApplet;
import java.util.ArrayList;

public class TestaSuperBola extends PApplet {
	private ArrayList<SuperBola> bolas;

	public void settings() {
		size(1000, 1000);
		bolas = new ArrayList<SuperBola>();
	}

	public void draw(){
		background(64);
		int i = 0;
		for (i = 0; i < bolas.size(); i++) {
			SuperBola bola = bolas.get(i);
			bola.desenha();
			bola.move();
			if (bola.pegaX() >= 1000 - bola.pegaTamanho()/2) bola.setaDX(-bola.pegaDX());
			else if (bola.pegaX() < bola.pegaTamanho()/2) bola.setaDX(-bola.pegaDX());
			if (bola.pegaY() >= 1000 - bola.pegaTamanho()/2)  bola.setaDY(-bola.pegaDY());
			else if (bola.pegaY() < bola.pegaTamanho()/2) bola.setaDY(-bola.pegaDY());
		}

	}

	public void mousePressed() {
		SuperBola bola = new SuperBola(50, mouseX, mouseY, this);
		bola.setaDX(1);
		bola.setaDY(1);
		bolas.add(bola);
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "TestaSuperBola" };
		PApplet.main(appletArgs);
    }
}
