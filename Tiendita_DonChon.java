package Parcial_1;
import java.util.*;

public class Tiendita_DonChon {
    
    public static void main(String[] args){
        Scanner tienda=new Scanner(System.in);
        
        String producto;
        int[] productos=new int[100];
        int i=0;
        int precio=0, x = 0;
        productos[i]=precio;
        int total=0;
        
        do{
            if(precio==-1){
                break;
            }
            productos[i]=precio;
            
        System.out.println("Ingresa el precio del producto");
        precio= tienda.nextInt();
        if(precio!=-1)
        total+=precio;
           
      }while(precio!=-1);
        for(int j=0; j<productos.length; j++){
            if(productos[i]==0){
                break;
            
            System.out.println(productos[i]);
            }
        }
        System.out.println("La cantidad a pagar es" + " " + "$" + total);
        System.out.print("Cantidad recibida: " + "$");
        int pago = tienda.nextInt();
        int cambio = pago-total;
        System.out.println("El cambio es: "+ "$" + cambio);
    }
}
