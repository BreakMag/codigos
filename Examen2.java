	import java.util.*;

	   public class Examen2{

	     public static void main(String[]args){
	 
	       Scanner src=new Scanner(System.in);
		   
		   double mi=0, cen=0, met=0, kil=0;
		   
		   System.out.println("----Conversion de milimetros----");
		   System.out.println("Ingresa los milimetros: ");
		   mi=src.nextDouble();
		   
		   cen= mi/10;
		   met=mi/1000;
		   kil=mi/1000000;
		   
		   System.out.println(mi + "milimetros =" + cen + " centimetros");
		   System.out.println(mi + "milimetros =" + met + " metros");
		   System.out.println(mi + "milimetros =" + kil + " kilometros");
	 }
	}