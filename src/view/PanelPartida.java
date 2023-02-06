package view;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Partida;

public class PanelPartida extends javax.swing.JPanel {

    private FramePrincipal framePai;
    
    private Partida partida;
    private int erros;
    
    public PanelPartida(FramePrincipal framePai, Partida partida) {
        initComponents();
        
        this.framePai = framePai;
        this.partida = partida;
        
        // configurando a primeira imagem da label "labelImagemForca"
        labelImagemForca.setIcon(new ImageIcon(getClass().getResource("/imagens/imagem-base.jpg")));
        
        if (partida.equals(null)) System.exit(0);
        labelDica.setText(partida.getDica()); // -> setando dica 
        
        configurarFonteLabelPalavra(); // -> ajustando tamanho da fonte da labelPalavra

        atualizarUI(); // -> atualizando interface grafica
        
        this.erros = 0; 
    }

    
    
    private void configurarFonteLabelPalavra() {
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            metodo responsavel por adaptar o tamanho da fonte da label
            de acordo com o numero de caracteres da palavra
        -----------------------------------------------//</editor-fold>*/
        
        int numCaracteresPalavra = partida.getPalavraMostrada().length;
        Font fonte = new Font("MS Gothic", 1, (42-numCaracteresPalavra));
        
        labelPalavra.setFont(fonte);
    }


