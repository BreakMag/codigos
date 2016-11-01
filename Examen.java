	import java.util.*;

	 public class Examen{

	   public static void main(String[]args){

	     Scanner src=new Scanner(System.in);
		  int O, a, b, resultado=0;
		  int seguir=0;
		  do{
		  System.out.println("1.- Suma \n 2.- Resta \n 3.- Multiplicacion \n 4.- Division");
	      System.out.println("---Selecciona una de las siguientes de las opciones---");
		  O=src.nextInt();
		  
		  switch(O){
			  
			  case 1:
			  System.out.println("Ingresa el valor de a: ");
			  a=src.nextInt();
			  System.out.println("Ingresa el valor de b: ");
			  b=src.nextInt();
			  resultado=a+b;
		  System.out.println("La suma de " + a + " + " + b + " = " + resultado);
		    break;
			
			case 2:
			  System.out.println("Ingresa el valor de a: ");
			  a=src.nextInt();
			  System.out.println("Ingresa el valor de b: ");
			  b=src.nextInt();
			  resultado=a-b;
		  System.out.println("La Resta de " + a + " + " + b + " = " + resultado);
		     break;
			 
			 case 3:
			  System.out.println("Ingresa el valor de a: ");
			  a=src.nextInt();
			  System.out.println("Ingresa el valor de b: ");
			  b=src.nextInt();
			  resultado=a*b;
		  System.out.println("La multiplicacion de " + a + " + " + b + " = " + resultado);
		  break;
		  
		  case 4:
			  System.out.println("Ingresa el valor de a: ");
			  a=src.nextInt();
			  System.out.println("Ingresa el valor de b: ");
			  b=src.nextInt();
			  resultado=a/b;
		  System.out.println("La division de " + a + " + " + b + " = " + resultado);
		  }
		  System.out.println("Si quieres continuar presiona 1");
		  System.out.println("Si no deseas continuar presiona 0");
		  seguir=src.nextInt();
		  
		   if(seguir==0){
			  System.out.println("Gracias, programa finalizado...");
		  }
		  }while(seguir==1);
		  
	 }
	}