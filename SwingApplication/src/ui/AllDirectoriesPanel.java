/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import doctor.Doctor;
import doctor.DoctorDirectory;
import hospital.Hospital;
import hospital.HospitalDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import patient.Patient;
import patient.PatientDirectory;
import person.Person;
import person.PersonDirectory;
import rbac.context.RbacApplicationContext;
import ui.crud.panels.HospitalCrud;
import ui.crud.panels.PatientCrud;
import ui.crud.panels.ResetCredentials;

/**
 *
 * @author rohitpanicker
 */
public class AllDirectoriesPanel extends javax.swing.JPanel {

    /**
     * Creates new form AllDirectories
     */
    public AllDirectoriesPanel() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnHospitalDirectory = new javax.swing.JButton();
        btnPatientDirectory = new javax.swing.JButton();
        btnDoctorDirectory = new javax.swing.JButton();
        allPersonsBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        viewRecordBtn = new javax.swing.JButton();
        deleteRecordBtn = new javax.swing.JButton();
        createRecordBtn = new javax.swing.JButton();
        updateRecordBtn = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
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

        btnHospitalDirectory.setText("Hospital Directory");
        btnHospitalDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalDirectoryActionPerformed(evt);
            }
        });

        btnPatientDirectory.setText("Patient Directory");
        btnPatientDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDirectoryActionPerformed(evt);
            }
        });

        btnDoctorDirectory.setText("Doctor Directory");
        btnDoctorDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorDirectoryActionPerformed(evt);
            }
        });

        allPersonsBtn.setText("All Registered Users");
        allPersonsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPersonsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHospitalDirectory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(allPersonsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnPatientDirectory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnDoctorDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244)
                .addComponent(btnHospitalDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(allPersonsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(btnPatientDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(661, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(248, 248, 248)
                    .addComponent(btnDoctorDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(572, Short.MAX_VALUE)))
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 1060, 260));

        viewRecordBtn.setText("View Patient Details");
        viewRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordBtnActionPerformed(evt);
            }
        });
        add(viewRecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 200, 30));

        deleteRecordBtn.setText("Delete Patient Record");
        deleteRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordBtnActionPerformed(evt);
            }
        });
        add(deleteRecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 200, 30));

        createRecordBtn.setText("Create New Patient");
        createRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRecordBtnActionPerformed(evt);
            }
        });
        add(createRecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 170, 30));

        updateRecordBtn.setText("Update Patient Details");
        updateRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordBtnActionPerformed(evt);
            }
        });
        add(updateRecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalDirectoryActionPerformed
      
     createRecordBtn.setText("Create New Hospital");
        viewRecordBtn.setText("View Hospital Details");
        updateRecordBtn.setText("Update Hospital Details");
        deleteRecordBtn.setText("Delete Hospital Record");   
    populateAndFillHospitalRecord();
    
    }//GEN-LAST:event_btnHospitalDirectoryActionPerformed
