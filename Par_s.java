	   import java.util.*;
	   public class Par_s{
	public static void main(String[]args){
		Scanner src=new Scanner(System.in);
		int k, a=0;
		System.out.println("Ingresa un numero: ");
		k=src.nextInt();
		a=k%2;
		
		switch(a){
			case 0:
		System.out.println("El numero es par");
			break;
			default:
			System.out.println("El numero es impar");
			break;
			
		}
	  }
	}