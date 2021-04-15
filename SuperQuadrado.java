import processing.core.PApplet;

public class SuperQuadrado implements Animável, Seguível {
	private float lado;
	private float posx;
	private float posy;
	private float dx = 0;
	private float dy = 0;

	private PApplet lugar;
	private int cor;

	//Construtor
	public SuperQuadrado(float lado, float posx, float posy, PApplet lugar) {
		this.lado = lado;
		this.posx = posx;
		this.posy = posy;
		this.lugar = lugar;
		this.cor = lugar.color(255, 255, 255);
	}

	//Interface Seguível
	public Posição pegaPosição() {
		return new Posição(this.posx, this.posy);
	}

	public void desenha() {
		this.lugar.push();
		this.lugar.fill(this.cor);
		this.lugar.square(posx - lado/2, posy - lado/2, lado);
		this.lugar.pop();
	}

	public void move() {
		this.posx = this.posx + this.dx;
		this.posy = this.posy + this.dy;
		ajusta();
	}

	public void ajusta() {
		if (posx < 0) {
			posx = posx + lugar.width;
			cor = lugar.color(lugar.random(0,255), lugar.random(0,255), lugar.random(0,255));
		}
		else if (posx > lugar.width) {
			posx = posx - lugar.width;
		}
		if (posy < 0) posy = posy + lugar.height;
		else if (posy > lugar.height) posy = posy - lugar.height;
	}



	public void setaLado(float lado) {
		this.lado = lado;
	}

	public void setaX(float posx) {
		this.posx = posx;
	}

	public void setaY(float posy) {
		this.posy = posy;
	}

	public float pegaLado() {
		return this.lado;
	}

	public float pegaX() {
		return this.posx;
	}

	public float pegaY() {
		return this.posy;
	}

	public void setaDX(float dx) {
		this.dx = dx;
	}

	public void setaDY(float dy) {
		this.dy = dy;
	}
	public float pegaDX() {
		return this.dx;
	}

	public float pegaDY() {
		return this.dy;
	}



}
