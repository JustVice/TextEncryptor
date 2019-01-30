package UIFrame;

import Logic.Run;
import Logic.Static;
import Logic.UserData;
import PopUpMessagesDeprecated.PopUpThread;
import java.awt.Desktop;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        setIconImage(Static.getIconImage());
        initComponents();
        setLocationRelativeTo(null);
        setTitle(Static.title + ". version = " + Static.version);
        parameters();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Panel1 = new javax.swing.JTextArea();
        convert = new javax.swing.JButton();
        copyEncrypt = new javax.swing.JButton();
        clear1and2 = new javax.swing.JButton();
        copyToClipboardEncrypt = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Panel4 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Panel3 = new javax.swing.JTextArea();
        unencrypt = new javax.swing.JButton();
        copyUnencrypt = new javax.swing.JButton();
        clear3and4 = new javax.swing.JButton();
        copyToClipboardUnencrypt = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FieldcustomCharTxt = new javax.swing.JTextField();
        saveCustomCharFile = new javax.swing.JButton();
        defaultTxtFileNameDisplay = new javax.swing.JLabel();
        what1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        saveLogs = new javax.swing.JRadioButton();
        what2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        separatorCharLabel = new javax.swing.JLabel();
        separatorCharField = new javax.swing.JTextField();
        what3 = new javax.swing.JButton();
        separatorCharSave = new javax.swing.JButton();
        resetSeparatorChar = new javax.swing.JButton();
        PopUpMessagesCombo = new javax.swing.JRadioButton();
        deleteAllData = new javax.swing.JButton();
        createNewRandomKeys = new javax.swing.JButton();
        showStartLogoCombo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        alllinks = new javax.swing.JLabel();
        github = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel2.setColumns(20);
        Panel2.setRows(5);
        jScrollPane1.setViewportView(Panel2);

        Panel1.setColumns(20);
        Panel1.setRows(5);
        jScrollPane2.setViewportView(Panel1);

        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        copyEncrypt.setText("Copy to clipboard");
        copyEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyEncryptActionPerformed(evt);
            }
        });

        clear1and2.setText("Clear");
        clear1and2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1and2ActionPerformed(evt);
            }
        });

        copyToClipboardEncrypt.setText("Copy to clipboard after convert");
        copyToClipboardEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyToClipboardEncryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(convert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyEncrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear1and2)
                        .addGap(18, 18, 18)
                        .addComponent(copyToClipboardEncrypt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convert)
                    .addComponent(copyEncrypt)
                    .addComponent(clear1and2)
                    .addComponent(copyToClipboardEncrypt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Encrypt", jPanel1);

        Panel4.setColumns(20);
        Panel4.setRows(5);
        jScrollPane3.setViewportView(Panel4);

        Panel3.setColumns(20);
        Panel3.setRows(5);
        jScrollPane4.setViewportView(Panel3);

        unencrypt.setText("Unencrypt");
        unencrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unencryptActionPerformed(evt);
            }
        });

        copyUnencrypt.setText("Copy to clipboard");
        copyUnencrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyUnencryptActionPerformed(evt);
            }
        });

        clear3and4.setText("Clear");
        clear3and4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3and4ActionPerformed(evt);
            }
        });

        copyToClipboardUnencrypt.setText("Copy to clipboard after convert");
        copyToClipboardUnencrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyToClipboardUnencryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(unencrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(copyUnencrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear3and4)
                        .addGap(18, 18, 18)
                        .addComponent(copyToClipboardUnencrypt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unencrypt)
                    .addComponent(copyUnencrypt)
                    .addComponent(clear3and4)
                    .addComponent(copyToClipboardUnencrypt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Unencrypt", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Open data folder");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel2.setText("Custom char file");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        FieldcustomCharTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldcustomCharTxtKeyTyped(evt);
            }
        });
        jPanel3.add(FieldcustomCharTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, 209, -1));

        saveCustomCharFile.setText("Load and save");
        saveCustomCharFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCustomCharFileActionPerformed(evt);
            }
        });
        jPanel3.add(saveCustomCharFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        defaultTxtFileNameDisplay.setText("Default: ");
        jPanel3.add(defaultTxtFileNameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, -1, -1));

        what1.setText("?");
        what1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                what1ActionPerformed(evt);
            }
        });
        jPanel3.add(what1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 16, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, 228, 10));

        saveLogs.setText("Save logs");
        saveLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveLogsActionPerformed(evt);
            }
        });
        jPanel3.add(saveLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, -1, -1));

        what2.setText("?");
        what2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                what2ActionPerformed(evt);
            }
        });
        jPanel3.add(what2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 177, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 228, 10));

        separatorCharLabel.setText("Separator char: ");
        jPanel3.add(separatorCharLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, -1, -1));

        separatorCharField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                separatorCharFieldKeyTyped(evt);
            }
        });
        jPanel3.add(separatorCharField, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 262, 31, -1));

        what3.setText("?");
        what3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                what3ActionPerformed(evt);
            }
        });
        jPanel3.add(what3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 235, -1, -1));

        separatorCharSave.setText("Save");
        separatorCharSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                separatorCharSaveActionPerformed(evt);
            }
        });
        jPanel3.add(separatorCharSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 288, -1, -1));

        resetSeparatorChar.setText("Reset");
        resetSeparatorChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetSeparatorCharActionPerformed(evt);
            }
        });
        jPanel3.add(resetSeparatorChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 288, -1, -1));

        PopUpMessagesCombo.setText("Show PopUp messages");
        PopUpMessagesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopUpMessagesComboActionPerformed(evt);
            }
        });
        jPanel3.add(PopUpMessagesCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        deleteAllData.setText("Delete all data");
        deleteAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllDataActionPerformed(evt);
            }
        });
        jPanel3.add(deleteAllData, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        createNewRandomKeys.setText("Create new random keys");
        createNewRandomKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewRandomKeysActionPerformed(evt);
            }
        });
        jPanel3.add(createNewRandomKeys, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        showStartLogoCombo.setText("Show start logo");
        showStartLogoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStartLogoComboActionPerformed(evt);
            }
        });
        jPanel3.add(showStartLogoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jTabbedPane1.addTab("Options", jPanel3);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setText("<html>- Made by Just Vice<br/>- Programmer<br/>- Digital artist<br/><br/>You are welcome</html>");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo1.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo1 smaller.png"))); // NOI18N

        twitter.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        twitter.setText("<html><a href=\"https://twitter.com/JustVicee\">Twitter</a></html>");
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });

        alllinks.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        alllinks.setText("<html><a href=\"https://twitter.com/JustVicee\">All Links</a></html>");
        alllinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alllinksMouseClicked(evt);
            }
        });

        github.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        github.setText("<html><a href=\"https://twitter.com/JustVicee\">Github</a></html>");
        github.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                githubMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jv.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(github, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alllinks, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 325, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(github, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alllinks, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("About", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Desktop.getDesktop().open(new File(Static.DataFolderPath));
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void unencryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unencryptActionPerformed
        if (!Panel3.getText().equals("")) {
            if (isItEncryptedText(Panel3.getText())) {
                String message = "";
                StringBuilder sb = new StringBuilder(Panel3.getText());
                String darkChar = "";
                boolean complete = false;
                while (!complete) {
                    while (true) {
                        if (sb.charAt(0) != Static.data.getUserData().getDarkCharSeparator().charAt(0)) {
                            darkChar += sb.charAt(0) + "";
                            sb.deleteCharAt(0);
                        } else {
                            sb.deleteCharAt(0);
                            if (sb.toString().equals("")) {
                                complete = true;
                            }
                            break;
                        }
                    }
                    message += LightTheDarkChar(darkChar);
                    darkChar = "";
                }
                Panel4.setText(message);
                saveLog2();
                checkcopyToClipboardUnencryptWhenConvert();
            } else {
                String str = "The encrypted text inserted is not either real encrypted text or has the correct\nseparator character. Review the text and separator character at options.\nCurrent separator character = \"" + Static.data.getUserData().getDarkCharSeparator() + "\".";
                JOptionPane.showMessageDialog(null, str, "There is something wrong.", 0);
            }
        } else {
            System.out.println("Nothing written.");
        }
    }//GEN-LAST:event_unencryptActionPerformed

    private boolean isItEncryptedText(String str) {
        boolean boo = false;
        char c = Static.data.getUserData().getDarkCharSeparator().charAt(0);
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (sb.charAt(0) == c) {
                boo = true;
                break;
            } else {
                sb.deleteCharAt(0);
            }
        }
        return boo;
    }

    private String LightTheDarkChar(String str) {
        int n = 0;
        boolean found = false;
        for (int i = 0; i < Static.charactersList.size(); i++) {
            if (Static.charactersList.get(i).getDarkChar().equals(str)) {
                n = i;
                found = true;
                break;
            }
        }
        if (found) {
            return Static.charactersList.get(n).getLightChar();
        } else {
            return str;
        }
//return Static.charactersList.get(n).getLightChar();
    }

    private void clear1and2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1and2ActionPerformed
        Panel1.setText("");
        Panel2.setText("");
    }//GEN-LAST:event_clear1and2ActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        if (!Panel1.getText().equals("")) {
            if (Static.run.prohibitedCharCheck(Panel1.getText())) {
                String message = "";
                StringBuilder sb = new StringBuilder(Panel1.getText());
                for (int i = 0; i < Panel1.getText().length(); i++) {
                    boolean found = false;
                    for (int j = 0; j < Static.charactersList.size(); j++) {
                        String str = sb.charAt(0) + "";
                        String light = Static.charactersList.get(j).getLightChar();
                        if (light.equals(str)) {
                            message += Static.charactersList.get(j).getDarkChar() + Static.data.getUserData().getDarkCharSeparator();
                            sb.deleteCharAt(0);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        message += sb.charAt(0) + Static.data.getUserData().getDarkCharSeparator();
                        sb.deleteCharAt(0);
                    }
                }
                Panel2.setText(message);
                checkcopyToClipboardEncryptWhenConvert();
                saveLog1();
            }
        } else {
            System.out.println("Nothing written.");
        }

