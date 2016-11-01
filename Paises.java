w    package pais.Paises; 
    import java.util.*;
    public class Paises { /*Usamos dos clases para seperar el codigo y mandar llamar el solicitado
        y hacerlos con valores staticos*/
              static Scanner buscador=new Scanner(System.in);
              static String nombre; /*El static sirve para indiciar que el String y Scanner 
              siempre tendrá ese valor y jamas va a cambiar*/
              static String nombreM;

        public static void main(String args[]){ /*Ponemos los valortes de cada campo del arreglo
            según el orde que les asginamos con los this en DatoPa                       is.java*/
              DatoPais argentina = new DatoPais("Argentina","Buenos Aires",41.45,60.99,"Peso Argentino",2.78);
              DatoPais bolivia = new DatoPais("Bolivia","Sucre",10.67,30.6,"Boliviano",1.099 );
              DatoPais mexico = new DatoPais("Mexico","Ciudad de México",122.3,1.261,"Peso Mexicano",1.973);
              DatoPais chile = new DatoPais("Chile","Chile",17.62,277.2,"Peso",756.096);
              DatoPais espana = new DatoPais("Espana","Madrid",46.77,1.393,"Euro",505.990);
              DatoPais brasil = new DatoPais("Brasil","Brasilia",200.4 ,2.246,"Real de Brazil",8.516);
              DatoPais honduras = new DatoPais("Honduras","Distrito Central",8.098,18.55,"Lempira",112.492);
              DatoPais francia = new DatoPais("Francia","Paris",66.03,2.806,"Euro",643.801);
              DatoPais italia = new DatoPais("Italia","Roma",59.83,2.149 ,"Euro",301.338);
              DatoPais portugal = new DatoPais("Portugal","Lisboa",10.46,227.3,"Euro",92.212);
              DatoPais bahamas= new DatoPais("Bahamas","Mancomunidad de las Bahamas",10.46,227.3,"Euro",92.212);
              DatoPais barbados= new DatoPais("Barbados","Barbados",10.46,227.3,"Euro",92.212);
              DatoPais canada= new DatoPais("Canada","Canadá",35.16,1.827,"Dólar canadiense",9.985);
              DatoPais colombia= new DatoPais("Colombia","República de Colombia",47.12,378.4,"Peso",1.142);
              DatoPais cuba = new DatoPais("Cuba ","República de Cuba",11.27,68.23,"Peso cubano",109.884);
              DatoPais ecuador = new DatoPais("Ecuador ","República del Ecuador",15.74,94.47,"Dólar estadounidense",283.56);
              DatoPais eua = new DatoPais("EUA ","Estados Unidos de América",318.9,16.77,"Dólar estadounidense",9.857);
              DatoPais jamaica = new DatoPais("Jamaica ","Jamaica",2.715,14.36,"Dólar jamaiquino",10.991);
              DatoPais panama = new DatoPais("Panamá ","República de Panamá",3.864,42.65,"Balboa",74.177);
              DatoPais perú = new DatoPais("Perú ","República del Perú",30.38,202.3,"Sol",1.285);
              DatoPais uruguay = new DatoPais("Uruguay ","República Oriental del Uruguay",3.407,55.71,"Peso uruguayo",176.215);
              DatoPais venezuela = new DatoPais("Venezuela ","República Bolivariana de Venezuela",30.41,438.3,"Bolívar",916.445);
              DatoPais alemania = new DatoPais("Alemania ","República Federal de Alemania",80.62,3.73,"Euro",357.168);
              DatoPais austria = new DatoPais("Austria ","República de Austria",8.474,428.3,"Euro",83.879);
              DatoPais bélgica = new DatoPais("Bélgica ","Reino de Bélgica",11.2,524.8,"Euro",30.528);
              DatoPais croacia = new DatoPais("Croacia ","República de Croacia",4.253,57.87,"Kuna croata",56.594);
              DatoPais dinamarca = new DatoPais("Dinamarca ","Reino de Dinamarca",5.614,335.9,"Corona danesa",42.925);
              DatoPais grecia = new DatoPais("Grecia ","República Helénica",11.03,242.2,"Euro",131.957);
              DatoPais hungría = new DatoPais("Hungría ","Hungría",9.897,133.4,"Forinto húngaro",93.03);
              DatoPais irlanda = new DatoPais("Irlanda ","República de Irlanda",4.595,232.1,"Euro",70.273);
              DatoPais noruega = new DatoPais("Noruega ","Reino de Noruega",5.084,512.6,"Corona noruega",385.178);
              DatoPais rusia = new DatoPais("Rusia ","Federación de Rusia",143.5,2.097,"Rublo ruso",17.100);
              DatoPais suecia = new DatoPais("Suecia ","Reino de Suecia",9.593,579.7,"Corona sueca",450.295);
              DatoPais suiza = new DatoPais("Suiza ","Confederación Suiza",8.081,685.4,"Franco suizo",41.285);
  
              DatoPais p[] = new DatoPais[45];/* Le damos valores los arreglos con los 
              nombres de los paises para encontralos más fácil*/
              p[0]= argentina;
              p[1]= bolivia;
              p[2]= mexico;
              p[3]= chile;
              p[4]= espana;
              p[5]= brasil;
              p[6]= honduras;
              p[7]= francia;
              p[8]= italia;
              p[9]= portugal;
              p[10]= bahamas;
              p[12]= barbados;
              p[13]= bolivia;
              p[14]= chile;
              p[15]= espana;
              p[16]= brasil;
              p[17]= honduras;
              p[18]= francia;
              p[19]= italia;
              p[20]= portugal;
              p[21]= bahamas;
              p[22]= barbados;
              p[23]= canada;
              p[24]= colombia;
              p[25]= cuba;
              p[26]= ecuador;
              p[27]= eua;
              p[28]= jamaica;
              p[29]= panama;
              p[30]= perú;
              p[31]=  uruguay;
              p[32]=  venezuela;
              p[33]=  alemania;
              p[34]=  austria;
              p[35]=  bélgica;
              p[36]=  croacia;
              p[37]=  dinamarca;
              p[38]=  grecia;
              p[39]=  hungría;
              p[40]=  irlanda;
              p[41]=  noruega;
              p[42]=  rusia;
              p[43]=  suecia;
              p[44]=  suiza;

            for(int i=0; p.length>=i; i++){ /*Recorremos cada campo del Arreglo para que los encuentre 
                las filas*/
            }
                  String conter=""; //El conter se usará para que el usuario repite la accón mediante Do While
            do{

            System.out.println("----- Países de America y Europa------");
            System.out.println("¿Qué país quieres saber su información?");
           nombre = buscador.nextLine(); //Pedimos al usuraio que ingrese el país
           nombreM = nombre.toLowerCase(); //Convertimos a mayusculas a minisculas

            for(int h=0; h<=p.length; h++){ /*Recorremos cada campo del Arreglo para que los encuentre 
                las filas*/
              if(h==p.length){ /* Si h es igual p.length imprima el Pais no se encuentra por que 
                  indicamos que h es menos igual que p.lenght*/
                     System.out.println("El Pais no se encuentra");
                     break;//Se usa el break para romper la acción
                 }
                if (nombre.equalsIgnoreCase(p[h].nombrePais)){ /* Usamos equelsIngnoreCase para indicar que si 
                    la palabra escrita por el usario se encuentra lo imprima a aparte que ignore las Mayusculas*/
                    System.out.println("Los datos del pais son: ");
                    System.out.println("--------------------------------------------");
                    System.out.println(p[h]); //Imprimos el país solicitado
                   break;//Rompres la acción y solo imprima el valor solicitado
                }

            }
            System.out.println();
            System.out.println("Si quieres continuar presiona ENTER 2 veces");
            System.out.println("------------------------------------------------------------------------");
                System.out.println("Si quieres salir ingresa FIN y ENTER ");
                conter=buscador.nextLine(); //Les damos opciones al usario de Continuar o Parar con Do-While
                buscador.nextLine();
            }while("".equals(conter));/*Usamos un equals para indicar que la opcion se realizará si la palabra
            introducida por el usuario es igual a las ""*/
    }	
            }
//Rodolfo Magallanes and Toño Durán