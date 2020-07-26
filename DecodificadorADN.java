package nuevos_ejemplos.ventana;

import javax.swing.JOptionPane;
import nuevos_ejemplos.Decodificador_ADN;

/**
 *
 * @author hectoradolfo
 */
public class DecodificadorADN extends javax.swing.JFrame {

    //declaracion de variables
    private String adn1;
    private String adn2;
    
    /**
     * constructor de mi clase decodificador adn
     * Creates new form DecodificadorADN
     */
    public DecodificadorADN() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblSecuenciaA = new javax.swing.JLabel();
        jLblSecuenciaB = new javax.swing.JLabel();
        txtfSecuencia1 = new javax.swing.JTextField();
        txtfSecuencia2 = new javax.swing.JTextField();
        botonVerificar = new javax.swing.JButton();
        jLblIngresarDatos = new javax.swing.JLabel();
        jLblDatosOrdenados = new javax.swing.JLabel();
        jLblAdn1 = new javax.swing.JLabel();
        jLblAdn2 = new javax.swing.JLabel();
        jLblImprimeAdnA = new javax.swing.JLabel();
        jLblImprimeAdnB = new javax.swing.JLabel();
        jLblOrdenadoLogo = new javax.swing.JLabel();
        jLblImprimeBase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Decodificador ADN");

        jLblSecuenciaA.setText("Secuencia ADN 1:");

        jLblSecuenciaB.setText("Secuencia ADN 2:");

        botonVerificar.setText("Verificar datos");
        botonVerificar.setBorder(null);
        botonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerificarActionPerformed(evt);
            }
        });

        jLblIngresarDatos.setText("Ingrese Datos");

        jLblDatosOrdenados.setText("Conjunto Ordenado de Bases");

        jLblAdn1.setText("ADN 1:");

        jLblAdn2.setText("ADN 2:");

        jLblOrdenadoLogo.setText("Base:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblSecuenciaA)
                                    .addComponent(jLblSecuenciaB))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtfSecuencia1)
                                        .addComponent(txtfSecuencia2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                    .addComponent(botonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblOrdenadoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLblImprimeBase, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLblAdn2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(jLblAdn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLblImprimeAdnA, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(jLblImprimeAdnB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLblIngresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLblDatosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblIngresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSecuenciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfSecuencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSecuenciaB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfSecuencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(botonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLblDatosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblAdn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblImprimeAdnA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblAdn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblImprimeAdnB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblOrdenadoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblImprimeBase, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //funcionalidad de boton Verificar Secuencias
    private void botonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerificarActionPerformed

        try {
            //obtener los datos ingresados por el usuario
            adn1 = txtfSecuencia1.getText().trim();
            adn2 = txtfSecuencia2.getText().trim();
            
            //crear un objeto de decodificador para obtener la logica
            Decodificador_ADN decodificador = new Decodificador_ADN();
            decodificador.guardarDatos(adn1, adn2);
            decodificador.compararSecuencias();
            
            //imprimimos datos y vaciamos los textfiel para que el usuario pueda utilizarlos de nuevo
            jLblImprimeAdnA.setText(adn1);
            jLblImprimeAdnB.setText(adn2);
            jLblImprimeBase.setText(decodificador.obtenerBase());
            txtfSecuencia1.setText("");
            txtfSecuencia2.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error!!,\nintenta de nuevo");
        }
    }//GEN-LAST:event_botonVerificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVerificar;
    private javax.swing.JLabel jLblAdn1;
    private javax.swing.JLabel jLblAdn2;
    private javax.swing.JLabel jLblDatosOrdenados;
    private javax.swing.JLabel jLblImprimeAdnA;
    private javax.swing.JLabel jLblImprimeAdnB;
    private javax.swing.JLabel jLblImprimeBase;
    private javax.swing.JLabel jLblIngresarDatos;
    private javax.swing.JLabel jLblOrdenadoLogo;
    private javax.swing.JLabel jLblSecuenciaA;
    private javax.swing.JLabel jLblSecuenciaB;
    private javax.swing.JTextField txtfSecuencia1;
    private javax.swing.JTextField txtfSecuencia2;
    // End of variables declaration//GEN-END:variables
}