//        if (!Panel1.getText().equals("")) {
//            if (Static.run.prohibitedCharCheck(Panel1.getText())) {
//                String message = "";
//                StringBuilder sb = new StringBuilder(Panel1.getText());
//                for (int i = 0; i < Panel1.getText().length(); i++) {
//                    for (int j = 0; j < Static.charactersList.size(); j++) {
//                        System.out.println("J = " + j);
//                        int n = j;
//                        String str = sb.charAt(0) + "";
//                        String light = Static.charactersList.get(n).getLightChar();
//                        if (light.equals(str)) {
//                            System.out.println("Vuelta ++ " + j);
//                            message += Static.charactersList.get(j).getDarkChar() + Static.defaultDarkCharSeparator;
//                            System.out.println("current char = " + sb.charAt(0));
//                            sb.deleteCharAt(0);
//                            break;
//                        }
//                    }
//                }
//                Panel2.setText(message);
//            }
//        } else {
//            System.out.println("Nothing written.");
//        }
    }//GEN-LAST:event_convertActionPerformed

    private void saveLog1() {
        if (Static.data.getUserData().isSaveLogs()) {
            System.out.println("SaveLogOn");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            Date date = new Date();
            try {
                Static.data.BuildTxtFile(Static.DataFolderPath + "\\" + Static.logsDefaultName, dateFormat.format(date), "Text:\n" + Panel1.getText() + "\n\nEncrypted text equivalent:\n" + Panel2.getText());
            } catch (Exception e) {
                System.out.println("ERROR CREATING LOG #1");
                e.printStackTrace();
            }
        }
    }

    private void saveLog2() {
        if (Static.data.getUserData().isSaveLogs()) {
            System.out.println("SaveLogOn");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            try {
                Static.data.BuildTxtFile(Static.DataFolderPath + "\\" + Static.logsDefaultName, dateFormat.format(date), "Encrypted Text:\n" + Panel3.getText() + "\n\nText equivalent:\n" + Panel4.getText());
            } catch (Exception e) {
                System.out.println("ERROR CREATING LOG #2");
                e.printStackTrace();
            }
        }
    }

    private void copyEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyEncryptActionPerformed
        copyToClipboardEncrypt();
    }//GEN-LAST:event_copyEncryptActionPerformed


    private void copyUnencryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyUnencryptActionPerformed
        copyToClipboardUnencrypt();
    }//GEN-LAST:event_copyUnencryptActionPerformed


    private void clear3and4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear3and4ActionPerformed
        Panel3.setText("");
        Panel4.setText("");
    }//GEN-LAST:event_clear3and4ActionPerformed

    private void saveCustomCharFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCustomCharFileActionPerformed
        saveCustomCharFileMethod();
    }//GEN-LAST:event_saveCustomCharFileActionPerformed

    private void saveCustomCharFileMethod() {
        if (!FieldcustomCharTxt.getText().equals("")) {
            boolean exists = Static.data.verifyCustomCharsTxt(FieldcustomCharTxt.getText());
            if (exists) {
                Static.data.getUserData().setTxtFileWithCharactersDefaultNameUserData(FieldcustomCharTxt.getText());
                Static.data.updateInfo();
                defaultTxtFileNameDisplay.setText("Current: " + Static.data.getUserData().getTxtFileWithCharactersDefaultNameUserData());
                FieldcustomCharTxt.setText("");
                PopUpThread popUpThread = new PopUpThread("Success!", Static.defaultTimeForPopUpMessage);
                popUpThread.start();
            } else {
                JOptionPane.showMessageDialog(null, "A Txt file named " + FieldcustomCharTxt.getText() + " does not exist.", "File not found", 0);
            }
        } else {
            System.out.println("Nothing Written.");
        }
    }

    private void what1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_what1ActionPerformed
        String str = "You can create your own patron of encrypted characters.\n"
                + "Go to the data folder (buttom below) to see a quick\n"
                + "tutorial of how to do so in a txt file.";

        JOptionPane.showMessageDialog(null, str, "Create your own encrypted patron.", 1);

        /*You can create your own patron of encrypted characters.
Go to the data folder (buttom below) to see a quick
tutorial of how to do so in a txt file.
         */
    }//GEN-LAST:event_what1ActionPerformed

    private void FieldcustomCharTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldcustomCharTxtKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            saveCustomCharFileMethod();
