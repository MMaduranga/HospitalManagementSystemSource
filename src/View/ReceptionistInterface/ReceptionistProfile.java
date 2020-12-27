package View.ReceptionistInterface;

import Controllers.CheckValidation;
import Controllers.ImageController;
import Controllers.JpanelGradient;
import Controllers.ReadFile;
import Controllers.ResizeInternalFrame;
import Controllers.SimpleMethodsController;
import Controllers.WriteFile;
import Model.Receptionist;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ReceptionistProfile extends javax.swing.JInternalFrame {

    private String receptionistDetails;
    private SimpleMethodsController simpleMethods;
    public String profilePicPath;
    private String strReceptionistFilePath = "src\\TxtFiles\\Receptionist.mov";
    JDesktopPane desktopPane;

    public ReceptionistProfile(String receptionistDetails, JDesktopPane desktopPane) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI basicinternalform = (BasicInternalFrameUI) this.getUI();
        basicinternalform.setNorthPane(null);

        this.setReceptionistDetails(receptionistDetails);
        startUp(this.geReceptionistDetails());
        addPendingAppoinmentsToDropDown();

        this.desktopPane = desktopPane;
        simpleMethods = new SimpleMethodsController();
        
    }

    public void setReceptionistDetails(String medicalofficerDetails) {
        this.receptionistDetails = medicalofficerDetails;
    }

    public String geReceptionistDetails() {
        return this.receptionistDetails;
    }

    public String getReceptionistFilePath() {
        return this.strReceptionistFilePath;
    }

    public void startUp(String receptionistdetails) {
        try {
            String[] details = receptionistdetails.split("~");

            jTextField1.setText(details[1]);
            jTextField2.setText(details[2]);
            jTextField3.setText(details[3]);
            jComboBox2.setSelectedItem(details[4]);
            jTextField8.setText(details[5]);
            jTextField5.setText(details[6]);
            jTextField6.setText(details[7]);
            jTextArea1.setText(details[8]);
            jComboBox3.setSelectedItem(details[9]);
            this.profilePicPath = details[10];
            jTextField9.setText(details[11]);
            jTextField10.setText(details[12]);
            jTextField11.setText(details[13]);
            jTextField12.setText(details[14]);
            jTextField13.setText(details[15]);
            if (details[16].equals("ResetPassword")) {
                jTextField2.setForeground(new Color(255, 0, 0));
                jTextField2.setFont(new Font("Tahoma", Font.BOLD, 24));

            }
            setImage();
        } catch (Exception e) {

        }
    }

    public void showMessage() {
        try {
            Thread.sleep(1000);
            JOptionPane.showMessageDialog(null, "Reset the Password");
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JpanelGradient(new Color(0,230,255), new Color(0,26,51),1000);
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

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
        jPanel2.setMinimumSize(new java.awt.Dimension(250, 27));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 27));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setPreferredSize(new java.awt.Dimension(450, 337));

        jButton1.setBackground(new java.awt.Color(0, 40, 53));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 216, 255));
        jButton1.setText("Save changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 216, 255));
        jLabel2.setText("BASIC INFORMATIONS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("User Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Name :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("ID Card No :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Date of Birth :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Maritial Status :");

        jTextField1.setBackground(new Color(0,0,0,0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField1.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField1.setPreferredSize(new java.awt.Dimension(250, 27));

        jTextField2.setBackground(new Color(0,0,0,0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField2.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField2.setPreferredSize(new java.awt.Dimension(250, 27));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField2MouseEntered(evt);
            }
        });

        jTextField3.setBackground(new Color(0,0,0,0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField3.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField3.setPreferredSize(new java.awt.Dimension(250, 27));

        jTextField5.setBackground(new Color(0,0,0,0));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField5.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField5.setPreferredSize(new java.awt.Dimension(250, 27));

        jTextField6.setBackground(new Color(0,0,0,0));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField6.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField6.setPreferredSize(new java.awt.Dimension(250, 27));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 216, 255));
        jLabel10.setText("CONTACT INFORMATIONS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Telephone :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setText("Address :");

        jTextField8.setBackground(new Color(0,0,0,0));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField8.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField8.setPreferredSize(new java.awt.Dimension(250, 27));

        jTextArea1.setBackground(new Color(0,0,0,0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextArea1.setMinimumSize(new java.awt.Dimension(250, 130));
        jTextArea1.setPreferredSize(new java.awt.Dimension(250, 130));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 26, 51));
        jLabel13.setText("Receptionist");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText(">>");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setText("Profile");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel16.setText("E-mail :");

        jTextField10.setBackground(new Color(0,0,0,0));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField10.setMinimumSize(new java.awt.Dimension(424, 29));
        jTextField10.setPreferredSize(new java.awt.Dimension(424, 29));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 216, 255));
        jLabel19.setText("STAFF  INFORMATIONS");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel17.setText("Staff ID :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel18.setText("Date of Join :");

        jButton2.setBackground(new java.awt.Color(0, 40, 53));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_image_gallery_30px.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(45, 37));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel20.setText("Staff Photograph :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setText("Attach doc :");

        jTextField9.setBackground(new Color(0,0,0,0));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField9.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField9.setPreferredSize(new java.awt.Dimension(250, 27));

        jTextField11.setBackground(new Color(0,0,0,0));
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField11.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField11.setPreferredSize(new java.awt.Dimension(250, 27));

        jTextField12.setBackground(new Color(0,0,0,0));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField12.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField12.setPreferredSize(new java.awt.Dimension(250, 27));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setBackground(new Color(0,0,0,0));
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));
        jTextField13.setMinimumSize(new java.awt.Dimension(250, 27));
        jTextField13.setPreferredSize(new java.awt.Dimension(250, 27));

        jButton3.setBackground(new java.awt.Color(0, 40, 53));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_image_gallery_30px.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(45, 37));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 40, 53));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_preview_pane_30px.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(45, 37));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 40, 53));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_new_copy_30px.png"))); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(45, 37));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel22.setText("Pending Appoinments :");

        jComboBox1.setBackground(new Color(0,0,0,0));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));

        jButton6.setBackground(new java.awt.Color(0, 40, 53));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_message_preview_30px.png"))); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(79, 37));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new Color(0,0,0,0));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));

        jComboBox3.setBackground(new Color(0,0,0,0));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 26,51)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(67, 67, 67)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel15))
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(105, 105, 105)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(77, 77, 77)
                                                        .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(50, 50, 50)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(103, 103, 103)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(64, 64, 64)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(51, 51, 51)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addGap(32, 32, 32)
                                                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addGap(174, 174, 174)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jButton1))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(87, 87, 87)
                                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(34, 34, 34))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jSeparator2))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator3)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel19))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        simpleMethods.changeFilesLocation(this.profilePicPath);

        try {
            new ReadFile(this.geReceptionistDetails()).deleteObj(new File(this.getReceptionistFilePath()));
            addChanges();

        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField13.setText(simpleMethods.fileChooser().toString());
        simpleMethods.changeFilesLocation(jTextField13);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.profilePicPath = simpleMethods.fileChooser().toString();
        setImage();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField12.setText(simpleMethods.fileChooser().toString());
        simpleMethods.changeFilesLocation(jTextField12);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ImageController().previewImage(jTextField12.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String[] appoinmentDetails = jComboBox1.getSelectedItem().toString().split("-");
        new ResizeInternalFrame(new ReceptionistViewAppointment1(appoinmentDetails[1]), this.desktopPane);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized
        setImage();
    }//GEN-LAST:event_jPanel1ComponentResized

    private void jTextField2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseEntered

    }//GEN-LAST:event_jTextField2MouseEntered
    public void setImage() {

        ImageIcon welcomeFrameArt = new ImageIcon(this.profilePicPath);
        Image resizeImage = welcomeFrameArt.getImage();

        Image newResizedImage = resizeImage.getScaledInstance((int) (this.getWidth() / 2.3), (int) (this.getHeight() / 3.3), Image.SCALE_SMOOTH);
        welcomeFrameArt = new ImageIcon(newResizedImage);

        jLabel1.setIcon(welcomeFrameArt);
    }

    public void addChanges() {
        String strErrorMessage = "Fail";
        try {

            CheckValidation checkValidation = new CheckValidation();

            String userName = jTextField1.getText().toLowerCase();
            if (!checkValidation.checkUserName(userName, this.getReceptionistFilePath(), 1)) {
                strErrorMessage = "User Name Already Exists";
                throw new IOException();
            }
            String name = jTextField3.getText().toLowerCase();
            String gender = jComboBox2.getSelectedItem().toString();
            String phoneNo = jTextField8.getText();
            if (!checkValidation.checkPhoneNumber(phoneNo, this.getReceptionistFilePath(), 5)) {
                strErrorMessage = "Invalid Phone Numbers Or Phone Number Already Exists";
                throw new IOException();
            }
            String idNo = jTextField5.getText().toLowerCase();
            if (!checkValidation.checkIdNumber(idNo, this.getReceptionistFilePath(), 6)) {
                strErrorMessage = "Invalid Id Numbers Or Id Number Already Exists";
                throw new IOException();
            }

            LocalDate DOB = LocalDate.parse(jTextField6.getText());
            String address = jTextArea1.getText().toLowerCase();
            String materialStatus = jComboBox3.getSelectedItem().toString();
            String password = jTextField2.getText();
            File profilePic = new File(this.profilePicPath);
            int staffId = Integer.valueOf(jTextField9.getText());
            String staffEmailAddress = jTextField10.getText().toLowerCase();
            if (!checkValidation.checkEmailId(staffEmailAddress, this.getReceptionistFilePath(), 12)) {
                strErrorMessage = "Invalid Email Address Numbers Or Email Address Already Exists";
                throw new IOException();
            }
            LocalDate dateOfJoin = LocalDate.parse(jTextField11.getText());
            File staffPhoto = new File(jTextField12.getText());
            File attachDoc = new File(jTextField13.getText());

            WriteFile writeFileObj = new WriteFile();
            writeFileObj.WriteInFile(new Receptionist(staffId, staffEmailAddress,
                    userName, name, gender, phoneNo, idNo, address, materialStatus,
                    password, DOB, profilePic, dateOfJoin, staffPhoto, attachDoc).toString(),
                    new File(this.getReceptionistFilePath()));
            writeFileObj.setNumber("src\\TxtFiles\\StaffIdNo.mov");
            JOptionPane.showMessageDialog(null, "Success");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, strErrorMessage, "", 2);
        }

    }

    public void addPendingAppoinmentsToDropDown() {

        ArrayList<String> totalFileLines = new ReadFile().readTotalFile(new File("src\\TxtFiles\\Appoinment.mov"));
        for (int count = 0; count < totalFileLines.size(); count++) {
            String[] appoinmentDetails = totalFileLines.get(count).split("~");
            if (appoinmentDetails[1].equals("Pending")) {
                jComboBox1.addItem(appoinmentDetails[3] + "-" + appoinmentDetails[6]);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
