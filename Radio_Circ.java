package parcia_1;
import java.util.Scanner;
public class Radio_Circ {
	public static void main(String[] args) {
		float area, diametro, diametroF;
		int radio;
		System.out.println("Ingresa el Radio: ");
		Scanner sc = new Scanner(System.in);
        radio= sc.nextInt();
        
        area = (float) (Math.PI*radio*radio);
        System.out.print("El radio es de: " + radio + " \n " +"Y el Area del circulo es: ");
        System.out.printf("%.2f", area);
        System.out.println("\n___________________________________________________________________________");
        diametro=2*radio;
        diametroF= (float) (Math.PI*diametro);
        System.out.printf("El radio es de: " + diametro + " \n " +"Y el Diametro del circulo es :");
        System.out.printf("%.2f", diametroF);
	}

}