//            System.out.println("ENTER");
//            evt.consume();
        }
    }//GEN-LAST:event_FieldcustomCharTxtKeyTyped

    private void saveLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveLogsActionPerformed
        if (saveLogs.isSelected()) {
            Static.data.getUserData().setSaveLogs(true);
            Static.data.updateInfo();
            Static.data.createDir(Static.DataFolderPath, Static.logsDefaultName);

        } else {
            Static.data.getUserData().setSaveLogs(false);
            Static.data.updateInfo();
        }
    }//GEN-LAST:event_saveLogsActionPerformed

    private void what2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_what2ActionPerformed
        JOptionPane.showMessageDialog(null, "Program will save all the encrypted and unencrypted logs you do "
                + "in a folder.\nAllow the program to do so or not by checking the \"Save logs\" box.\n"
                + "Find the folder \"Logs\" in the data folder (Button below).", "Save logs", 1);
    }//GEN-LAST:event_what2ActionPerformed

    private void copyToClipboardEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyToClipboardEncryptActionPerformed
        if (copyToClipboardEncrypt.isSelected()) {
            Static.data.getUserData().setCopyToClipboardEncrypt(true);
            Static.data.updateInfo();
        } else {
            Static.data.getUserData().setCopyToClipboardEncrypt(false);
            Static.data.updateInfo();
        }
    }//GEN-LAST:event_copyToClipboardEncryptActionPerformed

    private void copyToClipboardUnencryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyToClipboardUnencryptActionPerformed
        if (copyToClipboardUnencrypt.isSelected()) {
            Static.data.getUserData().setCopyToClipboardUnencrypt(true);
            Static.data.updateInfo();
        } else {
            Static.data.getUserData().setCopyToClipboardUnencrypt(false);
            Static.data.updateInfo();
        }
    }//GEN-LAST:event_copyToClipboardUnencryptActionPerformed

    private void separatorCharFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_separatorCharFieldKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || separatorCharField.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_separatorCharFieldKeyTyped

    private void what3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_what3ActionPerformed
        String str = "The program needs a specific letter to separate encrypted\nvalues to one another. You won't be able to write text if that character is present.\nThe default character is \"" + Static.defaultDarkCharSeparator + "\".";
        JOptionPane.showMessageDialog(null, str, "Separator character", 1);
    }//GEN-LAST:event_what3ActionPerformed

    private void separatorCharSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_separatorCharSaveActionPerformed
        if (!separatorCharField.getText().equals("")) {
            Static.data.getUserData().setDarkCharSeparator(separatorCharField.getText());
            separatorCharField.setText("");
            Static.data.updateInfo();
            separatorCharLabel.setText("Separator char: " + Static.data.getUserData().getDarkCharSeparator());
        } else {
            System.out.println("Nothing written.");
        }
    }//GEN-LAST:event_separatorCharSaveActionPerformed

    private void resetSeparatorCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetSeparatorCharActionPerformed
        if (!Static.data.getUserData().getDarkCharSeparator().equals(Static.defaultDarkCharSeparator)) {
            Static.data.getUserData().setDarkCharSeparator(Static.defaultDarkCharSeparator);
            separatorCharField.setText("");
            Static.data.updateInfo();
            separatorCharLabel.setText("Separator char: " + Static.data.getUserData().getDarkCharSeparator());
        } else {
            System.out.println("Already default.");
        }
    }//GEN-LAST:event_resetSeparatorCharActionPerformed

    private void PopUpMessagesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopUpMessagesComboActionPerformed
        if (PopUpMessagesCombo.isSelected()) {
            Static.data.getUserData().setPopUpMessagesOnOff(true);
            Static.data.updateInfo();
        } else {
            Static.data.getUserData().setPopUpMessagesOnOff(false);
            System.out.println(Static.data.getUserData().isPopUpMessagesOnOff());
            Static.data.updateInfo();
        }
    }//GEN-LAST:event_PopUpMessagesComboActionPerformed

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://twitter.com/JustVice1"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_twitterMouseClicked

    private void alllinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alllinksMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://justvice.wixsite.com/info"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_alllinksMouseClicked

    private void githubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/JustVice?tab=repositories"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_githubMouseClicked

    private void deleteAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllDataActionPerformed
        String option = JOptionPane.showInputDialog(null, "Type \"delete\" and accept to confirm data reset factory.\nThis includes the logs folder.", "Delete data", 2);
        if (option != null) {
            option = option.toLowerCase();
            if (option.equals("delete")) {
                this.dispose();
                Static.run.resetData();
            } else {
                MessagePopUp messagePopUp = new MessagePopUp("Cancelled");
            }
        } else {
            MessagePopUp messagePopUp = new MessagePopUp("Cancelled");
        }
    }//GEN-LAST:event_deleteAllDataActionPerformed

    private void createNewRandomKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewRandomKeysActionPerformed
        try {
            String name = JOptionPane.showInputDialog("Please, name the keys file..");
            if (!name.equals("")) {
                System.out.println("build");
                String keys = Static.textKeeper.randomKeysBuildUp();
                Static.data.BuildTxtFile(Static.DataFolderPath, name + " " + ((int) (Math.random() * 10000)), keys);
                MessagePopUp messagePopUp = new MessagePopUp("Keys created!");
            } else {
                Static.run.message("You need to provide a name to your keys file! Please, try again.", "No Name", 2);
            }
        } catch (Exception e) {System.out.println("cancelled");
        }
    }//GEN-LAST:event_createNewRandomKeysActionPerformed

    private void showStartLogoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStartLogoComboActionPerformed
        if (showStartLogoCombo.isSelected()) {
            Static.data.getUserData().setShowStartLogo(true);
            Static.data.updateInfo();
        } else {
            Static.data.getUserData().setShowStartLogo(false);
            Static.data.updateInfo();
        }
    }//GEN-LAST:event_showStartLogoComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(Static.DataFolderPath);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void parameters() {
        Panel1.setLineWrap(true);
        Panel2.setLineWrap(true);
        Panel3.setLineWrap(true);
        Panel4.setLineWrap(true);
        defaultTxtFileNameDisplay.setText("Current: " + Static.data.getUserData().getTxtFileWithCharactersDefaultNameUserData());
        parametersSaveLogsCheck();
        parametersCopyToClipboardEncrypt();
        parametersCopyToClipboardUnencrypt();
        separatorCharLabel.setText("Separator char: " + Static.data.getUserData().getDarkCharSeparator());
        parametersPopUpMessages();
        if (Static.data.getUserData().isShowStartLogo()) {
            showStartLogoCombo.setSelected(true);
        } else {
            showStartLogoCombo.setSelected(false);
        }
    }

    private void disableButtons() {
        saveCustomCharFile.setEnabled(false);
        separatorCharSave.setEnabled(false);
        resetSeparatorChar.setEnabled(false);
    }

    private void parametersPopUpMessages() {
        if (Static.data.getUserData().isPopUpMessagesOnOff()) {
            PopUpMessagesCombo.setSelected(true);
        } else {
            PopUpMessagesCombo.setSelected(false);
        }
    }

    private void parametersSaveLogsCheck() {
        if (Static.data.getUserData().isSaveLogs()) {
            saveLogs.setSelected(true);
            File file = new File(Static.DataFolderPath, Static.logsDefaultName);
            if (!file.exists()) {
                Static.data.createDir(Static.DataFolderPath, Static.logsDefaultName);
            }
        } else {
            saveLogs.setSelected(false);
        }
    }

    private void parametersCopyToClipboardEncrypt() {
        if (Static.data.getUserData().isCopyToClipboardEncrypt()) {
            copyToClipboardEncrypt.setSelected(true);
        } else {
            copyToClipboardEncrypt.setSelected(false);
        }
    }

    private void parametersCopyToClipboardUnencrypt() {
        if (Static.data.getUserData().isCopyToClipboardUnencrypt()) {
            copyToClipboardUnencrypt.setSelected(true);
        } else {
            copyToClipboardUnencrypt.setSelected(false);
        }
    }

    private void checkcopyToClipboardEncryptWhenConvert() {
        if (Static.data.getUserData().isCopyToClipboardEncrypt()) {
            copyToClipboardEncrypt();
        }
    }

    private void checkcopyToClipboardUnencryptWhenConvert() {
        if (Static.data.getUserData().isCopyToClipboardUnencrypt()) {
            copyToClipboardUnencrypt();
        }
    }

    private void copyToClipboardEncrypt() {
        Clipboard clip = getToolkit().getSystemClipboard();
        String toClipBoardText = Panel2.getText();
        StringSelection stringClip = new StringSelection(toClipBoardText);
        clip.setContents(stringClip, stringClip);
        MessagePopUp m = new MessagePopUp("Copied to clipboard");
//        PopUpThread popUpThread = new PopUpThread("Copied to clipboard", Static.defaultTimeForPopUpMessage);
//        popUpThread.start();
    }

    private void copyToClipboardUnencrypt() {
        Clipboard clip = getToolkit().getSystemClipboard();
        String toClipBoardText = Panel4.getText();
        StringSelection stringClip = new StringSelection(toClipBoardText);
        clip.setContents(stringClip, stringClip);
        MessagePopUp m = new MessagePopUp("Copied to clipboard");
//        PopUpThread popUpThread = new PopUpThread("Copied to clipboard", Static.defaultTimeForPopUpMessage);
//        popUpThread.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldcustomCharTxt;
    private javax.swing.JTextArea Panel1;
    private javax.swing.JTextArea Panel2;
    private javax.swing.JTextArea Panel3;
    private javax.swing.JTextArea Panel4;
    private javax.swing.JRadioButton PopUpMessagesCombo;
    private javax.swing.JLabel alllinks;
    private javax.swing.JButton clear1and2;
    private javax.swing.JButton clear3and4;
    private javax.swing.JButton convert;
    private javax.swing.JButton copyEncrypt;
    private javax.swing.JRadioButton copyToClipboardEncrypt;
    private javax.swing.JRadioButton copyToClipboardUnencrypt;
    private javax.swing.JButton copyUnencrypt;
    private javax.swing.JButton createNewRandomKeys;
    private javax.swing.JLabel defaultTxtFileNameDisplay;
    private javax.swing.JButton deleteAllData;
    private javax.swing.JLabel github;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton resetSeparatorChar;
    private javax.swing.JButton saveCustomCharFile;
    private javax.swing.JRadioButton saveLogs;
    private javax.swing.JTextField separatorCharField;
    private javax.swing.JLabel separatorCharLabel;
    private javax.swing.JButton separatorCharSave;
    private javax.swing.JRadioButton showStartLogoCombo;
    private javax.swing.JLabel twitter;
    private javax.swing.JButton unencrypt;
    private javax.swing.JButton what1;
    private javax.swing.JButton what2;
    private javax.swing.JButton what3;
    // End of variables declaration//GEN-END:variables
}
