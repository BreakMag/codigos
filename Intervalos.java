import java.util.*;
public class Intervalos {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int c,m,n,v=0,o;
        
        System.out.print("Ingresa la suma de los intervalos: ");
        c = leer.nextInt();
        System.out.print("Intervalo de inicio: ");
        m = leer.nextInt();
        System.out.print("Intervalo de fin: ");
        n = leer.nextInt();
        
        if (m>n){
            o=m;
            m=n;
            n=o;
        }
        System.out.println("Convinaciones: ");
        for(int i=m;i<=n;i++){
            for(int j=n;j>=m;j--){
                if((j+i)==c){
                    System.out.println(i+" + "+j+" = "+c);
                    v+=1;
                }
            }
        }
        if(v==0)
            System.out.println("No tiene convinaciones");
        
    }
    
}