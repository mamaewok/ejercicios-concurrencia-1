package hilos;

public class HiloSumaTerminan implements Runnable {

	private int contador;

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			if (i % 10 == 2 || i % 10 == 3) {
				setContador(getContador() + i);
			}
		}
		System.out.println(
				"La suma de los 1000 primeros números que acaban en 2 y 3 es " + getContador());

	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
