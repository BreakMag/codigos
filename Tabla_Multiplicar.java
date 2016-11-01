package parcia_1;
import java.util.*;
public class Tabla_Multiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingresa un número sin decimales: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i =1; i<=10; i++){
        	for(int j = 0; j<=10; j++){
        		if(i<=n)
             System.out.println(i + " * " + j + " = " + i*j);
             
        }
        	if(i<=n)
        	System.out.println("------------------");
        	
        }
    

	}

}
