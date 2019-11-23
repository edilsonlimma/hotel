package exercicio.bridge;


public abstract class shape {
	private color color;
	
	public color getColor() {
		return color;
	}
	
	public void  setcolor(color color) {
		this.color = color;
	}

	public void render() {
		this.draw();
		this.color.paint(this);
	}
	public abstract void draw();
}
