/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import doctor.Doctor;
import doctor.DoctorDirectory;
import encounter.Encounter;
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
import rbac.application.user.User;
import rbac.context.RbacApplicationContext;

/**
 *
 * @author rohitpanicker
 */
public class PatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanel
     */
    public PatientPanel() {
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
        btnNearbyHospitals = new javax.swing.JButton();
        btnViewDoctors = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();

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
                .addGap(345, 345, 345)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
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

        btnNearbyHospitals.setText("View Nearby Hospitals");
        btnNearbyHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNearbyHospitalsActionPerformed(evt);
            }
        });

        btnViewDoctors.setText("View Doctors ");
        btnViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNearbyHospitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnViewDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnNearbyHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnViewDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 1060, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorsActionPerformed
        // TODO add your handling code here:
          int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        Hospital hospital = (Hospital) tblRecords.getValueAt(selectedRowIndex, 0);
        populateTableRecordsWithEncounterHistory(hospital);
    }                                                      
    private void populateTableRecordsWithEncounterHistory(Hospital hospital)
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
        //tableModel.addColumn("Blood Pressure");
        //tableModel.addColumn("Doctor Name");
         JTableHeader th = tblRecords.getTableHeader();
         TableColumnModel tcm = th.getColumnModel();
         TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue( "ID" );
        TableColumn tc_one = tcm.getColumn(1);
        tc_one.setHeaderValue("Doctor Name");
        //TableColumn tc_two = tcm.getColumn(2);
       // tc_two.setHeaderValue("Pulse Rate");
       // TableColumn tc_three = tcm.getColumn(3);
        //tc_three.setHeaderValue("Respiration Rate");
       
        
        th.repaint();
        tableModel.setRowCount(0);
        DoctorDirectory doctorDirectory = hospital.getDoctorDirectory();
        try {
            for (Doctor  doctor : doctorDirectory.getDoctorList()) {

                Object[] row = new Object[2];
                row[0] = doctor;
                row[1] = doctor.getPerson().getName();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
        
        
    
    }//GEN-LAST:event_btnViewDoctorsActionPerformed

    private void btnNearbyHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNearbyHospitalsActionPerformed
        // TODO add your handling code here:
        User user = getLoggedInUser();
        String city = user.getPerson().getResidence().getCommunity().getCity().getName();
        String zipcode = user.getPerson().getResidence().getCommunity().getZipCode();
        HospitalDirectory hospitalDirectory = new HospitalDirectory();
        ArrayList<Hospital> nearbyHospital = searchNearbyHospitalsByCity(city, hospitalDirectory);
        populateNearbyHospitalsTable(nearbyHospital);
        
        
    }//GEN-LAST:event_btnNearbyHospitalsActionPerformed
    private void populateNearbyHospitalsTable(ArrayList<Hospital> nearbyHospitalList)
    {
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
      
         JTableHeader th = tblRecords.getTableHeader();
         TableColumnModel tcm = th.getColumnModel();
         TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue( "ID" );
        TableColumn tc_one = tcm.getColumn(1);
        tc_one.setHeaderValue("Hospital Name");
        TableColumn tc_two = tcm.getColumn(2);
        tc_two.setHeaderValue("Community Name");
        th.repaint();
        tableModel.setRowCount(0);
        
        
        try {
            for (Hospital  hospital : nearbyHospitalList) {

                Object[] row = new Object[3];
                row[0] = hospital;
                row[1] = hospital.getHospitalName();
                row[2] = hospital.getCommunity().getCommunityName();
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

    }
    
    private ArrayList<Hospital> searchNearbyHospitalsByCity(String city, HospitalDirectory hospitalDirectory)
    {   
        ArrayList<Hospital> result = new ArrayList<Hospital>();
        for(Hospital hospital : hospitalDirectory.getHospitalList())
        {
            if(hospital.getCommunity().getCity().getName().equalsIgnoreCase(city))
            {
                result.add(hospital);
            }else{
                continue;
            }
        }
        return result;
        
    }
    
    private User getLoggedInUser()
    {
        User user = RbacApplicationContext.getInstance().getUser();
        return user;
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNearbyHospitals;
    private javax.swing.JButton btnViewDoctors;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTable tblRecords;
    // End of variables declaration//GEN-END:variables
}
