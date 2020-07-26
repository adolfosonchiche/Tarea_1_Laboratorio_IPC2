package nuevos_ejemplos;

/**
 *
 * @author hectoradolfo
 */
public class Main {
    
     /**
      * metodo para inicializar el programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creando el objeto decodificador   
        Decodificador_ADN decodificador = new Decodificador_ADN();
        decodificador.pedirDatos();
        decodificador.compararSecuencias();
        decodificador.imprimir();
        
    }
}