    private void atualizarUI() {
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            metodo que verifica o status da partida e atualiza a
            interface grafica de acordo com os dados
        -----------------------------------------------//</editor-fold>*/
        
        // atualiza labelPalavra 
        labelPalavra.setText(partida.getPalavraMostradaComoStringFormatada());
        
        // verifica se houve o jogador 2 errou a letra
        if(this.erros < partida.getErros()) {
            // se houve um erro, a imagem da forca e atualizada de acordo com o numero de erros
            labelImagemForca.setIcon(new ImageIcon(getClass().
                    getResource("/imagens/erros-" + partida.getErros() + ".jpg")));
            this.erros = partida.getErros();
        }
        
        // se vencedor != 0, algum jogador venceu, portanto a partida e finalizada
        if(partida.getVencedor() != 0) finalizarPartida();
        
    }

    
    private void atualizarBotao(JButton btn) {
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            metodo chamado quando um botao e apertado, setando o 
            retorno do metodo "validarLetra" (VERMELHO -> nao contem 
            a letra e VERDE -> contem a letra) como cor de fundo do 
            botao, passando a propria letra presente no texto do 
            botao como parametro para verificacao
        -----------------------------------------------//</editor-fold>*/
         
        btn.setBackground(partida.validarLetra(btn.getText()));
        
        btn.setForeground(java.awt.Color.BLACK); // -> setando a cor da letra para preto
        btn.setEnabled(false); // -> botao e desabilitado ao ser apertado 1 vez
        atualizarUI(); // -> atualiza componentes graficos de acordo com as alteracoes da partida
    }

    
    private void finalizarPartida() {
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            metodo responsavel por terminar a partida caso haja 
            algum vencedor
        -----------------------------------------------//</editor-fold>*/
        
        int opcao = JOptionPane.showConfirmDialog(this,
                "Jogador "+ partida.getVencedor() +" VENCEU!!\nJOGAR NOVAMENTE?",
                "JOGO FINALIZADO", JOptionPane.YES_NO_OPTION);

        // se o usuario escolher "nao", a execucao do codigo e parada
        if (opcao == JOptionPane.NO_OPTION) {
            System.exit(0);
            return;
        }
        framePai.trocarPainel(new PanelTelaInicial(framePai));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnLetraA = new style.JButtonStyle1();
        btnLetraB = new style.JButtonStyle1();
        btnLetraC = new style.JButtonStyle1();
        btnLetraD = new style.JButtonStyle1();
        btnLetraM = new style.JButtonStyle1();
        btnLetraF = new style.JButtonStyle1();
        btnLetraG = new style.JButtonStyle1();
        btnLetraJ = new style.JButtonStyle1();
        btnLetraV = new style.JButtonStyle1();
        btnLetraR = new style.JButtonStyle1();
        btnLetraN = new style.JButtonStyle1();
        btnLetraK = new style.JButtonStyle1();
        btnLetraL = new style.JButtonStyle1();
        btnLetraO = new style.JButtonStyle1();
        btnLetraS = new style.JButtonStyle1();
        btnLetraP = new style.JButtonStyle1();
        btnLetraT = new style.JButtonStyle1();
        btnLetraZ = new style.JButtonStyle1();
        btnLetraW = new style.JButtonStyle1();
        btnLetraX = new style.JButtonStyle1();
        btnLetraH = new style.JButtonStyle1();
        btnLetraI = new style.JButtonStyle1();
        btnLetraY = new style.JButtonStyle1();
        btnLetraQ = new style.JButtonStyle1();
        btnLetraU = new style.JButtonStyle1();
        btnLetraE = new style.JButtonStyle1();
        jPanel3 = new javax.swing.JPanel();
        labelImagemForca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelDica = new javax.swing.JLabel();
        labelPalavra = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(170, 170, 170));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnLetraA.setForeground(new java.awt.Color(153, 153, 153));
        btnLetraA.setText("A");
        btnLetraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraAActionPerformed(evt);
            }
        });

        btnLetraB.setText("B");
        btnLetraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraBActionPerformed(evt);
            }
        });

        btnLetraC.setText("C");
        btnLetraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraCActionPerformed(evt);
            }
        });

        btnLetraD.setText("D");
        btnLetraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraDActionPerformed(evt);
            }
        });

        btnLetraM.setText("M");
        btnLetraM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraMActionPerformed(evt);
            }
        });

        btnLetraF.setText("F");
        btnLetraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraFActionPerformed(evt);
            }
        });

        btnLetraG.setText("G");
        btnLetraG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraGActionPerformed(evt);
            }
        });

        btnLetraJ.setText("J");
        btnLetraJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraJActionPerformed(evt);
            }
        });

        btnLetraV.setText("V");
        btnLetraV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraVActionPerformed(evt);
            }
        });

        btnLetraR.setText("R");
        btnLetraR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraRActionPerformed(evt);
            }
        });

        btnLetraN.setText("N");
        btnLetraN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraNActionPerformed(evt);
            }
        });

        btnLetraK.setText("K");
        btnLetraK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraKActionPerformed(evt);
            }
        });

        btnLetraL.setText("L");
        btnLetraL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraLActionPerformed(evt);
            }
        });

        btnLetraO.setText("O");
        btnLetraO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraOActionPerformed(evt);
            }
        });

        btnLetraS.setText("S");
        btnLetraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraSActionPerformed(evt);
            }
        });

        btnLetraP.setText("P");
        btnLetraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraPActionPerformed(evt);
            }
        });

        btnLetraT.setText("T");
        btnLetraT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraTActionPerformed(evt);
            }
        });

        btnLetraZ.setText("Z");
        btnLetraZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraZActionPerformed(evt);
            }
        });

        btnLetraW.setText("W");
        btnLetraW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraWActionPerformed(evt);
            }
        });

        btnLetraX.setText("X");
        btnLetraX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraXActionPerformed(evt);
            }
        });

        btnLetraH.setText("H");
        btnLetraH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraHActionPerformed(evt);
            }
        });

        btnLetraI.setText("I");
        btnLetraI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraIActionPerformed(evt);
            }
        });

        btnLetraY.setText("Y");
        btnLetraY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraYActionPerformed(evt);
            }
        });

        btnLetraQ.setText("Q");
        btnLetraQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraQActionPerformed(evt);
            }
        });

        btnLetraU.setText("U");
        btnLetraU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraUActionPerformed(evt);
            }
        });

        btnLetraE.setText("E");
        btnLetraE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLetraQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLetraM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLetraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLetraE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLetraA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLetraD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLetraU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLetraY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLetraZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLetraV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLetraW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLetraX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLetraA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLetraF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLetraJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLetraM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLetraR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLetraV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLetraZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        labelImagemForca.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelImagemForca.setForeground(new java.awt.Color(170, 170, 170));
        labelImagemForca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelImagemForca.setMaximumSize(new java.awt.Dimension(350, 350));
        labelImagemForca.setMinimumSize(new java.awt.Dimension(350, 350));
        labelImagemForca.setPreferredSize(new java.awt.Dimension(350, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 170, 170));
        jLabel1.setText("DICA:");
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(40, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 20));

        labelDica.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDica.setForeground(new java.awt.Color(170, 170, 170));
        labelDica.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        labelDica.setMaximumSize(new java.awt.Dimension(40, 20));
        labelDica.setMinimumSize(new java.awt.Dimension(40, 20));
        labelDica.setPreferredSize(new java.awt.Dimension(40, 20));

        labelPalavra.setFont(new java.awt.Font("MS Gothic", 1, 30)); // NOI18N
        labelPalavra.setForeground(new java.awt.Color(230, 230, 230));
        labelPalavra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPalavra.setText("_ _ _ _ _ _ _ _ _");
        labelPalavra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelPalavra.setMaximumSize(new java.awt.Dimension(40, 20));
        labelPalavra.setMinimumSize(new java.awt.Dimension(40, 20));
        labelPalavra.setPreferredSize(new java.awt.Dimension(40, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(labelImagemForca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelDica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(labelPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelImagemForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc=" EVENTOS DOS BOTOES DO ALFABETO ">
    
    /* -------------------------------------------------------------
        Aqui estao todos os eventos que foram configurados para
        cada botao do alfabeto presente no panel da partida.
        Quando um botao e apertado, ele se passa como parametro
        para o metodo "atualizarBotao", que realiza as demais acoes.
    ----------------------------------------------------------------*/
    
    private void btnLetraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraAActionPerformed
        atualizarBotao(btnLetraA);
    }//GEN-LAST:event_btnLetraAActionPerformed

    private void btnLetraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraBActionPerformed
        atualizarBotao(btnLetraB);
    }//GEN-LAST:event_btnLetraBActionPerformed

    private void btnLetraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraCActionPerformed
        atualizarBotao(btnLetraC);
    }//GEN-LAST:event_btnLetraCActionPerformed

    private void btnLetraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraDActionPerformed
        atualizarBotao(btnLetraD);
    }//GEN-LAST:event_btnLetraDActionPerformed

    private void btnLetraMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraMActionPerformed
        atualizarBotao(btnLetraM);
    }//GEN-LAST:event_btnLetraMActionPerformed

    private void btnLetraFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraFActionPerformed
        atualizarBotao(btnLetraF);
    }//GEN-LAST:event_btnLetraFActionPerformed

    private void btnLetraGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraGActionPerformed
        atualizarBotao(btnLetraG);
    }//GEN-LAST:event_btnLetraGActionPerformed

    private void btnLetraJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraJActionPerformed
        atualizarBotao(btnLetraJ);
    }//GEN-LAST:event_btnLetraJActionPerformed

    private void btnLetraVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraVActionPerformed
        atualizarBotao(btnLetraV);
    }//GEN-LAST:event_btnLetraVActionPerformed

    private void btnLetraRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraRActionPerformed
        atualizarBotao(btnLetraR);
    }//GEN-LAST:event_btnLetraRActionPerformed

    private void btnLetraNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraNActionPerformed
        atualizarBotao(btnLetraN);
    }//GEN-LAST:event_btnLetraNActionPerformed

    private void btnLetraKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraKActionPerformed
        atualizarBotao(btnLetraK);
    }//GEN-LAST:event_btnLetraKActionPerformed

    private void btnLetraLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraLActionPerformed
        atualizarBotao(btnLetraL);
    }//GEN-LAST:event_btnLetraLActionPerformed

    private void btnLetraOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraOActionPerformed
        atualizarBotao(btnLetraO);
    }//GEN-LAST:event_btnLetraOActionPerformed

    private void btnLetraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraSActionPerformed
        atualizarBotao(btnLetraS);
    }//GEN-LAST:event_btnLetraSActionPerformed

    private void btnLetraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraPActionPerformed
        atualizarBotao(btnLetraP);
    }//GEN-LAST:event_btnLetraPActionPerformed

    private void btnLetraTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraTActionPerformed
        atualizarBotao(btnLetraT);
    }//GEN-LAST:event_btnLetraTActionPerformed

    private void btnLetraZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraZActionPerformed
        atualizarBotao(btnLetraZ);
    }//GEN-LAST:event_btnLetraZActionPerformed

    private void btnLetraWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraWActionPerformed
        atualizarBotao(btnLetraW);
    }//GEN-LAST:event_btnLetraWActionPerformed

    private void btnLetraXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraXActionPerformed
        atualizarBotao(btnLetraX);
    }//GEN-LAST:event_btnLetraXActionPerformed

    private void btnLetraHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraHActionPerformed
        atualizarBotao(btnLetraH);
    }//GEN-LAST:event_btnLetraHActionPerformed

    private void btnLetraIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraIActionPerformed
        atualizarBotao(btnLetraI);
    }//GEN-LAST:event_btnLetraIActionPerformed

    private void btnLetraYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraYActionPerformed
        atualizarBotao(btnLetraY);
    }//GEN-LAST:event_btnLetraYActionPerformed

    private void btnLetraQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraQActionPerformed
        atualizarBotao(btnLetraQ);
    }//GEN-LAST:event_btnLetraQActionPerformed

    private void btnLetraUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraUActionPerformed
        atualizarBotao(btnLetraU);
    }//GEN-LAST:event_btnLetraUActionPerformed

    private void btnLetraEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraEActionPerformed
        atualizarBotao(btnLetraE);
    }//GEN-LAST:event_btnLetraEActionPerformed
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private style.JButtonStyle1 btnLetraA;
    private style.JButtonStyle1 btnLetraB;
    private style.JButtonStyle1 btnLetraC;
    private style.JButtonStyle1 btnLetraD;
    private style.JButtonStyle1 btnLetraE;
    private style.JButtonStyle1 btnLetraF;
    private style.JButtonStyle1 btnLetraG;
    private style.JButtonStyle1 btnLetraH;
    private style.JButtonStyle1 btnLetraI;
    private style.JButtonStyle1 btnLetraJ;
    private style.JButtonStyle1 btnLetraK;
    private style.JButtonStyle1 btnLetraL;
    private style.JButtonStyle1 btnLetraM;
    private style.JButtonStyle1 btnLetraN;
    private style.JButtonStyle1 btnLetraO;
    private style.JButtonStyle1 btnLetraP;
    private style.JButtonStyle1 btnLetraQ;
    private style.JButtonStyle1 btnLetraR;
    private style.JButtonStyle1 btnLetraS;
    private style.JButtonStyle1 btnLetraT;
    private style.JButtonStyle1 btnLetraU;
    private style.JButtonStyle1 btnLetraV;
    private style.JButtonStyle1 btnLetraW;
    private style.JButtonStyle1 btnLetraX;
    private style.JButtonStyle1 btnLetraY;
    private style.JButtonStyle1 btnLetraZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelDica;
    private javax.swing.JLabel labelImagemForca;
    private javax.swing.JLabel labelPalavra;
    // End of variables declaration//GEN-END:variables
}
