/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;

import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Jaryna
 */
public class FirstPanelImageEditor extends javax.swing.JPanel {

    /**
     * Creates new form FirstPanelImageEditor
     */
    
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

        setMinimumSize(new java.awt.Dimension(476, 599));
        setName(""); // NOI18N
        setLayout(new java.awt.BorderLayout());

        panelImageEditor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image Editor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 2, 14))); // NOI18N
        panelImageEditor.setMinimumSize(new java.awt.Dimension(0, 0));
        panelImageEditor.setName(""); // NOI18N

        panelForIcons.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelImageEditorLayout = new javax.swing.GroupLayout(panelImageEditor);
        panelImageEditor.setLayout(panelImageEditorLayout);
        panelImageEditorLayout.setHorizontalGroup(
            panelImageEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForIcons, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        panelImageEditorLayout.setVerticalGroup(
            panelImageEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImageEditorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panelForIcons, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        );

        add(panelImageEditor, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    String[] array = {".jpg",".png", ".jpeg"," .tiff",".tif"," .bmp" ,".JPG" };
    GenericExtFilter filter = new GenericExtFilter(array);
        
     /*public void clearComboBox(){
        jComboBox1.removeAllItems();
     }*/
    
    
    //functon to add directory names to comboBox
    /*public void addToComboBox(String dirName){
        jComboBox1.addItem(dirName);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelForIcons;
    private javax.swing.JPanel panelImageEditor;
    // End of variables declaration//GEN-END:variables
}
