package View.AdminInterface;

import Controllers.CreateCSV;
import Controllers.CreatePDF;
import Controllers.JpanelGradient;
import Controllers.ReadFile;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class PatientLogin extends javax.swing.JInternalFrame {

    private ArrayList<String> totalRowsArray;
    private Color panelBackgroundColor;
    private Color fontBorderColor;

    public PatientLogin(Color panelBackgroundColor, Color fontBorderColor) {
        this.setPanelBackgroundColor(panelBackgroundColor);
        this.setFontBorderColor(fontBorderColor);
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI basicinternalform = (BasicInternalFrameUI) this.getUI();
        basicinternalform.setNorthPane(null);
        addDataToTextArea();
    }

    public Color getPanelBackgroundColor() {
        return panelBackgroundColor;
    }

    public void setPanelBackgroundColor(Color panelBackgroundColor) {
        this.panelBackgroundColor = panelBackgroundColor;
    }

    public Color getFontBorderColor() {
        return fontBorderColor;
    }

    public void setFontBorderColor(Color fontBorderColor) {
        this.fontBorderColor = fontBorderColor;
    }

    public void setTotalRowArray(ArrayList<String> totalRowArry) {
        this.totalRowsArray = totalRowArry;
    }

    public ArrayList<String> getTotalRowArray() {
        return this.totalRowsArray;
    }

    public void addDataToTextArea() {

        this.setTotalRowArray(new ReadFile().readTotalFile(new File("src\\TxtFiles\\Pateint.mov")));

        jTextArea1.setText(arrangeData());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JpanelGradient(new Color(0,230,255), new Color(0,26,51),1000);
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 26, 51)));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 960));
        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 960));

        jPanel2.setBackground(this.panelBackgroundColor);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 26, 51)));
        jPanel2.setMinimumSize(new java.awt.Dimension(990, 910));
        jPanel2.setPreferredSize(new java.awt.Dimension(990, 910));

        jButton1.setBackground(new java.awt.Color(0, 40, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 216, 255));
        jButton1.setText("Export PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 40, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 216, 255));
        jButton2.setText("Export CSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setBackground(this.panelBackgroundColor);
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(this.getFontBorderColor());
        jLabel7.setText("Admin");

        jLabel8.setBackground(new java.awt.Color(230, 230, 230));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText(">>");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Patient Login Credential");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(this.panelBackgroundColor);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextArea1.setForeground(    this.getFontBorderColor());
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jSeparator1)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 478, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                .addGap(25, 25, 25))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new CreatePDF().writeInPDF(this.arrangeData(),
                    "C:\\Users\\DELL\\Desktop\\Patient Login Credential.pdf");
            JOptionPane.showMessageDialog(null, "Successfully Created the PDF ");
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            new CreateCSV().writeInCSVFile(new File("C:\\Users\\DELL\\Desktop\\Patient Login Credential.csv"), this.getTotalRowArray());
            JOptionPane.showMessageDialog(null, "Successfully Created the CSV ");
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    public String arrangeData() {
        String strParagraphContent = "PATIENT LOGIN CREDENTIAL\n";
        for (String line : this.getTotalRowArray()) {
            String[] lineDetails = line.split("~");
            strParagraphContent += "\n------------------------------------------------------------------------\n"
                    + "NAME:" + lineDetails[3] + "\nUSER NAME:" + lineDetails[1] + "\nPASSWORD:" + lineDetails[2];
        }
        return strParagraphContent;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
