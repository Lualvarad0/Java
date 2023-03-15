import java.lang.Thread;
import java.util.Scanner;
public class num_priHilos extends Thread {

	public static void main(String[] args)throws InterruptedException {
		Scanner ler=new Scanner(System.in);
		int limite, inicio = 2;
		boolean esPrimo;
		long InicioIiempo=java.util.Calendar.getInstance().getTimeInMillis();  
		System.out.println("Ingresa el limite del numero");
		limite=ler.nextInt();
		System.out.println("1");
		Thread h1 = new num_priHilos();  Thread h2 = new num_priHilos();
		h1.start();		h2.start();
		h1.join();		h2.join();	
		for(int i=inicio;i<=limite;i++) {
			esPrimo=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					esPrimo=false;
				}
			}
			if(esPrimo){
				long FinTiempo=java.util.Calendar.getInstance().getTimeInMillis(); 
				long TotalTiempo = (FinTiempo - InicioIiempo);
				System.out.print(i+"-");
				System.out.println("Fin de programa  en "+TotalTiempo+ " milisegundos");
			}
		  }
}
	}