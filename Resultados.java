package parcia_1;
import java.util.*;
public class Resultados {

	public static void main(String[] args) {
		Scanner ope = new Scanner(System.in);
        float x, y;
        System.out.println("Agregale un valor a X: ");
        x = ope.nextInt();
        System.out.println("Agregale un valor a Y: ");
        y = ope.nextInt();
         
         System.out.println("La Multipicación de X"+ " "+ x +" "+ "por Y" +" "+  y + " =" +" "+ + x*y );
         System.out.println("____________________________________________________________");
         System.out.println("La División de X"+ " "+ x +" "+ "Entre Y" +" "+  y + " =" +" "+ + x/y );
         System.out.println("____________________________________________________________");
         int resultado = (int) Math.pow(x, y);
         System.out.println(" X " + x + " elevado a la " + " Y " + y + " = " + resultado);
         System.out.println("____________________________________________________________");
         float resultado2 = (float) Math.pow(x,1/y);
         System.out.println(" Y " + y + " Raíz de " + " X " + x + " = " + resultado2);
         System.out.println("____________________________________________________________");
         System.out.println(" X "+ x +" "+ "Módulo % Y" +" "+  y + " =" +" "+ + x%y );
         System.out.println("____________________________________________________________");

	}

}
