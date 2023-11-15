/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosdejava3;

/**
 *
 * @author PC
 */
public class FundamentosDeJava3 {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BUCLES
        /*
        Los bucles `for` y `while` en Java se utilizan para la repeticion de codigo:

- `for`: Ideal para realizar un numero conocido de iteraciones. Se compone de inicializacion, condicion y actualizacion.

- `while`: Utilizado cuando no se conoce el numero exacto de iteraciones. Repite mientras se cumple una condicion booleana.

Ambos bucles son fundamentales para controlar el flujo de ejecucion en programas Java.
        
        
        Crear 3 variables:
        - Nombre
        - Edad
        - Salario
        */
        System.out.println("---------");
        System.out.println("VARIABLES");
        System.out.println("---------");
        int edad =35 ;
        String nombre = "Mariana Belen Soto,";
        String salario = "$ 1000000"; 
        
        System.out.println("Mi nombre es "+nombre);
        System.out.println("tengo "+edad+" años");
        System.out.println("y mi salario es de "+salario);
        
        System.out.println("-------------------------------------");
        System.out.println("ESTRUCTURA DE CONTROL - CONDICIONALES");
        System.out.println("-------------------------------------");
        /*
         En Java, las estructuras condicionales permiten tomar decisiones en el codigo. Las mas comunes son:

if: Ejecuta un bloque de codigo si una condicion es verdadera.

else: Se ejecuta cuando la condicion en un if es falsa.

else if: Permite encadenar condiciones adicionales despues de un if.

switch: Permite comparar una expresion con multiples valores y ejecutar codigo segun coincidencias.

Estas estructuras condicionales son esenciales para controlar el flujo de un programa en Java.
        */
         int edadAlumno = 17;

if (edadAlumno >= 18) {
    System.out.println("Es mayor de 18");
} else {
    System.out.println("Es menor de 18");
}
//BUCLES
/*
Crear un bucle que inicie en 1 y muestre hasta el numero 5
*/
for (int i = 1; i <= 5; i++) {
    System.out.println("Numero: " + i);
}
System.out.println("------------------------");
System.out.println("BUCLE WHILE");
        int contador = 1;
        while (contador <= 5 ) {
            System.out.println("Numero"+ contador); 
            contador++;
        }
            
    }
    
}
