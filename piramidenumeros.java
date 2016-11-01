			import java.util.*;
			public class piramidenumeros{
				  
					 public static void main(String[] args){
						  int n,a,b;
						  Scanner cal=new Scanner(System.in);
						  System.out.println("Ingrese un numero");
						  n=cal.nextInt();
							int num = 0;
						   for(a=0; a<=n; a++){
							   
							   for(b=0; b<=a; b++){
								   if(num==n){
									   break;
								   }
								   num++;
								   System.out.print(num+" ");
							   }
							   System.out.println(" ");
							}
			}
			}