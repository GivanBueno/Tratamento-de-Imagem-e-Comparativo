
package Apresentacao;

import static Modelo.Pixels.getPixels;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class frmBiometria extends javax.swing.JDialog
{


    public frmBiometria(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnAcessoGeral = new javax.swing.JButton();
        btnDiretores = new javax.swing.JButton();
        btnMinistro = new javax.swing.JButton();
        lblInformacao1 = new javax.swing.JLabel();
        lblInformacao2 = new javax.swing.JLabel();
        lblInformacao3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAcoes = new javax.swing.JMenu();
        imnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MInistério do Meio Ambiente");

        btnAcessoGeral.setText("Realizar Acesso");
        btnAcessoGeral.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAcessoGeralActionPerformed(evt);
            }
        });

        btnDiretores.setText("Realizar Biometria");
        btnDiretores.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDiretoresActionPerformed(evt);
            }
        });

        btnMinistro.setText("Realizar Biometria");
        btnMinistro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMinistroActionPerformed(evt);
            }
        });

        lblInformacao1.setText("Nível de Acesso 1: Informações de acesso geral.");

        lblInformacao2.setText("Nível de acesso 2: Informações restritas aos diretores de divisões. ");

        lblInformacao3.setText("Nível de acesso 3: Informações restritas apenas ao ministro do meio ambiente. ");

        mnuAcoes.setText("Ações");

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
                    .addComponent(lblInformacao1)
                    .addComponent(btnAcessoGeral)
                    .addComponent(lblInformacao2)
                    .addComponent(btnDiretores)
                    .addComponent(lblInformacao3)
                    .addComponent(btnMinistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformacao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAcessoGeral)
                .addGap(18, 18, 18)
                .addComponent(lblInformacao2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDiretores)
                .addGap(18, 18, 18)
                .addComponent(lblInformacao3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMinistro)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imnSairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_imnSairActionPerformed
    {//GEN-HEADEREND:event_imnSairActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_imnSairActionPerformed

    private void btnAcessoGeralActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAcessoGeralActionPerformed
    {//GEN-HEADEREND:event_btnAcessoGeralActionPerformed
        JOptionPane.showMessageDialog(null,"SEJA BEM VINDO");
    }//GEN-LAST:event_btnAcessoGeralActionPerformed

    private void btnDiretoresActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDiretoresActionPerformed
    {//GEN-HEADEREND:event_btnDiretoresActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION)
        {
            File arquivo = fc.getSelectedFile();  
            try
            {
                BufferedImage Digital = ImageIO.read(arquivo.getAbsoluteFile());
                BufferedImage Digital2 = ImageIO.read(new File("FingerPrints\\diretor1.jpg"));
                Modelo.TratamentoDeImagem.TratamentoEmCinza(Digital);
                Modelo.TratamentoDeImagem.TratamentoEmCinza(Digital2);
                int[] pixels1 = getPixels(Digital);
                int[] pixels2 = getPixels(Digital2);
                if (Arrays.equals(pixels1, pixels2)) 
                {
                    JOptionPane.showMessageDialog(null,"BEM VINDO DIRETOR 1");
                }
                else
                {
                    Digital2 = ImageIO.read(new File("FingerPrints\\diretor2.jpg"));
                    Modelo.TratamentoDeImagem.TratamentoEmCinza(Digital2);
                    pixels2 = getPixels(Digital2);
                    if (Arrays.equals(pixels1, pixels2)) 
                    {
                        JOptionPane.showMessageDialog(null,"BEM VINDO DIRETOR 2");
                    }
                    else
                    {
                        Digital2 = ImageIO.read(new File("FingerPrints\\diretor3.jpg"));
                        Modelo.TratamentoDeImagem.TratamentoEmCinza(Digital2);
                        pixels2 = getPixels(Digital2);
                        if (Arrays.equals(pixels1, pixels2)) 
                        {
                            JOptionPane.showMessageDialog(null,"BEM VINDO DIRETOR 3");
                        }
                        else
                        {
                            Digital2 = ImageIO.read(new File("FingerPrints\\diretor4.jpg"));
                            Modelo.TratamentoDeImagem.TratamentoEmCinza(Digital2);
                            pixels2 = getPixels(Digital2);
                            if (Arrays.equals(pixels1, pixels2)) 
                            {
                                JOptionPane.showMessageDialog(null,"BEM VINDO DIRETOR 4");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"VOCÊ NÃO TEM PERMISSÃO PARA ACESSAR ESSAS INFORMAÇÕES");
                            }
                        }
                    }
                }
                
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"SELECIONE UM ARQUIVO DE IMAGEM");
            }
        }
    else
        {
            JOptionPane.showMessageDialog(null, "NENHUM ARQUIVO SELECIONADO");
        }
    }//GEN-LAST:event_btnDiretoresActionPerformed

    private void btnMinistroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMinistroActionPerformed
    {//GEN-HEADEREND:event_btnMinistroActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION)
        {
            File arquivo = fc.getSelectedFile();  
            try
            {
                BufferedImage Digital = ImageIO.read(arquivo.getAbsoluteFile());
                BufferedImage Digital2 = ImageIO.read(new File("FingerPrints\\ministro.jpg"));
                Modelo.TratamentoDeImagem.TratamentoEmCinza(Digital);
                Modelo.TratamentoDeImagem.TratamentoEmCinza(Digital2);
                int[] pixels1 = getPixels(Digital);
                int[] pixels2 = getPixels(Digital2);
                if (Arrays.equals(pixels1, pixels2)) 
                {
                    JOptionPane.showMessageDialog(null,"BEM VINDO MINISTRO");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"VOCÊ NÃO TEM PERMISSÃO PARA ACESSAR ESSAS INFORMAÇÕES");
                }
                
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"SELECIONE UM ARQUIVO DE IMAGEM");
            }
        }
    else
        {
            JOptionPane.showMessageDialog(null, "NENHUM ARQUIVO SELECIONADO");
        }
    }//GEN-LAST:event_btnMinistroActionPerformed

    
    
    
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmBiometria dialog = new frmBiometria(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAcessoGeral;
    private javax.swing.JButton btnDiretores;
    private javax.swing.JButton btnMinistro;
    private javax.swing.JMenuItem imnSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblInformacao1;
    private javax.swing.JLabel lblInformacao2;
    private javax.swing.JLabel lblInformacao3;
    private javax.swing.JMenu mnuAcoes;
    // End of variables declaration//GEN-END:variables
}
