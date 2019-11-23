package exercicio.bridge;

public class main {
	
	public static void main(String[] args) {
		shape shape = new circle();
		shape.setcolor(new red());
		
		shape.render();
	}

}
