package parcia_1;
import java.util.*;
public class Mayor_menor_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menor, mayor, sum=0, num=0;
		menor= sc.nextInt();
		mayor= sc.nextInt();
		
		for (int i=0; 1<4; i++){
		
		System.out.println("Dame un número ");
		num = sc.nextInt();
		if(num>mayor) {
			mayor=num;
		}
		if(num<menor){
			menor=num;
			
		}
		System.out.println("Mayor: "+mayor+"\n Menor: "+ menor);
	}
	}
     
}
