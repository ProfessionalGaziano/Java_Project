/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class Progtelevisione extends javax.swing.JFrame {
  Televisore TV=new Televisore();
    /**
     * Creates new form Progtelevisione
     */
    public Progtelevisione() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonOn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CanaleSu = new javax.swing.JButton();
        CanaleGiu = new javax.swing.JToggleButton();
        VolumeGiu = new javax.swing.JToggleButton();
        VolumeSu = new javax.swing.JButton();
        NCanale = new javax.swing.JLabel();
        LVolume = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonOn.setText("ON/OFF");
        ButtonOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonOnMouseClicked(evt);
            }
        });

        jLabel1.setText("Canale");

        jLabel2.setText("Volume");

        CanaleSu.setText("+");
        CanaleSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanaleSuMouseClicked(evt);
            }
        });

        CanaleGiu.setText("-");
        CanaleGiu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanaleGiuMouseClicked(evt);
            }
        });

        VolumeGiu.setText("-");
        VolumeGiu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolumeGiuMouseClicked(evt);
            }
        });

        VolumeSu.setText("+");
        VolumeSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolumeSuMouseClicked(evt);
            }
        });

        NCanale.setText("Ncanale:    ");

        LVolume.setText("LVolume:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VolumeGiu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CanaleGiu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(NCanale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VolumeSu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(ButtonOn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CanaleSu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonOn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CanaleGiu)
                            .addComponent(CanaleSu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NCanale)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(VolumeGiu)
                            .addComponent(VolumeSu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LVolume))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonOnMouseClicked
      TV.Accendi();
      if(TV.acceso==true){
      
      LVolume.setText(""+TV.volume);
      NCanale.setText(""+TV.canale);
      
      }
       if(TV.acceso==false){
      
      LVolume.setText("");
      NCanale.setText("");
      
      }
    }//GEN-LAST:event_ButtonOnMouseClicked

    private void CanaleSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanaleSuMouseClicked
      TV.CanaleSu();
      if(TV.acceso==true){
      NCanale.setText(""+TV.canale);
      
      }
          
          
    }//GEN-LAST:event_CanaleSuMouseClicked

    private void CanaleGiuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanaleGiuMouseClicked
      TV.CanaleGiu();
      if(TV.acceso==true){
      
      NCanale.setText(""+TV.canale);
      
      }
    }//GEN-LAST:event_CanaleGiuMouseClicked

    private void VolumeSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolumeSuMouseClicked
      TV.Volumesu();
      if(TV.acceso==true){
      
      LVolume.setText(""+TV.volume);
      }
    }//GEN-LAST:event_VolumeSuMouseClicked

    private void VolumeGiuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolumeGiuMouseClicked
       TV.VolumeGiu();
       if(TV.acceso==true){
       
       LVolume.setText(""+TV.volume);
           
       }
    }//GEN-LAST:event_VolumeGiuMouseClicked

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
            java.util.logging.Logger.getLogger(Progtelevisione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Progtelevisione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Progtelevisione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Progtelevisione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Progtelevisione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonOn;
    private javax.swing.JToggleButton CanaleGiu;
    private javax.swing.JButton CanaleSu;
    private javax.swing.JLabel LVolume;
    private javax.swing.JLabel NCanale;
    private javax.swing.JToggleButton VolumeGiu;
    private javax.swing.JButton VolumeSu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}