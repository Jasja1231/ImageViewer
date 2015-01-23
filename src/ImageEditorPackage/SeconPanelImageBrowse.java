/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;


import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


/**
 *
 * @author Jaryna
 */
public class SeconPanelImageBrowse extends javax.swing.JPanel {

    
    private ArrayList<imagePanel> imagepanel1 = new ArrayList<>();
    private ArrayList<imagePanel> imagepanel2 = new ArrayList<>();
    private ArrayList<imagePanel> imagepanel3 = new ArrayList<>();
    private ArrayList<imagePanel> imagepanel4 = new ArrayList<>();
    private ArrayList<imagePanel> imagepanel5 = new ArrayList<>();
    
    
    
    private mainFrame parentFrame = (mainFrame) this.getParent();
    
    private int count = 0;
     JTextField displayDirName1  = new JTextField(15);
     JTextField displayDirName2  = new JTextField(15);
     JTextField displayDirName3  = new JTextField(15);
     JTextField displayDirName4  = new JTextField(15);
     JTextField displayDirName5  = new JTextField(15);
    
     JPanel panelOfDirectory1 = new JPanel();
     JPanel panelOfDirectory2 = new JPanel();
     JPanel panelOfDirectory3 = new JPanel();
     JPanel panelOfDirectory4 = new JPanel();
     JPanel panelOfDirectory5 = new JPanel();
     
     //Initializing files which we will choose later  , at the beginning null - no directory chosen
      File file1 ;
      File file2 ;
      File file3 ;
      File file4 ;
      File file5 ;
     
     JFileChooser chooser1 = new JFileChooser();
     JFileChooser chooser2 = new JFileChooser();
     JFileChooser chooser3 = new JFileChooser();
     JFileChooser chooser4 = new JFileChooser();
     JFileChooser chooser5 = new JFileChooser();
     
     //JPanel jpn1 = new JPanel();
     JPanel jpn2 = new JPanel();
     JPanel jpn3 = new JPanel();
     JPanel jpn4 = new JPanel();
     JPanel jpn5 = new JPanel();
     
     
    //array for Generic Filter of files that should be in  our chosen directory
    String[] array = {".jpg",".png", ".jpeg"," .tiff",".tif"," .bmp" ,".JPG" };
    /**
     * Creates new form SeconPanelImageBrowse
     */
    
    
    
    public SeconPanelImageBrowse() {
        initComponents();
        //2 - num of rolls , 3 - number of colums 5 - dst horisontally 10 - dist vertically
        panelDirectories.setLayout(new GridLayout(5 , 1 , 10 , 10));
        
        panelDirectories.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        panelDirectories.add(panelOfDirectory1);
        panelDirectories.add(panelOfDirectory2);
        panelDirectories.add(panelOfDirectory3);
        panelDirectories.add(panelOfDirectory4);
        panelDirectories.add(panelOfDirectory5);
         
        
        
       GenericExtFilter filter  = new GenericExtFilter(array);
        
        //Filling panelOfDirecrory11st directory filling 
        panelOfDirectory1.setVisible(false);
        panelOfDirectory1.setLayout(new BorderLayout());
        JButton buttonOpen1 = new JButton();
            buttonOpen1.addActionListener(new ActionListener() {
           //action after choosing Browse
            public void actionPerformed(ActionEvent e) {
                 
                chooser1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getActionCommand()!="CancelSelection"){
                            fullFillPanel(parentFrame.getImageEditor().getJpn1(),file1, chooser1 , imagepanel1);
                         }
                    }
                });
                
                chooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = chooser1.showOpenDialog(SeconPanelImageBrowse.this);
                if(option == JFileChooser.APPROVE_OPTION){
                    file1 = chooser1.getSelectedFile();
                    //checking if directory parent of a chosen accidentaly file(not directory) has images inside
                    String[] list = file1.list(filter);
                    if(list.length == 0){
                        displayDirName1.setText("No images in this directory");
                    }
                    else{
                        displayDirName1.setText(((chooser1.getSelectedFile()!=null)?file1.getPath():"nothing"));
                    }
                 }
                //if user canceled his request
                if(option == JFileChooser.CANCEL_OPTION) {
                    displayDirName1.setText("You canceled.");
                }
            }                
        });
           
            JButton buttonRemove1 = new JButton();
            buttonRemove1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //setting file to null , clear file(directory that we deleted
                file1 = null;
                parentFrame.getImageEditor().getJpn1().removeAll();
                parentFrame.getImageEditor().getJpn1().repaint();
                displayDirName1.setText(null);
                if(count == 1){
                    panelOfDirectory1.setVisible(false);
                    count--;
                }
                else if(count == 2){
                    displayDirName1.setText(displayDirName2.getText());
                    panelOfDirectory2.setVisible(false);
                     displayDirName2.setText(null);
                    count--;
                }
                else if(count == 3){
                    displayDirName1.setText(displayDirName2.getText());
                    displayDirName2.setText(displayDirName3.getText());
                    displayDirName3.setText(null);
                    panelOfDirectory3.setVisible(false);
                    count--;
                }
                else if(count == 4){
                    displayDirName1.setText(displayDirName2.getText());
                    displayDirName2.setText(displayDirName3.getText());
                    displayDirName3.setText(displayDirName4.getText());
                    displayDirName4.setText(null);
                    panelOfDirectory4.setVisible(false);
                    count--;
                }
                else if(count == 5){
                    displayDirName1.setText(displayDirName2.getText());
                    displayDirName2.setText(displayDirName3.getText());
                    displayDirName3.setText(displayDirName4.getText());
                    displayDirName4.setText(displayDirName5.getText());
                    displayDirName5.setText(null);
                    panelOfDirectory5.setVisible(false);
                    count--;
                   // AddNewDirectory.setVisible(true);
                    AddNewDirectory.setEnabled(true);
                }
            }
        });
            buttonRemove1.setText("X");
            buttonOpen1.setText("Browse");
            displayDirName1.setEditable(false);
            JPanel panelTest = new JPanel();
            panelTest.setLayout(new GridBagLayout());
                     
                     panelTest.add(buttonOpen1);
                     panelTest.add(displayDirName1);
                     panelTest.add(buttonRemove1);
                     
            panelOfDirectory1.add(panelTest);  
              
            //2nd chooser functionality adding
            panelOfDirectory2.setVisible(false);
            panelOfDirectory2.setLayout(new BorderLayout());
            JButton buttonOpen2 = new JButton();
            buttonOpen2.addActionListener((ActionEvent e) -> {
               chooser2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getActionCommand()!="CancelSelection"){
                           fullFillPanel(parentFrame.getImageEditor().getJpn2(),file2, chooser2 , imagepanel2);
                        }
                    }
                });
                chooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = chooser2.showOpenDialog(SeconPanelImageBrowse.this);
                 if(option ==JFileChooser.APPROVE_OPTION){
                    file2 = chooser2.getSelectedFile();
                     // if the user accidently click a file, then select the parent directory.
                    if(!file2.isDirectory()){
                     file2 = file2.getParentFile();
                    }
                    
                    String[] list = file2.list(filter);
                    if(list.length == 0){
                        displayDirName2.setText("No images in this directory");
                    }
                    else{
                        displayDirName2.setText(((chooser2.getSelectedFile()!=null)?file2.getPath():"nothing"));
                    }
                }
                if(option == JFileChooser.CANCEL_OPTION) {
                    displayDirName2.setText("You canceled.");
                }
        });
            JButton buttonRemove2 = new JButton();
             buttonRemove2.addActionListener((ActionEvent e) -> {
                 //setting file to null , clear file(directory that we deleted)
                file2 = null;
                parentFrame.getImageEditor().getJpn2().removeAll();
                parentFrame.getImageEditor().getJpn2().repaint();
                if(count == 2){
                     panelOfDirectory2.setVisible(false);
                     displayDirName2.setText(null);
                     count--;
                 }
                 else if(count == 3){
                     
                     displayDirName2.setText(displayDirName3.getText());
                     displayDirName3.setText(null);
                     panelOfDirectory3.setVisible(false);
                     count--;
                 }
                 else if(count == 4){
                     displayDirName2.setText(displayDirName3.getText());
                     displayDirName3.setText(displayDirName4.getText());
                     displayDirName4.setText(null);
                     panelOfDirectory4.setVisible(false);
                     count--;
                 }
                 else if(count == 5){
                     displayDirName2.setText(displayDirName3.getText());
                     displayDirName3.setText(displayDirName4.getText());
                     displayDirName4.setText(displayDirName5.getText());
                     displayDirName5.setText(null);
                     panelOfDirectory5.setVisible(false);
                     count--;
                     //AddNewDirectory.setVisible(true);
                     AddNewDirectory.setEnabled(true);
                 }
        });
            buttonRemove2.setText("X");
            buttonOpen2.setText("Browse");
            displayDirName2.setEditable(false);
            JPanel panelTest2 = new JPanel();
            panelTest2.setLayout(new GridBagLayout());
                     
                     panelTest2.add(buttonOpen2);
                     panelTest2.add(displayDirName2);
                     panelTest2.add(buttonRemove2);
                     
            panelOfDirectory2.add(panelTest2);  
            
            
            
            //Added  functionality to 3rd directory chooser
            panelOfDirectory3.setVisible(false);
            panelOfDirectory3.setLayout(new BorderLayout());
            JButton buttonOpen3 = new JButton();
            buttonOpen3.addActionListener((ActionEvent e) -> {
                chooser3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getActionCommand()!="CancelSelection"){
                           fullFillPanel(parentFrame.getImageEditor().getJpn3(),file3, chooser3 , imagepanel3);
                        }
                    }
                });
                chooser3.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = chooser3.showOpenDialog(SeconPanelImageBrowse.this);

                 if(option ==JFileChooser.APPROVE_OPTION){
                    file3 = chooser3.getSelectedFile();
                     // if the user accidently click a file, then select the parent directory.
                    if(!file3.isDirectory()){
                     file3 = file3.getParentFile();
                    }
                   
                    String[] list = file3.list(filter);
                    if(list.length == 0){
                        displayDirName3.setText("No images in this directory");
                    }
                    else{
                        displayDirName3.setText(((chooser3.getSelectedFile()!=null)?file3.getPath():"nothing"));
                    }
                }
                if(option == JFileChooser.CANCEL_OPTION) {
                    displayDirName3.setText("You canceled.");
                }
        });
            JButton buttonRemove3 = new JButton();
               buttonRemove3.addActionListener((ActionEvent e) -> {
                   //setting file to null , clear file(directory that we deleted)
                   file3 = null;
                   parentFrame.getImageEditor().getJpn3().removeAll();
                   parentFrame.getImageEditor().getJpn3().repaint();
                 if(count == 3){
                     displayDirName3.setText(null);
                     panelOfDirectory3.setVisible(false);
                     count--;
                 }
                 else if(count == 4){
                     displayDirName3.setText(displayDirName4.getText());
                     displayDirName4.setText(null);
                     panelOfDirectory4.setVisible(false);
                     count--;
                 }
                 else if(count == 5){
                     displayDirName3.setText(displayDirName4.getText());
                     displayDirName4.setText(displayDirName5.getText());
                     displayDirName5.setText(null);
                     panelOfDirectory5.setVisible(false);
                     count--;
                     //AddNewDirectory.setVisible(true);
                     AddNewDirectory.setEnabled(true);
                 }
        });
            buttonRemove3.setText("X");
            buttonOpen3.setText("Browse");
            displayDirName3.setEditable(false);
            JPanel panelTest3 = new JPanel();
            panelTest3.setLayout(new GridBagLayout());
                    
                     panelTest3.add(buttonOpen3);
                     panelTest3.add(displayDirName3);
                     panelTest3.add(buttonRemove3);
                     
            panelOfDirectory3.add(panelTest3);
           
            
            //Adding functionality to 4th directory chooser
            panelOfDirectory4.setVisible(false);
            panelOfDirectory4.setLayout(new BorderLayout());
            JButton buttonOpen4 = new JButton();
            buttonOpen4.addActionListener((ActionEvent e) -> {
                chooser4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getActionCommand()!="CancelSelection"){
                            fullFillPanel(parentFrame.getImageEditor().getJpn4(),file4, chooser4 , imagepanel4);
                        }
                    }
                });
                chooser4.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = chooser4.showOpenDialog(SeconPanelImageBrowse.this);
                if(option ==JFileChooser.APPROVE_OPTION){
                    file4 = chooser4.getSelectedFile();
                     // if the user accidently click a file, then select the parent directory.
                    if(!file4.isDirectory()){
                     file4 = file4.getParentFile();
                    }
                    
                    String[] list = file4.list(filter);
                    if(list.length == 0){
                        displayDirName4.setText("No images in this directory");
                    }
                    else{
                        displayDirName4.setText(((chooser4.getSelectedFile()!=null)?file4.getPath():"nothing"));
                    }
                }
                if(option == JFileChooser.CANCEL_OPTION) {
                    displayDirName4.setText("You canceled.");
                }
        });
            JButton buttonRemove4 = new JButton();
                 buttonRemove4.addActionListener((ActionEvent e) -> {
                 //setting file to null , clear file(directory that we deleted)
                 file4 = null; 
                 parentFrame.getImageEditor().getJpn4().removeAll();
                 parentFrame.getImageEditor().getJpn4().repaint();
                 if(count == 4){
                        displayDirName4.setText(null);
                     panelOfDirectory4.setVisible(false);
                     count--;
                 }
                 else if(count == 5){
                     displayDirName4.setText(displayDirName5.getText());
                     displayDirName5.setText(null);
                     panelOfDirectory5.setVisible(false);
                     count--;
                     //AddNewDirectory.setVisible(true);
                     AddNewDirectory.setEnabled(true);
                 }
        });
            buttonRemove4.setText("X");
            buttonOpen4.setText("Browse");
            displayDirName4.setEditable(false);
            JPanel panelTest4 = new JPanel();
            panelTest4.setLayout(new GridBagLayout());
                     panelTest4.add(buttonOpen4);
                     panelTest4.add(displayDirName4);
                     panelTest4.add(buttonRemove4);
                     
            panelOfDirectory4.add(panelTest4); 
            
            
            
            //Adding functionality to 5th directory chooser
            panelOfDirectory5.setVisible(false);
            panelOfDirectory5.setLayout(new BorderLayout());
            JButton buttonOpen5 = new JButton();
            buttonOpen5.addActionListener((ActionEvent e) -> {
                chooser5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getActionCommand()!="CancelSelection"){
                            fullFillPanel(parentFrame.getImageEditor().getJpn5(),file5, chooser5 , imagepanel5);
                        }
                    }
                });
                chooser5.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = chooser5.showOpenDialog(SeconPanelImageBrowse.this);
                if(option ==JFileChooser.APPROVE_OPTION){
                     file5 = chooser5.getSelectedFile();
                     // if the user accidently click a file, then select the parent directory.
                    if(!file5.isDirectory()){
                     file5 = file5.getParentFile();
                    }
                    
                    String[] list = file5.list(filter);
                    if(list.length == 0){
                        displayDirName5.setText("No images in this directory");
                    }
                    else{
                        displayDirName5.setText(((chooser5.getSelectedFile()!=null)?file5.getPath():"nothing"));
                    }
                }
                if(option == JFileChooser.CANCEL_OPTION) {
                    displayDirName5.setText("You canceled.");
                }
        });
            JButton buttonRemove5 = new JButton();
              buttonRemove5.addActionListener((ActionEvent e) -> {
                  //setting file to null , clear file(directory that we deleted)
                  file5 = null;
                  parentFrame.getImageEditor().getJpn5().removeAll();
                  parentFrame.getImageEditor().getJpn5().repaint();
                 if(count == 5){
                     displayDirName5.setText(null);
                     panelOfDirectory5.setVisible(false);
                     count--;
                     //AddNewDirectory.setVisible(true);
                     AddNewDirectory.setEnabled(true);
                 }
        });
            buttonRemove5.setText("X");
            buttonOpen5.setText("Browse");
            displayDirName5.setEditable(false);
            JPanel panelTest5 = new JPanel();
            panelTest5.setLayout(new GridBagLayout());
                     panelTest5.add(buttonOpen5);
                     panelTest5.add(displayDirName5);
                     panelTest5.add(buttonRemove5);
                    
            panelOfDirectory5.add(panelTest5); 
              
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAddDirectories = new javax.swing.JPanel();
        panelSubmitButtons = new javax.swing.JPanel();
        AddNewDirectory = new javax.swing.JButton();
        buttonRemoveAll = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        panelDirectories = new javax.swing.JPanel();

        panelAddDirectories.setBackground(new java.awt.Color(255, 153, 51));
        panelAddDirectories.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add directories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 2, 14))); // NOI18N
        panelAddDirectories.setMaximumSize(new java.awt.Dimension(380, 278));
        panelAddDirectories.setName(""); // NOI18N
        panelAddDirectories.setLayout(new java.awt.BorderLayout());

        panelSubmitButtons.setBackground(new java.awt.Color(153, 153, 255));
        panelSubmitButtons.setMaximumSize(new java.awt.Dimension(478, 50));
        panelSubmitButtons.setMinimumSize(new java.awt.Dimension(478, 50));
        panelSubmitButtons.setPreferredSize(new java.awt.Dimension(478, 50));
        panelSubmitButtons.setRequestFocusEnabled(false);

        AddNewDirectory.setText("Add  directory");
        AddNewDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewDirectoryActionPerformed(evt);
            }
        });

        buttonRemoveAll.setText("Remove all");
        buttonRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveAllActionPerformed(evt);
            }
        });

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSubmitButtonsLayout = new javax.swing.GroupLayout(panelSubmitButtons);
        panelSubmitButtons.setLayout(panelSubmitButtonsLayout);
        panelSubmitButtonsLayout.setHorizontalGroup(
            panelSubmitButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubmitButtonsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(buttonRemoveAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddNewDirectory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSave)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        panelSubmitButtonsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddNewDirectory, buttonRemoveAll, buttonSave});

        panelSubmitButtonsLayout.setVerticalGroup(
            panelSubmitButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubmitButtonsLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelSubmitButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewDirectory)
                    .addComponent(buttonRemoveAll)
                    .addComponent(buttonSave))
                .addContainerGap())
        );

        panelAddDirectories.add(panelSubmitButtons, java.awt.BorderLayout.PAGE_END);

        panelDirectories.setBackground(new java.awt.Color(204, 204, 204));
        panelDirectories.setLayout(new java.awt.GridLayout(1, 0));
        panelAddDirectories.add(panelDirectories, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAddDirectories, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAddDirectories, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void AddNewDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewDirectoryActionPerformed
        // TODO add your handling code here:
        if(count == 0 ){
            panelOfDirectory1.setVisible(true);
            count++;
          }
        else if(count == 1){
            count++;
            panelOfDirectory2.setVisible(true);
            }
        else if(count == 2 ){
            count++;
            panelOfDirectory3.setVisible(true);
            }
        else if(count == 3 ){
            count++;
            panelOfDirectory4.setVisible(true);
            }
        else if(count == 4 ){
         panelOfDirectory5.setVisible(true);
         //AddNewDirectory.setVisible(false);
         AddNewDirectory.setEnabled(false);
         count++;
        }
    }//GEN-LAST:event_AddNewDirectoryActionPerformed

    private void buttonRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveAllActionPerformed
        // TODO add your handling code here:
     //deleting all selected files
        file1 = null;
        file2 = null;
        file3 = null;
        file4 = null;
        file5 = null;
        //Clear text fields
        displayDirName1.setText(null);
        displayDirName2.setText(null);
        displayDirName3.setText(null);
        displayDirName4.setText(null);
        displayDirName5.setText(null);
        count = 0;
        //AddNewDirectory.setVisible(true);
        AddNewDirectory.setEnabled(true);
        panelOfDirectory1.setVisible(false);
        panelOfDirectory2.setVisible(false);
        panelOfDirectory3.setVisible(false);
        panelOfDirectory4.setVisible(false);
        panelOfDirectory5.setVisible(false);
        panelOfDirectory5.setVisible(false);
        //Clear panels with images icons
        parentFrame.getImageEditor().getJpn1().removeAll();
        parentFrame.getImageEditor().getJpn2().removeAll();
        parentFrame.getImageEditor().getJpn3().removeAll();
        parentFrame.getImageEditor().getJpn4().removeAll();
        parentFrame.getImageEditor().getJpn5().removeAll();
        
        parentFrame.getImageEditor().getJpn1().repaint();
        parentFrame.getImageEditor().getJpn2().repaint();
        parentFrame.getImageEditor().getJpn3().repaint();
        parentFrame.getImageEditor().getJpn4().repaint();
        parentFrame.getImageEditor().getJpn5().repaint();
        
    }//GEN-LAST:event_buttonRemoveAllActionPerformed

    public void fullFillPanel(JPanel JpnN , File file  , JFileChooser chooser , ArrayList<imagePanel> imagepanel){
        GenericExtFilter filter = new GenericExtFilter(array);
        JpnN.removeAll();
        file = chooser.getSelectedFile();
        
        JPanel jpn1child = new JPanel();
        jpn1child.setLayout(new GridLayout(0,2));
                                
        File[] images = file.listFiles(filter);
        for (File image : images) {
            imagePanel jp = new imagePanel(new ImageIcon(image.getPath()).getImage() , image);
            jp.setSize(250,250);
            imagepanel.add(jp);
            jpn1child.add(jp);
            jp.setVisible(true);
        }
                                
        JScrollPane scrollpane = new JScrollPane(jpn1child);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setBounds(30, 50, parentFrame.getImageEditor().getJpn1().getParent().getWidth(), 20000);
        JpnN.setLayout(new BorderLayout());
        JpnN.add(scrollpane , BorderLayout.CENTER);
        JpnN.repaint();
        JpnN.revalidate();
        parentFrame.getImageEditor().getPanelForIcons().updateUI();
    }
    
     public mainFrame getParentFrame(){
        return parentFrame;    
    }
     
    public void setParentFrame(mainFrame mainframe){
        parentFrame = mainframe;
    }
    
    public ArrayList<imagePanel> getImagePanel1(){
        return imagepanel1;
    }
    
    public ArrayList<imagePanel> getImagePanel2(){
         return imagepanel2;
    }
    
    public ArrayList<imagePanel> getImagePanel3(){
         return imagepanel3;
    }
    
    public ArrayList<imagePanel> getImagePanel4(){
        return imagepanel4;
    }
    
    public ArrayList<imagePanel> getImagePanel5(){
        return imagepanel5;
    }
    
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_buttonSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewDirectory;
    private javax.swing.JButton buttonRemoveAll;
    private javax.swing.JButton buttonSave;
    private javax.swing.JPanel panelAddDirectories;
    private javax.swing.JPanel panelDirectories;
    private javax.swing.JPanel panelSubmitButtons;
    // End of variables declaration//GEN-END:variables
}
