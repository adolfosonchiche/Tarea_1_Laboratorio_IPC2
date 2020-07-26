package nuevos_ejemplos.ventana;

/**
 *
 * @author hectoradolfo
 */
public class Main {
    
     /**
      * metodo para inicializar el programa
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DecodificadorADN().setVisible(true);
        });
    }
   
}
