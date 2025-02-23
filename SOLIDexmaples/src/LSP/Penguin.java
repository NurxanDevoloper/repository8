package LSP;

// Нарушение LSP: класс Penguin не умеет летать
public class Penguin extends Bird{
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Penquins can't fly");
	}
	
	// Penguin не реализует FlyingBird
}
