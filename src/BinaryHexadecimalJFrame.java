/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer User
 */
public class BinaryHexadecimalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form BinaryHexadecimalJFrame
     */
    public BinaryHexadecimalJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle1 = new javax.swing.JLabel();
        lblDecBin = new javax.swing.JLabel();
        lblDecToBin = new javax.swing.JLabel();
        txtDecToBin = new javax.swing.JTextField();
        btnDecToBin = new javax.swing.JButton();
        lblBinDec = new javax.swing.JLabel();
        txtBinToDec = new javax.swing.JTextField();
        btnBinToDec = new javax.swing.JButton();
        lblBinToDec = new javax.swing.JLabel();
        lblSubTitle2 = new javax.swing.JLabel();
        lblDecHex = new javax.swing.JLabel();
        txtDecToHex = new javax.swing.JTextField();
        btnDecToHex = new javax.swing.JButton();
        lblDecToHex = new javax.swing.JLabel();
        lblHexDec = new javax.swing.JLabel();
        txtHexToDec = new javax.swing.JTextField();
        btnHexToDec = new javax.swing.JButton();
        lblHexToDec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("NUMER SYSTEM");

        lblSubTitle1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblSubTitle1.setText("Decimal and Binary ");

        lblDecBin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDecBin.setText("Enter a decimal number");

        lblDecToBin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDecToBin.setText("Decimal and Binary ");

        btnDecToBin.setText("Dec. To Bin.");
        btnDecToBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecToBinActionPerformed(evt);
            }
        });

        lblBinDec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBinDec.setText("Enter a binary number");

        btnBinToDec.setText(" Bin. To Dec. ");
        btnBinToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinToDecActionPerformed(evt);
            }
        });

        lblBinToDec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBinToDec.setText("Decimal and Binary ");

        lblSubTitle2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblSubTitle2.setText("Decimal and Hexadecimal");

        lblDecHex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDecHex.setText("Enter a decimal number");

        txtDecToHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecToHexActionPerformed(evt);
            }
        });

        btnDecToHex.setText("Dec. To Hex.");
        btnDecToHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecToHexActionPerformed(evt);
            }
        });

        lblDecToHex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDecToHex.setText("Decimal and Binary ");

        lblHexDec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHexDec.setText("Enter a hexadecimal number");

        btnHexToDec.setText(" Hex. To Dec. ");
        btnHexToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexToDecActionPerformed(evt);
            }
        });

        lblHexToDec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHexToDec.setText("Decimal and Binary ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDecBin, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDecToBin)
                                        .addGap(113, 113, 113)
                                        .addComponent(lblDecToBin, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDecToBin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblBinDec, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBinToDec)
                                        .addGap(113, 113, 113)
                                        .addComponent(lblBinToDec, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtBinToDec, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(lblSubTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDecHex, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDecToHex)
                                .addGap(113, 113, 113)
                                .addComponent(lblDecToHex, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDecToHex, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHexDec, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnHexToDec)
                                .addGap(113, 113, 113)
                                .addComponent(lblHexToDec, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtHexToDec, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(35, 35, 35)
                .addComponent(lblSubTitle1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDecBin)
                    .addComponent(txtDecToBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecToBin)
                    .addComponent(lblDecToBin))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBinDec)
                    .addComponent(txtBinToDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBinToDec)
                    .addComponent(lblBinToDec))
                .addGap(59, 59, 59)
                .addComponent(lblSubTitle2)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDecHex)
                    .addComponent(txtDecToHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecToHex)
                    .addComponent(lblDecToHex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHexDec)
                    .addComponent(txtHexToDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHexToDec)
                    .addComponent(lblHexToDec))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecToBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecToBinActionPerformed
    
        int origInt = 0;
        String result;
       
        try
        {
            origInt = Integer.parseInt(txtDecToBin.getText());
            result = decToBinary(origInt);
          lblDecToBin.setText(result);
      
        }
        catch(Exception e)
        {
            lblDecToBin.setText("this is not a decimal number!");
            txtDecToBin.setText("");
            return;
        }
                
        
          
    }//GEN-LAST:event_btnDecToBinActionPerformed

    private void btnBinToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinToDecActionPerformed
        String origStr;
        String revStr = "";
        int binToDec = 0;
        
        origStr = txtBinToDec.getText();
        
        revStr = getRevStr(origStr);
        
        try
        {
            binToDec = binToDec(revStr); 
            if(binToDec == -1)
            {
                lblBinToDec.setText("this is not a bianry number!");
                txtBinToDec.setText("");
            }
            else 
            {
              lblBinToDec.setText(String.valueOf(binToDec));   
            
            }
        }
        catch(Exception e)
        {
            lblBinToDec.setText("this is not a bianry number!");
            txtBinToDec.setText("");
            return;
        }
        
        
               
    }//GEN-LAST:event_btnBinToDecActionPerformed

    private void btnDecToHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecToHexActionPerformed
        // TODO add your handling code here:
        int origInt = 0;
        String result;
       
        try
        {
            origInt = Integer.parseInt(txtDecToHex.getText());
             result = decToHex(origInt);
          lblDecToHex.setText(result);
      
        }
        catch(Exception e)
        {
            lblDecToHex.setText("this is not a decimal number!");
            txtDecToHex.setText("");
            return;
        }
                
         
          
    }//GEN-LAST:event_btnDecToHexActionPerformed

    private void btnHexToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexToDecActionPerformed
        // TODO add your handling code here:
        String origStr;
        String revStr = "";
        int hexToDec = 0;
        
        origStr = txtHexToDec.getText();
        
        revStr = getRevStr(origStr);
        
        try
        {
            hexToDec = hexToDec(revStr); 
            if(hexToDec == -1)
            {
                lblHexToDec.setText("this is not a hexadecimal number!");
                txtHexToDec.setText("");
            }
            else 
            {
              lblHexToDec.setText(String.valueOf(hexToDec));   
            
            }
        }
        catch(Exception e)
        {
            lblHexToDec.setText("this is not a hexadecimal number!");
            txtHexToDec.setText("");
            return;
        }
    }//GEN-LAST:event_btnHexToDecActionPerformed

    private void txtDecToHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecToHexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecToHexActionPerformed

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
            java.util.logging.Logger.getLogger(BinaryHexadecimalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinaryHexadecimalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinaryHexadecimalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinaryHexadecimalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaryHexadecimalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinToDec;
    private javax.swing.JButton btnDecToBin;
    private javax.swing.JButton btnDecToHex;
    private javax.swing.JButton btnHexToDec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBinDec;
    private javax.swing.JLabel lblBinToDec;
    private javax.swing.JLabel lblDecBin;
    private javax.swing.JLabel lblDecHex;
    private javax.swing.JLabel lblDecToBin;
    private javax.swing.JLabel lblDecToHex;
    private javax.swing.JLabel lblHexDec;
    private javax.swing.JLabel lblHexToDec;
    private javax.swing.JLabel lblSubTitle1;
    private javax.swing.JLabel lblSubTitle2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBinToDec;
    private javax.swing.JTextField txtDecToBin;
    private javax.swing.JTextField txtDecToHex;
    private javax.swing.JTextField txtHexToDec;
    // End of variables declaration//GEN-END:variables

    private String getRevStr(String origStr) {
        String revStr = "";
        for(int i = origStr.length()-1; i >=0; i--)
        {
            revStr = revStr + origStr.charAt(i);
        
        }
        
        return revStr;
    }

    private int binToDec(String revStr) {
         String tempStr ;
         int tempInt ;
         int result = 0;
     
        for(int i =0; i < revStr.length(); i++)
        {
            tempStr = String.valueOf(revStr.charAt(i));
            
            tempInt  = Integer.parseInt(tempStr);
            
            if(tempInt != 1 && tempInt != 0)
            {
                return -1;
            }
            if(tempInt == 0)
            {
                continue;
            }
            
            result =  result +(int)(tempInt *  Math.pow(2.0, (double)i));
           
              
        }
        
        return result;
    
    }

    private int hexToDec(String revStr) {
        
        String tempStr ;
         int tempInt ;
         int result = 0;
     
        for(int i =0; i < revStr.length(); i++)
        {
            tempStr = String.valueOf(revStr.charAt(i));
            
            if(tempStr.equals("A"))
            {
                tempStr = "10";
            }
            else if(tempStr.equals("B"))
            {
                tempStr = "11";
            }
            else if(tempStr.equals("C"))
            {
                tempStr = "12";
            }
            else if(tempStr.equals("D"))
            {
                tempStr = "13";
            }
            else if(tempStr.equals("E"))
            {
                tempStr = "14";
            }
            else if(tempStr.equals("F"))
            {
                tempStr = "15";
            }
            tempInt  = Integer.parseInt(tempStr);
            
            if(!(tempInt <= 15 && tempInt>= 0))
            {
                return -1;
            }
            if(tempInt == 0)
            {
                continue;
            }
            
            result =  result +(int)(tempInt *  Math.pow(16.0, (double)i));
           
              
        }
        
        return result;
        
    }

    private String decToBinary(int num) {
        String result = "";
        
        while(num > 0)
        {
            result = num %2 + result;
            num = num / 2;
        }
        
        return result;
        
    }

    private String decToHex(int num) {
        String result = "";
        int tempInt = 0;
        String tempStr;
        
        while(num > 0)
        {
            tempInt = num % 16;
             if(tempInt == 10)
            {
                tempStr = "A";
            }
            else if(tempInt == 11)
            {
                tempStr = "B";
            }
            else if(tempInt == 12)
            {
                tempStr = "C";
            }
            else if(tempInt == 13)
            {
                tempStr = "D";
            }
            else if(tempInt == 14)
            {
                tempStr = "E";
            }
            else if(tempInt == 15)
            {
                tempStr = "F";
            }
            else
            {
                tempStr = String.valueOf(tempInt);
            }
            result = tempStr + result;
            num = num / 16;
        }
        
        return result;
        
    
    }

}
