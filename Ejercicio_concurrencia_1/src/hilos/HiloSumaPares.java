package hilos;

public class HiloSumaPares implements Runnable{

	private int contador;
	
	@Override
	public void run() {
		
		for(int i = 0; i < 1000; i++){
			if(i %2 == 0){
				setContador(getContador() + i);
			}
		}
		System.out.println(
				"La suma de los 1000 primeros números pares es " + getContador());
		
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}

}