private void populateAndFillHospitalRecord(){
    DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        HospitalDirectory hospitalDirectory = new HospitalDirectory();
        
          
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Doctor Count");
        tableModel.addColumn("Community Name");
        tableModel.addColumn("Zip Code");
        
        
      
       
        
        
        try {
            for (Hospital  hospital : hospitalDirectory.getHospitalList()) {

                Object[] row = new Object[5];
                row[0] = hospital;
                row[1] = hospital.getHospitalName();
                row[2] = hospital.getDoctorList().size();
                row[3] = hospital.getCommunity().getCommunityName();
                row[4] = hospital.getCommunity().getZipCode();
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

}
    private void btnPatientDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDirectoryActionPerformed
        // TODO add your handling code here:
        createRecordBtn.setText("Create New Patient");
        viewRecordBtn.setText("View Patient Details");
        updateRecordBtn.setText("Update Patient Details");
        deleteRecordBtn.setText("Delete Patient");
        populateAndFillPatientRecordsTable();
       
    }//GEN-LAST:event_btnPatientDirectoryActionPerformed
   
       private void populateAndFillPatientRecordsTable() {
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
      
         JTableHeader th = tblRecords.getTableHeader();
         
         tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
        tableModel.addColumn("Hospital");
        
         
         
         
       
        try {
            for (Patient  patient : PatientDirectory.patientList) {

                Object[] row = new Object[5];
                row[0] = patient;
                row[1] = patient.getPerson().getName();
                row[2] = patient.getPerson().getGender();
                row[3] = patient.getPerson().getAge();
                row[4] = patient.getHospital().getHospitalName();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

    }
    private void btnDoctorDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorDirectoryActionPerformed
        // TODO add your handling code here:
        createRecordBtn.setText("Create New Doctor");
        viewRecordBtn.setText("View Doctor Record");
        updateRecordBtn.setText("Update Doctor Record");
        deleteRecordBtn.setText("Delete Doctor Record");
        populateDoctorDirectoryTable();
        
    }//GEN-LAST:event_btnDoctorDirectoryActionPerformed

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

    private void createRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRecordBtnActionPerformed
        // TODO add your handling code here:
        
        String txt = createRecordBtn.getText();
        if(txt.contains("Patient"))
        {
            PatientCrud patientCrud = new PatientCrud("cp");
            HomeScreen.homeScreen.getjSplitPane1().setRightComponent(patientCrud);
        }else if(txt.contains("Doctor")){
            PatientCrud patientCrud = new PatientCrud("cd");
            HomeScreen.homeScreen.getjSplitPane1().setRightComponent(patientCrud);   
    }else if (txt.contains("Hospital"))
    {
        HospitalCrud hospitalCrud = new HospitalCrud("create");
            HomeScreen.homeScreen.getjSplitPane1().setRightComponent(hospitalCrud); 
    }else if(txt.contains("Reset"))
    {
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        
        
        Person person = (Person) tblRecords.getValueAt(selectedRowIndex, 0);
        ResetCredentials resetCredentials = new ResetCredentials(person);
        HomeScreen.homeScreen.getjSplitPane1().setRightComponent(resetCredentials);
    }
        
    }//GEN-LAST:event_createRecordBtnActionPerformed

    private void viewRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordBtnActionPerformed
        // TODO add your handling code here:
        String txt = viewRecordBtn.getText();
         int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        
         if(txt.contains("Patient"))
        {   
            
        Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        
            PatientCrud patientCrud = new PatientCrud(patient, "pv");
            HomeScreen.homeScreen.getjSplitPane1().setRightComponent(patientCrud);
        }else if(txt.contains("Doctor")){
             
            Doctor doctor = (Doctor) tblRecords.getValueAt(selectedRowIndex, 0);
            PatientCrud patientCrud = new PatientCrud(doctor, "dv");
            HomeScreen.homeScreen.getjSplitPane1().setRightComponent(patientCrud);
        
    }else if(txt.contains("Hospital"))
    {
         Hospital hospital = (Hospital) tblRecords.getValueAt(selectedRowIndex, 0);
         HospitalCrud hospitalCrud = new HospitalCrud(hospital,"populate");
          HomeScreen.homeScreen.getjSplitPane1().setRightComponent(hospitalCrud);
         
    }
    }//GEN-LAST:event_viewRecordBtnActionPerformed

    private void updateRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordBtnActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        String txt = updateRecordBtn.getText();
          int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        
         if(txt.contains("Patient"))
        {   
            Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        
            PatientCrud patientCrud = new PatientCrud(patient, "pu");
            HomeScreen.homeScreen.getjSplitPane1().setRightComponent(patientCrud);
        }else if (txt.contains("Doctor")){
         Doctor doctor = (Doctor) tblRecords.getValueAt(selectedRowIndex, 0);
            PatientCrud patientCrud = new PatientCrud(doctor, "du");
            HomeScreen.homeScreen.getjSplitPane1().setRightComponent(patientCrud);
    }else if (txt.contains("Hospital"))
    {
         Hospital hospital = (Hospital) tblRecords.getValueAt(selectedRowIndex, 0);
            HospitalCrud hospitalCrud = new HospitalCrud(hospital, "update");
            HomeScreen.homeScreen.getjSplitPane1().setRightComponent(hospitalCrud);
    }
    }//GEN-LAST:event_updateRecordBtnActionPerformed

    private void deleteRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordBtnActionPerformed
        // TODO add your handling code here:
        
        String txt = deleteRecordBtn.getText();
         int selectedRowIndex = tblRecords.getSelectedRow();

            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "No Row is selected to Delete, Please Try Again");
                return;
            }
        if(txt.contains("Patient")){
        
           
            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Patient patient = (Patient) tableModel.getValueAt(selectedRowIndex, 0);
            deleteRecord(patient);
          
       
        }
        else if (txt.contains("Doctor")){
             DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Doctor doctor = (Doctor) tableModel.getValueAt(selectedRowIndex, 0);
            deleteDoctorRecord(doctor);
            
        }else if (txt.contains("Hospital")){
             DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Hospital hospital = (Hospital) tableModel.getValueAt(selectedRowIndex, 0);
            deleteHospitalRecord(hospital);
        }
    }//GEN-LAST:event_deleteRecordBtnActionPerformed
   private void hideButtons(boolean value)
   {
       createRecordBtn.setVisible(value);
       viewRecordBtn.setVisible(value);
       updateRecordBtn.setVisible(value);
       deleteRecordBtn.setVisible(value);
   }
    private void allPersonsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPersonsBtnActionPerformed
        // TODO add your handling code here:
        hideButtons(false);
        createRecordBtn.setVisible(true);
        createRecordBtn.setText("Reset Credentials");
        
        populateAllPersons(PersonDirectory.personList);
    }//GEN-LAST:event_allPersonsBtnActionPerformed
   private void deleteHospitalRecord(Hospital hospital)
   {
       HospitalDirectory.hospitalList.remove(hospital);
       JOptionPane.showMessageDialog(this, "Record deleted successfully");
       populateAndFillHospitalRecord();
   }
    private void deleteDoctorRecord(Doctor doctor)
    {
      DoctorDirectory.doctorList.remove(doctor); 
       JOptionPane.showMessageDialog(this, "Record deleted successfully");
       populateDoctorDirectoryTable();
    }
    
    private void deleteRecord(Patient patient){
    PatientDirectory.patientList.remove(patient);

        JOptionPane.showMessageDialog(this, "Record deleted successfully");
        populateAndFillPatientRecordsTable();
}
    
    private void populateDoctorDirectoryTable()
    {
          
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
          tableModel.setRowCount(0);
       
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Doctor Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("Hospital");
        
       
      
       
        DoctorDirectory doctorDirectory = new DoctorDirectory();
        try {
            for (Doctor  doctor : doctorDirectory.getDoctorList()) {

                Object[] row = new Object[4];
                row[0] = doctor;
                row[1] = doctor.getPerson().getName();
                row[2] = doctor.getPerson().getAge();
                row[3] = doctor.getHospital().getHospitalName();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
        
        
    
    }                 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allPersonsBtn;
    private javax.swing.JButton btnDoctorDirectory;
    private javax.swing.JButton btnHospitalDirectory;
    private javax.swing.JButton btnPatientDirectory;
    private javax.swing.JButton createRecordBtn;
    private javax.swing.JButton deleteRecordBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton updateRecordBtn;
    private javax.swing.JButton viewRecordBtn;
    // End of variables declaration//GEN-END:variables

    private void populateAllPersons(ArrayList<Person> personList) {
          
       
     
     
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
         tableModel.setRowCount(0);
         tableModel.setColumnCount(0);
         
           tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
       
      
       
        tableModel.setRowCount(0);
        try {
            for (Person  person : personList) {

                Object[] row = new Object[4];
                row[0] = person;
                row[1] = person.getName();
                row[2] = person.getGender();
                row[3] = person.getAge();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
     
    }
}
