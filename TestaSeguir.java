import processing.core.PApplet;
import java.util.ArrayList;

public class TestaSeguir extends PApplet {
	private Seguidor seguidor;
	private Seguível seguível;

	public void settings() {
		size(1000, 1000);
	}

	public void draw(){
		background(64);
		if (seguidor != null) {
			seguidor.desenha();
			seguidor.move();
			seguidor.segue();
		}
		if (seguível != null) {
			seguível.desenha();
			seguível.move();
		}
	}

	public void mousePressed() {
		SuperBola bola = new SuperBola(50, mouseX, mouseY, this);
		SuperQuadrado quad = new SuperQuadrado(50, mouseX, mouseY, this);

		bola.setaDX(random(-2,2));
		bola.setaDY(random(-2,2));
		quad.setaDX(random(-2,2));
		quad.setaDY(random(-2,2));

		if (mouseButton == LEFT) {
		    if (random(-1,1) < 0) {
			seguível = quad;
		    } else {
			seguível = bola;
		    }

		} else if (mouseButton == RIGHT) {
		    seguidor = bola;

		}

		if (seguível != null && seguidor != null)
		    seguidor.estabeleceAlvo(seguível);

	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "TestaSeguir" };
		PApplet.main(appletArgs);
    }
}
