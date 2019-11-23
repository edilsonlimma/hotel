package exercicio.bridge;

public class red extends color{

	@Override
	public void paint(shape shape) {
		System.out.println("Pintei o " + shape +  " de vermelho");
		
	}

}
