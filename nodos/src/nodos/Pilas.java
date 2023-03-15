package nodos;

import java.util.Scanner;

public class Pilas {

	private int tope, max;
	private String pila[];
	
	public Pilas (int m) {
		max=m;
		pila =new String[max];
		tope=0;
	}
	private void Agregar(String n) {
		if(tope<max) {
			pila[tope]=n;
			tope++;
			System.out.println("Dato Agregado");
			}
		else System.out.println("Ya no caben datos");
		}
	
	private void Mostrar() {
		if(!Vacia())
		{
			for(int a=(tope-1);a>0;a--) {
				System.out.println(pila[a]);
			}
		}
		else System.out.println("Pila Vacia");
	}
	
	private boolean Vacia() {
		if(pila==null)return true;
		else return false;
	}
	
	public static void main (String arg[]) {
		int t, opcion;
		String dato;
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Pilas--");
		System.out.println("tamanio para Pila: ");
		t=teclado.nextInt();
		Pilas pilita= new Pilas(t);
		do{
			   System.out.println("1. Agregar dato");
			   System.out.println("2. Mostrar datos");
			   System.out.println("3. Salir");
			   System.out.println("Que desea hacer? ");
			   opcion=teclado.nextInt();
			   switch(opcion)
			   {
			    case 1:
			    System.out.println("Escriba un dato: ");
			    dato=teclado.next();
			    pilita.Agregar(dato);
			    break;
			    case 2:
			    pilita.Mostrar();
			    break;
			   }
			  }while(opcion!=3);
			 }

	}
	