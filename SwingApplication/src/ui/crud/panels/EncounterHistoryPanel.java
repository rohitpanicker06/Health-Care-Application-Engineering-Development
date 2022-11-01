/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.crud.panels;

import doctor.Doctor;
import doctor.DoctorDirectory;
import encounter.Encounter;
import hospital.Hospital;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import patient.Patient;
import rbac.context.RbacApplicationContext;
import ui.DoctorPanel;
import ui.HomeScreen;
import ui.HomeScreenNotDefault;
import utility.DateParser;
import utility.ValidationHelper;
import vitalSigns.VitalSigns;

/**
 *
 * @author rohitpanicker
 */
public class EncounterHistoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterHistoryPanel
     */
    private Patient patient;
    public EncounterHistoryPanel(Patient patient) {
        initComponents();
        this.patient= patient;
        populateTableRecordsWithEncounterHistory();
        makeLabelsDisappear();
        makeTxtFieldsDisappear();
        
    }
    
     private void makeTxtFieldsDisappear(){
        
        patientIDtxtField.setVisible(false);
        nameTxtField.setVisible(false);
        ageTxtField.setVisible(false);
        genderTxtField.setVisible(false);
        addressTextField.setVisible(false);
        insuranceIdTxtField.setVisible(false);
        emailidTextField.setVisible(false);
        phoneNumberTextField.setVisible(false);
        doctorComboBox.setVisible(false);
        
    }
 private void populateTableRecordsWithEncounterHistory()
    {
        
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        
        tableModel.setColumnCount(0);
        tableModel.addColumn("Date");
        tableModel.addColumn("Body Temp");
        tableModel.addColumn("Pulse Rate");
        tableModel.addColumn("Respiration Rate");
        tableModel.addColumn("Blood Pressure");
        tableModel.addColumn("Doctor Name");
         /*JTableHeader th = tblRecords.getTableHeader();
         TableColumnModel tcm = th.getColumnModel();
         TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue( "Date" );
        TableColumn tc_one = tcm.getColumn(1);
        tc_one.setHeaderValue("Body Temp");
        TableColumn tc_two = tcm.getColumn(2);
        tc_two.setHeaderValue("Pulse Rate");
        TableColumn tc_three = tcm.getColumn(3);
        tc_three.setHeaderValue("Respiration Rate");*/
       
        
      //  th.repaint();
        tableModel.setRowCount(0);
        
        try {
            for (Encounter  encounter : patient.getEncounterHistoryList()) {

                Object[] row = new Object[6];
                row[0] = encounter;
                row[1] = encounter.getVitalSigns().getBodyTemperature();
                row[2] = encounter.getVitalSigns().getPulseRate();
                row[3] = encounter.getVitalSigns().getRespirationRate();
                row[4] = encounter.getVitalSigns().getBloodPressure();
                try{
                if(encounter.getVitalSigns().getDoctor() == null) {
                row[5]= "Created By System Admin";
                }else{
                    row[5] = encounter.getVitalSigns().getDoctor().getPerson().getName();
                }
                }catch(Exception e)
                {
                    
                }

                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        loginToContinuePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        deleteVitalBtn = new javax.swing.JButton();
        createVitalBtn = new javax.swing.JButton();
        searchVitalBtn = new javax.swing.JButton();
        updateVitalRecord = new javax.swing.JButton();
        searchByLabel = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        searchTextField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        insuranceIdLabel = new javax.swing.JLabel();
        patientIDLabel = new javax.swing.JLabel();
        patientIDtxtField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderTxtField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        insuranceIdTxtField = new javax.swing.JTextField();
        emailIdLabel = new javax.swing.JLabel();
        emailidTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        saveVariable = new javax.swing.JButton();
        doctorLabel = new javax.swing.JLabel();
        doctorComboBox = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MEDICAL RESOURCE FINDER");

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Logout");
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(479, 479, 479)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296)
                .addComponent(logoutLabel)
                .addGap(211, 211, 211))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(logoutLabel))
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1390, 70));

        jPanel4.setBackground(new java.awt.Color(0, 204, 51));

        jPanel5.setBackground(new java.awt.Color(200, 248, 202));

        jLabel5.setBackground(new java.awt.Color(0, 102, 51));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("WELCOME");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        loginToContinuePanel.setBackground(new java.awt.Color(77, 165, 124));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View All Records");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout loginToContinuePanelLayout = new javax.swing.GroupLayout(loginToContinuePanel);
        loginToContinuePanel.setLayout(loginToContinuePanelLayout);
        loginToContinuePanelLayout.setHorizontalGroup(
            loginToContinuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginToContinuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginToContinuePanelLayout.setVerticalGroup(
            loginToContinuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginToContinuePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginToContinuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginToContinuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 260, 860));

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Age"
            }
        ));
        jScrollPane1.setViewportView(tblRecords);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 1060, 200));

        deleteVitalBtn.setText("Delete Vital Record");
        deleteVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVitalBtnActionPerformed(evt);
            }
        });
        add(deleteVitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 180, -1));

        createVitalBtn.setText("Create Vital Record");
        createVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVitalBtnActionPerformed(evt);
            }
        });
        add(createVitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 180, -1));

        searchVitalBtn.setText("Search Vital Record");
        searchVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVitalBtnActionPerformed(evt);
            }
        });
        add(searchVitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 180, -1));

        updateVitalRecord.setText("Update Vital Record");
        updateVitalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVitalRecordActionPerformed(evt);
            }
        });
        add(updateVitalRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 180, -1));

        searchByLabel.setText("Search By");
        add(searchByLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 130, 30));

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pulse Rate", "Body Temp", "Respiration Rate", "Blood Pressure" }));
        add(searchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 130, -1));

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 220, -1));

        goButton.setText("Search");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        add(goButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, -1, -1));

        insuranceIdLabel.setText("Insurance ID");
        add(insuranceIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 80, 30));

        patientIDLabel.setText("Patient ID:");
        patientIDLabel.setMaximumSize(new java.awt.Dimension(100, 17));
        patientIDLabel.setPreferredSize(new java.awt.Dimension(100, 17));
        add(patientIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 180, 30));
        add(patientIDtxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 150, -1));

        nameLabel.setText("Name");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 190, 30));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 150, -1));
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 150, -1));

        ageLabel.setText("Age");
        add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 180, 30));

        genderLabel.setText("Gender");
        add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 200, 30));
        add(genderTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 150, -1));

        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, 180, 30));
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, 150, -1));
        add(insuranceIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, 150, -1));

        emailIdLabel.setText("Email ID:");
        add(emailIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 80, 30));
        add(emailidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 150, -1));

        phoneNumberLabel.setText("Phone Number:");
        add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 100, 30));
        add(phoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 150, -1));

        saveVariable.setText("SAVE");
        saveVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVariableActionPerformed(evt);
            }
        });
        add(saveVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 740, 80, 30));

        doctorLabel.setText("Doctor");
        add(doctorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 70, -1));

        doctorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(doctorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 430, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMousePressed
        // TODO add your handling code here:

        RbacApplicationContext rbacApplicationContext = RbacApplicationContext.getInstance();
        rbacApplicationContext.setRoleContext(null);
        rbacApplicationContext.setUser(null);
        JOptionPane.showMessageDialog(this, "Logged Out");
        HomeScreenNotDefault homeScreenNotDefault = new HomeScreenNotDefault();
        HomeScreen.homeScreen.getjSplitPane1().setRightComponent(homeScreenNotDefault);
        HomeScreen.homeScreen.getjSplitPane1().setDividerLocation(150);
    }//GEN-LAST:event_logoutLabelMousePressed

    private void deleteVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVitalBtnActionPerformed
        // TODO add your handling code here:
        clearTxtFields();
        makeLabelsDisappear();
        makeTxtFieldsDisappear();
         doctorComboBox.setVisible(false);
        doctorLabel.setVisible(false);
         searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
                 int selectedRowIndex = tblRecords.getSelectedRow();

            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "No Row is selected to Delete, Please Try Again");
                return;
            }
      
            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Encounter encounter = (Encounter) tableModel.getValueAt(selectedRowIndex, 0);
            deleteRecord(encounter);
          
       
       
    }//GEN-LAST:event_deleteVitalBtnActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:

        int userTypeIndex = searchComboBox.getSelectedIndex();
        String txtSearch = searchTextField.getText();

        if(txtSearch.isBlank() || txtSearch.isEmpty() || txtSearch == null)
        {
            JOptionPane.showMessageDialog(this, "Please enter the key for Searching and Try Again");
            return;
        }
        ArrayList<Encounter> encounterList = null;
