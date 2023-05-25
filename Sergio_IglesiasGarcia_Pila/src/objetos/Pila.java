package objetos;

import java.util.ArrayList;

import excepciones.PilaLlenaException;
import utilidades.Write;

public class Pila {

	private ArrayList<Integer> numeros;
	
	
	public Pila() {
		numeros = new ArrayList<Integer>();
	}

	
	
	
	public void add(int numero) throws PilaLlenaException {
		
		if(numeros.size()<30) {
			numeros.add(0, numero);
		}
		else {
			PilaLlenaException llena = new PilaLlenaException("La pila está llena") ;
				throw llena;
			
		}
		
	}
	
	
	
	public void get() {
		
		try {
			numeros.remove(0);
		}
		catch(Exception e){
			System.out.println("La pila no tiene más números");
		}
		
	}
	
	
	public boolean comprobarLlena() {
		
		boolean llena;
		
		if(numeros.size()==30) {
			llena = true;
		}
		else {
			llena = false;
		}
		
		return llena;
		
	}
	
	public boolean comprobarVacia() {
		
		boolean vacia;
		
		if(numeros.isEmpty()) {
			vacia = true;
		}
		else {
			vacia = false;
		}
		
		
		return vacia;
		
	}
	
	public int cuantosNumeros() {
		
		
		return numeros.size();
	}
	
	
	public void volcarDatos(String fichero) {
		
		Write.escribir(fichero, numeros.iterator());
		
	}

	@Override
	public String toString() {
		return "[" + numeros + "]";
	}





	public ArrayList<Integer> getNumeros() {
		return numeros;
	}


	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	
	
}
