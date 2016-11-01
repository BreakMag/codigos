	import java.util.*;

	  public class Examen3 {

	    public static void main(String[]args){

	      Scanner src=new Scanner(System.in);
	 
	  int n, i=0, total=0, pago, cambio, l=0, hehe=0;
	  
	  System.out.println("---- Tiendita Don Chon---");
	  System.out.println("Usando las siguientes denominaciones de moneda, ingresa el valor de los productos");
	  System.out.println("$5OO \n $200 \n $100 \n $50 \n $20 \n $10 \n $5 \n $1");
	  
	  do{
	  System.out.println("Ingresa los precios de los productos: ");
	  n=src.nextInt();
	  System.out.println("Presiona 1 para continuar ingresando valores");
	  System.out.println("Finalizar ingresa 999");
	  hehe=src.nextInt();
	  total+=n;
	  i+=1;
	  }while(hehe!=999);
	   System.out.println("Por favor introduzca el monto con el que pago el cliente: ");
	  pago=src.nextInt();
	  System.out.println("-------------------------------------");
	  
	  System.out.println("Usted compro: "+ i + " articulos");
	  System.out.println("El total de su compra fue: " + total);
	  System.out.println("Su pago: " + pago);
	  cambio=pago-total;
	  System.out.println("Su cambio: " + cambio);
	 
	 
	  if((cambio>=500) && (cambio<=200) && (cambio<=100) && (cambio<=50) && (cambio<=20) && (cambio<=10) && (cambio<=5) && (cambio<=1)){
		l=+1;
		System.out.println(l + cambio);
	   }	
	 
	 }
	}