//Pulse Rate, Body Temp, Respiration Rate, Blood Pressure
        switch (userTypeIndex) {
            case 0:
            encounterList = searchByPulseRate(txtSearch );
            break;
            case 1:
            encounterList = searchByBodyTemp(txtSearch);
            break;
            case 2:
            encounterList = searchByRespRate(txtSearch);
            break;
            case 3:
            encounterList = searchByBloodPressure(txtSearch);
            break;
           
            default:

            break;
        }
        populateTableRecordsWithEncounterHistory(encounterList);
       // populatePatientsTable(patientList);
    }//GEN-LAST:event_goButtonActionPerformed
  private void clearTxtFields()
    {
        patientIDtxtField.setText("");
        nameTxtField.setText("");
        ageTxtField.setText("");
        genderTxtField.setText("");
        addressTextField.setText("");
        insuranceIdTxtField.setText("");
        emailidTextField.setText("");
        phoneNumberTextField.setText("");
    }
    private void saveVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVariableActionPerformed
        // TODO add your handling code here:
        int errorCount = 0;
        int pulseRate =0, respirationRate=0, bodyTemp=0;
        String bloodPressure = null, doctorName = null;
        StringBuffer errorNotifier = new StringBuffer("Please correct the following Errors\n");
        Doctor doctor = null;
        try{
        if(ValidationHelper.isInteger(ageTxtField.getText()))
        {
            pulseRate = Integer.parseInt(ageTxtField.getText());
        }else{
            errorCount++;
            errorNotifier.append(errorCount).append(". Pulse Rate should be of integers\n");

        }
        if(ValidationHelper.isInteger(genderTxtField.getText()))
        {
            respirationRate = Integer.parseInt(genderTxtField.getText());
        }
        else{
            errorCount++;
            errorNotifier.append(errorCount).append(". Respiration Rate should be of integers\n");
        }

        if(ValidationHelper.checkBloodPressure(addressTextField.getText())){
            bloodPressure = addressTextField.getText();
        }else{
            errorCount++;
            errorNotifier.append(errorCount).append(". Blood Pressure Rate should be in proper Format\n");
        }

         
            if(!patientIDtxtField.getText().isBlank() || !patientIDtxtField.getText().isEmpty()){
                bodyTemp = Integer.parseInt(patientIDtxtField.getText());
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Body Temp should be in proper Format\n");

            }
            
            if(doctorName == null)
            {
                doctorName = (String)doctorComboBox.getSelectedItem();
                 doctor = new DoctorDirectory().findDoctorByName(doctorName);
                
            }
        }catch(Exception e)
        {
            
        }
            if (errorCount > 0) {
                JOptionPane.showMessageDialog(this, errorNotifier.toString());
            }else{
                VitalSigns vitalSigns = new VitalSigns(bodyTemp,pulseRate, respirationRate, bloodPressure, null);
                
               
                try {
                    if(saveVariable.getText().equalsIgnoreCase("Update")){
                        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select the Encounter, and try again");
            return;
        }
        Encounter encounter = (Encounter) tblRecords.getValueAt(selectedRowIndex, 0);
        VitalSigns vitalSigns1 = encounter.getVitalSigns();
        vitalSigns1.setBloodPressure(bloodPressure);
        vitalSigns1.setPulseRate(pulseRate);
        vitalSigns1.setBodyTemperature(bodyTemp);
        vitalSigns1.setRespirationRate(respirationRate);
        vitalSigns1.setDoctor(doctor);
        encounter.setVitalSigns(vitalSigns1);
        JOptionPane.showMessageDialog(this, "Vital Record Updated");
        populateTableRecordsWithEncounterHistory();
        clearTxtFields();
        return;
        
                    }else{
                    patient.getEncounterHistory().newEcounter(DateParser.getCurrentDate(), vitalSigns, LocalTime.now());
                    JOptionPane.showMessageDialog(this, "Vital Record Added");
                    }
                } catch (ParseException ex) {
                  
                }
                clearTxtFields();
                populateTableRecordsWithEncounterHistory();
            }
    }//GEN-LAST:event_saveVariableActionPerformed

    private void createVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVitalBtnActionPerformed
        // TODO add your handling code here:
        clearTxtFields();
        doctorComboBox.setVisible(false);
        doctorLabel.setVisible(false);
        searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
         makeLabelsDisappear();
        saveVariable.setVisible(true);
        saveVariable.setText("Save");
       
       
       
        
        patientIDLabel.setText("Body Temperature");
        
        ageLabel.setText("Pulse Rate");
        genderLabel.setText("Respiration Rate");
        addressLabel.setText("Blood Pressure");
        nameTxtField.setText(patient.getPerson().getName());
        patientIDLabel.setVisible(true);
        nameLabel.setVisible(true);
        ageLabel.setVisible(true);
        genderLabel.setVisible(true);
        addressLabel.setVisible(true);
        
        makeVitalTxtFieldsAppear();
    }//GEN-LAST:event_createVitalBtnActionPerformed

    private void updateVitalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVitalRecordActionPerformed
        // TODO add your handling code here:
           // TODO add your handling code here:
          
          int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
         makeLabelsDisappear();
          searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        doctorLabel.setVisible(true);
        doctorComboBox.setVisible(true);
        goButton.setVisible(false);
        
            Encounter encounter = (Encounter) tblRecords.getValueAt(selectedRowIndex, 0);
            
          
           
           
        saveVariable.setVisible(true);
        saveVariable.setText("Update");
       
       
       
        
        patientIDLabel.setText("Body Temperature");
        patientIDtxtField.setText(String.valueOf(encounter.getVitalSigns().getBodyTemperature()));
        ageLabel.setText("Pulse Rate");
        ageTxtField.setText(String.valueOf(encounter.getVitalSigns().getPulseRate()));
        genderLabel.setText("Respiration Rate");
        genderTxtField.setText(String.valueOf(encounter.getVitalSigns().getRespirationRate()));
        addressLabel.setText("Blood Pressure");
        addressTextField.setText(encounter.getVitalSigns().getBloodPressure());
        nameTxtField.setText(patient.getPerson().getName());
        patientIDLabel.setVisible(true);
        nameLabel.setVisible(true);
        ageLabel.setVisible(true);
        genderLabel.setVisible(true);
        addressLabel.setVisible(true);
        makeVitalTxtFieldsAppear();
        populateJComboBox(encounter);
        
        
        
        
      
        
            
            
 
    }//GEN-LAST:event_updateVitalRecordActionPerformed

    private void searchVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVitalBtnActionPerformed
        // TODO add your handling code here:
         makeLabelsDisappear();
        makeTxtFieldsDisappear();
         doctorComboBox.setVisible(false);
        doctorLabel.setVisible(false);
        searchByLabel.setVisible(true);
        searchTextField.setVisible(true);
        goButton.setVisible(true);
        searchComboBox.setVisible(true);
       
    }//GEN-LAST:event_searchVitalBtnActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        populateTableRecordsWithEncounterHistory();
    }//GEN-LAST:event_jLabel1MousePressed
 private void makeVitalTxtFieldsAppear()
    {
         patientIDtxtField.setVisible(true);
        nameTxtField.setVisible(true);
        ageTxtField.setVisible(true);
        genderTxtField.setVisible(true);
        addressTextField.setVisible(true);
        insuranceIdTxtField.setVisible(false);
        emailidTextField.setVisible(false);
        phoneNumberTextField.setVisible(false);
    }     
    public void makeLabelsDisappear()
    {
        searchComboBox.setVisible(false);
       searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
        patientIDLabel.setVisible(false);
        nameLabel.setVisible(false);
        ageLabel.setVisible(false);
        genderLabel.setVisible(false);
        addressLabel.setVisible(false);
        insuranceIdLabel.setVisible(false);
        emailIdLabel.setVisible(false);
        phoneNumberLabel.setVisible(false);
        doctorLabel.setVisible(false);
       
        saveVariable.setVisible(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton createVitalBtn;
    private javax.swing.JButton deleteVitalBtn;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel emailIdLabel;
    private javax.swing.JTextField emailidTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel insuranceIdLabel;
    private javax.swing.JTextField insuranceIdTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel loginToContinuePanel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JTextField patientIDtxtField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton saveVariable;
    private javax.swing.JLabel searchByLabel;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton searchVitalBtn;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton updateVitalRecord;
    // End of variables declaration//GEN-END:variables

    private void deleteRecord(Encounter encounter) {
       this.patient.getEncounterHistoryList().remove(encounter);
       populateTableRecordsWithEncounterHistory();
    }

    private ArrayList<Encounter> searchByPulseRate(String txtSearch) {
        ArrayList<Encounter> result = new ArrayList<>();
    for(Encounter e : this.patient.getEncounterHistoryList())
    {
        if(e.getVitalSigns().getPulseRate() == Integer.parseInt(txtSearch))
        {
            result.add(e);
        }
    }
    return result;
    }

    private ArrayList<Encounter> searchByBodyTemp(String txtSearch) {
        ArrayList<Encounter> result = new ArrayList<>();
    for(Encounter e : this.patient.getEncounterHistoryList())
    {
        if(e.getVitalSigns().getBodyTemperature() == Integer.parseInt(txtSearch))
        {
            result.add(e);
        }
    }
    return result;
    }

    private ArrayList<Encounter> searchByRespRate(String txtSearch) {
       
         ArrayList<Encounter> result = new ArrayList<>();
    for(Encounter e : this.patient.getEncounterHistoryList())
    {
        if(e.getVitalSigns().getRespirationRate() == Integer.parseInt(txtSearch))
        {
            result.add(e);
        }
    }
    return result;
    }

    private ArrayList<Encounter> searchByBloodPressure(String txtSearch) {
        ArrayList<Encounter> result = new ArrayList<>();
    for(Encounter e : this.patient.getEncounterHistoryList())
    {
        if(e.getVitalSigns().getBloodPressure().equalsIgnoreCase(txtSearch))
        {
            result.add(e);
        }
    }
    return result;
    }

    private void populateTableRecordsWithEncounterHistory(ArrayList<Encounter> encounterList) {
      DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
     
        tableModel.setColumnCount(0);
        tableModel.addColumn("Date");
        tableModel.addColumn("Body Temp");
        tableModel.addColumn("Pulse Rate");
        tableModel.addColumn("Respiration Rate");
        tableModel.addColumn("Blood Pressure");
        tableModel.addColumn("Doctor Name");
       
      
        tableModel.setRowCount(0);
        
        try {
            for (Encounter  encounter : encounterList) {

                Object[] row = new Object[6];
                row[0] = encounter;
                row[1] = encounter.getVitalSigns().getBodyTemperature();
                row[2] = encounter.getVitalSigns().getPulseRate();
                row[3] = encounter.getVitalSigns().getRespirationRate();
                row[4] = encounter.getVitalSigns().getBloodPressure();
               if(encounter.getVitalSigns().getDoctor() == null )
               {
                   row[5]=  "Created by System Admin";
               }else{
                row[5]=  encounter.getVitalSigns().getDoctor().getPerson().getName();
                   }
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
        
    }

    private void populateJComboBox(Encounter encounter) {
     doctorComboBox.removeAllItems();
      String name = encounter.getVitalSigns().getDoctor().getPerson().getName();
     doctorComboBox.addItem(name);
     for(Doctor doctor : DoctorDirectory.doctorList)
     {
         if(!doctor.getPerson().getName().equals(name))
         {
           doctorComboBox.addItem(doctor.getPerson().getName());
         }
     }
    }
}
