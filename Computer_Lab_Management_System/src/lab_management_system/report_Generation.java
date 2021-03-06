/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_management_system;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class report_Generation extends javax.swing.JFrame {
 JTextFieldDateEditor dt_From,dt_To;
    /**
     * Creates new form report_Generation
     */
    public report_Generation() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        stu_report = new javax.swing.JRadioButton();
        comp_report = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        to_dt = new com.toedter.calendar.JDateChooser();
        from_dt = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gen_report_btn = new javax.swing.JButton();
        print_report_btn = new javax.swing.JButton();
        export_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        admin_list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        class_list = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        comp_list = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Generation");
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Date");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1020, 210, 240, 40);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 850, 500);

        stu_report.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(stu_report);
        stu_report.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        stu_report.setForeground(new java.awt.Color(255, 255, 255));
        stu_report.setText("Student Report");
        stu_report.setOpaque(false);
        stu_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_reportActionPerformed(evt);
            }
        });
        getContentPane().add(stu_report);
        stu_report.setBounds(920, 140, 180, 30);

        comp_report.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(comp_report);
        comp_report.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        comp_report.setForeground(new java.awt.Color(255, 255, 255));
        comp_report.setText("Computer Report");
        comp_report.setOpaque(false);
        comp_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_reportActionPerformed(evt);
            }
        });
        getContentPane().add(comp_report);
        comp_report.setBounds(1130, 140, 200, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><u>Report Generation</u>");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 10, 318, 44);

        to_dt.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(to_dt);
        to_dt.setBounds(1200, 260, 150, 30);

        from_dt.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(from_dt);
        from_dt.setBounds(970, 260, 150, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Select Report Type");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(960, 80, 318, 40);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filter By:-");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1150, 300, 97, 20);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("From:-");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(900, 260, 70, 20);

        gen_report_btn.setBackground(new java.awt.Color(0, 0, 0));
        gen_report_btn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        gen_report_btn.setForeground(new java.awt.Color(255, 255, 255));
        gen_report_btn.setText("Generate report");
        gen_report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_report_btnActionPerformed(evt);
            }
        });
        getContentPane().add(gen_report_btn);
        gen_report_btn.setBounds(920, 480, 200, 40);

        print_report_btn.setBackground(new java.awt.Color(0, 0, 0));
        print_report_btn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        print_report_btn.setForeground(new java.awt.Color(255, 255, 255));
        print_report_btn.setText("Print Report");
        print_report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_report_btnActionPerformed(evt);
            }
        });
        getContentPane().add(print_report_btn);
        print_report_btn.setBounds(1150, 480, 180, 40);

        export_btn.setBackground(new java.awt.Color(0, 0, 0));
        export_btn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        export_btn.setForeground(new java.awt.Color(255, 255, 255));
        export_btn.setText("Export as PDF");
        export_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_btnActionPerformed(evt);
            }
        });
        getContentPane().add(export_btn);
        export_btn.setBounds(930, 540, 190, 40);

        back_btn.setBackground(new java.awt.Color(0, 0, 0));
        back_btn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn);
        back_btn.setBounds(1160, 540, 150, 40);

        admin_list.setBackground(new java.awt.Color(0, 0, 0));
        admin_list.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        admin_list.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane4.setViewportView(admin_list);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(1180, 330, 150, 130);

        class_list.setBackground(new java.awt.Color(0, 0, 0));
        class_list.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        class_list.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane2.setViewportView(class_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(880, 330, 150, 130);

        comp_list.setBackground(new java.awt.Color(0, 0, 0));
        comp_list.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        comp_list.setForeground(new java.awt.Color(255, 0, 0));
        comp_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "comp_1", "comp_2", "comp_3", "comp_4", "comp_5", "comp_6", "comp_7", "comp_8", "comp_9", "comp_10", "comp_11", "comp_12", "comp_13", "comp_14", "comp_15", "comp_16", "comp_17", "comp_18", "comp_19", "comp_20", "comp_21", "comp_22", "comp_23", "comp_24", "comp_25", "comp_26", "comp_27", "comp_28", "comp_29", "comp_30", "comp_31", "comp_32", "comp_33", "comp_34", "comp_35", "comp_36", "comp_37", "comp_38", "comp_39", "comp_40", "comp_41", "comp_42", "comp_43", "comp_44", "comp_45", "comp_46", "comp_47", "comp_48", "comp_49", "comp_50", "comp_51", "comp_52", "comp_53", "comp_54", "comp_55", "comp_56", "comp_57", "comp_58", "comp_59", "comp_60" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(comp_list);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1040, 330, 130, 130);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("To:-");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1150, 260, 50, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1460, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents
JComboBox class_CB = new JComboBox(); 
JComboBox section_CB = new JComboBox(); 
DefaultListModel listmod = new DefaultListModel();
DefaultListModel listnm = new DefaultListModel();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        openf("456498.jpg");
        this.setSize(d);
        initDateEditor();
        class_list.setEnabled(false);
        comp_list.setEnabled(false);
        admin_list.setEnabled(false);
        from_dt.setEnabled(false);
        to_dt.setEnabled(false);
       try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management", "root", "root");
            Statement stm = con.createStatement();
            Statement stmm = con.createStatement();
            Statement stmtt = con.createStatement();
            String qry = "show tables;";
            ResultSet rs = stmm.executeQuery(qry);
            while (rs.next()) {
               String len = rs.getString(1);
                int length = len.length();
                
              if (length == 3) {
                  String qryy = "insert into comboaddtableandsection values("+len.substring(0,2)+",'"+len.substring(2).toUpperCase()+"');";
                  stm.executeUpdate(qryy);
                }
              else if(length == 2)
              {
          String qryy = "insert into comboaddtableandsection values("+len.substring(0,1)+",'"+len.substring(1).toUpperCase()+"');";
             stm.executeUpdate(qryy);
              }
            }
            Statement st = con.createStatement();
             ResultSet rt = st.executeQuery("select distinct t_name,section from comboaddtableandsection order by t_name;");
             while(rt.next())
             {
                 String cla = rt.getString(1).concat(rt.getString(2));
                 listmod.addElement(cla);
             }
             class_list.setModel(listmod);
             String query = "delete from comboaddtableandsection;";
            stm.executeUpdate(query);
            ResultSet fin = stmtt.executeQuery("select Name from admin_id;");
            while(fin.next())
            {
            String nam = fin.getString(1);
            listnm.addElement(nam);
            }
            admin_list.setModel(listnm);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void stu_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_reportActionPerformed
  DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
  m.setRowCount(0);
  m.setColumnCount(0);
       from_dt.setEnabled(true);
       to_dt.setEnabled(true);
       class_list.setEnabled(true);
       comp_list.setEnabled(true);
       admin_list.setEnabled(true);       
        JOptionPane.showMessageDialog(null,"Now Please select the date range and the classes.You can also filter the data by computer name and Admin.");
    }//GEN-LAST:event_stu_reportActionPerformed

    private void gen_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_report_btnActionPerformed
