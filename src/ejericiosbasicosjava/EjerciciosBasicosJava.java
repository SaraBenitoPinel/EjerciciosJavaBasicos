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
    
    public boolean digitoIgual (int numero1, int numero2){
     if ()
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        //Prueba el ejercicio uno
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, true));
        System.out.println(ejercicios.fiestaArdillas(70, true));
        //Prueba el ejercicio dos
        System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(65, true));
        //Prueba el ejercicio tres
        System.out.println(ejercicios.vanidoso(22));
        System.out.println(ejercicios.vanidoso(23));
        System.out.println(ejercicios.vanidoso(24));
        //Prueba el ejercicio cuatro
        System.out.println(ejercicios.contesta(false, false, false));
        System.out.println(ejercicios.contesta(false, false, true));
        System.out.println(ejercicios.contesta(true, false, false));
        //Prueba el ejercicio cinco
        System.out.println(ejercicios.menorPor10(1,7,11));
        System.out.println(ejercicios.menorPor10(1,7,10));
        System.out.println(ejercicios.menorPor10(11,1,7));
        //Prueba el ejercicio seis
    }
}
