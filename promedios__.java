package parcia_1;
import java.util.*;
public class promedios__ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			Double num= 7.0;
			
			String [] calif=(sc.nextLine()).split(" ");
			int suma=0;
			for (int i=0; i<calif.length; i++) {
				suma += Integer.parseInt(calif[i]);
			}
			System.out.println("Promedio: "+suma/calif.length);
				
	}

}
