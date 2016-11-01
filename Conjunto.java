	import java.util.*;
	public class Conjunto{
	public static void main(String[]agrs){
	  Scanner src=new Scanner(System.in);
	   
	   int n, num=1, suma=0, i=0;
	   int prom;
	   
	   do{
	   System.out.println("Ingresa un numero" +  num);
	   n=src.nextInt();
	   num++;
	   suma+=n;
	   i+=1;
	   prom=suma/i;
	   
	   }while(prom>15);
	   System.out.println("La suma es: "+ suma);
	   System.out.println("La cantidad de numeros: " +i);
	   System.out.println("El promedio es: "+ prom);
	  
	  }
	}