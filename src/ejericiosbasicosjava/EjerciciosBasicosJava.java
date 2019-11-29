package ejericiosbasicosjava;

/**
 *
 * @author Sarita
 */
public class EjerciciosBasicosJava {
 public boolean fiestaArdillas (int numBellotas, boolean finDeSemana){
     if(finDeSemana){
         return true;
     }
     if(numBellotas >= 40 && numBellotas <= 60){
         return true;
     }
     return false;
 }
 public int multa (int velocidad, boolean cumple){
     if (cumple){
         velocidad = velocidad - 5;
     }
     if (velocidad <= 60){
         return 0;
     }
     if ((velocidad >=61) && (velocidad <= 81)){
         return 1;
     }
         return 2;
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
       //Prueba del primer ejercicio
       System.out.println(ejercicios.fiestaArdillas(30,false));
       System.out.println(ejercicios.fiestaArdillas(50,true));
       System.out.println(ejercicios.fiestaArdillas(70,true));
       //Prueba del segundo ejercicio
       System.out.println(ejercicios.multa(60, false));
       System.out.println(ejercicios.multa(65, false));
       System.out.println(ejercicios.multa(65, true));
    }  
}
