package Parcial_1;

import java.util.*;
public class Fechas {

    private static int par=0;
        @SuppressWarnings("empty-statement")
	public static void main(String[]args){
		Scanner calen=new Scanner(System.in);
		
	int f=30, f2=31, f3=28, f4=29, año = 0;
        int O;
     
		System.out.println("1.- Enero \n 2.- Febrero \n 3.- Marzo \n 4.- Abril \n 5.- Mayo \n 6.- Junio \n 7.- Julio \n 8.- Agosto" +
		 "\n 9.- Septiembre \n 10.- Octubre \n 11.- Noviembre \n 12.- Diciembre");
                 do{
                System.out.println("--------------------------------- \n Ingresa el Mes: ");
		 O = calen.nextInt();
		 System.out.println("--------------------------------- \n Ingresa el año: ");
		 año=calen.nextInt();
                 System.out.println("--------------------------------- ");
                 
	       
		switch(O){
			case 1:
		if(((año%100==0)&&(año%4==0))||(año%400==0)){
                    System.out.println("Mes: Enero");
                    System.out.println("Los dias del mes son: " + f2);
                    System.out.println("Año : " + año);
                    System.out.println("¡El Año es Bisiesto!");
                }else{
                    System.out.println("Mes: Enero");
                    System.out.println("Los dias del mes son: "+ f2);
                    System.out.println("Año : " + año);
                    System.out.println("El año no es bisiesto");
                }
			break;
			
			case 2:
			if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Febrero");
		System.out.println("Los dias del mes son: "+ f4);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Febrero");
		System.out.println("Los dias del mes son: "+ f3);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
		}
			break;
			
			
			case 3:
	       if(((año%100==0)&&(año%4==0))||(año%400==0)){
	        System.out.println("Mes: Marzo");
		System.out.println("Los dias del mes son: " +f2);
		System.out.println("Año: " + año);
                System.out.println("¡El Ano es Bisiesto!");
		}else{
			System.out.println("Mes: Marzo");
		System.out.println("Los dias del mes son: " +f2);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			}
			break;
			
			case 4:
			if(((año%100==0)&&(año%4==0))||(año%400==0)){
                System.out.println("Mes: Abril");
		System.out.println("Los días del mes son: " +f);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Mes: Abril");
		System.out.println("Los días del mes son: "+ f);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			break;
                                }
			case 5:
		if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Mayo");
		System.out.println("Los días del mes son: " +f2);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
		}else{
		System.out.println("Mes: Mayo");
		System.out.println("Los días del mes son: " +f2);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			break;
                                }
			case 6:
				if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Junio");
		System.out.println("Los días del mes son: " +f);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Mes: Junio");
		System.out.println("Los días del mes son: " +f);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			break;
                                }
			case 7:
				if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Julio");
		System.out.println("Los días del mes son: "+ f2);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Mes: Julio");
		System.out.println("Los días del mes son: " + f2);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			break;
                                }
			case 8:
				if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Agosto");
		System.out.println("Los días del mes son: " + f2);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Mes: Agosto");
		System.out.println("Los días del mes son: " + f2);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
                                }
			break;
                                
			case 9:
				if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Septiembre");
		System.out.println("Los días del mes son: " + f);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Mes: Septiembre");
		System.out.println("Los días del mes son: " + f);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			break;
                                }
			case 10:
				if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Octubre");
		System.out.println("Los días del mes son: " + f2);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Mes: Octubre");
		System.out.println("Los días del mes son: " + f2);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			break;
                                }
			case 11:
				if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Noviembre");
		System.out.println("Los días del mes son: " +f);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Mes: Noviembre");
		System.out.println("Los días del mes son: " +f);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			break;
                                }
			case 12:
				if(((año%100==0)&&(año%4==0))||(año%400==0)){
		System.out.println("Mes: Diciembre");
		System.out.println("Los días del mes son: " +f2);
		System.out.println("Año: " + año);
                System.out.println("¡El Año es Bisiesto!");
			}else{
			System.out.println("Mes: Diciembre");
		System.out.println("Los días del mes son: " +f2);
		System.out.println("Año: " + año);
                System.out.println("El año no es bisiesto");
			break;
			}
                    } 
                     System.out.println("Si no quieres continuar presiona 999");
                       System.out.println("Si quieres continuar presiona 0");
                    par = calen.nextInt();
                       }    while(par==0);         
        }
}