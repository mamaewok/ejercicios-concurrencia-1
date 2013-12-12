package hilos;

public class HiloContadorDivisores extends Thread {
    
	public HiloContadorDivisores(int i){
        
    }

    @Override
    public void run() {
        int i=0;
        int cont=0;
        int aux;
        for (int a = 1; a <= i; a++) {
            if ((i % a) == 0) {
                cont++;
               
            }
        } System.out.print(" " + cont + " ");
    }

}
