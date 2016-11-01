import java.util.Scanner;

public class MenuFiguras {

public static void main(String[]args){
   
   Scanner src=new Scanner(System.in);
   
   int A, regist=0;
   do {
   System.out.println("Menu de Areas de Figurlas EL RODO");
   System.out.println("1.- Triangulo \n 2.- Cuadrado \n 3.- Circulo");
   A= src.nextInt();
   
   switch(A){
	   
	   case 1:
	    System.out.println("Ingresa la base:");
	   int base=src.nextInt();
		System.out.println("Ingresa la altura:");
		int altura=src.nextInt();
	   int valor = calcularTriangulo(base,altura);
	   System.out.println("El Area del Triangulo es: " + valor);
	   break;
	   case 2:
	     System.out.println("Ingresa el Lado 1:");
	   int base2=src.nextInt();
		System.out.println("Ingresa el Lado 2:");
		int altura2=src.nextInt();
	   int valor2 = calcularCuadrado(base2,altura2);
	   System.out.println("El Area del Cuadrado es: " +valor2);
	   break;
	   case 3:
	     System.out.println("Ingresa el Radio:");
	   double radio=src.nextInt();
	   double valor3 = calcularCirculo(radio);
	   System.out.println("El Area del Circulo es: " +valor3);
	   break;
}
   System.out.println("------------------------------------ \n Si no quieres continuar ingresa 0");
regist=src.nextInt();
  }while(regist!=0);
}
public static int calcularTriangulo(int base, int altura){
int ope= (base * altura) / 2;
return ope;
}

public static int calcularCuadrado(int base2, int altura2){
int ope2= base2 * altura2;
return ope2;
}

public static double calcularCirculo(double radio){
double ope3= radio * 3.1416;
return ope3;
}
 }
   
 