if(comp_report.isSelected() == false && stu_report.isSelected() == false)
{
JOptionPane.showMessageDialog(null,"Please Select a report type.","Error",JOptionPane.ERROR_MESSAGE);
}
else
{    
try
{
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_management","root","root");
Statement st = con.createStatement();
if(comp_report.isSelected()== true)
{
String query = "select Sno,Computer,mouse,keyboard,monitor,cpu,switch,software from available_computers;";
ResultSet rs = st.executeQuery(query);
jTable1.setModel(DbUtils.resultSetToTableModel(rs));    
}
else if(stu_report.isSelected()==true)
{
   
    if(from_dt.getDate().equals(null)|| to_dt.getDate().equals(null))
    {
    JOptionPane.showMessageDialog(null,"Please select a date range.");
    }
    else       
    {
try
{
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
Date db_chk = from_dt.getDate();
Date da_chk = to_dt.getDate();
if(db_chk.before(da_chk) == true)
{
String db = sdf.format(db_chk);
String da = sdf.format(da_chk);
if(class_list.getSelectedIndex() == -1)
{
JOptionPane.showMessageDialog(null, "No Class Selected.","Error",JOptionPane.ERROR_MESSAGE);
}
else
{
Object[] sel_class = class_list.getSelectedValues();
String fin_cla = getListvalues(sel_class);
Statement stmt = con.createStatement();
String qry = "";
if(comp_list.getSelectedIndex() == -1 && admin_list.getSelectedIndex() == -1)
{
    qry = "select Class,Section,Rollno,Name,Comp,Date(date_and_time) as Date,Admin from stu_report where concat(Class,Section) in("+fin_cla+") and date(date_and_time) between '"+db+"' and '"+da+"';";
}
else if(comp_list.getSelectedIndex() != -1 && admin_list.getSelectedIndex() == -1)
{
Object[] sel_comp = comp_list.getSelectedValues();
String fin_comp = getListvalues(sel_comp);
qry = "select Class,Section,Rollno,Name,Comp,Date(date_and_time) as Date,Admin from stu_report where concat(Class,Section) in("+fin_cla+") and Comp in("+fin_comp+") and date(date_and_time) between '"+db+"' and '"+da+"';";
}
else if(admin_list.getSelectedIndex() != -1 && comp_list.getSelectedIndex() == -1)
{
Object[] sel_nm = admin_list.getSelectedValues();
String fin_nm = getListvalues(sel_nm);
qry = "select Class,Section,Rollno,Name,Comp,Date(date_and_time) as Date,Admin from stu_report where concat(Class,Section) in("+fin_cla+") and Admin in("+fin_nm+") and date(date_and_time) between '"+db+"' and '"+da+"';";
}
else if(comp_list.getSelectedIndex() != -1 && admin_list.getSelectedIndex() != -1)
{
Object[] sel_comp = comp_list.getSelectedValues();
String fin_comp = getListvalues(sel_comp);
Object[] sel_nm = admin_list.getSelectedValues();
String fin_nm = getListvalues(sel_nm);
qry = "select Class,Section,Rollno,Name,Comp,Date(date_and_time) as Date,Admin from stu_report where concat(Class,Section) in("+fin_cla+") and Comp in("+fin_comp+") and Admin in("+fin_nm+") and date(date_and_time) between '"+db+"' and '"+da+"';";
}
ResultSet ru = stmt.executeQuery(qry);
jTable1.setModel(DbUtils.resultSetToTableModel(ru));
if(jTable1.getRowCount() == 0)
{
JOptionPane.showMessageDialog(null,"No details matched");
}
}
}
else
{
JOptionPane.showMessageDialog(null,"Please Enter a valid date range","Error",JOptionPane.ERROR_MESSAGE);
}
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null,"invalid Date range.","Error",JOptionPane.ERROR_MESSAGE);
}
}
}
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,"Invalid Entry.Try Again.","Error",JOptionPane.ERROR_MESSAGE);
}
    }

    }//GEN-LAST:event_gen_report_btnActionPerformed

    private void comp_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_reportActionPerformed
   DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
  m.setRowCount(0);
  m.setColumnCount(0);
       from_dt.setEnabled(false);
       to_dt.setEnabled(false);
       class_list.setEnabled(false);
       comp_list.setEnabled(false);
       admin_list.setEnabled(false);
    }//GEN-LAST:event_comp_reportActionPerformed

    private void print_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_report_btnActionPerformed
