/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerebro;

/**
 *
 * @author Beny
 */
public class Window extends javax.swing.JFrame {
    private String currentResponse;
    private String currentRejouerResponse;
    private String currentPropostionResponse;
    private String currentApprentissageResponse;

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        this.currentResponse = "";
        this.currentRejouerResponse = "";
        this.currentPropostionResponse = "";
        this.currentApprentissageResponse = "";

        this.setVisible(true);

        this.jButtonNon.setFocusPainted(false);
        this.jButtonOui.setFocusPainted(false);
        this.jButtonProbOui.setFocusPainted(false);
        this.jButtonProbNon.setFocusPainted(false);
        this.jButtonRejouerOui.setFocusPainted(false);
        this.jButtonRejouerNon.setFocusPainted(false);
        this.jButtonPropositionOui.setFocusPainted(false);
        this.jButtonPropositionNon.setFocusPainted(false);
        this.jButtonApprentissageOui.setFocusPainted(false);
        this.jButtonApprentissageNon.setFocusPainted(false);

        this.hideAllPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelQuestion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButtonOui = new javax.swing.JButton();
        jButtonProbOui = new javax.swing.JButton();
        jButtonProbNon = new javax.swing.JButton();
        jButtonNon = new javax.swing.JButton();
        PanelRejouer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jButtonRejouerOui = new javax.swing.JButton();
        jButtonRejouerNon = new javax.swing.JButton();
        PanelProposition = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        propositionText = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jButtonPropositionOui = new javax.swing.JButton();
        jButtonPropositionNon = new javax.swing.JButton();
        jLabelQuestionMark = new javax.swing.JLabel();
        PanelApprentissage = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        nouvelleQuestion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nomNouveauPersonnage = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jButtonApprentissageOui = new javax.swing.JButton();
        jButtonApprentissageNon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cerebro");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        PanelQuestion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setText("QUESTION");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("questionText");

