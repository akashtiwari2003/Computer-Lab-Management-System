/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_management_system;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class add_class_student extends javax.swing.JFrame {

    JTextFieldDateEditor dt_Editor, dt_Edit, new_cl_dt, add_stu,Edit_d;

    /**
     * Creates new form add_class_student
     */
    public add_class_student() {

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

        Edit_existing = new javax.swing.JButton();
        remove_stu = new javax.swing.JButton();
        class_CB = new javax.swing.JComboBox<>();
        section_CB = new javax.swing.JComboBox<>();
        Add_new_cla = new javax.swing.JButton();
        Add_new_stu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Home_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add class or student");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Edit_existing.setBackground(new java.awt.Color(0, 0, 0));
        Edit_existing.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Edit_existing.setForeground(new java.awt.Color(0, 255, 0));
        Edit_existing.setText("Edit the details of Selected Student");
        Edit_existing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_existingActionPerformed(evt);
            }
        });
        getContentPane().add(Edit_existing);
        Edit_existing.setBounds(310, 550, 380, 50);

        remove_stu.setBackground(new java.awt.Color(0, 0, 0));
        remove_stu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        remove_stu.setForeground(new java.awt.Color(0, 255, 0));
        remove_stu.setText("Remove Selected Student");
        remove_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_stuActionPerformed(evt);
            }
        });
        getContentPane().add(remove_stu);
        remove_stu.setBounds(710, 550, 290, 50);

        class_CB.setBackground(new java.awt.Color(0, 0, 0));
        class_CB.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        class_CB.setForeground(new java.awt.Color(255, 255, 255));
        class_CB.setOpaque(false);
        class_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_CBActionPerformed(evt);
            }
        });
        getContentPane().add(class_CB);
        class_CB.setBounds(510, 80, 160, 30);

        section_CB.setBackground(new java.awt.Color(0, 0, 0));
        section_CB.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        section_CB.setForeground(new java.awt.Color(255, 255, 255));
        section_CB.setOpaque(false);
        section_CB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                section_CBItemStateChanged(evt);
            }
        });
        section_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section_CBActionPerformed(evt);
            }
        });
        getContentPane().add(section_CB);
        section_CB.setBounds(690, 80, 190, 30);

        Add_new_cla.setBackground(new java.awt.Color(0, 0, 0));
        Add_new_cla.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Add_new_cla.setForeground(new java.awt.Color(0, 255, 0));
        Add_new_cla.setText("Add new Class");
        Add_new_cla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_new_claActionPerformed(evt);
            }
        });
        getContentPane().add(Add_new_cla);
        Add_new_cla.setBounds(720, 610, 270, 50);

        Add_new_stu.setBackground(new java.awt.Color(0, 0, 0));
        Add_new_stu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Add_new_stu.setForeground(new java.awt.Color(0, 255, 0));
        Add_new_stu.setText("Add new Student in this Class");
        Add_new_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_new_stuActionPerformed(evt);
            }
        });
        getContentPane().add(Add_new_stu);
        Add_new_stu.setBounds(320, 610, 350, 50);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(51, 255, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Section", "Rollno", "Name", "DOB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 130, 570, 402);

        Home_btn.setBackground(new java.awt.Color(0, 0, 0));
        Home_btn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Home_btn.setForeground(new java.awt.Color(0, 255, 0));
        Home_btn.setText("Home");
        Home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Home_btn);
        Home_btn.setBounds(220, 110, 140, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 JDateChooser jd = new JDateChooser();
    JTextField tf = new JTextField();
    JDateChooser jt = new JDateChooser();
    JTextField td = new JTextField();
    JDateChooser d_Edit = new JDateChooser();
    JTextField n_Edit = new JTextField();
    private void section_CBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_section_CBItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_section_CBItemStateChanged

    private void class_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_CBActionPerformed
if(class_CB.getItemCount() != 0 && section_CB.getItemCount() != 0);
{
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        m.setRowCount(0);
        jTable1.setModel(m);
        int c, s;
        c = class_CB.getSelectedIndex();
        s = section_CB.getSelectedIndex();
        if (c != 0 && s != 0 && c != -1 && s != -1) {
            String cl,cla,sect;
            cla = class_CB.getSelectedItem().toString().substring(32,34).trim();
            sect = section_CB.getSelectedItem().toString().substring(32,34).toLowerCase().trim();
            cl = cla.concat(sect);
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
                Statement sr = con.createStatement();
                ResultSet rs = sr.executeQuery("show tables;");
                String t;
                while (rs.next()) {
                    t = rs.getString(1);
                    if (t.equals(cl)) {
                        String qry = "select Class,Section,Rollno,Name,DOB from " +cl+";";
                        Statement st = con.createStatement();
                        ResultSet ts = st.executeQuery(qry);
                        table_entry(m,ts,5);
                       break;
                    }
                }
                if (jTable1.getModel().getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Selected Class does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
}
    }//GEN-LAST:event_class_CBActionPerformed

    private void Add_new_claActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_new_claActionPerformed
        String[] class_array = {"Select Class", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] section_array = {"Select Section", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        JComboBox new_class = new JComboBox(class_array);
        JComboBox new_section = new JComboBox(section_array);
        Object[] cl_and_sc = {new_class, new_section};
        int new_Cl = JOptionPane.showConfirmDialog(null, cl_and_sc, "Enter Information", JOptionPane.YES_NO_OPTION);
        if (new_Cl == JOptionPane.YES_OPTION && new_class.getSelectedIndex() != 0 && new_section.getSelectedIndex() != 0) {
            String sec = (String) new_section.getSelectedItem();
            String clas = (String) new_class.getSelectedItem();
            sec = sec.toLowerCase();
            String cla = clas.concat(sec);
            {
                try {
                    Connection conadd = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
                    Statement addst = conadd.createStatement();
                    String qeuy = "create table " + cla + "(Class int(6),Section varchar(2),Rollno int(4),Name varchar(40),Attendance varchar(10),DOB date);";
                    try {
                        JOptionPane.showMessageDialog(null, "Since you are going to create a new class it should at least contain one student.Please select his/her Name and DOB");
                        Object[] details = {"Enter DOB:-", jd, "Enter Name:-", tf};
                        try {
                            int nm_stu = JOptionPane.showConfirmDialog(null, details, "INFORMATION", JOptionPane.YES_NO_OPTION);
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                            String df = sdf.format(jd.getDate());
                            boolean b = dateCheck(df);
                            String sa = "";
                            if (b == true && sa.equals(tf.getText()) == false && nm_stu == JOptionPane.YES_OPTION) {
                                Statement enter_data = conadd.createStatement();
                                String qriy = "insert into " + cla + " values(" + clas + ",'" + sec.toUpperCase() + "',1,'" + tf.getText() + "','present','" + df + "');";
                                addst.executeUpdate(qeuy);
                                enter_data.executeUpdate(qriy);
                                JOptionPane.showMessageDialog(null, "Class Successfully created.");
                                      DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
                                      m.setRowCount(0);
                                      jTable1.setModel(m);
                                      cb_add();
                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid Entry.Class not Created. Try Again", "error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception ep) {
                            JOptionPane.showMessageDialog(null, "Invalid Entry.Class not Created.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "The given class is already in the database");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Class or section not valid");
        }
        
    }//GEN-LAST:event_Add_new_claActionPerformed

    private void Add_new_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_new_stuActionPerformed
        String cl,cla,sect;
            cl = class_CB.getSelectedItem().toString().substring(32,34).trim();
            sect = section_CB.getSelectedItem().toString().substring(32,34).toLowerCase().trim();
            cla = cl.concat(sect);
        try {
            Connection conadd = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
            Statement sr = conadd.createStatement();
            ResultSet rs = sr.executeQuery("show tables;");
            String t;
            while (rs.next()) {
                t = rs.getString(1);
                if (t.equals(cla)) {
                    Object[] details = {"Enter DOB:-", jt, "Enter Name:-", td};
                    td.setText("");
                    try {
                        int nm_stu = JOptionPane.showConfirmDialog(null, details, "INFORMATION", JOptionPane.YES_NO_OPTION);
                        Add_new_stu.setText("Please wait...");
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        String df = sdf.format(jt.getDate());
                        boolean b = dateCheck(df);
                        String string = "";
                        if (b == true && (string.equals(td.getText()) == false) && nm_stu == JOptionPane.YES_OPTION) {
                            String nams;
                            int maxRoll;
                            boolean repeated = false;
                            try {
                                Statement data_chk = conadd.createStatement();
                                ResultSet chk_data = data_chk.executeQuery("select Name, DOB from " + cla + ";");
                                while (chk_data.next()) {
                                    String nnmm = chk_data.getString(1);
                                    String stu_dob = chk_data.getString(2);
                                    if (nnmm.equals(td.getText()) && stu_dob.equals(df)) 
                                        repeated = true;
                             }
                                if (repeated == false) {
                                    Statement st = conadd.createStatement();
                                    String qry = "select max(Rollno) from " + cla + ";";
                                    ResultSet rsp = st.executeQuery(qry);
                                    rsp.next();
                                    maxRoll = rsp.getInt(1);
                                    maxRoll++;
                                    JOptionPane.showMessageDialog(null, "Please Click OK and wait.");
                                    String query = "insert into " + cla + " values(" + cl + ",'" + sect.toUpperCase() + "'," + maxRoll + ",'" + td.getText() + "','present','" + df + "');";
                                    st.executeUpdate(query);
                                    order_Roll(conadd,st,cla);
                                    JOptionPane.showMessageDialog(null, "Student added successfully!");
                                    dt_Edit = (JTextFieldDateEditor) jt.getDateEditor();
                                    dt_Edit.setText("");
                                    td.setText("");
                                } else if (repeated == true) {
                                    JOptionPane.showMessageDialog(null, "The given details already exist in this class", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        } else if (nm_stu == JOptionPane.NO_OPTION || td.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "No data will be entered");
                            dt_Edit = (JTextFieldDateEditor) jt.getDateEditor();
                            dt_Edit.setText("");
                            td.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Entry.Try Again", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception ep) {
                        JOptionPane.showMessageDialog(null, "Invalid Entry.Try Again", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception g) {
            JOptionPane.showMessageDialog(null, "An unexpected Error occured retry.", "Error", JOptionPane.ERROR_MESSAGE);
        }
Add_new_stu.setText("Add new Student in this Class");

    }//GEN-LAST:event_Add_new_stuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        openf("648548.jpg");
       cb_add();
       jTable1.getTableHeader().setReorderingAllowed(false);
    }//GEN-LAST:event_formWindowOpened

    private void section_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section_CBActionPerformed
if(class_CB.getItemCount() != 0 && section_CB.getItemCount() != 0);
{
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        m.setRowCount(0);
        jTable1.setModel(m);
        int c, s;
        c = class_CB.getSelectedIndex();
        s = section_CB.getSelectedIndex();
        if (c != 0 && s != 0 && c != -1 && s != -1) {
            String cl,cla,sect;
            cla = class_CB.getSelectedItem().toString().substring(32,34).trim();
            sect = section_CB.getSelectedItem().toString().substring(32,34).toLowerCase().trim();
            cl = cla.concat(sect);
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
                Statement sr = con.createStatement();
                ResultSet rs = sr.executeQuery("show tables;");
                String t;
                while (rs.next()) {
                    t = rs.getString(1);
                    if (t.equals(cl)) {
                        String qry = "select Class,Section,Rollno,Name,DOB from " +cl+";";
                        Statement st = con.createStatement();
                        ResultSet ts = st.executeQuery(qry);
                        table_entry(m,ts,5);
                        break;
                    } 
                }
                if (jTable1.getModel().getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Selected Class does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }        
}    }//GEN-LAST:event_section_CBActionPerformed

    private void remove_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_stuActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        int[] selRow = jTable1.getSelectedRows();
        if(selRow.length == 0)
        {
        JOptionPane.showMessageDialog(null,"Please select the students to be removed.");
        }
        else
        {   
         int conf = JOptionPane.showConfirmDialog(null,"Are you sure you want to remove the selected student/students.","Confirmation",JOptionPane.YES_NO_OPTION);
        if(conf == JOptionPane.YES_OPTION)
        {
        String names;
        String DOBs;
        String nams;
        String cl,cla,sect;
            cl = class_CB.getSelectedItem().toString().substring(32,34).trim();
            sect = section_CB.getSelectedItem().toString().substring(32,34).toLowerCase().trim();
            cla = cl.concat(sect);
        try {
            Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
            Statement str = co.createStatement();
            Statement stmt = co.createStatement();
            int count = jTable1.getSelectedRowCount();
            int i = 0;
            while (i < count) {
                names = tbl.getValueAt(selRow[i], 3).toString();
                DOBs = tbl.getValueAt(selRow[i], 4).toString();
                String qry = "delete from " + cla + " where Name = '" + names + "' and DOB = '" + DOBs + "';";
                str.executeUpdate(qry);
                ++i;
            }
            String alterT = "alter table " + cla + " order by Name";
            str.executeUpdate(alterT);
            String fin = "select Class,Section,Rollno,Name,DOB from " + cla + ";";
            ResultSet ms = stmt.executeQuery(fin);
            int rolln = 1;
            while (ms.next()) {
                nams = ms.getString(4);
                Date dts = ms.getDate(5);
                String alt = "update " + cla + " set Rollno = " + rolln + " where Name = '" + nams + "' and DOB = '" + dts + "';";
                str.executeUpdate(alt);
                ++rolln;
            }
            Statement tr = co.createStatement();
            ResultSet fg = tr.executeQuery(fin);
            tbl.setRowCount(0);
            table_entry(tbl,fg,5);
            try
            {
            Statement stm = co.createStatement();
            ResultSet yq = stm.executeQuery("select count(*) from "+cla+";");
            yq.next();
            int rows = yq.getInt(1);
            if(rows == 0)
            {
            Statement del = co.createStatement();
            del.executeUpdate("drop table "+cla+";");
            JOptionPane.showMessageDialog(null,"Since no stuent is left in the class. The class has been removed from the database.");
                  DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
                  m.setRowCount(0);
                  jTable1.setModel(m);
                  cb_add();
            }

            }
            catch(Exception ex)
            {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
        }
              
    }//GEN-LAST:event_remove_stuActionPerformed

    private void Edit_existingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_existingActionPerformed
Object[] ob = {"Enter new DOB",d_Edit,"Enter new Name",n_Edit};
String cl,cla,sect;
            cl = class_CB.getSelectedItem().toString().substring(32,34).trim();
            sect = section_CB.getSelectedItem().toString().substring(32,34).toLowerCase().trim();
            cla = cl.concat(sect);
        if(class_CB.getSelectedIndex()!=0 && section_CB.getSelectedIndex()!=0)
        {   
                try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
            Statement st = con.createStatement();
            int a[] = jTable1.getSelectedRows();
            if(a.length == 0)
            {
            JOptionPane.showMessageDialog(null,"Please select a student first.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(a.length ==1)
            {
                Edit_existing.setText("Processing...");
            try
            {
            int cn = JOptionPane.showConfirmDialog(null,ob,"Enter new Details",JOptionPane.YES_NO_OPTION);
            JOptionPane.showMessageDialog(null,"Please Click Ok and Wait...");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String df = sdf.format(d_Edit.getDate());
            boolean b = dateCheck(df);
            String string = "";         
            if (b == true && (string.equals(n_Edit.getText()) == false) && cn == JOptionPane.YES_OPTION)
            {
         String namms = jTable1.getValueAt(a[0], 3).toString();
         String DOB = jTable1.getValueAt(a[0], 4).toString();
         String upd = "update "+cla+" set Name = '"+n_Edit.getText()+"',DOB = '"+df+"' where Name = '"+namms+"' and DOB = '"+DOB+"';";
         st.executeUpdate(upd);
         order_Roll(con,st,cla);
            }
            else
            {
            JOptionPane.showMessageDialog(null,"Data not updated");
            }
            }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
            else if (a.length>1)
            {
            JOptionPane.showMessageDialog(null,"Please select only one student","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Class or Section not Selected");
        }
        Edit_existing.setText("Edit the details of Selected Student");
    }//GEN-LAST:event_Edit_existingActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
  
    }//GEN-LAST:event_jTable1PropertyChange

    private void Home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_btnActionPerformed
Allocated_computers info = new Allocated_computers();
info.setVisible(true);
this.dispose();
    }//GEN-LAST:event_Home_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
del_and_report();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(add_class_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_class_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_class_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_class_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_class_student().setVisible(true);
            }
        });
    }

    private void initDateEditor() {

        new_cl_dt = (JTextFieldDateEditor) jd.getDateEditor();
        new_cl_dt.setEditable(false);
        add_stu = (JTextFieldDateEditor) jt.getDateEditor();
        new_cl_dt.setEditable(false);
        Edit_d = (JTextFieldDateEditor) d_Edit.getDateEditor();
        Edit_d.setEditable(false);
    }

    private boolean dateCheck(String dob) {
        boolean b = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
            Statement sts = con.createStatement();
            String qrye = "select curdate();";
            ResultSet rst = sts.executeQuery(qrye);
            rst.next();
            String dfinal = rst.getString(1);
            dfinal = dfinal.substring(0, 4);
            String dmtch = dob.substring(0, 4);
            int dfin = Integer.parseInt(dfinal);
            int dmatch = Integer.parseInt(dmtch);

            if (dmatch > dfin - 7) {
                JOptionPane.showMessageDialog(null, "Your age is not sufficient");
                b = false;
            } else {
                b = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return b;
    }

    private void openf(String a) {
        initDateEditor();
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dmnsn = t.getScreenSize();
        jLabel1.setSize(dmnsn);
        this.setSize(dmnsn);
        ImageIcon img = new ImageIcon(getClass().getResource(a));
        Image im = img.getImage();
        Image fin = im.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon background_img = new ImageIcon(fin);
        jLabel1.setIcon(background_img);
    }
    
    private void cb_add()
    {
     class_CB.removeAllItems();
        section_CB.removeAllItems();
        class_CB.addItem("<html> <font color = '#00FF00'>Select Class</font>");
        section_CB.addItem("<html> <font color = '#00FF00'>Select Section</font>");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
            Statement stm = con.createStatement();
            Statement stmm = con.createStatement();
            String qry = "show tables;";
            ResultSet rs = stmm.executeQuery(qry);
            while (rs.next()) {
                String len = rs.getString(1);
                int length = len.length();

                if (length == 3) {
                    String qryy = "insert into comboaddtableandsection values(" + len.substring(0, 2) + ",'" + len.substring(2).toUpperCase() + "');";
                    stm.executeUpdate(qryy);
                } else if (length == 2) {
                    String qryy = "insert into comboaddtableandsection values(" + len.substring(0, 1) + ",'" + len.substring(1).toUpperCase() + "');";
                    stm.executeUpdate(qryy);
                }
            }
            Statement st = con.createStatement();
            ResultSet rt = st.executeQuery("select distinct(t_name) from comboaddtableandsection order by t_name;");
            while (rt.next()) {
                class_CB.addItem("<html> <font color = '#00FF00'> "+rt.getString(1)+ "  </font>");
            }
            Statement su = con.createStatement();
            ResultSet ru = su.executeQuery("select distinct(section) from comboaddtableandsection order by section");
            while (ru.next()) {
                section_CB.addItem("<html> <font color = '#00FF00'> "+ru.getString(1)+ "  </font>");
            }
            String query = "delete from comboaddtableandsection;";
            stm.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void table_entry(DefaultTableModel m,ResultSet r,int i)
    {
        int a = 0;
        try {
            while(r.next())
            {
               Object [] enter_data = new Object[i];
               while(a<i)
               {
               enter_data[a] = r.getString(a+1);
               ++a;
               }
                m.addRow(enter_data);
               a=0;
            }   
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    private void order_Roll(Connection conadd,Statement st,String cla)
    {
        try
        {
        String nams;
      String alterT = "alter table " + cla + " order by Name";
                                    st.executeUpdate(alterT);
                                    Statement stmt = conadd.createStatement();
                                    String fin = "select Class,Section,Rollno,Name,DOB from " + cla + ";";
                                    ResultSet gs = stmt.executeQuery(fin);
                                    int rolln = 1;
                                    while (gs.next()) {
                                        nams = gs.getString(4);
                                        Date dts = gs.getDate(5);
                                        String alt = "update " + cla + " set Rollno = " + rolln + " where Name = '" + nams + "' and DOB = '" + dts + "';";
                                        st.executeUpdate(alt);
                                        ++rolln;
                                    }
                                    ResultSet fs = st.executeQuery(fin);
                                    DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
                                    m.setRowCount(0);
                                    table_entry(m,fs,5);
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void del_and_report()
{
try
{
Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management","root","root");
Statement d = cn.createStatement();
String send = "select * from temp";
ResultSet b = d.executeQuery(send);
Statement de = cn.createStatement();
Statement ed = cn.createStatement();
ResultSet rs = ed.executeQuery("select Name from login_info");
rs.next();
String usr = rs.getString(1);
if(b.next())
{
 b.beforeFirst();
while(b.next())
{
int rno = b.getInt(1);
String nm = b.getString(2);
String cname = b.getString(3);
int clss = b.getInt(5);
String sn = b.getString(6);
String exec= "insert into stu_report values("+clss+",'"+sn+"',"+rno+",'"+nm+"','"+cname+"',sysdate(),'"+usr+"');";
de.executeUpdate(exec);
}
String del = "delete from temp;";
String log_del = "delete from login_info;";
de.executeUpdate(del);
de.executeUpdate(log_del);
}
else
{
String log_del = "delete from login_info;";
de.executeUpdate(log_del);
}
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_new_cla;
    private javax.swing.JButton Add_new_stu;
    private javax.swing.JButton Edit_existing;
    private javax.swing.JButton Home_btn;
    private javax.swing.JComboBox<String> class_CB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remove_stu;
    private javax.swing.JComboBox<String> section_CB;
    // End of variables declaration//GEN-END:variables
}
