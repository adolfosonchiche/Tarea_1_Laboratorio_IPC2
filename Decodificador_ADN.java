package nuevos_ejemplos;

import java.util.Scanner;

/**
 *
 * @author hectoradolfo
 */
public class Decodificador_ADN {

    //declaracion de variables
    private String secuenciaA, secuenciaB;
    private int contadorInicial = 0;
    private int longitudA, longitudB;
    private String letrasA[], letrasB[];
    private String cadena1 = "", cadena2 = "";
    Scanner in = new Scanner(System.in);

    /**
     * metodo para pedir los secuencias de ADN al usuario y guardarlo en
     * variables y enviarlos de parametros(adn1, adn2) 
     */
    public void pedirDatos() {

        System.out.println("ingresa primera secuencia de adn");
        String adn1 = in.nextLine();

        System.out.println("ingresa segunda secuencia adn");
        String adn2 = in.nextLine();

        guardarDatos(adn1, adn2);
    }

    /**
     *metodo que guarda los datos en variables e inicializa los arrays de char para guardar las 
     * letras de las secuencias ingresadas por el usuario
     * @param secuenciaA
     * @param secuenciaB
     */
    public void guardarDatos(String secuenciaA, String secuenciaB) {
        this.secuenciaA = secuenciaA;
        this.secuenciaB = secuenciaB;
        longitudA = secuenciaA.length();
        longitudB = secuenciaB.length();

        letrasA = new String[longitudA];
        llenarArrays(letrasA, secuenciaA);
        letrasB = new String[longitudB];
        llenarArrays(letrasB, secuenciaB);
    }

    /**
     *llenamos los arrays con las letras de las secuencias de ADN 
     * recibiendo como parametro la secuencia y el arrays a llenar
     * @param array
     * @param secuencia
     */
    public void llenarArrays(String array[], String secuencia) {

        for (var i = 0; i < array.length; i++) {
            array[i] = String.valueOf(secuencia.charAt(i));
        }
    }

    /**
     *metodo que compara las dos arrays creadas (LetrasA, letrasB)
     * hasta encontrar la secuencia mas larga de letras iguales
     * y guardarlo en una variable para presentarlo como vase de las
     * secuencias de ADN (cadena1, cadena2)
     */
    public void compararSecuencias() {
        //declaramos variables locales que vamos a utilizar
        int contador1 = 0, contador2 = 0;
        int a = 0, b = 0;
        int recorrerA = 0, recorrerB = 0;
        boolean bandera = true;
        int contadorRecorridoA = 1, contadorRecorridoB = 1;

        //verificamos de principio que las secuencias son iguales
        if (secuenciaA.equalsIgnoreCase(secuenciaB)) {
            cadena1 = secuenciaA;
            contadorRecorridoA = longitudA;
            contadorRecorridoB = longitudB;
        }
        
        //ciclo para recorrer los arrays
        while (contadorRecorridoA < longitudA - 1 || contadorRecorridoB < longitudB - 1) {
            //verificamos que los indices no sean mayores a las longitudes de las secuencias
            if (a < longitudA && b < longitudB) { 
                //comparamos las letras ssi son iguales
                if (letrasA[a].equalsIgnoreCase(letrasB[b])) {
                    //llenamos una cadena 
                    if (bandera == true) {
                        contador1++;
                        cadena1 += letrasA[a];
                        a++;
                        b++;

                    } else {
                        contador2++;
                        cadena2 += letrasB[b];
                        a++;
                        b++;
                    }

                } else {
                    //verificamos la cadena mas pequeña de letras iguales para eliminarlo 
                    if (contador1 >= contador2) {
                        contador2 = 0;
                        bandera = false;
                        cadena2 = "";

                    } else if (contador2 >= contador1) {
                        contador1 = 0;
                        bandera = true;
                        cadena1 = "";
                    }
                    //verificamos el recorrido del arrays uno (letrasA)
                    if (contadorRecorridoA <= (longitudA - 2)) {
                        if (recorrerB <= letrasB.length - 2) {
                            b = recorrerB;
                            recorrerB++;

                        } else {
                            a = contadorRecorridoA;
                            recorrerB = 0;
                            contadorRecorridoA++;
                        }
                        if (contadorRecorridoA == (letrasA.length - 2)) {
                            a = 0;
                            b = 0;
                        }
                    //verificamos el recorrido del arrays dos (letrasB)                        
                    } else if (contadorRecorridoB <= (longitudB - 2)) {
                        if (recorrerA <= letrasA.length - 2) {
                            a = recorrerA;
                            recorrerA++;

                        } else {
                            b = contadorRecorridoB;
                            recorrerA = 0;
                            contadorRecorridoB++;
                        }
                    }
                }
            } else {
                //inicializamos las variables locales a cero
                if (contador1 >= contador2) {
                    contador2 = 0;
                    bandera = false;
                    cadena2 = "";

                } else if (contador2 >= contador1) {
                    contador1 = 0;
                    bandera = true;
                    cadena1 = "";
                }

                if (a >= longitudA) {
                    a = 0;

                } else if (b >= longitudB) {
                    b = 0;
                }
            }

        }
    }
    

    /**
     *devuelve la cadena que tiene la base de las secuencias de ADN
     * @return cadena
     */
    public String obtenerBase() {
        if (cadena1.length() > cadena2.length()) {
            return cadena1;
        } else {
            return cadena2;
        }
    }

    /**
     * imprime la base en consola
     */
    public void imprimir() {
        System.out.println("La base es: " + obtenerBase());
    }

}
