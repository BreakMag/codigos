import java.util.*;

public class Comprendidos{

public static void main(String[]args){

Scanner src=new Scanner(System.in);

System.out.println("Ingresa el numero 1");
int num1=src.nextInt();
System.out.println("Ingresa el numero 2");
int num2= src.nextInt();
entre(num1, num2);
}
public static void entre(int num1, int num2){
	System.out.println("Los numeros comprendidos son: ");
for (int i=num1 ; i<num2; i++){
System.out.println(i);	
}
}

 
}