/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.g12.duque.antonio.monteseupc;

/**
 *
 * @author Antonio
 */
public class JFMenu extends javax.swing.JFrame {

    String [] intel = {
        "Intel Core i9-12900K",//0
        "Intel Core i7-12700K",//1
        "Intel Core i5-12600K",//2
        "Intel Core i9-11900K",//3
        "Intel Core i5-11600K"//4
    };
    
    String [] amd = {
        "AMD Ryzen 9 5950X",
        "AMD Ryzen 7 5900X",
        "AMD Ryzen 5 5600X",
        "AMD Ryzen 9 5900HX",
        "AMD Ryzen 7 5800X"
            
    };
    
    double[] precosIntel = {
        800.00, 
        1200.00, 
        1400.00,
        1600.00,
        2000.00
    };
    
    double[] precosAMD = {
        900.00, 
        1300.00, 
        1500.00,
        1700.00,
        2100.00
    };
    
    double precoCPU = 0;
    double precoPlacaMae = 0;
    double precoMemoria = 0;
    double precoGPU = 0;
    double precoSSD = 0;
    
    
    
    public JFMenu() {
        initComponents();
        rbIntel.setSelected(true);
        rbGigabyte.setSelected(true);
        
        // Preencher o combo box com os dados da intel
        cbxProcessador.removeAllItems();
        cbxProcessador.addItem("Selecione o processador");
        for(int i = 0; i < 5; i++){
            cbxProcessador.addItem(intel[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpProcessador = new javax.swing.ButtonGroup();
        grpPlacaMae = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbIntel = new javax.swing.JRadioButton();
        rbAMD = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cbxProcessador = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rbGigabyte = new javax.swing.JRadioButton();
        rbAsus = new javax.swing.JRadioButton();
        rbAsRock = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Selecione a marca do Processador");

        grpProcessador.add(rbIntel);
        rbIntel.setText("Intel");
        rbIntel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIntelActionPerformed(evt);
            }
        });

        grpProcessador.add(rbAMD);
        rbAMD.setText("AMD");
        rbAMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAMDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Selecione o modelo do Processador:");

        cbxProcessador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha seu processador", "I3 13900 H", "I5 13900 S", "I7 !5800 F" }));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione a placa-mãe:");

        grpPlacaMae.add(rbGigabyte);
        rbGigabyte.setText("Gigabyte");

        grpPlacaMae.add(rbAsus);
        rbAsus.setText("ASUS");

        grpPlacaMae.add(rbAsRock);
        rbAsRock.setText("AsRock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAsRock, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAsus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbGigabyte, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbGigabyte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAsus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAsRock)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbxProcessador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rbIntel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbAMD, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbIntel)
                            .addComponent(rbAMD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbAMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAMDActionPerformed
        // TODO add your handling code here:
        cbxProcessador.removeAllItems();
        cbxProcessador.addItem("Selecione o processador");
        for(int i = 0; i < 5; i++){
            cbxProcessador.addItem(amd[i]);
        }
    }//GEN-LAST:event_rbAMDActionPerformed

    private void rbIntelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIntelActionPerformed
        // TODO add your handling code here:
        cbxProcessador.removeAllItems();
        cbxProcessador.addItem("Selecione o processador");
        for(int i = 0; i < 5; i++){
            cbxProcessador.addItem(intel
                    [i]);
        }
    }//GEN-LAST:event_rbIntelActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxProcessador;
    private javax.swing.ButtonGroup grpPlacaMae;
    private javax.swing.ButtonGroup grpProcessador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAMD;
    private javax.swing.JRadioButton rbAsRock;
    private javax.swing.JRadioButton rbAsus;
    private javax.swing.JRadioButton rbGigabyte;
    private javax.swing.JRadioButton rbIntel;
    // End of variables declaration//GEN-END:variables
}
