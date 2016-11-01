import java.util.Scanner;
public class Arreglos {
	public static String[] meh = new String[20];
	public static int cont = 0;
	public static Scanner sc = new Scanner(System.in);
	public static void agregar(){
		if(cont > 19){
			System.out.println("Ya no se pueden agregar mas palabras");
		} else{ 
			meh[cont] = sc.next();
			cont++;
		}
	}
	public static void modificar(byte position, String toAdd){
		meh[position] = toAdd;
	}
	public static void mostrar(){
		for (int i = 0; i < meh.length; i++) {
			System.out.println(meh[i]);
		}
	}
	public static void main(String[] args) {
		boolean running = true;
		while(running){
			System.out.println("Que desea hacer:\nAgregar una palabra en el arreglo: 1\nMostrar el arreglo: 2\nModificar el arreglo: 3\nCerrar el programa: 4");
			byte sel = sc.nextByte();
			switch(sel){
			case 1: System.out.println("Introduce la palabra:");
			agregar();
			break;
			case 2: mostrar();
			break;
			case 3: System.out.print("Dame el lugar del arreglo donde desea trabajar: ");
			byte nom = sc.nextByte();
			System.out.print("Que palabra desea agregar en esa posicion: ");
			String palabra = sc.next();
			modificar(nom,palabra);
			break;
			case 4: running = false;
			break;
			}
		}
		sc.close();
	}
}
