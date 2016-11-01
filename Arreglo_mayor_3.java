package parcia_1;
import java.util.*;
public class Arreglo_mayor_3 {

	public static void main(String[] args) {
		Scanner May = new Scanner(System.in);
		
		System.out.println("Ingresa la cadena de numeros dividida por espcacios");
		String cadena="";
		cadena = May.nextLine();
		int mayor =0 ;
		String [] numeros = cadena.split(" ");
		for(int i=0; i<numeros.length; i++) {
			if(Integer.parseInt(numeros[i]) > mayor) {
				mayor= Integer.parseInt(numeros[i]);
				
			}
			
		}
		System.out.println("Numero mayor: "+mayor);

	}

}
