//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println(serieN0(4));
    System.out.println(serie0N(4));
    System.out.println(sumaRecursiva(4,2));
    System.out.println(cadenaFibonacci(4));
    System.out.println(getCantidadOrejasConejo(5));
    int [] arreglo = {1,12,13,5,8,20,100};;
    System.out.println("indice: "+verificarArreglo(arreglo,7));
    String prueba = "Apto 4B, 215 West 92nd Street, Nueva York, NY 10025";
    System.out.println(prueba+" Suma de los numeros: "+sumaEnString(prueba));
    String prueba1 = "Apto B, Westnd Street, Nueva York, NY";
    System.out.println(prueba1+" Suma de los numeros: "+sumaEnString(prueba1));
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

public String cadenaFibonacci(int n){
    if (n==0) return "" + 0;
    int suma = n + n-1;
    return cadenaFibonacci(n-1) + suma + "";
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