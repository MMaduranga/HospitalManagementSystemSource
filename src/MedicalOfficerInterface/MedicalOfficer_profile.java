package MedicalOfficerInterface;

import AdminInterface.AdminDashboardInterface;
import Controllers.CheckValidation;
import Controllers.ImageController;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import Controllers.JpanelGradient;
import Controllers.ReadFile;
import Controllers.ResizeInternalFrame;
import Controllers.SimpleMethodsController;
import Controllers.WriteFile;
import LoginInterface.Login;
import Model.MedicalOfficer;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class MedicalOfficer_profile extends javax.swing.JInternalFrame {

    private String medicalofficerDetails;
    private SimpleMethodsController simpleMethods;
    private String profilePicPath;
    private String strMedicalOfficerFilePath = "src\\TxtFiles\\MedicalOfficer.mov";
    JDesktopPane desktopPane;

    public MedicalOfficer_profile(String medicalOfficerDetails, JDesktopPane desktopPane) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI basicinternalform = (BasicInternalFrameUI) this.getUI();
        basicinternalform.setNorthPane(null);
        
        this.setMedicalofficerDetails(medicalOfficerDetails);
        startUp(this.getMedicalofficerDetails());
        addApprovedAppoinmentsToDropDown();
        simpleMethods = new SimpleMethodsController();
        this.desktopPane = desktopPane;
    }

    public void setMedicalofficerDetails(String medicalofficerDetails) {
        this.medicalofficerDetails = medicalofficerDetails;
    }

    public String getMedicalofficerDetails() {
        return this.medicalofficerDetails;
    }

    public String getMedicalOfficerFilePath() {
        return this.strMedicalOfficerFilePath;
    }

    public void startUp(String medicalOfficerdetails) {
        String[] details = medicalOfficerdetails.split("~");
        jTextField3.setText(details[1]);
        jTextField8.setText(details[2]);
        jTextField6.setText(details[3]);
        jComboBox1.setSelectedItem(details[4]);
        jTextField15.setText(details[5]);
        jTextField5.setText(details[6]);
        jTextField9.setText(details[7]);
        jTextArea2.setText(details[8]);
        jComboBox2.setSelectedItem(details[9]);

        jTextField14.setText(details[11]);
        jTextField19.setText(details[12]);
        jTextField20.setText(details[13]);
        jTextField21.setText(details[14]);
        jTextField17.setText(details[15]);
        jComboBox4.setSelectedItem(details[16]);
        this.profilePicPath = details[10];
        setImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JpanelGradient(new Color(0,230,255), new Color(0,26,51),1000);
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBox4 = new javax.swing.JComboBox<>();

        setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 26, 51)));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 960));
        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 960));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentResized(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 26, 51)));
        jPanel2.setMinimumSize(new java.awt.Dimension(990, 910));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 27));
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentResized(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 153, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 204));

        jLabel1.setPreferredSize(new java.awt.Dimension(430, 297));
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentResized(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Name : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("User Name : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Gender : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("ID Card No : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Martial Status: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Password : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Date of Birth : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 216, 255));
        jLabel9.setText("CONTACT INFORMATION ");

        jTextField3.setBackground(new Color(0,0,0,0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField3.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 216, 255));
        jLabel10.setText("BASIC INFORMATION ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setText("Email :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel22.setText("Telephone : ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel23.setText("Address :");

        jTextField14.setBackground(new Color(0,0,0,0));
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField14.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField14.setMaximumSize(new java.awt.Dimension(230, 27));
        jTextField14.setMinimumSize(new java.awt.Dimension(230, 27));
        jTextField14.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setBackground(new Color(0,0,0,0));
        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField15.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField15.setPreferredSize(new java.awt.Dimension(230, 27));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel24.setText("Satff ID :");

        jTextField17.setBackground(new Color(0,0,0,0));
        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField17.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField17.setMaximumSize(new java.awt.Dimension(230, 27));
        jTextField17.setMinimumSize(new java.awt.Dimension(230, 27));
        jTextField17.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel25.setText("Speciality : ");

        jTextArea2.setBackground(new Color(0,0,0,0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTextArea2);

        jTextField8.setBackground(new Color(0,0,0,0));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField8.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel27.setText("Attach Document : ");

        jTextField19.setBackground(new Color(0,0,0,0));
        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField19.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField19.setMaximumSize(new java.awt.Dimension(230, 27));
        jTextField19.setMinimumSize(new java.awt.Dimension(230, 27));
        jTextField19.setPreferredSize(new java.awt.Dimension(230, 27));
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 216, 255));
        jLabel11.setText("OTHER INFORMATION ");

        jTextField5.setBackground(new Color(0,0,0,0));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField5.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new Color(0,0,0,0));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField6.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField9.setBackground(new Color(0,0,0,0));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField9.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel28.setText("Date of Joining:");

        jTextField20.setBackground(new Color(0,0,0,0));
        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField20.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField20.setMaximumSize(new java.awt.Dimension(230, 27));
        jTextField20.setMinimumSize(new java.awt.Dimension(230, 27));
        jTextField20.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 40, 53));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 216, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_preview_pane_30px.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(45, 37));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 40, 53));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 216, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_image_gallery_30px.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(45, 37));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel29.setText("Staff Photograph :");

        jTextField21.setBackground(new Color(0,0,0,0));
        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField21.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField21.setMaximumSize(new java.awt.Dimension(230, 27));
        jTextField21.setMinimumSize(new java.awt.Dimension(230, 27));
        jTextField21.setPreferredSize(new java.awt.Dimension(260, 27));
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 40, 53));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 216, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_new_copy_30px.png"))); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(45, 37));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 40, 53));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 216, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_image_gallery_30px.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(45, 37));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 26, 51));
        jLabel12.setText("Medical Officer");

        jLabel13.setBackground(new java.awt.Color(230, 230, 230));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText(">>");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 204));
        jLabel14.setText("Profile");

        jButton5.setBackground(new java.awt.Color(0, 40, 53));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 216, 255));
        jButton5.setText("Save Changes");
        jButton5.setPreferredSize(new java.awt.Dimension(200, 45));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new Color(0,0,0,0));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jComboBox1.setPreferredSize(new java.awt.Dimension(260, 27));

        jComboBox2.setBackground(new Color(0,0,0,0));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jComboBox2.setPreferredSize(new java.awt.Dimension(260, 27));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setText("Pending Appoinmnets:");

        jComboBox3.setBackground(new Color(0,0,0,0));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jComboBox3.setPreferredSize(new java.awt.Dimension(260, 27));

        jButton1.setBackground(new java.awt.Color(0, 40, 53));
        jButton1.setForeground(new java.awt.Color(0, 216, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_message_preview_30px.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(79, 37));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jComboBox4.setBackground(new Color(0,0,0,0));
        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fkgjj", "hgjkghjk", "ghjghj" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 353, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(29, 29, 29))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jSeparator2)
                                    .addComponent(jLabel22))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3))
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(24, 24, 24)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );

        jComboBox1.setBackground(new Color(0,0,0,0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jLabel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentResized

    }//GEN-LAST:event_jLabel1ComponentResized

    private void jPanel2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentResized

    }//GEN-LAST:event_jPanel2ComponentResized

    private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized

        setImage();
    }//GEN-LAST:event_jPanel1ComponentResized

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.profilePicPath = simpleMethods.fileChooser().toString();
        setImage();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField21.setText(simpleMethods.fileChooser().toString());
        simpleMethods.changeFilesLocation(jTextField21);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField17.setText(simpleMethods.fileChooser().toString());
        simpleMethods.changeFilesLocation(jTextField17);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        simpleMethods.changeFilesLocation(this.profilePicPath);

        try {
            new ReadFile(this.getMedicalofficerDetails()).deleteObj(new File(this.getMedicalOfficerFilePath()));
            addChanges();

        } catch (Exception e) {

        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ImageController().previewImage(jTextField21.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] appoinmentDetails = jComboBox3.getSelectedItem().toString().split("-");
        new ResizeInternalFrame(new ViewAppointmentMedicalOfficer1(appoinmentDetails[1]), this.desktopPane);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void setImage() {

        ImageIcon welcomeFrameArt = new ImageIcon(this.profilePicPath);
        Image resizeImage = welcomeFrameArt.getImage();

        Image newResizedImage = resizeImage.getScaledInstance((int) (this.getWidth() / 2.3), (int) (this.getHeight() / 3.3), Image.SCALE_SMOOTH);
        welcomeFrameArt = new ImageIcon(newResizedImage);

        jLabel1.setIcon(welcomeFrameArt);
    }

    public void addChanges() {
        System.out.println("bfbvfkj");
        String strErrorMessage = "Fail";
        try {
            CheckValidation checkValidation = new CheckValidation();

            String userName = jTextField3.getText().toLowerCase();
            if (!checkValidation.checkUserName(userName, this.getMedicalOfficerFilePath(), 1)) {
                strErrorMessage = "User Name Already Exists";
                throw new IOException();
            }
            String name = jTextField6.getText().toLowerCase();
            String gender = jComboBox1.getSelectedItem().toString();
            String phoneNo = jTextField15.getText();
            if (!checkValidation.checkPhoneNumber(phoneNo, this.getMedicalOfficerFilePath(), 5)) {
                strErrorMessage = "Invalid Phone Numbers Or Phone Number Already Exists";
                throw new IOException();
            }
            String idNo = jTextField5.getText().toLowerCase();
            if (!checkValidation.checkIdNumber(idNo, this.getMedicalOfficerFilePath(), 6)) {
                strErrorMessage = "Invalid Id Numbers Or Id Number Already Exists";
                throw new IOException();
            }
            LocalDate DOB = LocalDate.parse(jTextField9.getText());
            String address = jTextArea2.getText().toLowerCase();
            String materialStatus = jComboBox2.getSelectedItem().toString();
            String password = jTextField8.getText();
            File profilePic = new File(this.profilePicPath);

            int staffId = Integer.valueOf(jTextField14.getText());
            String staffEmailAddress = jTextField19.getText().toLowerCase();
            if (!checkValidation.checkEmailId(staffEmailAddress, this.getMedicalOfficerFilePath(), 12)) {
                strErrorMessage = "Invalid Email Address Numbers Or Email Address Already Exists";
                throw new IOException();
            }
            LocalDate dateOfJoin = LocalDate.parse(jTextField20.getText());
            File staffPhoto = new File(jTextField21.getText());
            File attachDoc = new File(jTextField17.getText());
            String spetialtyArea = jComboBox4.getSelectedItem().toString().toLowerCase();

            WriteFile writeFileObj = new WriteFile();
            MedicalOfficer medicalOfficerDetails = new MedicalOfficer(staffId, staffEmailAddress,
                    userName, name, gender, phoneNo, idNo,
                    address, materialStatus, password, DOB, profilePic, dateOfJoin,
                    staffPhoto, attachDoc, spetialtyArea);
            this.setMedicalofficerDetails(medicalofficerDetails);
            writeFileObj.WriteInFile(medicalOfficerDetails, new File(this.getMedicalOfficerFilePath()));

            JOptionPane.showMessageDialog(null, "To Load the new Details Please SignIn again");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, strErrorMessage, "", 2);
        }
    }

    public void addApprovedAppoinmentsToDropDown() {

        ArrayList<String> totalFileLines = new ReadFile().readTotalFile(new File("src\\TxtFiles\\Appoinment.mov"));
        for (int count = 0; count < totalFileLines.size(); count++) {
            String[] appoinmentDetails = totalFileLines.get(count).split("~");
            if (appoinmentDetails[1].equals("Approved")) {
                jComboBox3.addItem(appoinmentDetails[3] + "-" + appoinmentDetails[6]);
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