if(jTable1.getRowCount()==0)
        {
        JOptionPane.showMessageDialog(null,"Please Generate the Report first.");
        }
        else
        {
MessageFormat header = new MessageFormat("Report Print");
MessageFormat footer = new MessageFormat("Page{0,number,integer}");
try
{
jTable1.print(JTable.PrintMode.NORMAL,header,footer);
}
catch(java.awt.print.PrinterException e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
        }
    }//GEN-LAST:event_print_report_btnActionPerformed

    private void export_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_btnActionPerformed
        if(jTable1.getRowCount()==0)
        {
        JOptionPane.showMessageDialog(null,"Please Generate the Report first.");
        }
        else
        {
        JTextField t = new JTextField();
        Object [] show = {"Enter PDF Name",t};
        int confirm = JOptionPane.showConfirmDialog(null,show,"Enter",JOptionPane.YES_NO_OPTION);
try
{
           String t_text = t.getText();    
        if(confirm == JOptionPane.YES_OPTION && t.getText().equals("") == false)
        {
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
       int y = mod.getColumnCount(); 
        String path = "";
         JFileChooser j = new JFileChooser();
         j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
         int x = j.showSaveDialog(this);
         
         if(x == JFileChooser.APPROVE_OPTION)
         {
             path = j.getSelectedFile().getPath();
         }
         
         Document doc = new Document();
         try
         {
         PdfWriter.getInstance(doc, new FileOutputStream(path+"\\"+t.getText()+".pdf"));
         doc.open();
         PdfPTable tb1 = new PdfPTable(y);
         if(y == 7)
         {
         tb1.addCell("Class");
         tb1.addCell("Section");
         tb1.addCell("Rollno");
         tb1.addCell("Name");
         tb1.addCell("Comp");
         tb1.addCell("Date");
         tb1.addCell("Admin");
         for(int i = 0;i<jTable1.getRowCount();++i)
         {
         String C =jTable1.getValueAt(i,0).toString();
         String S =jTable1.getValueAt(i,1).toString();
         String R =jTable1.getValueAt(i,2).toString();
         String N =jTable1.getValueAt(i,3).toString();
         String Co =jTable1.getValueAt(i,4).toString();
         String D =jTable1.getValueAt(i,5).toString();
         String U = jTable1.getValueAt(i,6).toString();
         tb1.addCell(C);
         tb1.addCell(S);
         tb1.addCell(R);
         tb1.addCell(N);
         tb1.addCell(Co);
         tb1.addCell(D);
         tb1.addCell(U);
         }
         }
         else if(y==8)
         {
         tb1.addCell("Sno");
         tb1.addCell("Computer");
         tb1.addCell("Mouse");
         tb1.addCell("Keyboard");
         tb1.addCell("Monitor");
         tb1.addCell("CPU");
         tb1.addCell("Switch");
         tb1.addCell("Software");
         for(int i = 0;i<jTable1.getRowCount();++i)
         {
         String S =jTable1.getValueAt(i,0).toString();
         String C =jTable1.getValueAt(i,1).toString();
         String M =jTable1.getValueAt(i,2).toString();
         String K =jTable1.getValueAt(i,3).toString();
         String MO =jTable1.getValueAt(i,4).toString();
         String CPU =jTable1.getValueAt(i,5).toString();
         String SW =jTable1.getValueAt(i,6).toString();
         String SO =jTable1.getValueAt(i,7).toString();
         
         tb1.addCell(S);
         tb1.addCell(C);
         tb1.addCell(M);
         tb1.addCell(K);
         tb1.addCell(MO);
         tb1.addCell(CPU);
         tb1.addCell(SW);
         tb1.addCell(SO);
         }
         }
         doc.add(tb1);
     } catch (Exception ex) {
       JOptionPane.showMessageDialog(null,"Unexpected Error Occured.Please Retry.","Error",JOptionPane.ERROR_MESSAGE);
     } 
        
         doc.close();
        }
        else
        {
        JOptionPane.showMessageDialog(null,"File Not Created","Error",JOptionPane.ERROR_MESSAGE);
        }
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
        }
    }//GEN-LAST:event_export_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        Allocated_computers i = new Allocated_computers();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(report_Generation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report_Generation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report_Generation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report_Generation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report_Generation().setVisible(true);
            }
        });
    }
private void initDateEditor()
{

dt_From = (JTextFieldDateEditor) from_dt.getDateEditor();
dt_From.setEditable(false);
dt_To = (JTextFieldDateEditor) to_dt.getDateEditor();
dt_To.setEditable(false);
}

private void cb_add()
    {
     class_CB.removeAllItems();
        section_CB.removeAllItems();
        class_CB.addItem("Select Class");
        section_CB.addItem("Select Section");
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
                class_CB.addItem(rt.getString(1));
            }
            Statement su = con.createStatement();
            ResultSet ru = su.executeQuery("select distinct(section) from comboaddtableandsection order by section");
            while (ru.next()) {
                section_CB.addItem(ru.getString(1));
            }
            String query = "delete from comboaddtableandsection;";
            stm.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
private String getListvalues(Object[] sel_class)
{
int l = sel_class.length;
String [] class_sel = new String[l];
for(int i = 0;i<l;++i)
{
class_sel[i] = sel_class[i].toString();
}
for(int i = 0; i<class_sel.length;++i)
{
class_sel[i] = "'"+class_sel[i]+"'";
}
String fin_cla = Arrays.toString(class_sel);
int lenth = fin_cla.length();
fin_cla = fin_cla.substring(1,lenth-1);
return fin_cla;
}
private void openf(String a) {
        initDateEditor();
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dmnsn = t.getScreenSize();
        jLabel2.setSize(dmnsn);
        this.setSize(dmnsn);
        ImageIcon img = new ImageIcon(getClass().getResource(a));
        Image im = img.getImage();
        Image fin = im.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon background_img = new ImageIcon(fin);
        jLabel2.setIcon(background_img);
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
    private javax.swing.JList<String> admin_list;
    private javax.swing.JButton back_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JList<String> class_list;
    private javax.swing.JList<String> comp_list;
    private javax.swing.JRadioButton comp_report;
    private javax.swing.JButton export_btn;
    private com.toedter.calendar.JDateChooser from_dt;
    private javax.swing.JButton gen_report_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print_report_btn;
    private javax.swing.JRadioButton stu_report;
    private com.toedter.calendar.JDateChooser to_dt;
    // End of variables declaration//GEN-END:variables
}
