import processing.core.PApplet;

public class Quadrado implements Animável {
	private int lado;
	private int posx;
	private int posy;
	private int dx = 0;
	private int dy = 0;

	private PApplet lugar;

	public Quadrado(int lado, int posx, int posy, PApplet lugar) {
		this.lado = lado;
		this.posx = posx;
		this.posy = posy;
		this.lugar = lugar;
	}

	public void desenha() {
		this.lugar.square(posx - lado/2, posy - lado/2, lado);
	}

	public void move() {
		this.posx = this.posx - this.dx;
		this.posy = this.posy + this.dy;
		ajusta();
	}

	public void ajusta() {
		if (posx < 0) posx = posx + lugar.width;
		else if (posx > lugar.width) posx = posx - lugar.width;

		if (posy < 0) posy = posy + lugar.width;
		else if (posy > lugar.height) posy = posy - lugar.height;
	}



	public void setaLado(int lado) {
		this.lado = lado;
	}

	public void setaX(int posx) {
		this.posx = posx;
	}

	public void setaY(int posy) {
		this.posy = posy;
	}

	public int pegaLado() {
		return this.lado;
	}

	public int pegaX() {
		return this.posx;
	}

	public int pegaY() {
		return this.posy;
	}

	public void setaDX(int dx) {
		this.dx = dx;
	}

	public void setaDY(int dy) {
		this.dy = dy;
	}
	public int pegaDX() {
		return this.dx;
	}

	public int pegaDY() {
		return this.dy;
	}



}
