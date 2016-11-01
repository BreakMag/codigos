	import java.util.*;
	 public class vocales{

	  public static void main(String[]args){

	    Scanner src=new Scanner(System.in);

	    String a,converirda;
		int x=1, j=0, n=0;
		 
		for(int i=0; i<=5; i++){
			System.out.println("Ingresa una letra" + x);
			a=src.nextLine();
			converirda=a.toLowerCase();
			x++;
			if("a".equals(converirda) || "e".equals(converirda) || "i".equals(converirda) || "o".equals(converirda) || "u".equals(converirda)){
				n++;
				
			}else{
				j++;
				}
		}
		System.out.println("Las vocales son: "+ n);
		System.out.println("Las consonantes son: " + j);
	}
	}