import java.util.Scanner;
	import java.io.*;
	import java.io.IOException;
	
	public class ReporteXmen{
	
	   public void Reportes(){
	Scanner src=new Scanner(System.in);
	String sCadena;
	 System.out.println("Universidad Charles Xavier para ninos especiales \n --------------------");
	 System.out.println("---Reporte Genral de la Materias, Maestros y Alumnos- \n");
	 
		   try{
		    BufferedReader bf = new BufferedReader(new FileReader("AB78C.txt"));
			BufferedReader ba = new BufferedReader(new FileReader("AD45T.txt"));
			BufferedReader bc = new BufferedReader(new FileReader("FA6HG.txt"));
			BufferedReader be = new BufferedReader(new FileReader("FW45G.txt"));
			BufferedReader bq = new BufferedReader(new FileReader("RJ45YH.txt"));
			BufferedReader bg = new BufferedReader(new FileReader("YU12G.txt"));
		         
				 System.out.print("     Profesores                     ");    System.out.println("Materias disponibles");	 
				 System.out.print("xxxxxxxxxxxxxxxx       ");                                   System.out.println("|Clave  |         Materia                  |");
		         System.out.print("-------------------    ");                                  System.out.println("|_______|_________________________________ |");
				 System.out.print("      EL DON VERGAS    ");                                  System.out.println("|AB78C  | Control de la Meteria.           |");
                 System.out.print("-------------------    ");                                  System.out.println("____________________________________________");	   
				 System.out.print("      EL NAPA          ");                                  System.out.println("|AD45T  | Clase de Ninja avanzada.         |");
                 System.out.print(" ------------------    ");                                  System.out.println("____________________________________________");	   
				 System.out.print("      LA SENORA        ");                                  System.out.println("|FA6HG  | Caculo super ultra avanzado.     |");
				 System.out.print("-------------------    ");                                  System.out.println("____________________________________________");	   
				 System.out.print("      EL BRAYAN        ");                                   System.out.println("|FW45G  | Matematicas complicadas.         |");
				 System.out.print("-------------------    ");                                  System.out.println("___________________________________________");	   
				 System.out.print("      EL KEVIN         ");                                  System.out.println("|RJ45YH | Diseño de trajes de licra.      |");
				 System.out.print("-------------------    ");                                  System.out.println("____________________________________________");	   
				 System.out.print("      DR. GOKU         ");                                  System.out.println("|YU12G  | Introducciona al deseño de      |");
				 System.out.print("                       ");                                  System.out.println("          frases para final izar malvados  |");
  
				 System.out.println("--------------------------------------------------------------------------------------------------\n                                              Alumnos de la Universidad  ");
                 System.out.println("   NOMBRE  |  NIVEL  |  GRUPO  ");
				 System.out.println("------------------------------------------------------------------------------------------------------");
                    while ((sCadena = bf.readLine())!=null) {
				   sCadena.split(" ");
                   System.out.print(sCadena.toUpperCase() + "\n");
				   System.out.println("---------------------------");
				   }
				   while ((sCadena = ba.readLine())!=null) {
					   sCadena.split(" ");
                   System.out.println(sCadena.toUpperCase());
				   System.out.println("---------------------------");
				   } 
				   while ((sCadena = bc.readLine())!=null) {
					   sCadena.split(" ");
                   System.out.println(sCadena.toUpperCase());
				   System.out.println("---------------------------");
				   } 
				   while ((sCadena = be.readLine())!=null) {
					   sCadena.split(" ");
                   System.out.println(sCadena.toUpperCase());
				   System.out.println("---------------------------");
				   }
				   while ((sCadena = bq.readLine())!=null) {
					   sCadena.split(" ");
                   System.out.println(sCadena.toUpperCase());
				   System.out.println("---------------------------");
				   } 
				   while ((sCadena = bg.readLine())!=null) {
					   sCadena.split(" ");
                   System.out.println(sCadena.toUpperCase());
				   System.out.println("---------------------------");
				   } 
				   
				   }catch(IOException io){
			 System.out.println(io.getMessage());
	  }
				   }		  
	}