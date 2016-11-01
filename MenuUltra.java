  import java.util.Scanner;
	import java.io.*;
	import java.io.IOException;
	
	public class MenuUltra{
	
	 public static void main(String[]args){
	
	
		RegistroX registrox = new RegistroX();
		InicioXmen eto = new InicioXmen();
		AlumnosMat alumnosMate = new AlumnosMat();
		ReporteXmen reportess=new ReporteXmen();
		
	    Scanner src=new Scanner(System.in);
	  
	  int A, regist=0;
	  do{
	    System.out.println("---Universidad Charles Xavier para ninos especiales---");
		System.out.println("---Menu central de mutantes--- \n -------------------------");
		System.out.println("1.- Ingreso de mutantes a materias. \n 2.- Reporte con los alumnos por materia. \n 3.- Materias por alumno. \n 4.- Reporte general con maestros, materias y alumnos.");
		System.out.println("Según el menu, eligue la opción deseada:");
		A=src.nextInt();
	  switch(A){
		  case 1:
	      registrox.registro();
		  break;
		  case 2:
		  eto.Xmen();
		  break;
		  case 3:
		  alumnosMate.mates();
		  break;
		  case 4:
		  reportess.Reportes();
		  break;
	  } 
	  System.out.println(" --------------------------------\n \n Continuar presiona 1----- No seguir presionar 0");
	  regist=src.nextInt();
	 }while(regist!=0);
	}
}


