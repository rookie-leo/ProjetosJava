public class Login extends javax.swing.JFrame {

    
    
   
    public Login() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelC = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ms = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        noC = new javax.swing.JLabel();
        seC = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastroS = new javax.swing.JMenu();
        jMenuItemCad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Login");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nome");

        jLabel3.setText("Senha");

        ms.setText("Não Logado");

        jButton1.setText("Entrar!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        noC.setText("*");

        seC.setText("*");

        PainelC.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelC.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelC.setLayer(nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelC.setLayer(senha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelC.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelC.setLayer(ms, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelC.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelC.setLayer(noC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelC.setLayer(seC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelCLayout = new javax.swing.GroupLayout(PainelC);
        PainelC.setLayout(PainelCLayout);
        PainelCLayout.setHorizontalGroup(
            PainelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCLayout.createSequentialGroup()
                .addGroup(PainelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCLayout.createSequentialGroup()
                        .addGroup(PainelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelCLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelCLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PainelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PainelCLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noC, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seC, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelCLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        PainelCLayout.setVerticalGroup(
            PainelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(PainelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(seC))
                .addGap(18, 18, 18)
                .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jMenu1.setText("Login");
        menu.add(jMenu1);

        cadastroS.setText("Cadastro");
        cadastroS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSActionPerformed(evt);
            }
        });

        jMenuItemCad.setText("Cadastrar");
        jMenuItemCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadActionPerformed(evt);
            }
        });
        cadastroS.add(jMenuItemCad);

        menu.add(cadastroS);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelC, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s , n ,l, s1, n2, l1, c;
        s1 = "1234";
        n2 = "Eli";
        n = (nome.getText()) ;
        s = (senha.getText());
        l = (s1.equals(s))?"Correto":"Incorreto";
        seC.setText(l);
        l1 = (n2.equals(n))?"Correto":"Incorreto";
        noC.setText(l1);
        c = (l + l1)  ;
        if (c.equals("CorretoCorreto")){
            ms.setText("Logado");
        } 
        else {
            ms.setText("Falha no login!");
        }
         
        
    
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cadastroSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSActionPerformed
        
    }//GEN-LAST:event_cadastroSActionPerformed

    private void jMenuItemCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadActionPerformed
        Cadastro tela = new Cadastro();
        PainelC.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PainelC;
    private javax.swing.JMenu cadastroS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItemCad;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel ms;
    private javax.swing.JLabel noC;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel seC;
    private javax.swing.JTextField senha;
    // End of variables declaration//GEN-END:variables
}
