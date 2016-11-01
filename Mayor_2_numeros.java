package parcia_1;
import java.util.*;
public class Mayor_2_numeros {
	
	public static void main(String[] args) {
		
	Scanner	mayor = new Scanner(System.in);
		int N1, N2;
		
		System.out.println("Ingresa el primer número: ");
		N1= mayor.nextInt();
		System.out.println("Ingresa el segundo número: ");
		N2= mayor.nextInt();
		
		if(N1>N2)
			System.out.println(N1 +" Es mayor que: : " + N2);
		else
			System.out.println(N2 +" Es mayor que: : " + N1);
		
	}

} 
