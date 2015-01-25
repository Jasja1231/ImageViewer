/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Jaryna
 */
public class FirstPanelImageEditor extends javax.swing.JPanel {

    /**
     * Creates new form FirstPanelImageEditor
     */
    public ArrayList<imagePanel> currentpanel = new ArrayList<>();
    
    private  mainFrame parentFrame = (mainFrame) this.getParent();
    
    public FirstPanelImageEditor() {
        initComponents();
                
    }

    public JPanel getPanelImageEditor(){
        return panelImageEditor;
    }
    
    public JPanel getPanelForIcons(){
        return panelForIcons;
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImageEditor = new javax.swing.JPanel();
        panelForIcons = new javax.swing.JPanel();
        jpn1 = new javax.swing.JPanel();
        jpn2 = new javax.swing.JPanel();
        jpn3 = new javax.swing.JPanel();
        jpn4 = new javax.swing.JPanel();
        jpn5 = new javax.swing.JPanel();
        panelForDirButtons = new javax.swing.JPanel();
        buttonDir1 = new javax.swing.JButton();
        buttonDir2 = new javax.swing.JButton();
        buttonDir3 = new javax.swing.JButton();
        buttonDir4 = new javax.swing.JButton();
        buttonDir5 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(476, 599));
        setName(""); // NOI18N
        setLayout(new java.awt.BorderLayout());

        panelImageEditor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image Editor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 2, 14))); // NOI18N
        panelImageEditor.setMinimumSize(new java.awt.Dimension(0, 0));
        panelImageEditor.setName(""); // NOI18N
        panelImageEditor.setLayout(new java.awt.BorderLayout());

        panelForIcons.setLayout(new java.awt.CardLayout());

        jpn1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jpn1Layout = new javax.swing.GroupLayout(jpn1);
        jpn1.setLayout(jpn1Layout);
        jpn1Layout.setHorizontalGroup(
            jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jpn1Layout.setVerticalGroup(
            jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        panelForIcons.add(jpn1, "jpn1");

        jpn2.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jpn2Layout = new javax.swing.GroupLayout(jpn2);
        jpn2.setLayout(jpn2Layout);
        jpn2Layout.setHorizontalGroup(
            jpn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jpn2Layout.setVerticalGroup(
            jpn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        panelForIcons.add(jpn2, "jpn2");

        jpn3.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jpn3Layout = new javax.swing.GroupLayout(jpn3);
        jpn3.setLayout(jpn3Layout);
        jpn3Layout.setHorizontalGroup(
            jpn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jpn3Layout.setVerticalGroup(
            jpn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        panelForIcons.add(jpn3, "jpn3");

        jpn4.setBackground(new java.awt.Color(0, 0, 204));
        jpn4.setName("jpn4"); // NOI18N

        javax.swing.GroupLayout jpn4Layout = new javax.swing.GroupLayout(jpn4);
        jpn4.setLayout(jpn4Layout);
        jpn4Layout.setHorizontalGroup(
            jpn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jpn4Layout.setVerticalGroup(
            jpn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        panelForIcons.add(jpn4, "jpn4");

        jpn5.setBackground(new java.awt.Color(0, 255, 255));
        jpn5.setName("jpn5"); // NOI18N

        javax.swing.GroupLayout jpn5Layout = new javax.swing.GroupLayout(jpn5);
        jpn5.setLayout(jpn5Layout);
        jpn5Layout.setHorizontalGroup(
            jpn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jpn5Layout.setVerticalGroup(
            jpn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        panelForIcons.add(jpn5, "jpn5");

        panelImageEditor.add(panelForIcons, java.awt.BorderLayout.CENTER);

        buttonDir1.setText("     Dir 1     ");
        buttonDir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDir1ActionPerformed(evt);
            }
        });
        panelForDirButtons.add(buttonDir1);

        buttonDir2.setText("     Dir 2    ");
        buttonDir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDir2ActionPerformed(evt);
            }
        });
        panelForDirButtons.add(buttonDir2);

        buttonDir3.setText("     Dir 3     ");
        buttonDir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDir3ActionPerformed(evt);
            }
        });
        panelForDirButtons.add(buttonDir3);

        buttonDir4.setText("     Dir 4     ");
        buttonDir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDir4ActionPerformed(evt);
            }
        });
        panelForDirButtons.add(buttonDir4);

        buttonDir5.setText("     Dir 5     ");
        buttonDir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDir5ActionPerformed(evt);
            }
        });
        panelForDirButtons.add(buttonDir5);

        panelImageEditor.add(panelForDirButtons, java.awt.BorderLayout.PAGE_START);

        add(panelImageEditor, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void buttonDir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDir1ActionPerformed
        try{
            currentpanel = parentFrame.getImageBrowser().getImagePanel1();
        }
        catch(Exception e){
        
        }
        CardLayout card = (CardLayout) panelForIcons.getLayout();
        card.show(panelForIcons, "jpn1");
    }//GEN-LAST:event_buttonDir1ActionPerformed

    private void buttonDir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDir4ActionPerformed
        try{
            currentpanel = parentFrame.getImageBrowser().getImagePanel4();
        }
        catch(Exception e){
        
        }
        CardLayout card = (CardLayout) panelForIcons.getLayout();
        card.show(panelForIcons, "jpn4");    
    }//GEN-LAST:event_buttonDir4ActionPerformed

    private void buttonDir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDir2ActionPerformed
        try{
           currentpanel = parentFrame.getImageBrowser().getImagePanel2(); 
        }
        catch(Exception e){
        
        }
        CardLayout card = (CardLayout) panelForIcons.getLayout();
        card.show(panelForIcons, "jpn2");
    }//GEN-LAST:event_buttonDir2ActionPerformed

    private void buttonDir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDir3ActionPerformed
        try{
            currentpanel = parentFrame.getImageBrowser().getImagePanel3();
        }
        catch(Exception e){
        
        }
        CardLayout card = (CardLayout) panelForIcons.getLayout();
        card.show(panelForIcons, "jpn3");
    }//GEN-LAST:event_buttonDir3ActionPerformed

    private void buttonDir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDir5ActionPerformed
        try{
            currentpanel = parentFrame.getImageBrowser().getImagePanel5();
        }
        catch(Exception e){
        
        }
        CardLayout card = (CardLayout) panelForIcons.getLayout();
        card.show(panelForIcons, "jpn5");
    }//GEN-LAST:event_buttonDir5ActionPerformed

    String[] array = {".jpg",".png", ".jpeg"," .tiff",".tif"," .bmp" ,".JPG" };
    GenericExtFilter filter = new GenericExtFilter(array);
        
    public JPanel getJpn1(){
       return jpn1;
    }
   
    public JPanel getJpn2(){
       return jpn2;
    }
    public JPanel getJpn3(){
       return jpn3;
    }
    public JPanel getJpn4(){
       return jpn4;
    }
    public JPanel getJpn5(){
       return jpn5;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDir1;
    private javax.swing.JButton buttonDir2;
    private javax.swing.JButton buttonDir3;
    private javax.swing.JButton buttonDir4;
    private javax.swing.JButton buttonDir5;
    private javax.swing.JPanel jpn1;
    private javax.swing.JPanel jpn2;
    private javax.swing.JPanel jpn3;
    private javax.swing.JPanel jpn4;
    private javax.swing.JPanel jpn5;
    private javax.swing.JPanel panelForDirButtons;
    private javax.swing.JPanel panelForIcons;
    private javax.swing.JPanel panelImageEditor;
    // End of variables declaration//GEN-END:variables
}
