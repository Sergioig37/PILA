package utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Write {

	public static void escribir(String fichero, Iterator<Integer> numeros) {
		BufferedWriter salida;
		ArrayList<Integer> numerosASacar = new ArrayList<Integer>();
		try {
			salida = new BufferedWriter ( new FileWriter(fichero));
			
			while(numeros.hasNext()){
				numerosASacar.add(numeros.next());
				}
				salida.write(numerosASacar.toString());
				
				salida.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
