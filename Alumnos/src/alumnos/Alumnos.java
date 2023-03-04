package alumnos;
import Alumno.Alumno;
import java.util.Scanner;

/**
 * Solicita nombre y nota de un alumno.
 * Realiza una media de las notas de los alumnos.
 * @author Nerea Romero
 */

public class Alumnos {
	
	/**
	 * Main del programa
	 * @param args Main
	 */
	
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    /**
     * Define un array de 5 alumnos
     * @param alum alumno.
     */
    
    Alumno[] alum = new Alumno[5];
    

    // Pide los datos de los alumnos 
        
    System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
    
    /**
     * Creación de variables.
     * @param nombreIntroducido String donde se va a introducir el nombre.
     * @param notaIntroducida Double donde se va a introducir la nota.
     */
    
    String nombreIntroducido;
    double notaIntroducida;
    
    for(int i = 0; i < 5; i++) {
    	
        
         // Bucle para cambiar la selección del alumno.
         
    	
      alum[i] = new Alumno();          
      System.out.println("Alumno " + i);
      System.out.print("Nombre: ");
      nombreIntroducido = entrada.nextLine();
      (alum[i]).nombre = nombreIntroducido;
      System.out.print("Nota media: ");
      notaIntroducida = Double.parseDouble(entrada.nextLine());
      alum[i].notaMedia = notaIntroducida;
    }
    
    // Muestra los datos de los alumnos
    
    System.out.println("Los datos introducidos son los siguientes:");
    
    // @param sumaDeMedia Double de la suma de todas las notas.
    
    double  sumaDeMedias = 0;
    
    // Bucle para mostrar del almuno seleccionado nombre, nota y la nota media.
    
    for(int i = 0; i < 5; i++) {
      System.out.println("Alumno " + i);  
      System.out.println("Nombre: " + alum[i].nombre);    
      System.out.println("Nota media: " + alum[i].notaMedia);
      System.out.println("----------------------------");

      sumaDeMedias += alum[i].notaMedia;
    }
    
    // Muestra en pantalla la media de la clase utilizando la variable sumaDeMedias entre 5.
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  }
}
