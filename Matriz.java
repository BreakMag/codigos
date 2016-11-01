package Parcial_1;
import java.util.*;

public class Matriz {
    public static void main(String[] args){
        int[][] matriz= new int[4][3];
        Random x = new Random(1000000000);
        int i,j,suma=0,sumac=0, contador=0;
        
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                matriz[i][j]=(int)(x.nextDouble()*10+1);
                System.out.print(matriz[i][j]+ " ");
                suma+=matriz[i][j];

            }
            System.out.print(": "+suma);
            System.out.println();
            suma=0;
        }
        System.out.println("-----------------------------------");
      
            for(j=0;j<3;j++){
                 for(i=0;i<4;i++){
//                    matriz[i][j]=(int)(x.nextDouble()*10+1);
               // System.out.print(matriz[l][contador]+ " ");
             //  if(contador==3)
                  // break;
                sumac+=matriz[i][j];
             }
            //contador+=1;
            System.out.print(sumac+" ");
            sumac=0;
            //System.out.println();
        }
    }  
            
//            System.out.println("La suma de las filas es: "+sumaf);
//            System.out.println("La suma de las columnas es. "+sumaC);
    }


