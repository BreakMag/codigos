import java.util.Scanner;
public class Trump {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int e,c1=0,c2=0,c3=0;
        
        System.out.println("Ingresa el numero del presidente que va a robarnos");
        System.out.println("1.-La senorona");
        System.out.println("2.-Napa");
        System.out.println("3.-Senorita");
        
        for(int i=0;i<5;i++){
            System.out.print("Elector #"+(i+1)+": ");
            e=leer.nextInt();
            if(e==1)
             c1++;
            if(e==2)
            c2++;
            if(e==3)
             c3++;	
        }
        if(c1>=c2 && c1>=c3)
            System.out.println("El ganador es La senorona");
        if(c2>=c1 && c2>=c3)
            System.out.println("El ganador es Napa");
        if(c3>=c1 && c3>=c2)
            System.out.println("El ganador es Senorita");
    }
    
}