package ejericiosbasicosjava;

/**
 *
 * @author Sarita
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana) {
        if (finDeSemana) {
            return true;
        }
        if (numBellotas >= 40 && numBellotas <= 60) {
            return true;
        }
        return false;
    }

    public int multa(int velocidad, boolean cumple) {
        if (cumple) {
            velocidad = velocidad - 5;
        }
        if (velocidad <= 60) {
            return 0;
        }
        if ((velocidad >= 61) && (velocidad <= 81)) {
            return 1;
        }
        return 2;
    }

    public boolean vanidoso(int numero) {
        if ((numero % 11 == 0) || (numero % 11 ==1)) {
            return true;
        }
        return false;
    }
    
    public boolean contesta (boolean matinal, boolean madre, boolean dormido){
        if(dormido){
        return false;
        }
        if(madre && matinal){
        return true;   
    }
        if (matinal){
            return false;
        }
        return true;
    }
    
    public boolean menorPor10 (int numero1, int numero2, int numero3){
     if ((Math.abs(numero1-numero2) >=10) || (Math.abs(numero1-numero3) >=10) || (Math.abs(numero2-numero3) >=10)){
         return true;
     }   
       return false;    
    }
    
    public boolean digitoIgual (int a, int b){
        int aIzq = a/10;
        int aDer = a%10;
        int bIzq = b/10;
        int bDer = b%10;
        if (aIzq == bDer || aIzq == bIzq || aDer == bIzq || aDer == bDer){
           return true;
    }
    return false;
}

    public boolean multiploMultiple (int a){
     if (a % 3 == 0 && a % 5 == 0){
         return false;
     }
     if(a %3 == 0 || a%5 == 0){
        return true;
    }
         return false;
    }
    
    public boolean menos20 (int a){
        if ((((a+1)%20) == 0) || (((a+2) %20) == 0)){
            return true;
        }
        return false;
    }
    
     public int loteria (int a, int b, int c){
         if( a == b && a != c){
             return 0;
         }
         if(a == 2 && b==2 && c==2){
             return 10;
         }
         else{
             return 5;
         }
     }
     
     public int withoutDoubles (int a, int b, boolean noDoubles){
      int resultado = a+b;
      if((noDoubles == true) && (a == b)){
          resultado ++;
      }
      return resultado;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        //Prueba el ejercicio uno
        System.out.println("fiestaArdillas(30, false)" + ejercicios.fiestaArdillas(30, false));
        System.out.println("fiestaArdillas(50, true)" + ejercicios.fiestaArdillas(50, true));
        System.out.println("fiestaArdillas(70, true)" + ejercicios.fiestaArdillas(70, true));
        //Prueba el ejercicio dos
        System.out.println("multa(60, false)" + ejercicios.multa(60, false));
        System.out.println("multa(65, false)" + ejercicios.multa(65, false));
        System.out.println("multa(65, true)" + ejercicios.multa(65, true));
        //Prueba el ejercicio tres
        System.out.println("vanidoso(22)" + ejercicios.vanidoso(22));
        System.out.println("vanidoso(23)" + ejercicios.vanidoso(23));
        System.out.println("vanidoso(24)" + ejercicios.vanidoso(24));
        //Prueba el ejercicio cuatro
        System.out.println("contesta(false, false, false)" + ejercicios.contesta(false, false, false));
        System.out.println("contesta(false, false, true)" + ejercicios.contesta(false, false, true));
        System.out.println("contesta(true, false, false)" + ejercicios.contesta(true, false, false));
        //Prueba el ejercicio cinco
        System.out.println("menorPor10(1,7,11)" + ejercicios.menorPor10(1,7,11));
        System.out.println("menorPor10(1,7,10)" + ejercicios.menorPor10(1,7,10));
        System.out.println("menorPor10(11,1,7)" + ejercicios.menorPor10(11,1,7));
        //Prueba el ejercicio seis
        System.out.println("digitoIgual(12,23)" + ejercicios.digitoIgual(12,23));
        System.out.println("digitoIgual(12,43)" + ejercicios.digitoIgual(12,43));
        System.out.println("digitoIgual(12,44)" + ejercicios.digitoIgual(12,44));
        //Prueba el ejercicio siete
        System.out.println("multiploMultiple(3)" + ejercicios.multiploMultiple(3));
        System.out.println("multiploMultiple(10)" + ejercicios.multiploMultiple(10));
        System.out.println("multiploMultiple(15)" + ejercicios.multiploMultiple(15));
        //Prueba el ejercicio ocho
        System.out.println("menos20(18)" + ejercicios.menos20(18));
        System.out.println("menos20(19)" + ejercicios.menos20(19));
        System.out.println("menos20(20)" + ejercicios.menos20(20));
        //Prueba el ejercicio nueve
        System.out.println("loteria(2,2,2)" + ejercicios.loteria(2,2,2));
        System.out.println("loteria(2,2,1)" + ejercicios.loteria(2,2,1));
        System.out.println("loteria(0,0,0)" + ejercicios.loteria(0,0,0));
        //Prueba el ejercicio diez
        System.out.println("withoutDoubles(2,3,true)" + ejercicios.withoutDoubles(2,3,true));
        System.out.println("withoutDoubles(3,3,true)" + ejercicios.withoutDoubles(3,3,true));
        System.out.println("withoutDoubles(3,3,false)" + ejercicios.withoutDoubles(3,3,false));
        System.out.println("withoutDoubles(6,6,true)" + ejercicios.withoutDoubles(6,6,true));
    }
}
