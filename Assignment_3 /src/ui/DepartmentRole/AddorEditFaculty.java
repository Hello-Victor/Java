/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DepartmentRole;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.College.College;
import model.CourseSchedule.CourseSchedule;
import model.Department.Department;
import model.Persona.AccountDirectory;
import model.Persona.Faculty.FacultyDirectory;
import model.Persona.Faculty.FacultyProfile;
import model.Persona.Person;
import model.Persona.PersonDirectory;
import model.Persona.StudentDirectory;
import model.Persona.StudentProfile;
import model.University.University;
import ui.main.BaseJPanel;

/**
 *
 * @author victor
 */
public class AddorEditFaculty extends BaseJPanel {

    private Department department;
    private FacultyProfile facultyProfile;

    /**
     * Creates new form AddStudentJPanel
     */
    public AddorEditFaculty(JPanel mainWorkArea, Department department) {
        super(mainWorkArea);
        this.department = department;
        initComponents();
        refreshTable();
    }

    public AddorEditFaculty(JPanel mainWorkArea, Department department, FacultyProfile facultyProfile) {
        super(mainWorkArea);
        this.department = department;
        this.facultyProfile = facultyProfile;
        initComponents();
        jLabel4.setText("Edit Faculty");
        refreshTable();
    }

    @Override
    public void refreshTable() {
        if (facultyProfile != null) {
            populateInfo();
        }
    }

    public void populateInfo() {
        jTextField1.setText(facultyProfile.getPerson().getLastname());
        jTextField2.setText(facultyProfile.getAccount().getUserName());
        jTextField3.setText(facultyProfile.getAccount().getPassword());
        jTextField4.setText(facultyProfile.getPerson().getBirthDateString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Name:");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Create New Faculty");

        jLabel3.setText("Username:");

        jLabel5.setText("Password:");

        jButton2.setText("<<  Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("BirthDate:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(110, 110, 110)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = this.jTextField1.getText();
        String userName = this.jTextField2.getText();
        String password = this.jTextField3.getText();
        String sbirthdate = this.jTextField4.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date birthdate = dateFormat.parse(sbirthdate);
            FacultyDirectory facultyDirectory = department.getFacultydirectory();

            try {
                if (facultyProfile == null) {
                    Person newPerson = personDirectory.newPerson();
                    newPerson.setLastname(name);
                    newPerson.setBirthDate(birthdate);
                    FacultyProfile newStudentProfile = facultyDirectory.newFacultyProfile(newPerson, userName, password);
                    JOptionPane.showMessageDialog(this, "created");
                    facultyProfile = newStudentProfile;
                } else {
                    facultyProfile.getPerson().setLastname(name);
                    facultyProfile.getPerson().setBirthDate(birthdate);
                    facultyProfile.getAccount().setUserName(userName);
                    facultyProfile.getAccount().setPassword(password);
                    JOptionPane.showMessageDialog(this, "saved");
                }
                backAction();
            } catch (AccountDirectory.AccountNameConflictException ex) {
                JOptionPane.showMessageDialog(this, "Account name conflict!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Wrong Date Format (should be yyyy-MM-dd)");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        backAction();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}