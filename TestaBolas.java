import processing.core.PApplet;

public class TestaBolas extends PApplet {
	private Bola bola;

	public void settings() {
		size(1000, 1000);
		bola = new Bola(60, 500, 500);
		bola.setaDX(1);
		bola.setaDY(1);
	}

	public void draw(){
		background(64);
		ellipse(bola.pegaX(), bola.pegaY(), bola.pegaTamanho(), bola.pegaTamanho());
		bola.move();
		if (bola.pegaX() >= 1000 - bola.pegaTamanho()/2) bola.setaDX(-bola.pegaDX());
		else if (bola.pegaX() < bola.pegaTamanho()/2) bola.setaDX(-bola.pegaDX());
		if (bola.pegaY() >= 1000 - bola.pegaTamanho()/2)  bola.setaDY(-bola.pegaDY());
		else if (bola.pegaY() < bola.pegaTamanho()/2) bola.setaDY(-bola.pegaDY());

	}

	public void mousePressed() {
		bola.setaX(mouseX);
		bola.setaY(mouseY);
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "TestaBolas" };
		PApplet.main(appletArgs);
    }
}
