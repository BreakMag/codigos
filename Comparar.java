	import java.util.*;
	 public class Comparar{
	  public static void main(String[]args){
		  Scanner src=new Scanner(System.in);
		  
		  int n, num=1, romper, mayor=0, menor=0;
		  do{
		  
			 System.out.println("Ingresa la calificación:" + num);
		     n=src.nextInt();
			  num++;
			  
		  if(n<=7)
			  menor+=1;
		  if(n>=7)
		     mayor+=1;
		  
		  } while(n!=0);
		   System.out.println("Las calificaciones menor a 7 son: "+ menor+ " ");
			  System.out.println("Las calificaciones mayores a 7 son: "+ mayor + "");
		  
	}
	}