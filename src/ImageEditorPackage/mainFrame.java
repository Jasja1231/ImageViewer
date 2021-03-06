/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.File;

/**
 *
 * @author Jaryna
 */
public final class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
       this.setMinimumSize(new Dimension(800, 600));
       displayPanel.setLayout(new BorderLayout());
       this.getImageEditor().setParentFrame(this);
       this.getImageBrowser().setParentFrame(this);
       this.getOperationsPanel().setParentFrame(this);
       displayPanel.add(firstPanelImageEditor1 ,BorderLayout.CENTER );
       displayPanel.add(seconPanelImageBrowse1 ,BorderLayout.WEST);
       displayPanel.add(thirdPanelOperation1 ,BorderLayout.EAST);
       seconPanelImageBrowse1.setParentFrame(this);
       
       seconPanelImageBrowse1.setVisible(false);
       thirdPanelOperation1.setVisible(false);

       //constructComboBox(seconPanelImageBrowse1.getAllDirectories());
    }

    public FirstPanelImageEditor getImageEditor(){
        return this.firstPanelImageEditor1;
    }
    
     public SeconPanelImageBrowse getImageBrowser(){
        return this.seconPanelImageBrowse1;
    }
    
      public ThirdPanelOperation getOperationsPanel(){
        return this.thirdPanelOperation1;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        buttonImageEditor = new javax.swing.JButton();
        buttonAddDirectories = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonOperations = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        firstPanelImageEditor1 = new ImageEditorPackage.FirstPanelImageEditor();
        seconPanelImageBrowse1 = new ImageEditorPackage.SeconPanelImageBrowse();
        thirdPanelOperation1 = new ImageEditorPackage.ThirdPanelOperation();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));

        buttonPanel.setBackground(new java.awt.Color(255, 102, 0));

        buttonImageEditor.setText("ImageEditor");
        buttonImageEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImageEditorClicked(evt);
            }
        });

        buttonAddDirectories.setText("Exit");
        buttonAddDirectories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddDirectoriesActionPerformed(evt);
            }
        });

        buttonExit.setText("Add/RemoveDirecrory");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddDirectoriesClicked(evt);
            }
        });

        buttonOperations.setText("Operations");
        buttonOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOperationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonImageEditor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonExit)
                .addGap(18, 18, 18)
                .addComponent(buttonOperations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(buttonAddDirectories)
                .addContainerGap())
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonExit, buttonImageEditor, buttonOperations});

        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonImageEditor)
                    .addComponent(buttonAddDirectories)
                    .addComponent(buttonExit)
                    .addComponent(buttonOperations))
                .addContainerGap())
        );

        getContentPane().add(buttonPanel, java.awt.BorderLayout.SOUTH);

        displayPanel.setLayout(new java.awt.CardLayout());

        firstPanelImageEditor1.setBackground(new java.awt.Color(255, 102, 0));
        displayPanel.add(firstPanelImageEditor1, "firstIE");

        seconPanelImageBrowse1.setBackground(new java.awt.Color(255, 102, 0));
        seconPanelImageBrowse1.setFocusCycleRoot(true);
        displayPanel.add(seconPanelImageBrowse1, "secondIB");
        displayPanel.add(thirdPanelOperation1, "card4");

        getContentPane().add(displayPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonImageEditorClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImageEditorClicked
        // TODO add your handling code here:
        // CardLayout card = (CardLayout) displayPanel.getLayout();
        //card.show(displayPanel,"firstIE");
        seconPanelImageBrowse1.setVisible(false);
    }//GEN-LAST:event_buttonImageEditorClicked

    boolean openDirectPanel = false;
    private void buttonAddDirectoriesClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddDirectoriesClicked
        // TODO add your handling code here:
        //CardLayout card = (CardLayout) displayPanel.getLayout();
        //card.show(displayPanel,"secondIB");
        if(openDirectPanel==false){
            seconPanelImageBrowse1.setVisible(true);
            openDirectPanel=true;
            seconPanelImageBrowse1.updateUI();
            displayPanel.revalidate();
            displayPanel.repaint();
        }
        else{
            seconPanelImageBrowse1.setVisible(false);
            openDirectPanel=false;
            seconPanelImageBrowse1.updateUI();
            displayPanel.revalidate();
            displayPanel.repaint();
        }
    }//GEN-LAST:event_buttonAddDirectoriesClicked

    private void buttonAddDirectoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddDirectoriesActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonAddDirectoriesActionPerformed
    
    boolean thirdPanelOperationOpen   = false;
    private void buttonOperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOperationsActionPerformed
        // TODO add your handling code here:
        if(thirdPanelOperationOpen == false){
             thirdPanelOperation1.setVisible(true);
             thirdPanelOperationOpen = true;
             
        }
         else 
            if(thirdPanelOperationOpen == true){
                thirdPanelOperation1.setVisible(false);
                thirdPanelOperationOpen = false;
        }
    }//GEN-LAST:event_buttonOperationsActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddDirectories;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonImageEditor;
    private javax.swing.JButton buttonOperations;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel displayPanel;
    private ImageEditorPackage.FirstPanelImageEditor firstPanelImageEditor1;
    private ImageEditorPackage.SeconPanelImageBrowse seconPanelImageBrowse1;
    private ImageEditorPackage.ThirdPanelOperation thirdPanelOperation1;
    // End of variables declaration//GEN-END:variables
}
