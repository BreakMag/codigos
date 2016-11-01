    package pais.Paises;

    public class DatoPais {  //Les asignaos su variable y que sea publica
    public String nombrePais;
    public String capital;
    public double poblacion;
    public double pib;
    public String moneda;
    public double area;

    public DatoPais(String nombrePais, String capital, double poblacion, double pib, String moneda, double area){
      this.nombrePais = nombrePais; //this.para es el campo y para el parámetro
      this.capital= capital;
      this.poblacion= poblacion; 
      this.pib=pib; 
      this.moneda=moneda; 
      this.area= area;
    }

 
    public String toString(){  //Imprimimos todos lso resultados según lo que tengamos en Paises.java
    return "País: " + nombrePais + "\n" + "Capital: " + "" + capital + "\n" + "Población: "+
            poblacion + " Millones de Habitantes" +"\n" + "Producto Interno Bruto: " + pib + "  Miles de Millones USD" + "\n" +
            "Moneda:  " +moneda  +"\n" + "Area: " + area + "  Millones de Km2";
    }
    public String imprimirDatos(){ //Imprimios espacios en entre las palabras
            String cad="";
            cad+= "Pais" + nombrePais;
            return cad; //El return es para imprimir los espacios y así...
    }
    }
