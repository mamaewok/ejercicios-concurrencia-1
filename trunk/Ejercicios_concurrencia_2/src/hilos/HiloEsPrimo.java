package hilos;

public class HiloEsPrimo implements Runnable{
	
	private int numero;

	@Override
	public void run() {
		if(getNumero()%1 == 0 && getNumero()%getNumero()==0){
			
		}
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
}
