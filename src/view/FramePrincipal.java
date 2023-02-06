package view;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FramePrincipal extends javax.swing.JFrame {
    private Container conteudoFrame;
    
    public FramePrincipal() {
        initComponents();
        
        this.setLayout(new BorderLayout()); // -> configurando o layout do frame
        
        // setando o icone do frame
        this.setIconImage(
                new ImageIcon(getClass().getResource("/imagens/frame-icon.png")).getImage());
        
        conteudoFrame = this.getContentPane();
        
        // o painel PanelTelaInicial e o primeiro a ser exibido quando o codigo e executado
        trocarPainel(new PanelTelaInicial(this)); 
    }

    public void trocarPainel(JPanel painelNovo){
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            metodo que troca o conteudo do frame para o painel
            recebido como parametro
        -----------------------------------------------//</editor-fold>*/
        
        conteudoFrame.removeAll(); // limpa o container
        
        conteudoFrame.add(painelNovo); // adiciona o painel novo ao container
        
        validate(); // atualiza a interface grafica 
        setVisible(true); // deixa o painel visivel
        conteudoFrame.repaint(); // renderiza a tela
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forca :)");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new FramePrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
