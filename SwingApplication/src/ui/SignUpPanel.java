/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import doctor.Doctor;
import doctor.DoctorDirectory;
import hospital.Hospital;
import hospital.HospitalDirectory;
import house.House;
import java.awt.Image;
import java.io.File;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.state.city.community.CommunityDirectory;
import patient.Patient;
import patient.PatientDirectory;
import person.Person;
import person.PersonDirectory;
import rbac.application.user.User;
import rbac.application.user.UserListDirectory;
import rbac.context.RbacApplicationContext;
import us.state.city.City;
import us.state.city.community.Community;
import utility.ValidationHelper;

/**
 *
 * @author rohitpanicker
 */
public class SignUpPanel extends javax.swing.JPanel {

  
    JPanel loginJpanel;
    private Image globalImage = null;
    private String selectedImage;
    /**
     * Creates new form SignUpPanel
     */
    public SignUpPanel() {
        initComponents();
        insuranceIdLabel.setVisible(false);
        insuranceIdTxtField.setVisible(false);
        hospitalLable.setVisible(false);
        hospitalNameComboBox.setVisible(false);
    }
    
    public SignUpPanel(JPanel jpanel){
        initComponents();
        insuranceIdLabel.setVisible(false);
        insuranceIdTxtField.setVisible(false);
        hospitalLable.setVisible(false);
        hospitalNameComboBox.setVisible(false);
        loginJpanel=jpanel;
        
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
        loginToConitueLabel = new javax.swing.JLabel();
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
        signUpBtn = new javax.swing.JButton();
        personIdLabel1 = new javax.swing.JLabel();
        idTxtField = new javax.swing.JTextField();
        communityNameLabel = new javax.swing.JLabel();
        communityNameTxtField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        zipCodeLabel = new javax.swing.JLabel();
        zipCodeTxtField = new javax.swing.JTextField();
        userTypeLabel = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTxtField1 = new javax.swing.JTextField();
        passwordTxtField = new javax.swing.JPasswordField();
        hospitalLable = new javax.swing.JLabel();
        hospitalNameComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        browseImage = new javax.swing.JButton();

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
                .addGap(205, 205, 205)
                .addComponent(logoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        loginToConitueLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        loginToConitueLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginToConitueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginToConitueLabel.setText("SIGN UP");

        javax.swing.GroupLayout loginToContinuePanelLayout = new javax.swing.GroupLayout(loginToContinuePanel);
        loginToContinuePanel.setLayout(loginToContinuePanelLayout);
        loginToContinuePanelLayout.setHorizontalGroup(
            loginToContinuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginToContinuePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginToConitueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        loginToContinuePanelLayout.setVerticalGroup(
            loginToContinuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginToContinuePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(loginToConitueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
        add(insuranceIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 790, 90, -1));

        personNameLabel.setText("Name:");
        add(personNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, -1));

        emailIdPersonLabel.setText("Email ID:");
        add(emailIdPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 70, -1));

        phonePersonalLabel.setText("Phone Number:");
        add(phonePersonalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 100, -1));

        cityLabel.setText("City:");
        add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 40, -1));

        stateLabel.setText("State");
        add(stateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 40, -1));

        countryLabel.setText("Country:");
        add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 60, -1));

        genderLabel.setText("Gender");
        add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 60, -1));

        ageLabel.setText("Age:");
        add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, 60, -1));
        add(insuranceIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 780, 150, -1));
        add(addressTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 200, 130));

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 150, -1));
        add(emailIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 150, -1));
        add(phnNumberTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 150, -1));
        add(cityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 150, -1));
        add(stateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 150, -1));
        add(countryTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 150, -1));
        add(genderTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 150, -1));
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 710, 150, -1));

        signUpBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        signUpBtn.setText("SIGN UP");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 820, 300, 80));

        personIdLabel1.setText("ID:");
        add(personIdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 70, -1));
        add(idTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 150, -1));

        communityNameLabel.setText("Community Name:");
        add(communityNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 130, -1));
        add(communityNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 200, -1));

        addressLabel.setText("Address:");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 130, -1));

        zipCodeLabel.setText("ZipCode:");
        add(zipCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 130, -1));
        add(zipCodeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 200, -1));

        userTypeLabel.setText("Role");
        add(userTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 100, -1));

        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Patient", "Doctor", "Hospital Admin", "Community Admin" }));
        userTypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userTypeComboBoxItemStateChanged(evt);
            }
        });
        userTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeComboBoxActionPerformed(evt);
            }
        });
        add(userTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 190, -1));

        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 640, 130, -1));

        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 710, 90, -1));

        userNameTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtField1ActionPerformed(evt);
            }
        });
        add(userNameTxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 200, -1));
        add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 700, 200, -1));

        hospitalLable.setText("Hospital");
        add(hospitalLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 770, 60, -1));

        hospitalNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(hospitalNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 760, 200, -1));

        jLabel4.setText("Image");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 90, -1));

        photoLabel.setBackground(new java.awt.Color(255, 255, 255));
        photoLabel.setOpaque(true);
        add(photoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 147, 190, 160));

        browseImage.setText("Browse Image");
        browseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseImageActionPerformed(evt);
            }
        });
        add(browseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 180, -1));
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

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
        int errorCount =0;
        StringBuffer errorNotifier = new StringBuffer();
        String id = null, name = null, emailId = null, phoneNumber = null, cityName = null, state = null,
        country = null, gender = null, age = null, insuranceId = null, communityName = null, zipCode = null,
        address = null, userName= null, password= null;
        Image image= null;
       
        String hospitalName= null;
        
            if(ValidationHelper.isInteger(idTxtField.getText()))
            {
                id = idTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Hospital ID should be an Integer\n");
            }
            if(ValidationHelper.isValidName(nameTxtField.getText()))
            {
                name = nameTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Name should be a String\n");
            }
            if(ValidationHelper.isValidEmailID(emailIdTxtField.getText())){
                emailId = emailIdTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Email Id should be in xyz@gmail.com format\n");
            }
            if(ValidationHelper.checkPhoneNumberWith10Digits(phnNumberTxtField.getText())){
                phoneNumber = phnNumberTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Phone number should be of 10 digits\n");
            }
            if(ValidationHelper.isValidName(cityTxtField.getText())){
                cityName = cityTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Phone number should be a String\n");
            }
            if(ValidationHelper.isValidName(stateTxtField.getText()))
            {
                state = stateTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". State should be a String\n");
            }

            if(ValidationHelper.isValidName(countryTxtField.getText())){
                country = countryTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Country should be a String\n");
            }
            if(ValidationHelper.isValidName(genderTxtField.getText())){
                gender = genderTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Gender should be a String\n");
            }
            if(ValidationHelper.isInteger(ageTxtField.getText())){
                age = ageTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Age should be an Integer\n");
            }
            
            if(userTypeComboBox.getSelectedIndex() == 1){
            if(ValidationHelper.isInteger(insuranceIdTxtField.getText())){
                insuranceId = insuranceIdTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Insurance ID should be an Integer\n");
            }
            }
            
            if(userTypeComboBox.getSelectedIndex() == 1 || userTypeComboBox.getSelectedIndex() ==2){
            hospitalName = (String)hospitalNameComboBox.getSelectedItem();
            }
           
            if(ValidationHelper.isValidName(communityNameTxtField.getText())){
                communityName = communityNameTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Community Name should be a String\n");
            }
            if(ValidationHelper.isInteger(zipCodeTxtField.getText())){
                zipCode = zipCodeTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Zipcode should be an Integer\n");
            }
            if(ValidationHelper.isValidName(addressTxtField.getText())){
                address = addressTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Address should be a String\n");
            }
            
            if(ValidationHelper.checkIfUserNameIsUnique(userNameTxtField1.getText(), userTypeComboBox.getSelectedIndex()))
            {
                userName = userNameTxtField1.getText();
            }else{
                 errorCount++;
                errorNotifier.append(errorCount).append(". This userName already exists, please choose another\n");
            }
            
            if(passwordTxtField.getText()!= null)
            {
                password = passwordTxtField.getText();
            }else{
                 errorCount++;
                errorNotifier.append(errorCount).append(". Please enter password\n");
            }
            
            if(this.globalImage != null)
            {
                image= globalImage;
            }else{
                 errorCount++;
                errorNotifier.append(errorCount).append(". Please upload a  picture\n");
            }

            if(errorCount > 0 )
            {
                JOptionPane.showMessageDialog(this, errorNotifier.toString());
                return;
            }else{
                
                int selectedIndex = userTypeComboBox.getSelectedIndex();
               
                City city = new City(state, country,  cityName);
                Community community = new Community(city, communityName, country, zipCode);
                CommunityDirectory.communityList.add(community);
                House house = new House(community, 7, 8);
                Person person = new Person(id, name, emailId, Long.parseLong(phoneNumber), house, gender, Integer.parseInt(age), image);
                PersonDirectory.personList.add(person);
                User newUser = new User(userName, password, person);
            // System Admin, Patient, Doctor, Hospital Admin, Community Admin
            switch (selectedIndex) {
                case 0:
                    UserListDirectory.getSystemAdminList().add(newUser);
                    break;
                case 1:
                    UserListDirectory.getPatientList().add(newUser);
                    Hospital hospital_x = new HospitalDirectory().findHospitalByName(hospitalName);
                    Patient newPatient = new Patient(person, null, Integer.parseInt(insuranceId),hospital_x, null);
                    hospital_x.getPatientList().add(newPatient);
                    PatientDirectory.patientList.add(newPatient);
                    break;
                case 2:
                    Hospital hospital = new HospitalDirectory().findHospitalByName(hospitalName);
                    Doctor doctor = new Doctor(person,hospital);
                    hospital.getDoctorList().add(doctor);
                    DoctorDirectory.doctorList.add(doctor);
                    UserListDirectory.getDoctorUserList().add(newUser);
                    break;
                case 3:
                    UserListDirectory.getHospitalAdminList().add(newUser);
                    break;
                case 4:
                    UserListDirectory.getCommunityAdminList().add(newUser);
                    break;
                default:
                    break;
            }
                HashMap<String,Person> personToUserName =UserListDirectory.getUserNameToPersonMap();
                personToUserName.put(userName, person);
                JOptionPane.showMessageDialog(this,"Sign Up Successful");
                clearAllTxtFields();
                HomeScreen.homeScreen.getjSplitPane1().setRightComponent(loginJpanel);
                }
   
    }//GEN-LAST:event_signUpBtnActionPerformed

   
    private void userTypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userTypeComboBoxItemStateChanged
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_userTypeComboBoxItemStateChanged

    private void userTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeComboBoxActionPerformed
        // TODO add your handling code here:
        
        if(userTypeComboBox.getSelectedIndex() == 1 || userTypeComboBox.getSelectedIndex() ==2)
        {
            if(userTypeComboBox.getSelectedIndex() ==1){
                insuranceIdLabel.setVisible(true);
                insuranceIdTxtField.setVisible(true);
            }else{
                 insuranceIdLabel.setVisible(false);
                insuranceIdTxtField.setVisible(false);
            }
            
            hospitalLable.setVisible(true);
            hospitalNameComboBox.setVisible(true);
            populateHospitalNameComboBox();
        }else{
            insuranceIdLabel.setVisible(false);
            insuranceIdTxtField.setVisible(false); 
            hospitalLable.setVisible(false);
            hospitalNameComboBox.setVisible(false);
            }
        
        
    }//GEN-LAST:event_userTypeComboBoxActionPerformed

    private void userNameTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtField1ActionPerformed

    private void browseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseImageActionPerformed
        // TODO add your handling code here:
        
        globalImage = null;
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Choose your extension", "jpg");
        jFileChooser.setFileFilter(fileNameExtensionFilter);

        try {
            int selectedOperation = jFileChooser.showOpenDialog(this);
            if (selectedOperation == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser.getSelectedFile();
                selectedImage = file.getAbsolutePath();

                JOptionPane.showInternalMessageDialog(null, "Are you sure you want this Photo?");

                ImageIcon imageIcon = new ImageIcon(selectedImage);
                Image imageDefault = imageIcon.getImage();
                Image imageDisplay = imageDefault.getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(), Image.SCALE_SMOOTH);
                globalImage = imageDisplay;
                photoLabel.setIcon(new ImageIcon(imageDisplay));
            }
        } catch (Exception e) {
            System.out.println("Exception occured while choosing image e= " + e.getMessage());
        }
    }//GEN-LAST:event_browseImageActionPerformed
 private void clearAllTxtFields()
    {
        addressTxtField.setText("");
        ageTxtField.setText("");
        cityTxtField.setText("");
        communityNameTxtField.setText("");
        countryTxtField.setText("");
        emailIdTxtField.setText("");
        genderTxtField.setText("");
        idTxtField.setText("");
        insuranceIdTxtField.setText("");
        nameTxtField.setText("");
        passwordTxtField.setText("");
        phnNumberTxtField.setText("");
        stateTxtField.setText("");
        userNameTxtField1.setText("");
        zipCodeTxtField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton browseImage;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JLabel communityNameLabel;
    private javax.swing.JTextField communityNameTxtField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTxtField;
    private javax.swing.JLabel emailIdPersonLabel;
    private javax.swing.JTextField emailIdTxtField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JLabel hospitalLable;
    private javax.swing.JComboBox<String> hospitalNameComboBox;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JLabel insuranceIdLabel;
    private javax.swing.JTextField insuranceIdTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel loginToConitueLabel;
    private javax.swing.JPanel loginToContinuePanel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JLabel personIdLabel1;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTextField phnNumberTxtField;
    private javax.swing.JLabel phonePersonalLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTxtField;
    private javax.swing.JTextField userNameTxtField1;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JLabel zipCodeLabel;
    private javax.swing.JTextField zipCodeTxtField;
    // End of variables declaration//GEN-END:variables

    private void populateHospitalNameComboBox() {
        hospitalNameComboBox.removeAllItems();
      for(Hospital hospital: HospitalDirectory.hospitalList)
      {
          hospitalNameComboBox.addItem(hospital.getHospitalName());
      }
    }
}
