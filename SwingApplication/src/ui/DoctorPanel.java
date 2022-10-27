/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import encounter.Encounter;
import encounter.EncounterHistory;
import hospital.Hospital;
import hospital.HospitalDirectory;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import patient.PatientDirectory;
import rbac.context.RbacApplicationContext;
import patient.Patient;
import utility.DateParser;
import utility.ValidationHelper;
import vitalSigns.VitalSigns;

/**
 *
 * @author rohitpanicker
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel
     */
    public DoctorPanel() {
        initComponents();
        searchComboBox.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
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
        
    }
    
    private void makeAllTxtFieldsAppear()
    {
         patientIDtxtField.setVisible(true);
        nameTxtField.setVisible(true);
        ageTxtField.setVisible(true);
        genderTxtField.setVisible(true);
        addressTextField.setVisible(true);
        insuranceIdTxtField.setVisible(true);
        emailidTextField.setVisible(true);
        phoneNumberTextField.setVisible(true);
        
    }
    
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
    
    
     private void populateAndFillRecordsTable() {
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();

        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
        /* JTableHeader th = tblRecords.getTableHeader();
         TableColumnModel tcm = th.getColumnModel();
         TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue( "ID" );
        TableColumn tc_one = tcm.getColumn(1);
        tc_one.setHeaderValue("Name");
        TableColumn tc_two = tcm.getColumn(2);
        tc_two.setHeaderValue("Gender");
        TableColumn tc_three = tcm.getColumn(3);
        tc_three.setHeaderValue("Age");*/
        try{
        TableColumn tableColumn = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn);
        
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 4");
        }
        
        try{
        TableColumn tableColumn_two = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn_two);
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 5");
        }
       // th.repaint();
        tableModel.setRowCount(0);
        try {
            for (Patient  patient : PatientDirectory.patientList) {

                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getPerson().getName();
                row[2] = patient.getPerson().getGender();
                row[3] = patient.getPerson().getAge();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

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
        enterVitalRecordLabel.setVisible(false);
        saveVariable.setVisible(false);

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
        jButton2 = new javax.swing.JButton();
        encounterHistoryButton = new javax.swing.JButton();
        btnViewPatientDetails = new javax.swing.JButton();
        viewAllPatientsButton = new javax.swing.JButton();
        recordEncounterButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        patientIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        insuranceIdLabel = new javax.swing.JLabel();
        emailIdLabel = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        searchTextField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        enterVitalRecordLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        patientIDtxtField = new javax.swing.JTextField();
        nameTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        genderTxtField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        insuranceIdTxtField = new javax.swing.JTextField();
        emailidTextField = new javax.swing.JTextField();
        saveVariable = new javax.swing.JButton();
        searchByLabel = new javax.swing.JLabel();

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
                .addContainerGap(516, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButton2.setText("Search Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        encounterHistoryButton.setText("Encounter History");
        encounterHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterHistoryButtonActionPerformed(evt);
            }
        });

        btnViewPatientDetails.setText("View Patient Details");
        btnViewPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientDetailsActionPerformed(evt);
            }
        });

        viewAllPatientsButton.setText("View All Patients");
        viewAllPatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllPatientsButtonActionPerformed(evt);
            }
        });

        recordEncounterButton.setText("Record Encounter");
        recordEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordEncounterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(encounterHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnViewPatientDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewAllPatientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recordEncounterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(encounterHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnViewPatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(viewAllPatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(recordEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        patientIDLabel.setText("Patient ID:");
        patientIDLabel.setMaximumSize(new java.awt.Dimension(100, 17));
        patientIDLabel.setPreferredSize(new java.awt.Dimension(100, 17));
        add(patientIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 180, 30));

        nameLabel.setText("Name");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 190, 30));

        ageLabel.setText("Age");
        add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 180, 30));

        phoneNumberLabel.setText("Phone Number:");
        add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 100, 30));

        genderLabel.setText("Gender");
        add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 200, 30));

        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, 180, 30));

        insuranceIdLabel.setText("Insurance ID");
        add(insuranceIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 80, 30));

        emailIdLabel.setText("Email ID:");
        add(emailIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 80, 30));

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Insurance ID", "Mobile Number", "Age" }));
        add(searchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 130, -1));

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 220, -1));

        goButton.setText("Search");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        add(goButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 310, -1, -1));

        enterVitalRecordLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        enterVitalRecordLabel.setText("Enter Vital Record");
        add(enterVitalRecordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 240, 70));
        add(phoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 150, -1));
        add(patientIDtxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 150, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 150, -1));
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 150, -1));
        add(genderTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 150, -1));
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, 150, -1));
        add(insuranceIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 150, -1));
        add(emailidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, 150, -1));

        saveVariable.setText("SAVE");
        saveVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVariableActionPerformed(evt);
            }
        });
        add(saveVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 740, 80, 30));

        searchByLabel.setText("Search By");
        add(searchByLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        makeLabelsDisappear();
        makeTxtFieldsDisappear();
        searchComboBox.setVisible(true);
        searchTextField.setVisible(true);
        searchByLabel.setVisible(true);
        goButton.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void encounterHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterHistoryButtonActionPerformed
        // TODO add your handling code here:
        disappearVitalLabels();
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        populateTableRecordsWithEncounterHistory(patient);
    }//GEN-LAST:event_encounterHistoryButtonActionPerformed
    private void populateTableRecordsWithEncounterHistory(Patient patient)
    {
        
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
         try{
        TableColumn tableColumn = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn);
        
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 4");
        }
        
        try{
        TableColumn tableColumn_two = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn_two);
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 5");
        }
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
                row[5]= encounter.getVitalSigns().getBloodPressure(); //toBeDone
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
        
        
    }
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
        ArrayList<Patient> patientList = null;
       
        
        switch (userTypeIndex) {
                case 0:
                    patientList = searchById(txtSearch );
                    break;
                case 1:
                    patientList = searchByName(txtSearch);
                    break;
                case 2:
                    patientList = searchByInsuranceID(txtSearch);
                    break;
                case 3:
                    patientList = searchByMobileNumber(txtSearch);
                    break;
                case 4:
                    patientList = searchByAge(txtSearch);
                    break;
               
                   
                default:
                    
                    break;
            }
        
         populatePatientsTable(patientList);
    }//GEN-LAST:event_goButtonActionPerformed
    private void populatePatientsTable(ArrayList<Patient> patientList)
    {
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();

        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
       
        try{
        TableColumn tableColumn = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn);
        
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 4");
        }
        
        try{
        TableColumn tableColumn_two = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn_two);
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 5");
        }
       // th.repaint();
        tableModel.setRowCount(0);
        try {
            for (Patient  patient : patientList) {

                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getPerson().getName();
                row[2] = patient.getPerson().getGender();
                row[3] = patient.getPerson().getAge();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

    
    }
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

    private void btnViewPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientDetailsActionPerformed
        // TODO add your handling code here:
        
        searchComboBox.setVisible(false);
        searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
        patientIDLabel.setVisible(true);
        nameLabel.setVisible(true);
        ageLabel.setVisible(true);
        genderLabel.setVisible(true);
        addressLabel.setVisible(true);
        insuranceIdLabel.setVisible(true);
        emailIdLabel.setVisible(true);
        phoneNumberLabel.setVisible(true);
        makeAllTxtFieldsAppear();
        
        DefaultTableModel tableModel = (DefaultTableModel)tblRecords.getModel();
         int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        patientIDtxtField.setText(patient.getPerson().getId());
        nameTxtField.setText(patient.getPerson().getName());
        ageTxtField.setText(String.valueOf(patient.getPerson().getAge()));
       genderTxtField.setText(patient.getPerson().getGender());
       try{
       String address = patient.getPerson().getResidence().getBuildingNumber() + " #" + patient.getPerson().getResidence().getApartmentNumber() + " " + patient.getPerson().getResidence().getCommunity().getCommunityName() + " " + 
                        patient.getPerson().getResidence().getCommunity().getLocation() + " " + patient.getPerson().getResidence().getCommunity().getCity() + " " + patient.getPerson().getResidence().getCommunity().getCity();
       
       addressTextField.setText(address);
       
       }catch(Exception e)
       {
           
       }
       insuranceIdTxtField.setText(String.valueOf(patient.getInsuranceId()));
       emailidTextField.setText(patient.getPerson().getEmailid());
       phoneNumberTextField.setText(String.valueOf(patient.getPerson().getPhoneNumber()));
       
        
               
        
        
        
        
    }//GEN-LAST:event_btnViewPatientDetailsActionPerformed
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
    private void viewAllPatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllPatientsButtonActionPerformed
        // TODO add your handling code here:
        disappearVitalLabels();
        searchByLabel.setVisible(false);
        makeTxtFieldsDisappear();
         populateAndFillRecordsTable();
    }//GEN-LAST:event_viewAllPatientsButtonActionPerformed
    private void disappearVitalLabels(){
       enterVitalRecordLabel.setVisible(false);
       searchByLabel.setVisible(false);
       searchComboBox.setVisible(false);
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
        enterVitalRecordLabel.setVisible(false);
        saveVariable.setVisible(false);
       
    }
    private void recordEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordEncounterButtonActionPerformed
        // TODO add your handling code here:
        makeLabelsDisappear();
        saveVariable.setVisible(true);
        enterVitalRecordLabel.setVisible(true);
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        
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
        
        
    }//GEN-LAST:event_recordEncounterButtonActionPerformed

    private void saveVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVariableActionPerformed
        // TODO add your handling code here:
         int errorCount = 0;
         int pulseRate =0, respirationRate=0, bodyTemp=0;
         String bloodPressure = null;
        StringBuffer errorNotifier = new StringBuffer("Please correct the following Errors\n");
        
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
        
        if(ValidationHelper.checkBodyTemp(patientIDtxtField.getText())){
         bodyTemp = Integer.parseInt(patientIDtxtField.getText());
        }else{
            errorCount++;
            errorNotifier.append(errorCount).append(". Body Temp should be in proper Format\n");
        
        }
        if (errorCount > 0) {
                JOptionPane.showMessageDialog(this, errorNotifier.toString());
        }else{
        VitalSigns vitalSigns = new VitalSigns(bodyTemp,pulseRate, respirationRate, bloodPressure, null);
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select the Patient, and try again");
            return;
        }
        Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        try {
            patient.getEncounterHistory().newEcounter(DateParser.getCurrentDate(), vitalSigns, LocalTime.now());
            JOptionPane.showMessageDialog(this, "Vital Record Added");
        } catch (ParseException ex) {
            Logger.getLogger(DoctorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearTxtFields();
        }
    }//GEN-LAST:event_saveVariableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton btnViewPatientDetails;
    private javax.swing.JLabel emailIdLabel;
    private javax.swing.JTextField emailidTextField;
    private javax.swing.JButton encounterHistoryButton;
    private javax.swing.JLabel enterVitalRecordLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel insuranceIdLabel;
    private javax.swing.JTextField insuranceIdTxtField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JTextField patientIDtxtField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton recordEncounterButton;
    private javax.swing.JButton saveVariable;
    private javax.swing.JLabel searchByLabel;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton viewAllPatientsButton;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Patient> searchById(String id) {
       
        ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getPerson().getId().equals(id))
            {
                patientResult.add(patient);
                return patientResult;
            }
        }
        
        return patientResult;
    }

    private ArrayList<Patient> searchByName(String name) {
       ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getPerson().getName().contains(name))
            {
                patientResult.add(patient);
                
            }
        }
        
        return patientResult;
    }

    private ArrayList<Patient> searchByInsuranceID(String insuranceId) {
         
         ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getInsuranceId() == Integer.parseInt(insuranceId))
            {
                patientResult.add(patient);
                return patientResult;
                
            }
        }
        
        return patientResult;
        
    }

    private ArrayList<Patient> searchByMobileNumber(String mobileNumber) {
          ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getPerson().getPhoneNumber()== Long.parseLong(mobileNumber))
            {
                patientResult.add(patient);
               
                
            }
        }
        
        return patientResult;
    }

    private ArrayList<Patient> searchByAge(String age) {
        ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getPerson().getAge()== Integer.parseInt(age))
            {
                patientResult.add(patient);
               
                
            }
        }
        
        return patientResult;
    }
}
