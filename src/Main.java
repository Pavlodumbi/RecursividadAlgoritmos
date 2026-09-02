//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println(serieN0(4));
    System.out.println(serie0N(4));
    System.out.println(sumaRecursiva(4,2));
    System.out.println(cadenaFibonacci(4));
    System.out.println(getCantidadOrejasConejo(5));
    int[] arreglo = {3,2,22,1,3,5,8,7,11,12,20};
    System.out.println(valorMasGrandeArreglo(arreglo));
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

public int valorMasGrandeArreglo(int[] arreglo){
    return valorMasGrandeArreglo(arreglo,0,arreglo[0]);
}

public int valorMasGrandeArreglo(int[] arreglo, int indice, int valorMasGrande){
    if(indice == arreglo.length -1) return valorMasGrande;

    if(valorMasGrande < arreglo[indice+1]) valorMasGrande = arreglo[indice+1];
    indice ++;
    return valorMasGrandeArreglo(arreglo,indice,valorMasGrande);
}

