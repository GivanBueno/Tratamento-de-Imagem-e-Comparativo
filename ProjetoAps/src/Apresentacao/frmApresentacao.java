package Apresentacao;

public class frmApresentacao extends javax.swing.JDialog
{

    
    public frmApresentacao(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblInformacao1 = new javax.swing.JLabel();
        lblInformacao2 = new javax.swing.JLabel();
        lblInformacao4 = new javax.swing.JLabel();
        lblInformacao8 = new javax.swing.JLabel();
        lblInformacao5 = new javax.swing.JLabel();
        lblInformacao6 = new javax.swing.JLabel();
        lblInformacao7 = new javax.swing.JLabel();
        lblInformação3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAcoes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        imnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ministério do Meio Ambiente");

        lblInformacao1.setText("Bem vim ao sistema de informações do Ministério do Meio Ambiente.");

        lblInformacao2.setText("As informações aqui acessadas são de importancia estratégica para o Ministério do Meio Ambiente.");

        lblInformacao4.setText("A verificação biométrica está classificada em 3 níveis de acesso diferentes.");

        lblInformacao8.setText("Siga a próxima página para realizar sua biometria.");

        lblInformacao5.setText("Nível de acesso 1 contém informações para acesso geral. Neste nível é não é feita biometria ");

        lblInformacao6.setText("Nível de acesso 2 contém informações de acesso exclusivas para diretores.");

        lblInformacao7.setText("Nível de acesso 3 contém nformações de acesso exclusivas para o ministro.");

        lblInformação3.setText("Para acessa-las, primeiro você terá que realizar uma verificação biométrica com base em seu nível de acesso.");

        mnuAcoes.setText("Ações");

        jMenuItem1.setText("Biometria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuAcoes.add(jMenuItem1);

        imnSair.setText("Sair");
        imnSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                imnSairActionPerformed(evt);
            }
        });
        mnuAcoes.add(imnSair);

        jMenuBar1.add(mnuAcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInformacao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInformacao2)
                            .addComponent(lblInformacao4)
                            .addComponent(lblInformacao5)
                            .addComponent(lblInformacao6)
                            .addComponent(lblInformacao7)
                            .addComponent(lblInformacao8)
                            .addComponent(lblInformação3))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInformacao2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformação3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformacao4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformacao5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformacao6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformacao7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imnSairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_imnSairActionPerformed
    {//GEN-HEADEREND:event_imnSairActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_imnSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        frmBiometria frmb = new frmBiometria(null, true);
        frmb.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmApresentacao dialog = new frmApresentacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imnSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblInformacao1;
    private javax.swing.JLabel lblInformacao2;
    private javax.swing.JLabel lblInformacao4;
    private javax.swing.JLabel lblInformacao5;
    private javax.swing.JLabel lblInformacao6;
    private javax.swing.JLabel lblInformacao7;
    private javax.swing.JLabel lblInformacao8;
    private javax.swing.JLabel lblInformação3;
    private javax.swing.JMenu mnuAcoes;
    // End of variables declaration//GEN-END:variables
}
