package primav5;
import java.util.Scanner;

/**
 *
 * @author Pedro Mendoza
 */
public class PrimaV5 {

    /**
     * @param args the command line arguments
     */
	
	/**
	 * Funcion que a partir de un entero edad retorna el Factor edad.
	 * @param edad
	 * @return
	 */
    public static double factorEdad(int edad){
        if (edad<25 && edad>=18){
            return 2.8;
        } else if (edad>=25 && edad<35){
            return 1.8;
        } else if (edad>=35 && edad<45){
            return 1.0;
        } else if (edad>=45 && edad<65){
            return 0.8;
        } else if (edad>=65 && edad<=90){
            return 1.5;
        } else{
            return 0;
        }
        
        
    }
    
    /**
     * Funcion que a partir de dos enteros, edad y puntos, obtiene el RCS.
     * @param edad
     * @param ptos
     * @return
     */
    public static int calculoRCS(int edad,int ptos){
        
        if (edad<25 && ptos>=29){
            return 50;
        } else if (edad>=25 && edad<35 && ptos>=27){
            return 50;
        } else if (edad>=35 && edad<45 && ptos>=25){
            return 100;
        } else if (edad>=45 && edad<65 && ptos>=23){
            return 150;
        } else if (edad>=65 && ptos>=25){
            return 200;
        } else{
            return 0;
        }
    }
    
    /**
     * Funcion que a partir de dos enteros, edad y puntos, obtiene la Prima.
     * @param edad
     * @param ptos
     */
    public static void calculoPrima(int edad,int ptos){
        
        if (((edad<18 && edad>0) || edad>90) && (ptos>0 && ptos<=30) ){
            System.out.println("No esta dentro del rango de edad");
            
        } else if (edad<0 && (ptos>0 && ptos<=30)){
            System.out.println("ERROR");
            
        } else if ((ptos>30 || ptos<0)){
            System.out.println("ERROR");
            
        } else if (ptos==0){
            System.out.println("No tiene licencia valida");
        } else{
        double prima=(500*factorEdad(edad))-calculoRCS(edad,ptos);
        System.out.println(prima);
        
        }
    }
    
    /**
     * Funcion que a partir de una cadena verifica si la misma es un entero
     * @param cadena
     * @return
     */
    public static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
    
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        String edad = "";
        String puntos= "";
        do{
        System.out.println("Ingrese su edad: ");        
        Scanner age = new Scanner (System.in);        
        edad = age.nextLine ();
        System.out.println("Ingrese sus puntos: ");        
        Scanner ptos = new Scanner (System.in);
        puntos = ptos.nextLine();
        if (!isNumeric(edad) || !isNumeric(puntos)){
            System.out.println("ERROR");
        } else {
            int ed2=Integer.parseInt(edad);
            int pt2=Integer.parseInt(puntos);
            calculoPrima(ed2,pt2);
        }
        }while(!isNumeric(edad) || !isNumeric(puntos));
        
    }
}