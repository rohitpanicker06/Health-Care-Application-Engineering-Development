/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.crud.panels;

import doctor.Doctor;
import doctor.DoctorDirectory;
import house.House;
import javax.swing.JOptionPane;
import patient.Patient;
import patient.PatientDirectory;
import person.Person;
import rbac.context.RbacApplicationContext;
import rbac.roles.roleInterface.SystemAdminRoleInterface;
import ui.HomeScreen;
import ui.HomeScreenNotDefault;
import us.state.city.City;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class PatientCrud extends javax.swing.JPanel {

    
    private Patient patient ;
    private String operation;
    private Doctor doctor;
    
    public PatientCrud(Doctor doctor, String operation)
    {
        this.doctor = doctor;
        this.operation = operation;
        initComponents();
         insuranceIdLabel.setVisible(false);
            insuranceIdTxtField.setVisible(false);
        
         populateDoctorCrudFields();
         if(operation.equals("du"))
        {   
            createPatientBtn.setText("Update");
            createPatientBtn.setVisible(true);
        }
        
        
    }
     private void populateDoctorCrudFields(){
         createPatientBtn.setVisible(false);
         insuranceIdLabel.setVisible(false);
         insuranceIdTxtField.setVisible(false);
        idTxtField.setText(doctor.getPerson().getId());
        nameTxtField.setText(doctor.getPerson().getName());
        emailIdTxtField.setText(doctor.getPerson().getEmailid());
        phnNumberTxtField.setText(String.valueOf(doctor.getPerson().getPhoneNumber()));
        cityTxtField.setText(doctor.getPerson().getResidence().getCommunity().getCity().getName());
        stateTxtField.setText(doctor.getPerson().getResidence().getCommunity().getCity().getState());
        countryTxtField.setText(doctor.getPerson().getResidence().getCommunity().getCity().getCountry());
        genderTxtField.setText(doctor.getPerson().getGender());
        ageTxtField.setText(String.valueOf(doctor.getPerson().getAge()));
        //insuranceIdTxtField.setText(String.valueOf(doctor.getInsuranceId()));
        communityNameTxtField.setText(doctor.getPerson().getResidence().getCommunity().getCommunityName());
        zipCodeTxtField.setText(doctor.getPerson().getResidence().getCommunity().getZipCode());
        addressTxtField.setText(doctor.getPerson().getResidence().getCommunity().getLocation());
         
     }
     
     
     public PatientCrud(String operation)
     {
         this.operation = operation;
         
         initComponents();
         
         if(operation.contains("cd")){
         try{
             insuranceIdLabel.setText("");
             insuranceIdLabel.setVisible(false);
         insuranceIdTxtField.setText("");
         insuranceIdTxtField.setVisible(false);
         }catch(Exception e)
         {
             System.out.println(e.getMessage()); 
         }
         }
     }
    
    public PatientCrud(Patient patient, String operation)
    {
        this.patient = patient;
        this.operation = operation;
        initComponents();
        populatePatinetCrudFields();
        if(operation.equals("pv")){
        
        }
        else if(operation.equals("pu"))
        {
            createPatientBtn.setText("Update");
            createPatientBtn.setVisible(true);
        }
    }
    /**
     * Creates new form PatientCrud
     * 
     */
    public PatientCrud() {
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
        loginToContinuePanel = new javax.swing.JPanel();
        insuranceIdLabel = new javax.swing.JLabel();
        personNameLabel = new javax.swing.JLabel();
        emailIdPersonLabel = new javax.swing.JLabel();
        phonePersonalLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        insuranceIdTxtField = new javax.swing.JTextField();
        addressTxtField = new javax.swing.JTextField();
        nameTxtField = new javax.swing.JTextField();
        emailIdTxtField = new javax.swing.JTextField();
        phnNumberTxtField = new javax.swing.JTextField();
        cityTxtField = new javax.swing.JTextField();
        stateTxtField = new javax.swing.JTextField();
        countryTxtField = new javax.swing.JTextField();
        genderTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        createPatientBtn = new javax.swing.JButton();
        personIdLabel1 = new javax.swing.JLabel();
        idTxtField = new javax.swing.JTextField();
        communityNameLabel = new javax.swing.JLabel();
        communityNameTxtField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        zipCodeLabel = new javax.swing.JLabel();
        zipCodeTxtField = new javax.swing.JTextField();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        loginToContinuePanel.setBackground(new java.awt.Color(77, 165, 124));

        javax.swing.GroupLayout loginToContinuePanelLayout = new javax.swing.GroupLayout(loginToContinuePanel);
        loginToContinuePanel.setLayout(loginToContinuePanelLayout);
        loginToContinuePanelLayout.setHorizontalGroup(
            loginToContinuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        loginToContinuePanelLayout.setVerticalGroup(
            loginToContinuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
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

        insuranceIdLabel.setText("Insurance ID:");
        add(insuranceIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 90, -1));

        personNameLabel.setText("Name:");
        add(personNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 70, -1));

        emailIdPersonLabel.setText("Email ID:");
        add(emailIdPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 70, -1));

        phonePersonalLabel.setText("Phone Number:");
        add(phonePersonalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 100, -1));

        cityLabel.setText("City:");
        add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 40, -1));

        stateLabel.setText("State");
        add(stateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 40, -1));

        countryLabel.setText("Country:");
        add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 60, -1));

        genderLabel.setText("Gender");
        add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 60, -1));

        ageLabel.setText("Age:");
        add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 60, -1));
        add(insuranceIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, 150, -1));
        add(addressTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 200, 130));

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 150, -1));
        add(emailIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 150, -1));
        add(phnNumberTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 150, -1));
        add(cityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 150, -1));
        add(stateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 150, -1));
        add(countryTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 150, -1));
        add(genderTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 150, -1));
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 150, -1));

        createPatientBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createPatientBtn.setText("CREATE");
        createPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientBtnActionPerformed(evt);
            }
        });
        add(createPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 740, 300, 80));

        personIdLabel1.setText("ID:");
        add(personIdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 70, -1));
        add(idTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 150, -1));

        communityNameLabel.setText("Community Name:");
        add(communityNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 130, -1));
        add(communityNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 200, -1));

        addressLabel.setText("Address:");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 130, -1));

        zipCodeLabel.setText("ZipCode:");
        add(zipCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 130, -1));
        add(zipCodeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 200, -1));
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

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed
    private void updateDoctor(){
        doctor.getPerson().setId(idTxtField.getText());
         doctor.getPerson().setName( nameTxtField.getText());
        doctor.getPerson().setEmailid(emailIdTxtField.getText());
        doctor.getPerson().setPhoneNumber(Long.parseLong(phnNumberTxtField.getText()));
        doctor.getPerson().getResidence().getCommunity().getCity().setName( cityTxtField.getText());
        doctor.getPerson().getResidence().getCommunity().getCity().setState( stateTxtField.getText());
        doctor.getPerson().getResidence().getCommunity().getCity().setCountry(countryTxtField.getText());
       doctor.getPerson().setGender( genderTxtField.getText());
        doctor.getPerson().setAge( Integer.parseInt(ageTxtField.getText()));
       // doctor.setInsuranceId(Integer.parseInt(insuranceIdTxtField.getText()));
         doctor.getPerson().getResidence().getCommunity().setCommunityName( communityNameTxtField.getText());
        doctor.getPerson().getResidence().getCommunity().setZipCode( zipCodeTxtField.getText());
        doctor.getPerson().getResidence().getCommunity().setLocation( addressTxtField.getText());
        JOptionPane.showMessageDialog(this, "Record Updated Successfuly");
        clearPatinetCrudFields();
    }
    
    private void updatePatient()
    {
         patient.getPerson().setId(idTxtField.getText());
         patient.getPerson().setName( nameTxtField.getText());
        patient.getPerson().setEmailid(emailIdTxtField.getText());
        patient.getPerson().setPhoneNumber(Long.parseLong(phnNumberTxtField.getText()));
        patient.getPerson().getResidence().getCommunity().getCity().setName( cityTxtField.getText());
        patient.getPerson().getResidence().getCommunity().getCity().setState( stateTxtField.getText());
        patient.getPerson().getResidence().getCommunity().getCity().setCountry(countryTxtField.getText());
       patient.getPerson().setGender( genderTxtField.getText());
        patient.getPerson().setAge( Integer.parseInt(ageTxtField.getText()));
        patient.setInsuranceId(Integer.parseInt(insuranceIdTxtField.getText()));
         patient.getPerson().getResidence().getCommunity().setCommunityName( communityNameTxtField.getText());
        patient.getPerson().getResidence().getCommunity().setZipCode( zipCodeTxtField.getText());
        patient.getPerson().getResidence().getCommunity().setLocation( addressTxtField.getText());
        JOptionPane.showMessageDialog(this, "Record Updated Successfuly");
        clearPatinetCrudFields();
        
        
    }
    private void clearPatinetCrudFields()
    {
        idTxtField.setText("");
        nameTxtField.setText("");
        emailIdTxtField.setText("");
        phnNumberTxtField.setText("");
        cityTxtField.setText("");
        stateTxtField.setText("");
        countryTxtField.setText("");
        genderTxtField.setText("");
        ageTxtField.setText("");
        insuranceIdTxtField.setText("");
        communityNameTxtField.setText("");
        zipCodeTxtField.setText("");
        addressTxtField.setText("");
            
    }
    
    private void populatePatinetCrudFields()
    {   
        createPatientBtn.setVisible(false);
        idTxtField.setText(patient.getPerson().getId());
        nameTxtField.setText(patient.getPerson().getName());
        emailIdTxtField.setText(patient.getPerson().getEmailid());
        phnNumberTxtField.setText(String.valueOf(patient.getPerson().getPhoneNumber()));
        cityTxtField.setText(patient.getPerson().getResidence().getCommunity().getCity().getName());
        stateTxtField.setText(patient.getPerson().getResidence().getCommunity().getCity().getState());
        countryTxtField.setText(patient.getPerson().getResidence().getCommunity().getCity().getCountry());
        genderTxtField.setText(patient.getPerson().getGender());
        ageTxtField.setText(String.valueOf(patient.getPerson().getAge()));
        insuranceIdTxtField.setText(String.valueOf(patient.getInsuranceId()));
        communityNameTxtField.setText(patient.getPerson().getResidence().getCommunity().getCommunityName());
        zipCodeTxtField.setText(patient.getPerson().getResidence().getCommunity().getZipCode());
        addressTxtField.setText(patient.getPerson().getResidence().getCommunity().getLocation());
            
    }
    private void createPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientBtnActionPerformed
        // TODO add your handling code here:
        if(this.operation.contains("cp") || this.operation.contains("cd")){
        String id = idTxtField.getText();
        String name = nameTxtField.getText();
        String emailId = emailIdTxtField.getText();
        String phoneNumber = phnNumberTxtField.getText();
        String cityName = cityTxtField.getText();
        String state = stateTxtField.getText();
        String country = countryTxtField.getText();
        String gender = genderTxtField.getText();
        String age = ageTxtField.getText();
        String insuranceId = insuranceIdTxtField.getText();
        String communityName = communityNameTxtField.getText();
        String zipCode = zipCodeTxtField.getText();
        String address = addressTxtField.getText();
        
        
        City city = new City(state, country,  cityName);
        Community community = new Community(city, communityName, country, zipCode);
        House house = new House(community, 7, 8);
        Person person = new Person(id, name, emailId, Long.parseLong(phoneNumber), house, gender, Integer.parseInt(age));
       if(this.operation.contains("cp")){
        Patient newPatient = new Patient(person, null, Integer.parseInt(insuranceId));
        PatientDirectory.patientList.add(newPatient);
        JOptionPane.showMessageDialog(this,"Created New Patient");
       }else if(this.operation.contains("cd")){
        Doctor doctor = new Doctor(person);
        DoctorDirectory.doctorList.add(doctor);
        JOptionPane.showMessageDialog(this,"Created New Doctor");
       }
           
       }
        else if(this.operation.contains("pu")){
            updatePatient();
        }
        else if(this.operation.contains("du"))
        {
            updateDoctor();
        }
        
         clearPatinetCrudFields();
    }//GEN-LAST:event_createPatientBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JLabel communityNameLabel;
    private javax.swing.JTextField communityNameTxtField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTxtField;
    private javax.swing.JButton createPatientBtn;
    private javax.swing.JLabel emailIdPersonLabel;
    private javax.swing.JTextField emailIdTxtField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JLabel insuranceIdLabel;
    private javax.swing.JTextField insuranceIdTxtField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel loginToContinuePanel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel personIdLabel1;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTextField phnNumberTxtField;
    private javax.swing.JLabel phonePersonalLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTxtField;
    private javax.swing.JLabel zipCodeLabel;
    private javax.swing.JTextField zipCodeTxtField;
    // End of variables declaration//GEN-END:variables
}
