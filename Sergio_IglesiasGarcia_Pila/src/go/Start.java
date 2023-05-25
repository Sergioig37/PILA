package go;

import excepciones.PilaLlenaException;
import objetos.Pila;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila pilaNumeros = new Pila();
		
		
		for(int i=1; i<=40; i++) {
			try {
				pilaNumeros.add(i);
			} catch (PilaLlenaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pilaNumeros.volcarDatos("C:\\Users\\Mañana\\Documents\\salida1.txt");
		System.out.println(pilaNumeros);
		
		for(int i=1; i<=10; i++) {
			pilaNumeros.get();
		}
		
		
		System.out.println(pilaNumeros);
		pilaNumeros.volcarDatos("C:\\Users\\Mañana\\Documents\\salida2.txt");
		
		for(int i=1; i<=30; i++) {
			pilaNumeros.get();
		}
		
		System.out.println(pilaNumeros);
	}

}
