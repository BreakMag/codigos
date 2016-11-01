package Parcial_1;
public class MYM {
    public static void main(String[] args){
		int a=18,b=3,c=7, ax;
		
		if(a>b){
			ax=b;
			b=a;
			a=ax;		
		if(a>c){
			ax=c;
			a=c;
			c=ax;
		}if(c<b){
			ax=b;
			b=c;
			c=ax;
		}
		System.out.println(a+","+b+","+c);
		
		if(a<b){
			ax=a;
			a=b;
			b=ax;		
		}if(a<c){
			ax=c;
			c=a;
			a=ax;
		}if(c>b){
			ax=c;
			c=b;
			b=ax;
		}
		System.out.println(a+","+b+","+c);
	}
    }
}
