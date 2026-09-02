//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("Metodo que regresa una cadena con los numeros de N0");
    System.out.println("Cadena de 9 a 0: "+serieN0(9));
    System.out.println("---------------------------------");
    System.out.println("Metodo que regresa una cadena con los numeros de 0N");
    System.out.println("Cadena de 0 a 9: "+serie0N(9));
    System.out.println("---------------------------------");
    System.out.println("Metodo que calcula una multiplicacion entre dos numeros en base a sus sumas consecutivas: ");
    System.out.println("5*9= "+sumaRecursiva(5,9));
    System.out.println("---------------------------------");
    System.out.println("Metodo que recibe un valore y recibe una cadena con los N valores de la cadena de fibonacci:");
    System.out.println("15 numeros de la serie de fibonacci: "+fibonacci(15));
    System.out.println("---------------------------------");
    System.out.println("Metodo que verifica si un numero es primo o no:");
    System.out.println("113 es primo? "+esPrimo(113));
    System.out.println("58 es primo? "+esPrimo(58));
    System.out.println("---------------------------------");
    System.out.println("Metodo que verifica si un valor x se encuentra en un arreglo, en caso de no encontrarse devuelve -1:");
    int [] arreglo ={15,999,40,27,39,87,101,56,30,4};
    System.out.print("Arreglo: ");
    System.out.println("");
    for (int i = 0; i< arreglo.length; i++){
        System.out.print(arreglo[i]+",");
    }
    System.out.println("");
    System.out.println("Numero a buscar: 30");
    System.out.println("Indice: "+verificarArreglo(arreglo,30));
    System.out.println("Numero a buscar: 100");
    System.out.println("Indice: "+verificarArreglo(arreglo,100));
    System.out.println("---------------------------------");
    System.out.println("Metodo para buscar el valor mas grande en un arreglo: ");
    System.out.print("Arreglo: ");
    for (int i = 0; i< arreglo.length; i++){
        System.out.print(arreglo[i]+",");
    }
    System.out.println("");
    System.out.println("Numero mas grande: "+valorMasGrandeArreglo(arreglo));
    System.out.println("---------------------------------");
    System.out.println("Metodo que recibe una cadena y verifica si un caracter c1 aparece inmediatamente antes que un caracter c2: ");
    String cadena="Apto 4B, 215 West 92nd Street, Nueva York, NY 10025";
    System.out.println("Cadena: "+cadena);
    System.out.println("Caracter c1: o");
    System.out.print("Caracter c2: r");
    System.out.println("");
    System.out.println("Se cumple? "+apareceCaracterSucesivo(cadena,'o','r'));
    System.out.println("Caracter c1: o");
    System.out.print("Caracter c2: k");
    System.out.println("");
    System.out.println("Se cumple? "+apareceCaracterSucesivo(cadena,'o','k'));
    System.out.println("-----------------------------------");
    System.out.println("Un metodo que regresa una cantidad de conejos y devuelve la cantidad de orejas: ");
    System.out.println("Cantidad de conejos: 54");
    System.out.println("Cantidad de orejas: "+getCantidadOrejasConejo(54));
    System.out.println("-----------------------------------");
    System.out.println("Metodo que recibe una cadena y tiene que retornar la suma de los digitos que se encuentren en la cadena: ");
    System.out.println("Cadena: "+cadena);
    System.out.println("Suma: "+sumaEnString(cadena));
    String cadenaMala="Apto, West nd Street, Nueva York, NY";
    System.out.println("Cadena sin numeros: "+cadenaMala);
    System.out.println("Suma: "+sumaEnString(cadenaMala));
}
public String serieN0(int n){
    if (n == 0) return n+"";
    return n + serieN0(n-1) + "";
}

public String serie0N(int n){
    if(n== 0) return "0";

    return serie0N(n-1) + "" + n;
}

public int sumaRecursiva(int n1, int n2){
    if(n2==0) return 0;
    return n1 + sumaRecursiva(n1,n2-1);
}


//

public int getCantidadOrejasConejo(int conejos){
    if (conejos ==0) return 0;
    return getCantidadOrejasConejo(conejos-1) +2;
}

public int verificarArreglo(int [] arreglo,int buscar){
    return verificarArreglo(arreglo,0,buscar);
}

public int verificarArreglo(int [] arreglo,int indice,int buscar){
    if (indice==arreglo.length-1){
        if (arreglo[indice]==buscar){
            return indice;
        }
        else {
            return -1;
        }
    }

    if (arreglo[indice]==buscar){
        return indice;
    }
    return verificarArreglo(arreglo,indice+1,buscar);
}

public int sumaEnString(String cadena){
    return sumaEnString(cadena,0,0);
}

public int sumaEnString(String cadena,int suma,int indice){
    if (cadena.charAt(indice)-'0'>=0&&cadena.charAt(indice)-'0'<=9){
        if (indice==cadena.length()-1){
            return suma+cadena.charAt(indice)-'0';
        }
        return sumaEnString(cadena,suma+cadena.charAt(indice)-'0',indice+1);
    }
    if (indice==cadena.length()-1){
        return suma;
    }
    return sumaEnString(cadena,suma,indice+1);

}

public String fibonacci(int objetivo){
    return fibonacci(objetivo,0,1,"0,",0);
}

public String fibonacci(int objetivo, int actual,int anterior,String cadena,int n){
    if (n==objetivo){
        return cadena+(anterior+actual);
    }
    int suma= actual+anterior;
    anterior=actual;
    actual=suma;
    cadena+=suma+",";
    return fibonacci(objetivo,actual,anterior,cadena,n+1);
}

public int valorMasGrandeArreglo(int[] arreglo){
    return valorMasGrandeArreglo(arreglo,0,arreglo[0]);
}

private int valorMasGrandeArreglo(int[] arreglo, int indice, int valorMasGrande){
    if(indice == arreglo.length -1) return valorMasGrande;

    if(valorMasGrande < arreglo[indice+1]) valorMasGrande = arreglo[indice+1];
    indice ++;
    return valorMasGrandeArreglo(arreglo,indice,valorMasGrande);
}

public boolean apareceCaracterSucesivo(String cadena, char c1, char c2){
    return apareceCaracterSucesivo(cadena,c1,c2,0);
}

private boolean apareceCaracterSucesivo(String cadena, char c1, char c2, int indice){
    if(indice == cadena.length() -1) return false;
    if(cadena.charAt(indice) == c1 && cadena.charAt(indice+1) == c2) return true;
    indice++;
    return apareceCaracterSucesivo(cadena,c1,c2,indice);
}

private boolean esPrimo(int n){
    return esPrimo(n, (int) Math.sqrt(n));
}
//Para determinar si un numero es primom se usa la formula de la raiz de n y dividir entre todos los valores abajo de esa raiz
private boolean esPrimo(int n, int indice){
    if (indice == 1) return true;

    float es = (float) n/indice;
    if(es % 1.0 == 0.0) return false;
    return esPrimo(n,indice-1);
}



