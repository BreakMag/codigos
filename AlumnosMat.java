import java.util.Scanner;
	import java.io.*;
	import java.io.IOException;
	
	public class AlumnosMat{
	
	public void mates(){
		Scanner src=new Scanner(System.in);
		int regist=0, registro=1;
		String nom="";
		System.out.println("Universidad Charles Xavier para ninos especiales \n --------------------");
	 System.out.println("---Menú control de cantidad de alumnos por materia-- \n");
	   do {
	 try{
		    BufferedReader bf = new BufferedReader(new FileReader("AB78C.txt"));
			BufferedReader ba = new BufferedReader(new FileReader("AD45T.txt"));
			BufferedReader bc = new BufferedReader(new FileReader("FA6HG.txt"));
			BufferedReader be = new BufferedReader(new FileReader("FW45G.txt"));
			BufferedReader bq = new BufferedReader(new FileReader("RJ45YH.txt"));
			BufferedReader bg = new BufferedReader(new FileReader("YU12G.txt"));
		   
		   	  String sCadena;
			  System.out.println();
			  System.out.println("Ingresa con MAYUSCULAS los datos del mutante: Nombre | Nivel | Grupo");
			   System.out.print("Nombre del Alumno: ");
			   nom=src.nextLine();
			while ((sCadena = bf.readLine())!=null) {
				   if(sCadena.equals(nom)){
				System.out.println("Materias en la que se encuentra inscrito \n");	   
			     System.out.println("|Clave  |         Materia                  |");
				 System.out.println("|_______|_________________________________ |");
				 System.out.println("|AB78C  | Control de la Meteria.           |");
				   }
			}
			while ((sCadena = ba.readLine())!=null) {
				   if(sCadena.equals(nom)){
				 System.out.println("____________________________________________");	   
				 System.out.println("|AD45T  | Clase de Ninja avanzada.         |");
				   }
			}
			while ((sCadena = bc.readLine())!=null) {
				   if(sCadena.equals(nom)){
				 System.out.println("____________________________________________");	   
				 System.out.println("|FA6HG  | Caculo super ultra avanzado.     |");
				   }
            }
            while ((sCadena = be.readLine())!=null) {
				   if(sCadena.equals(nom)){
				 System.out.println("____________________________________________");	   
				 System.out.println("|FW45G  | Matematicas complicadas.         |");
				   }
			}
            while ((sCadena = bq.readLine())!=null) {
				   if(sCadena.equals(nom)){
				 System.out.println("___________________________________________");	   
				 System.out.println("|RJ45YH | Diseño de trajes de licra.      |");
				   }
            }
            while ((sCadena = bg.readLine())!=null) {
				   if(sCadena.equals(nom)){
				 System.out.println("____________________________________________");	   
				 System.out.println("|YU12G  | Introducciona al deseño de" +
				                               "frases para final izar malvados  |");
				   }		  
	}
		}catch(IOException io){
			 System.out.println(io.getMessage());
	  }
	  System.out.println("Seguir ingresa 1------ parar para ingresa 0");  while(regist!=0);
      regist=src.nextInt();
	  if(regist == 0)
			   break;
	    }while(registro==1);
	}
	}