import processing.core.PApplet;
import java.util.ArrayList;

public class TestaSeguir2 extends PApplet {
	private SuperBola seguidor;
	private SuperBola seguível;

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
			seguível.segue();
		}
	}

	public void mousePressed() {
		SuperBola bola = new SuperBola(50, mouseX, mouseY, this);

		bola.setaDX(random(-2,2));
		bola.setaDY(random(-2,2));

		if (mouseButton == LEFT) {
		    seguível = bola;

		} else if (mouseButton == RIGHT) {
		    seguidor = bola;

		}

		if (seguível != null && seguidor != null) {
		    seguidor.estabeleceAlvo(seguível);
		    seguível.estabeleceAlvo(seguidor);
		}




	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "TestaSeguir2" };
		PApplet.main(appletArgs);
    }
}
