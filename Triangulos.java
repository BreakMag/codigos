	import java.util.*;
	public class Triangulos {
	 public static void main(String[]args){
		 
				Scanner hip=new Scanner(System.in);
				int lado, altura, ancho;
				System.out.print("--------------Tipos de Triangulos------------- " + "\n");
				System.out.println("Ingresa el lado del Triangulo: ");
				lado=hip.nextInt();
				System.out.print(" \n Ingresa la altura del Triangulo: ");
				altura=hip.nextInt();
				System.out.print("\n El ancho del Triangulo tiene que ser mayor a los anterioes" + "\n" +"Ingresa el ancho del Triangulo: ");
				ancho=hip.nextInt();
				
				if(ancho>=altura+lado){
					System.out.println("No es un Triangulo... :( ");
					
				} 
				if(Math.pow(ancho,2)==altura+lado) {
					System.out.println("El Triangulo es Rectangulo");
					
				}
				if(Math.pow(ancho,2)>altura+lado){
					System.out.println("El Triangulo es obtusangulo");
					
				}
				if(Math.pow(ancho,2)<altura+lado){
					System.out.println("El Triangulo es obtuso");
					
				}
	 }
	} 