        jButtonOui.setBackground(new java.awt.Color(46, 204, 113));
        jButtonOui.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonOui.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOui.setText("Oui");
        jButtonOui.setBorder(null);
        jButtonOui.setBorderPainted(false);
        jButtonOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOuiActionPerformed(evt);
            }
        });

        jButtonProbOui.setBackground(new java.awt.Color(52, 152, 219));
        jButtonProbOui.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonProbOui.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProbOui.setText("Probablement oui");
        jButtonProbOui.setBorder(null);
        jButtonProbOui.setMaximumSize(new java.awt.Dimension(83, 16));
        jButtonProbOui.setMinimumSize(new java.awt.Dimension(83, 16));
        jButtonProbOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProbOuiActionPerformed(evt);
            }
        });

        jButtonProbNon.setBackground(new java.awt.Color(214, 196, 15));
        jButtonProbNon.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonProbNon.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProbNon.setText("Probablement non");
        jButtonProbNon.setBorder(null);
        jButtonProbNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProbNonActionPerformed(evt);
            }
        });

        jButtonNon.setBackground(new java.awt.Color(231, 76, 60));
        jButtonNon.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonNon.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNon.setText("Non");
        jButtonNon.setBorder(null);
        jButtonNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonProbOui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonProbNon, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
            .addComponent(jButtonNon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonOui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonOui, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonProbOui, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonProbNon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonNon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1.setLayer(jButtonOui, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonProbOui, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonProbNon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonNon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelQuestionLayout = new javax.swing.GroupLayout(PanelQuestion);
        PanelQuestion.setLayout(PanelQuestionLayout);
        PanelQuestionLayout.setHorizontalGroup(
            PanelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelQuestionLayout.createSequentialGroup()
                .addGroup(PanelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelQuestionLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(PanelQuestionLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelQuestionLayout.setVerticalGroup(
            PanelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelQuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelRejouer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel3.setText("REJOUER");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("?");

        jButtonRejouerOui.setBackground(new java.awt.Color(46, 204, 113));
        jButtonRejouerOui.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonRejouerOui.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRejouerOui.setText("Oui");
        jButtonRejouerOui.setBorder(null);
        jButtonRejouerOui.setBorderPainted(false);
        jButtonRejouerOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRejouerOuiActionPerformed(evt);
            }
        });

        jButtonRejouerNon.setBackground(new java.awt.Color(231, 76, 60));
        jButtonRejouerNon.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonRejouerNon.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRejouerNon.setText("Non");
        jButtonRejouerNon.setBorder(null);
        jButtonRejouerNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRejouerNonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonRejouerNon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonRejouerOui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addComponent(jButtonRejouerOui, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonRejouerNon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane2.setLayer(jButtonRejouerOui, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButtonRejouerNon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelRejouerLayout = new javax.swing.GroupLayout(PanelRejouer);
        PanelRejouer.setLayout(PanelRejouerLayout);
        PanelRejouerLayout.setHorizontalGroup(
            PanelRejouerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelRejouerLayout.createSequentialGroup()
                .addGroup(PanelRejouerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRejouerLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRejouerLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelRejouerLayout.setVerticalGroup(
            PanelRejouerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRejouerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelProposition.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel5.setText("Le personnage est-il");

        propositionText.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        propositionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        propositionText.setText("proposition text");

        jButtonPropositionOui.setBackground(new java.awt.Color(46, 204, 113));
        jButtonPropositionOui.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonPropositionOui.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPropositionOui.setText("Oui");
        jButtonPropositionOui.setBorder(null);
        jButtonPropositionOui.setBorderPainted(false);
        jButtonPropositionOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPropositionOuiActionPerformed(evt);
            }
        });

        jButtonPropositionNon.setBackground(new java.awt.Color(231, 76, 60));
        jButtonPropositionNon.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonPropositionNon.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPropositionNon.setText("Non");
        jButtonPropositionNon.setBorder(null);
        jButtonPropositionNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPropositionNonActionPerformed(evt);
            }
        });

        jLabelQuestionMark.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabelQuestionMark.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQuestionMark.setText("?");

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonPropositionNon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonPropositionOui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelQuestionMark, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQuestionMark, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButtonPropositionOui, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonPropositionNon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane3.setLayer(jButtonPropositionOui, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButtonPropositionNon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabelQuestionMark, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelPropositionLayout = new javax.swing.GroupLayout(PanelProposition);
        PanelProposition.setLayout(PanelPropositionLayout);
        PanelPropositionLayout.setHorizontalGroup(
            PanelPropositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelPropositionLayout.createSequentialGroup()
                .addGroup(PanelPropositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPropositionLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5))
                    .addGroup(PanelPropositionLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(propositionText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelPropositionLayout.setVerticalGroup(
            PanelPropositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPropositionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propositionText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelApprentissage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel7.setText("Nouveau personnage");

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Question :");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("Personnage :");

        nomNouveauPersonnage.setMaximumSize(new java.awt.Dimension(6, 50));

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nouvelleQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomNouveauPersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomNouveauPersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nouvelleQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jLayeredPane6.setLayer(nouvelleQuestion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(nomNouveauPersonnage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane6)
                .addContainerGap())
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane7)
                    .addContainerGap()))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap(179, Short.MAX_VALUE)
                    .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
        );
        jLayeredPane5.setLayer(jLayeredPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonApprentissageOui.setBackground(new java.awt.Color(46, 204, 113));
        jButtonApprentissageOui.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonApprentissageOui.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApprentissageOui.setText("Oui");
        jButtonApprentissageOui.setBorder(null);
        jButtonApprentissageOui.setBorderPainted(false);
        jButtonApprentissageOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApprentissageOuiActionPerformed(evt);
            }
        });

        jButtonApprentissageNon.setBackground(new java.awt.Color(231, 76, 60));
        jButtonApprentissageNon.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonApprentissageNon.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApprentissageNon.setText("Non");
        jButtonApprentissageNon.setBorder(null);
        jButtonApprentissageNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApprentissageNonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonApprentissageNon, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
            .addComponent(jButtonApprentissageOui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jButtonApprentissageOui, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonApprentissageNon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane4.setLayer(jButtonApprentissageOui, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButtonApprentissageNon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelApprentissageLayout = new javax.swing.GroupLayout(PanelApprentissage);
        PanelApprentissage.setLayout(PanelApprentissageLayout);
        PanelApprentissageLayout.setHorizontalGroup(
            PanelApprentissageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelApprentissageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(34, 34, 34))
            .addGroup(PanelApprentissageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelApprentissageLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane5)
                    .addContainerGap()))
        );
        PanelApprentissageLayout.setVerticalGroup(
            PanelApprentissageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelApprentissageLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelApprentissageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelApprentissageLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(114, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelRejouer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelProposition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelApprentissage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelRejouer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelProposition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelApprentissage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(13, 13, 13)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProbOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProbOuiActionPerformed
        this.currentResponse = "probablement oui";
    }//GEN-LAST:event_jButtonProbOuiActionPerformed

    private void jButtonProbNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProbNonActionPerformed
        this.currentResponse = "probablement non";
    }//GEN-LAST:event_jButtonProbNonActionPerformed

    private void jButtonNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNonActionPerformed
        this.currentResponse = "non";
    }//GEN-LAST:event_jButtonNonActionPerformed

    private void jButtonOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOuiActionPerformed
        this.currentResponse = "oui";
    }//GEN-LAST:event_jButtonOuiActionPerformed

    private void jButtonRejouerOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRejouerOuiActionPerformed
        this.currentRejouerResponse = "oui";
    }//GEN-LAST:event_jButtonRejouerOuiActionPerformed

    private void jButtonRejouerNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRejouerNonActionPerformed
        this.currentRejouerResponse = "non";
    }//GEN-LAST:event_jButtonRejouerNonActionPerformed

    private void jButtonPropositionOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPropositionOuiActionPerformed
        this.currentPropostionResponse = "oui";
    }//GEN-LAST:event_jButtonPropositionOuiActionPerformed

    private void jButtonPropositionNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPropositionNonActionPerformed
        this.currentPropostionResponse = "non";
    }//GEN-LAST:event_jButtonPropositionNonActionPerformed

    private void jButtonApprentissageOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApprentissageOuiActionPerformed
        this.currentApprentissageResponse = "oui";
    }//GEN-LAST:event_jButtonApprentissageOuiActionPerformed

    private void jButtonApprentissageNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApprentissageNonActionPerformed
        this.currentApprentissageResponse = "non";
    }//GEN-LAST:event_jButtonApprentissageNonActionPerformed

    private void hideAllPanels() {
        this.PanelQuestion.hide();
        this.PanelRejouer.hide();
        this.PanelProposition.hide();
        this.PanelApprentissage.hide();
    }

    public void setCurrentPanel(String panelName) {
        this.hideAllPanels();
        switch (panelName) {
            case "question":
                this.PanelQuestion.show();
                break;
            case "proposition":
                this.PanelProposition.show();
                break;
            case "rejouer":
                this.PanelRejouer.show();
                break;
            case "apprentissage":
                this.PanelApprentissage.show();
                break;
        }
    }

    public void setCurrentQuestion(String question) {
        this.jLabel2.setText(question);
    }

    public String getCurrentResponse() {
        if (this.currentResponse.equals(""))
            return "";

        String tmp = this.currentResponse;
        this.currentResponse = "";
        return tmp;
    }

    public String getCurrentRejouerResponse() {
        if (this.currentRejouerResponse.equals(""))
            return "";

        String tmp = this.currentRejouerResponse;
        this.currentRejouerResponse = "";
        return tmp;
    }

    public void setCurrentPropostion(String proposition) {
        this.propositionText.setText(proposition);
    }

    public String getCurrentPropostionResponse() {
        if (this.currentPropostionResponse.equals(""))
            return "";

        String tmp = this.currentPropostionResponse;
        this.currentPropostionResponse = "";
        return tmp;
    }

    public String getCurrentApprentissageResponse() {
        if (this.currentApprentissageResponse.equals(""))
            return "";

        String tmp = this.currentApprentissageResponse;
        this.currentApprentissageResponse = "";
        return tmp;
    }

    public String getCurrentApprentissagePersonnage() {
        String res = this.nomNouveauPersonnage.getText();
        this.nomNouveauPersonnage.setText("");
        return res;
    }

    public String getCurrentApprentissageQuestion() {
        String res = this.nouvelleQuestion.getText();
        this.nouvelleQuestion.setText("");
        return res;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelApprentissage;
    private javax.swing.JPanel PanelProposition;
    private javax.swing.JPanel PanelQuestion;
    private javax.swing.JPanel PanelRejouer;
    private javax.swing.JButton jButtonApprentissageNon;
    private javax.swing.JButton jButtonApprentissageOui;
    private javax.swing.JButton jButtonNon;
    private javax.swing.JButton jButtonOui;
    private javax.swing.JButton jButtonProbNon;
    private javax.swing.JButton jButtonProbOui;
    private javax.swing.JButton jButtonPropositionNon;
    private javax.swing.JButton jButtonPropositionOui;
    private javax.swing.JButton jButtonRejouerNon;
    private javax.swing.JButton jButtonRejouerOui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelQuestionMark;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JTextField nomNouveauPersonnage;
    private javax.swing.JTextField nouvelleQuestion;
    private javax.swing.JLabel propositionText;
    // End of variables declaration//GEN-END:variables
}