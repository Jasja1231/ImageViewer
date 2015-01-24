/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;

import javax.swing.ButtonGroup;

/**
 *
 * @author Jaryna
 */
public class ThirdPanelOperation extends javax.swing.JPanel {

    /**
     * Creates new form ThirdPanelOperation
     */
    
    public ThirdPanelOperation() {
        initComponents();
        ButtonGroup group  = new ButtonGroup(); 
        
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

        jRadioButton2.setText("OR");

        jRadioButton3.setText("XOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(30, 30, 30)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        buttonMergeSelectedPictures.setText("Merge Pictures");
        buttonMergeSelectedPictures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMergeSelectedPicturesActionPerformed(evt);
            }
        });

        buttonMergeDirectories.setText("Merge Direcctories");

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
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelForOperationsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonMergeDirectories)))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelForOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelForOperationsLayout.createSequentialGroup()
                        .addComponent(buttonMergeSelectedPictures)
                        .addGap(18, 18, 18)
                        .addComponent(buttonMergeDirectories))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        panelForOperationsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, jPanel2});

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
        // TODO add your handling code here:
        Merging Test = new Merging();
        
    }//GEN-LAST:event_buttonMergeSelectedPicturesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMergeDirectories;
    private javax.swing.JButton buttonMergeSelectedPictures;
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
