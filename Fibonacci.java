package parcia_1;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int cantidadN,f1,f2, j;
	        do{
	            System.out.print("Ingresa un número que sea mayor de 1 para encontrar la sucesión Fibonacci: ");
	            cantidadN = sc.nextInt();
	            
	        }while(cantidadN<=1);
	        System.out.println("Los " + cantidadN + " términos de la sucesión de Fibonacci son: "); 

	        f1=1;
	        f2=1; 
	        System.out.print(f1 + ", ");
	        for(j=2;j<=cantidadN;j++) {
	             System.out.print(f2);
	             f2 = f1 + f2;
	             f1 = f2 - f1;
	             if(j<cantidadN)
	             System.out.print(", ");
	           
	        }
	        System.out.println("...");
	    
	}

	}


