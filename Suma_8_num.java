package parcial_1;
import java.util.*;
public class Suma_8_num {

	public static void main(String[] args) {
		Scanner suma = new Scanner(System.in);
		int x, a=0, num=1;
		for (int i=0; i<=7; i++){
			System.out.println("Ingresa el numero " + num);
			x= suma.nextInt();
			a += x;
			num++;
		}
		System.out.println("La suma es: " + a);

	}

}
