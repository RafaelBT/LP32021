public class Bola {
	private int tamanho;
	private int posx;
	private int posy;
	private int dx = 0;
	private int dy = 0;

	public Bola(int tamanho, int posx, int posy) {
		this.tamanho = tamanho;
		this.posx = posx;
		this.posy = posy;
	}

	public void setaTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void setaX(int posx) {
		this.posx = posx;
	}

	public void setaY(int posy) {
		this.posy = posy;
	}

	public int pegaTamanho() {
		return this.tamanho;
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

	public void move() {
		this.posx = this.posx + this.dx;
		this.posy = this.posy + this.dy;
	}



}
