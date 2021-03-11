import processing.core.PApplet;
import java.util.ArrayList;

public class TestaMuitasBolas extends PApplet {
	private ArrayList<Bola> bolas;

	public void settings() {
		size(1000, 1000);
		bolas = new ArrayList<Bola>();
	}

	public void draw(){
		background(64);
		int i = 0;
		for (i = 0; i < bolas.size(); i++) {
			Bola bola = bolas.get(i);
			ellipse(bola.pegaX(), bola.pegaY(), bola.pegaTamanho(), bola.pegaTamanho());
			bola.move();
			if (bola.pegaX() >= 1000 - bola.pegaTamanho()/2) bola.setaDX(-bola.pegaDX());
			else if (bola.pegaX() < bola.pegaTamanho()/2) bola.setaDX(-bola.pegaDX());
			if (bola.pegaY() >= 1000 - bola.pegaTamanho()/2)  bola.setaDY(-bola.pegaDY());
			else if (bola.pegaY() < bola.pegaTamanho()/2) bola.setaDY(-bola.pegaDY());
		}

	}

	public void mousePressed() {
		Bola bola = new Bola(50, mouseX, mouseY);
		bola.setaDX(1);
		bola.setaDY(1);
		bolas.add(bola);
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "TestaMuitasBolas" };
		PApplet.main(appletArgs);
    }
}
