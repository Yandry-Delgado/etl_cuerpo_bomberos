/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prin;

import conectar.Conectar;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Usuario
 */
public class Datamart extends javax.swing.JFrame {

    Conectar con1 = new Conectar();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;

    public Datamart() {
        initComponents();
        setLocationRelativeTo(null);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbAnio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setText(" Nivel de Incidencias por estación");

        Datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Mes:");

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Dirección");

        btnAceptar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Año:");

        cbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", " " }));
        cbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(404, 629, Short.MAX_VALUE))
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "año", "mes", "descripcion", "direccion", "hecho"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(353, 353, 353))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        Datos.getAccessibleContext().setAccessibleName(" ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        limpiartabla();
        if (txtProducto.getText().isEmpty()) {
            consultar2();
        }
        else {
            consultar1();
        }        
        graficar();
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datamart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datamart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datamart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datamart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datamart().setVisible(true);
            }
        });
    }

    void consultar1() {

        String direccion = txtProducto.getText();
        String mes = (String) cbMes.getSelectedItem();
        String anio = (String) cbAnio.getSelectedItem();

        //String sql = "SELECT * FROM hec_preferencia";
        String sql = "select dim_tiempo.año, dim_tiempo.mes, dim_emergencias.descripcion, dim_estacion.direccion, count(hecho_incidencias.hecho) AS hecho\n" +
"from hecho_incidencias\n" +
"inner join dim_emergencias on dim_emergencias.id = hecho_incidencias.dim_emergencias_id\n" +
"inner join dim_estacion on dim_estacion.id = hecho_incidencias.dim_estacion_id\n" +
"inner join dim_tiempo on dim_tiempo.fecha = hecho_incidencias.dim_tiempo_fecha\n" +
"where dim_tiempo.mes = '" + mes + "'" +
"and dim_tiempo.año =  '" + anio + "'" + 
                "and dim_estacion.direccion like '%" + direccion + "%'" +
"group by dim_emergencias.descripcion";

        try {
            conect = con1.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] thecho = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel();
            while (rs.next()) {
                thecho[0] = rs.getInt("año");
                thecho[1] = rs.getInt("mes");
                thecho[2] = rs.getString("descripcion");
                thecho[3] = rs.getString("direccion");
                thecho[4] = rs.getInt("hecho");

                modelo.addRow(thecho);
            }
            tabla.setModel(modelo);

        } catch (Exception e) {
        }
    }

     void consultar2() {

        //String direccion = txtProducto.getText();
        String mes = (String) cbMes.getSelectedItem();
        String anio = (String) cbAnio.getSelectedItem();

        //String sql = "SELECT * FROM hec_preferencia";
        String sql = "select dim_tiempo.año, dim_tiempo.mes, dim_emergencias.descripcion, dim_estacion.direccion, count(hecho_incidencias.hecho) AS hecho\n" +
"from hecho_incidencias\n" +
"inner join dim_emergencias on dim_emergencias.id = hecho_incidencias.dim_emergencias_id\n" +
"inner join dim_estacion on dim_estacion.id = hecho_incidencias.dim_estacion_id\n" +
"inner join dim_tiempo on dim_tiempo.fecha = hecho_incidencias.dim_tiempo_fecha\n" +
"where dim_tiempo.mes = '" + mes + "'" +
"and dim_tiempo.año =  '" + anio + "'" + 
                //"and dim_estacion.direccion like '%" + direccion + "%'" +
"group by dim_emergencias.descripcion";

        try {
            conect = con1.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] thecho = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel();
            while (rs.next()) {
                thecho[0] = rs.getInt("año");
                thecho[1] = rs.getInt("mes");
                thecho[2] = rs.getString("descripcion");
                thecho[3] = rs.getString("direccion");
                thecho[4] = rs.getInt("hecho");

                modelo.addRow(thecho);
            }
            tabla.setModel(modelo);

        } catch (Exception e) {
        }
    }
    public void limpiartabla() {
        DefaultTableModel temp = (DefaultTableModel) tabla.getModel();
        int filas = tabla.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }
    
    public void graficar(){
        DefaultPieDataset dtsc = new DefaultPieDataset();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            
            dtsc.setValue(tabla.getValueAt(i, 2).toString(), Integer.parseInt(tabla.getValueAt(i, 4).toString()));
            JFreeChart ch = ChartFactory.createPieChart3D("Nivel de Incidencias", dtsc, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(600, 170, 600, 450);           
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Datos;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cbAnio;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
