package Proyacto_1;
import java.util.*;

public class Diccionario {
    public static void main(String[]args){
        Scanner tradu=new Scanner(System.in);
        String frase = null, frase2, fraseh;
        int klm;
      Map<String, String> treeMap = new TreeMap<>();
treeMap.put("there is","hay");	                treeMap.put("grow","crecer");
treeMap.put("whant","querer");	                treeMap.put("die","morir");
treeMap.put("whis","desear");	                treeMap.put("feel","sentir");
treeMap.put("love","amor");	                treeMap.put("hurt","doler");
treeMap.put("help","ayuda");	                treeMap.put("cure","curar");
treeMap.put("try","intentar");                  treeMap.put("see","ver");
treeMap.put("get","consguir");	                treeMap.put("hear","oír");
treeMap.put("ask for","pedir");                 treeMap.put("listen","escuchar");
treeMap.put("sing","canción");	                treeMap.put("like","gustar");
treeMap.put("need","necesitar");	        treeMap.put("touch","tocar");
treeMap.put("live","vivir");	                treeMap.put("smell","oler");
treeMap.put("be born","nacer");                 treeMap.put("speak","hablar");
treeMap.put("say","decir");	                treeMap.put("eliminate","eliminar");
treeMap.put("read","leer");	                treeMap.put("fill","llenar");
treeMap.put("write","escribir");	        treeMap.put("empity","vaciar");
treeMap.put("erase","borrar");	                treeMap.put("think","pensar");
treeMap.put("sign","canción");	                treeMap.put("imagine","imaginar");
treeMap.put("can","puedo");                     treeMap.put("believe","creer");
treeMap.put("do","hacer");	                treeMap.put("know","saber");
treeMap.put("ask for","pedir");                 treeMap.put("remember","recordar");
treeMap.put("work","trabajar");	                treeMap.put("forget","olvidar");
treeMap.put("make","hacer");	                treeMap.put("study","estudiar");
treeMap.put("build","construir");	        treeMap.put("pay attention","atender");
treeMap.put("demolish","derribar");             treeMap.put("understand","comprender");
treeMap.put("learn","leer");	                treeMap.put("drive","conducir");
treeMap.put("momorize","memorizar");	        treeMap.put("rest","descansar");
treeMap.put("teach","enseñar");	                treeMap.put("go to bed","acostar");
treeMap.put("explain","explicar");	        treeMap.put("dress","vestir");
treeMap.put("be wrong","equivocar");	        treeMap.put("last","durar");
treeMap.put("go","ir");                         treeMap.put("clean","limpiar");
treeMap.put("arrive", "llegar");	        treeMap.put("eat", "comer");
treeMap.put("return","volver");                 treeMap.put("have","tomar");
treeMap.put("come","venir");	                treeMap.put("have breakfast","desayunar");
treeMap.put("go in","entrar");	                treeMap.put("have lunch","almorzar");
treeMap.put("go out","salir");	                treeMap.put("have dinner","cenar");
treeMap.put("take out","sacar");                treeMap.put("drink","beber");
treeMap.put("walk","caminar");	                treeMap.put("buy","comprar");
treeMap.put("read","leer");	                treeMap.put("rent","rentar");
treeMap.put("run","correr");	                treeMap.put( "serve for","servir");
treeMap.put("park","parque");	                treeMap.put("pay","pagar");
treeMap.put("jump","saltar");	                treeMap.put("owe","deber");
treeMap.put("dance","bailar");                  treeMap.put("get paid","cobrar");
treeMap.put("stop","parar");	                treeMap.put("spend","gastar");
treeMap.put("cross","cruzar");                  treeMap.put("give","dar");
treeMap.put("continue","continuar");	        treeMap.put("take away","dar");
treeMap.put("travel","viajar");	                treeMap.put("receive","recibir");
treeMap.put("go up","subir");	                treeMap.put("lose","perder");
treeMap.put("go down","bajar");                 treeMap.put("look for","buscar");
treeMap.put("I am","yo");	                treeMap.put("we","nosotros");
treeMap.put("she","ella");	                treeMap.put("you","ustedes");
treeMap.put("he","el");	                        treeMap.put("they","ellos");
treeMap.put("you","tu");                        treeMap.put("in","en");
treeMap.put("it","eso");                        treeMap.put("chair","silla");
treeMap.put("yes","si");	                treeMap.put("desk","escritorio");
treeMap.put("not","no");	                treeMap.put("teacher","maestro");
treeMap.put("book","libro");	                treeMap.put("teacher","maestra");
treeMap.put("pencil","lápiz");                  treeMap.put("men","hombre"); 
treeMap.put("girl","mujer");                    treeMap.put("computer","computadora");
treeMap.put("dad","papá");	                treeMap.put("schoolbag","mochila");
treeMap.put("mom","mamá");	                treeMap.put("student","estudiante");
treeMap.put("boy","niño");	                treeMap.put("high","alto");
treeMap.put("school","escuela");                treeMap.put("wide","ancho");
treeMap.put("ok","esta bien");                  treeMap.put("old","viejo");
treeMap.put("hard","duro");	                treeMap.put("years old","años");
treeMap.put("ugly","feo");	                treeMap.put("young","joven");
treeMap.put("cute","lindo");	                treeMap.put("black","negro");
treeMap.put("pencil","lápiz");                  treeMap.put("white","blanco");
treeMap.put("purple","morado");                 treeMap.put("gray","gris");
treeMap.put("yellow","amarillo");	        treeMap.put("coffe","café");
treeMap.put("green","verde");	                treeMap.put("new","nuevo");
treeMap.put("red","rojo");	                treeMap.put("thing","cosa");
treeMap.put("blue","azúl");                     treeMap.put("beautiful","bonito"); 
treeMap.put("I_want","quiero");                 treeMap.put("burritos", "burritos");
treeMap.put("tinder","yesca");                  treeMap.put("I_have", "tengo");
treeMap.put("hunger","hambre");                 treeMap.put("dream", "sueño");
treeMap.put("of","de");                         treeMap.put("the", "la");
 

     
      
      int conti = 3;
    do{
        System.out.print("          ¡TRADUCTOR!" + "\n" + "Presiona 1 si quieres ESPAÑOL-INGLES " );
        System.out.println();
     System.out.println("-----------------------------------------------------");
      System.out.println("Presiona 2 si quieres INGLES-ESPAÑOL");
       klm= tradu.nextInt();
       tradu.nextLine();
    if (klm==2){
        System.out.println("Introduce tu frase a traducir: "+ "\n");
    frase= tradu.nextLine();
    frase = frase.toLowerCase();
    System.out.print("----------------------------------------------------");
     System.out.println();
    String[] cadenas = frase.split(" ");
            for (String cadena : cadenas) {
                if (treeMap.containsKey(cadena)) {
                    System.out.print(treeMap.get(cadena) + " ");
                }
                System.out.println(cadena.toLowerCase());
                }
    }else if(klm==1){
    Map<String, String> treeMap2 = new TreeMap<>();
treeMap2.put("hay", "there is");	        treeMap2.put("crecer", "grow");
treeMap2.put("querer", "whant");	        treeMap2.put("morir", "die");
treeMap2.put("desear", "whis");	                treeMap2.put("sentir", "feel");
treeMap2.put("amor", "love");	                treeMap2.put("doler", "hurt");
treeMap2.put("ayuda", "help");	                treeMap2.put("curar", "cure");
treeMap2.put("intentar", "try");                treeMap2.put("ver", "see");
treeMap2.put("conseguir","get");	        treeMap2.put("oír", "hear");
treeMap2.put("pedir", "ask for");               treeMap2.put("escuchar", "listen");
treeMap2.put("canción", "sing");	        treeMap2.put("gustar", "like");
treeMap2.put("necesitar", "need");	        treeMap2.put("tocar", "touch");
treeMap2.put("vivir", "live");	                treeMap2.put("oler", "smell");
treeMap2.put("nacer", "be born");               treeMap2.put("hablar", "speak");
treeMap2.put("decir", "say");	                treeMap2.put("eliminar", "eliminate");
treeMap2.put("leer", "read");	                treeMap2.put("llenar", "fill");
treeMap2.put("escribir", "write");	        treeMap2.put("vaciar", "empity");
treeMap2.put("borrar", "erase");	        treeMap2.put("pensar", "think");
treeMap2.put("firmar", "sign");	                treeMap2.put("imaginar", "imagine");
treeMap2.put("poder", "can");                   treeMap2.put("creer", "believe");
treeMap2.put("hacer","do");	                treeMap2.put("saber", "know");
treeMap2.put("pedir", "ask for");               treeMap2.put("recordar", "remember");
treeMap2.put("trabajar", "work");	        treeMap2.put("olvidar", "forget");
treeMap2.put("fabricar", "make");	        treeMap2.put("estudiar", "study");
treeMap2.put("construir", "build");	        treeMap2.put("atender", "pay attention");
treeMap2.put("derribar", "demolish");           treeMap2.put("comprender", "understand");
treeMap2.put("aprender", "learn");	        treeMap2.put("conducir", "drive");
treeMap2.put("memorizar", "momorize");	        treeMap2.put("descansar", "rest");
treeMap2.put("enseñar", "teach");	        treeMap2.put("acostar", "go to bed");
treeMap2.put("explicar", "explain");	        treeMap2.put("vestir", "dress");
treeMap2.put("equivocar", "be wrong");	        treeMap2.put("durar", "last");
treeMap2.put("ir", "go");                       treeMap2.put("limpiar", "clean");
treeMap2.put("llegar","arrive");	        treeMap2.put("comer", "eat");
treeMap2.put("volver", "return");               treeMap2.put("tomar", "have");
treeMap2.put("venir", "come");	                treeMap2.put("desayunar", "have breakfast");
treeMap2.put("entrar", "go in");	        treeMap2.put("almorzar", "have lunch");
treeMap2.put("salir", "go out");	        treeMap2.put("cenar", "have dinner");
treeMap2.put("sacar", "take out");              treeMap2.put("beber", "drink");
treeMap2.put("caminar", "walk");	        treeMap2.put("comprar", "buy");
treeMap2.put("leer", "read");	                treeMap2.put("rentar", "rent");
treeMap2.put("correr", "run");	                treeMap2.put("servir", "serve for");
treeMap2.put("parque", "park");	                treeMap2.put("pagar", "pay");
treeMap2.put("saltar", "jump");	                treeMap2.put("deber", "owe");
treeMap2.put("bailar", "dance");                treeMap2.put("cobrar", "get paid");
treeMap2.put("parar","stop");	                treeMap2.put("gastar", "spend");
treeMap2.put("cruzar", "cross");                treeMap2.put("dar ", "give");
treeMap2.put("continuar", "continue");	        treeMap2.put("dar", "take away");
treeMap2.put("viajar", "travel");	        treeMap2.put("recibir", "receive");
treeMap2.put("subir", "go up");	                treeMap2.put("perder", "lose");
treeMap2.put("bajar", "go down");               treeMap2.put("buscar", "look for");
treeMap2.put("yo", "I am");	                treeMap2.put("nosotros", "we");
treeMap2.put("ella", "she");	                treeMap2.put("ustedes", "you");
treeMap2.put("el", "he");	                treeMap2.put("ellos", "they");
treeMap2.put("tu", "you");                      treeMap2.put("en", "in");
treeMap2.put("eso", "it");                      treeMap2.put("silla", "chair");
treeMap2.put("si", "yes");	                treeMap2.put("escritorio", "desk");
treeMap2.put("no", "not");	                treeMap2.put("maestro", "teacher");
treeMap2.put("libro", "book");	                treeMap2.put("maestra", "teacher");
treeMap2.put("lápiz", "pencil");                treeMap2.put("hombre", "men"); 
treeMap2.put("mujer", "girl");                  treeMap2.put("computadora", "computer");
treeMap2.put("papá", "dad");	                treeMap2.put("mochila", "schoolbag");
treeMap2.put("mamá", "mom");	                treeMap2.put("estudiante", "student");
treeMap2.put("niño", "boy");	                treeMap2.put("alto", "high");
treeMap2.put("escuela", "school");              treeMap2.put("ancho", "wide");
treeMap2.put("esta bien", "ok");                treeMap2.put("viejo", "old");
treeMap2.put("duro", "hard");	                treeMap2.put("años", "years old");
treeMap2.put("feo", "ugly");	                treeMap2.put("joven", "young");
treeMap2.put("lindo", "cute");	                treeMap2.put("negro", "black");
treeMap2.put("lápiz", "pencil");                treeMap2.put("blanco", "white");
treeMap2.put("morado", "purple");               treeMap2.put("gris", "gray");
treeMap2.put("amarillo", "yellow");	        treeMap2.put("café", "coffe");
treeMap2.put("verde", "green");	                treeMap2.put("nuevo", "new");
treeMap2.put("rojo", "red");	                treeMap2.put("cosa", "thing");
treeMap2.put("azúl", "blue");                   treeMap2.put("bonito", "beautiful");        
treeMap2.put("quiero","I want");                 treeMap2.put("burritos", "burritos");
treeMap2.put("yesca","tinder");                  treeMap2.put("tengo","I have");
treeMap2.put("hambre","hungry");                 treeMap2.put("sueño","dream");
treeMap2.put("de","of");                         treeMap2.put("la", "the");
treeMap2.put("hola","hi");                         treeMap2.put("mundo", "world");

     System.out.println("Introduce tu frase a traducir: " +"\n");
     frase2= tradu.nextLine();
      frase2 = frase2.toLowerCase();
     System.out.print("----------------------------------------------------");
     System.out.println();
   String[] cadenas2 = frase2.split(" ");
            for (String cadenas21 : cadenas2) {
                if (treeMap2.containsKey(cadenas21)) {
                    System.out.print(treeMap2.get(cadenas21) + " ");
                    }
            }
            }
    System.out.println("\n");
            System.out.println("   Si quieres continuar, presiona 3" + "\n" + "---Si no presiona cualquier otro numero.--- ");
                    conti= tradu.nextInt();
                    tradu.nextLine();
    }   while(conti == 3);
    }        
   }
    
