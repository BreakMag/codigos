package Parcial_1;
import java.util.*;

public class dinero_Dinero {	
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Double C,P,D,E,Y,L,R,DC;
        int O;
        
        System.out.println("1.Pesos \n2.Dolar(EUA) \n3.Euro \n4.Yen \n5.Lempira \n6.Real \n7.Dolar(Can)");
        System.out.print("Ingresa el numero de la opcion que deseas convertir: ");
        O = leer.nextInt();
        System.out.print("Ingresa la cantidad a convertir: ");
        C = leer.nextDouble();
        
        switch(O){
            case 1: 
                D=C*0.0510196; 
                System.out.println("Dolar(EUA): "+D);
                E=C*0.0455486;
                System.out.println("Euro: "+E);
                Y=C*5.17232 ;
                System.out.println("Yen: "+Y);
                L=C*1.16755;
                System.out.println("Lempira: "+L);
                R=C*0.166400;
                System.out.println("Real: "+R);
                DC=C*0.0669339 ;
                System.out.println("Dolar(Can): "+DC); 
            break;
            case 2: 
                P=C*19.6528;
                System.out.println("Pesos: "+P);
                E=C*0.894673;
                System.out.println("Euro: "+E);
                Y=C*101.698;
                System.out.println("Yen: "+Y);
                L=C*22.7022;
                System.out.println("Lempira: "+L);
                R=C*3.25965 ;
                System.out.println("Real: "+R);
                DC=C*1.31637;
                System.out.println("Dolar(Can): "+DC);
            break;
            case 3: 
                P=C*21.8533;
                System.out.println("Pesos: "+P);
                D=C*1.11773;
                System.out.println("Dolar(EUA): "+D);
                Y=C*113.651;
                System.out.println("Yen: "+Y);
                L=C*25.3210;
                System.out.println("Lempira: "+L);
                R=C*3.64000;
                System.out.println("Real: "+R);
                DC=C*1.47121;
                System.out.println("Dolar(Can): "+DC);
            break;
            case 4: 
                P=C*0.192966;
                System.out.println("Pesos: "+P);
                D=C*0.00983303;
                System.out.println("Dolar(EUA): "+D);
                E=C*0.00879885;
                System.out.println("Euro: "+E);
                L=C*0.222754;
                System.out.println("Lempira: "+L);
                R=C*0.0319967;
                System.out.println("Real: "+R);
                DC=C* 0.0129408;
                System.out.println("Dolar(Can): "+DC);
            break;
            case 5: 
                P=C*0.865336;
                System.out.println("Pesos: "+P);
                D=C*0.0440486;
                System.out.println("Dolar(EUA): "+D);
                E=C*0.0394929;
                System.out.println("Euro: "+E);
                Y=C*4.48925;
                System.out.println("Yen: "+Y);
                R=C*0.143606;
                System.out.println("Real: "+R);
                DC=C*0.0580922;
                System.out.println("Dolar(Can): "+DC);
            break;
            case 6: 
                P=C*6.02024;
                System.out.println("Pesos: "+P);
                D=C*0.306782 ;
                System.out.println("Dolar(EUA): "+D);
                E=C*0.274725;
                System.out.println("Euro: "+E);
                Y=C*31.2532;
                System.out.println("Yen: "+Y);
                L=C* 6.96351;
                System.out.println("Lempira: "+L);
                DC=C*0.404420;
                System.out.println("Dolar(Can): "+DC);
            break;
            case 7: 
                P=C*14.9003;
                System.out.println("Pesos: "+P);
                D=C*0.759663;
                System.out.println("Dolar(EUA): "+D);
                E=C*0.679712;
                System.out.println("Euro: "+E);
                Y=C*77.2749;
                System.out.println("Yen: "+Y);
                L=C*17.2140;
                System.out.println("Lempira: "+L);
                R=C*2.47268;
                System.out.println("Real: "+R);
            break;
            
        }
 
    }
 }