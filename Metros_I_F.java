package parcia_1;
import java.util.Scanner;
public class Metros_I_F {

	public static void main(String[] args) {
		Scanner I_F = new Scanner(System.in);
		float M2, M1, DF;
        float KF, MF, K=1000, M=1609;
        System.out.println("Ingresa los Metros Iniciales: ");
        M1= I_F.nextInt();
        System.out.println("Ingresa los Metros Finales: ");
        M2= I_F.nextInt();
        
        DF =M2-M1;
        System.out.println(+ M1 + " " + "Metros de Inicio " + "\n" + M2 + " " + "Metros al Final " + " ");
        System.out.println("Distancia recorrida en total: " + DF + " " + "Metros");
        System.out.println();
        KF= (float) (DF/K);
        System.out.printf("Distancia recorrida en Kilometros: ");
        System.out.printf("%.3f", KF);
        System.out.println("_______________________________________________________");
        MF= (float)(DF/M);
        System.out.printf("Distancia recorrida en Millas: ");
        System.out.printf("%.3f", MF);
	}

}
