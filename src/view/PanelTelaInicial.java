package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Partida;

public class PanelTelaInicial extends javax.swing.JPanel {
    // constante que contem os caracteres validos para a Palavra Segredo
    private static final String CARACTERES_DISPONIVEIS = "'A'B'C'D'E'F'G'H'I'J'K'L'M'N'O'P'Q'R'S'T'U'V'W'X'Y'Z'-' e ESPACO";
    
    // constante que contem o numero maximo de caracteres permitidos para a Palavra Segredo
    private static final int MAX_CARACTERES = 30;

    private FramePrincipal framePai;
    
    public PanelTelaInicial(FramePrincipal framePai) {
        initComponents();
 
        this.framePai = framePai;

        this.labelIconForca.setIcon(
                new ImageIcon(getClass().getResource("/imagens/frame-icon.png")));
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        /* -------------------------------------------------------------
            configura a imagem de fundo do painel
        ----------------------------------------------------------------*/
        
        try{
            Graphics2D grafico2d = (Graphics2D) g;
            InputStream imageInputStream = getClass().getResourceAsStream("/imagens/bg-tela-inicial.jpg");
            BufferedImage bufferedImage = ImageIO.read(imageInputStream);
            Image imagemRedimensionada = bufferedImage.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            grafico2d.drawImage(imagemRedimensionada, 0, 0, this);
        }catch(Exception e){
            System.err.println("Imagem nao encontrada!");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnComecarJogo = new style.JButtonStyle1();
        jLabel2 = new javax.swing.JLabel();
        txtFieldPalavraSegredo = new style.JTextFieldStyle1();
        jLabel3 = new javax.swing.JLabel();
        txtFieldDica = new style.JTextFieldStyle1();
        labelIconForca = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(58, 58, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(170, 170, 170)));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 170, 170));
        jLabel1.setText("BEM-VINDO À FORCA!");

        btnComecarJogo.setText("COMEÇAR!");
        btnComecarJogo.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btnComecarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarJogoActionPerformed(evt);
            }
        });
        btnComecarJogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnComecarJogoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(170, 170, 170));
        jLabel2.setText("Palavra Segredo:");

        txtFieldPalavraSegredo.setForeground(new java.awt.Color(235, 235, 235));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(170, 170, 170));
        jLabel3.setText("Dica:");

        txtFieldDica.setForeground(new java.awt.Color(235, 235, 235));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldDica, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldPalavraSegredo, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btnComecarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldPalavraSegredo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldDica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnComecarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        labelIconForca.setMaximumSize(new java.awt.Dimension(40, 40));
        labelIconForca.setMinimumSize(new java.awt.Dimension(40, 40));
        labelIconForca.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelIconForca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelIconForca, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComecarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarJogoActionPerformed
        iniciarJogo();

    }//GEN-LAST:event_btnComecarJogoActionPerformed

    private void btnComecarJogoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnComecarJogoKeyReleased
        if(evt.getKeyChar() == '\n') {
            iniciarJogo();
        }
    }//GEN-LAST:event_btnComecarJogoKeyReleased

    
    private void iniciarJogo(){
       // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            cria uma partida e troca a tela para o "PainelPartida"
            caso nao haja problema com as verificacoes
        -----------------------------------------------//</editor-fold>*/
        
        String palavraSegredo = txtFieldPalavraSegredo.getText().toUpperCase();
        String dica = txtFieldDica.getText();

        
        if(!validarPalavraSegredoEDica(palavraSegredo, dica)) return;
              
        this.framePai.trocarPainel(new PanelPartida(framePai, new Partida(palavraSegredo, dica)));
    }
    
    
    private boolean validarPalavraSegredoEDica(String palavraSegredo, String dica){
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            metodo responsavel pela validacao completa dos campos e 
            comunicar com o usuario caso haja algo errado
        -----------------------------------------------//</editor-fold>*/
        
        boolean[] validacoes = {true, true, true};
        String mensagem = "", titulo = "";
        
        
        // <editor-fold defaultstate="collapsed" desc=" Primeira Validacao -> todos os campos estao preenchidos? ">
        if(palavraSegredo.isEmpty() || dica.isEmpty()){
            validacoes[0] = false;
            mensagem = "Todos os Campos Precisam ser Preenchidos!";
            titulo = "Preenchimento dos Campos"; 
        }// </editor-fold>  
        
        // <editor-fold defaultstate="collapsed" desc=" Segunda Validacao -> a palavraSegredo possui apenas caracteres validos? ">
        for(int i = 0; i < palavraSegredo.length(); i++){
            if(!CARACTERES_DISPONIVEIS.contains(""+palavraSegredo.charAt(i))){
                validacoes[1] = false;
                mensagem = "A palavra segredo deve conter apenas os seguintes caracteres: \n" +
                        CARACTERES_DISPONIVEIS;
                titulo = "Caracteres Invalidos!";
                break;
            }
        }// </editor-fold> 
           
        // <editor-fold defaultstate="collapsed" desc=" Terceira Validacao -> a palavraSegredo possui mais caracteres que o maximo permitido? ">
        if(palavraSegredo.length() > 30){
            validacoes[2] = false;
            mensagem = "A palavra segredo deve conter no maximo " + MAX_CARACTERES + " caracteres. ";
            titulo = "Numero de caracteres excedido!";
        }// </editor-fold> 
        
        // verificando se alguma validacao falhou
        if(!validacoes[0] || !validacoes[1] || !validacoes[2]){
            JOptionPane.showMessageDialog(this,  mensagem, titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private style.JButtonStyle1 btnComecarJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIconForca;
    private style.JTextFieldStyle1 txtFieldDica;
    private style.JTextFieldStyle1 txtFieldPalavraSegredo;
    // End of variables declaration//GEN-END:variables
}
