/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Jaryna
 */
public class ThirdPanelOperation extends javax.swing.JPanel {

    /**
     * Creates new form ThirdPanelOperation
     */
    //array for Generic Filter of files that should be in  our chosen directory
    String[] array = {".jpg",".png", ".jpeg"," .tiff",".tif"," .bmp" ,".JPG" };
    
    private   mainFrame parentFrame = (mainFrame) this.getParent();
    
    public void setParentFrame(mainFrame frame) {
        parentFrame = frame;
    }
    
    ButtonGroup group  = new ButtonGroup();
    String selectedButton = "AND";
    
    String selectedSizeType = "ErlargeSmaller";
    //0 - ErlargeSmaller 1 - Shrink Bigger 2- Center(put in the middle) 3 - CutOut
    public int sizeType = 0 ; 
    
    public ThirdPanelOperation() {
        initComponents();
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        group.add(jRadioButton3);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelForOperations = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        buttonMergeSelectedPictures = new javax.swing.JButton();
        buttonMergeDirectories = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setBackground(new java.awt.Color(255, 102, 0));
        setMaximumSize(new java.awt.Dimension(2147483647, 200));
        setPreferredSize(new java.awt.Dimension(300, 353));

        panelForOperations.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Merge", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 10))); // NOI18N

        jRadioButton1.setText("AND");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("OR");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("XOR");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Erlarge smaller", "Shrink bigger", "Center", "Center and cut" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(48, 48, 48)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jRadioButton3)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1)
                .addContainerGap())
        );

        buttonMergeSelectedPictures.setText("Merge Pictures");
        buttonMergeSelectedPictures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMergeSelectedPicturesActionPerformed(evt);
            }
        });

        buttonMergeDirectories.setText("Merge Direcctories");
        buttonMergeDirectories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMergeDirectoriesActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shading", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 10))); // NOI18N

        jLabel1.setText("+");

        jLabel2.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Directory 1", "Directory 2", "Directory 3", "Directory 4", "Directory 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout panelForOperationsLayout = new javax.swing.GroupLayout(panelForOperations);
        panelForOperations.setLayout(panelForOperationsLayout);
        panelForOperationsLayout.setHorizontalGroup(
            panelForOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForOperationsLayout.createSequentialGroup()
                .addGroup(panelForOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonMergeSelectedPictures)
                    .addComponent(buttonMergeDirectories))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelForOperationsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonMergeDirectories, buttonMergeSelectedPictures});

        panelForOperationsLayout.setVerticalGroup(
            panelForOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForOperationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelForOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelForOperationsLayout.createSequentialGroup()
                        .addComponent(buttonMergeSelectedPictures)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMergeDirectories))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelForOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelForOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMergeSelectedPicturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMergeSelectedPicturesActionPerformed
        
        
        
        ArrayList<imagePanel> currentSelectedImagePanels = new ArrayList<>();
        try{
            currentSelectedImagePanels = parentFrame.getImageEditor().getCurrentPanelSetOfImages();
        }
        catch(Exception exc){}
        Merging Test = new Merging();
        
        //Getting type of selected choice how to merge (OR , XOR , AND)
        int type = 0 ;
        
        if(null != selectedButton)switch (selectedButton) {
            case "AND":
                type = 0;
                break;
            case "OR":
                type = 1;
                break;
            case "XOR":
                type = 2;
                break;
        }
        
        //Getting selected images  and putting them into ArrayList<File> inside Test(class Merging instance)
        for(imagePanel imgPn : currentSelectedImagePanels ){
            if(imgPn.selected == true)
                Test.imagesSelected.add(imgPn.fileOfImage);
        }
        
        if(Test.imagesSelected.isEmpty() == true){
            //custom title, error icon
            JOptionPane.showMessageDialog(parentFrame,"Choose image before you merge","" ,JOptionPane.ERROR_MESSAGE);
        }
        else{
        //Merging operation in action
            try{
                Test.merge(type);
            }
            catch(Exception e){}
        }
        
        fullFillPanelwithOneMergedImage(parentFrame.getImageEditor().getPanelForResult() , Test.result_image );
    }//GEN-LAST:event_buttonMergeSelectedPicturesActionPerformed

    public void fullFillPanelwithOneMergedImage(JPanel JpnN , Image image ){
        GenericExtFilter filter = new GenericExtFilter(array);
        //JpnN.removeAll();
        
        JpnN.setBackground(java.awt.Color.ORANGE);
        JPanel jpn1child = new JPanel();
        jpn1child.setLayout(new GridLayout(0,2));
        
        if(image!=null){
            imagePanel jp = new imagePanel(image  , null);
            jp.setSize(300,300);
            jpn1child.add(jp);
            jp.setVisible(true);
        }
        
                                
        JScrollPane scrollpane = new JScrollPane(jpn1child);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setBounds(30, 50, parentFrame.getImageEditor().getPanelForResult().getParent().getWidth(), 20000);
        JpnN.setLayout(new BorderLayout());
        JpnN.add(scrollpane , BorderLayout.CENTER);
        JpnN.repaint();
        JpnN.revalidate();
        parentFrame.getImageEditor().getPanelForIcons().updateUI();
    }
    
    
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       //0 - ErlargeSmaller 1 - Shrink Bigger 2- Center(put in the middle) 3 - CutOut
        selectedSizeType =jComboBox1.getSelectedItem().toString();
        switch (selectedSizeType) {
            case "Center":
                sizeType=2;
                break;
            case "Enlarge smaller":
                sizeType=0;
                break;
            case "Shrink bigger":     
                sizeType=1;
                break;
            case "Center and cut":
                sizeType=3;
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        selectedButton = "AND";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        selectedButton = "OR";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        selectedButton = "XOR";
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void buttonMergeDirectoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMergeDirectoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMergeDirectoriesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMergeDirectories;
    private javax.swing.JButton buttonMergeSelectedPictures;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JPanel panelForOperations;
    // End of variables declaration//GEN-END:variables
}
