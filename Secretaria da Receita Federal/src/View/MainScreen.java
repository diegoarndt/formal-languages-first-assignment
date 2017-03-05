package View;

import Controller.MainScreenController;
import Controller.TextReader;

public class MainScreen extends javax.swing.JFrame {

    private MainScreenController controller;
    private TextReader reader;
    
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        this.setTitle("Secretaria da Receita Federal");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jInputTextArea.setBorder(new NumberedBorder());
        controller = new MainScreenController();
        
        //TEST MODE
        reader = new TextReader();
        jInputTextArea.setText(reader.getFileContent("test/Example 05.txt"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jOutputTextArea = new javax.swing.JTextArea();
        jPanelMainTextArea = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jInputTextArea = new javax.swing.JTextArea();
        jBtnAnalyze = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnSquad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(864, 410));
        setName("mainScreen"); // NOI18N
        setResizable(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jOutputTextArea.setEditable(false);
        jOutputTextArea.setColumns(20);
        jOutputTextArea.setRows(5);
        jOutputTextArea.setMaximumSize(new java.awt.Dimension(164, 84));
        jOutputTextArea.setMinimumSize(new java.awt.Dimension(164, 84));
        jOutputTextArea.setPreferredSize(new java.awt.Dimension(164, 84));
        jScrollPane1.setViewportView(jOutputTextArea);

        jPanelMainTextArea.setMaximumSize(new java.awt.Dimension(864, 281));
        jPanelMainTextArea.setMinimumSize(new java.awt.Dimension(864, 281));
        jPanelMainTextArea.setPreferredSize(new java.awt.Dimension(864, 281));

        jInputTextArea.setColumns(20);
        jInputTextArea.setRows(5);
        jScrollPane2.setViewportView(jInputTextArea);

        javax.swing.GroupLayout jPanelMainTextAreaLayout = new javax.swing.GroupLayout(jPanelMainTextArea);
        jPanelMainTextArea.setLayout(jPanelMainTextAreaLayout);
        jPanelMainTextAreaLayout.setHorizontalGroup(
            jPanelMainTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanelMainTextAreaLayout.setVerticalGroup(
            jPanelMainTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        jBtnAnalyze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/analyzeIcon.png"))); // NOI18N
        jBtnAnalyze.setText("Analisar");
        jBtnAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnalyzeActionPerformed(evt);
            }
        });

        jBtnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clearIcon.png"))); // NOI18N
        jBtnClear.setText("Limpar");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnSquad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/squadIcon.png"))); // NOI18N
        jBtnSquad.setText("Equipe");
        jBtnSquad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSquadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanelMainTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 860, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSquad, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelMainTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAnalyze, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jBtnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jBtnSquad, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnalyzeActionPerformed
        //jSimpleTextArea.setText(String.valueOf(DataValidator.isCodAE("abc")));
        //jSimpleTextArea.setText(String.valueOf(DataValidator.isCodAE("01234")));
        controller.setInput(jInputTextArea.getText());
        controller.validateInput();
        jOutputTextArea.setText(controller.getOutput());
        jInputTextArea.requestFocusInWindow();
    }//GEN-LAST:event_jBtnAnalyzeActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        jInputTextArea.setText("");
        jOutputTextArea.setText("");
        jInputTextArea.requestFocusInWindow();
        
        controller.clearFields();
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnSquadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSquadActionPerformed
        jOutputTextArea.setText("Este projeto foi desenvolvido por: \n\n"
                                + "* Diego Arndt \t\t| diegoarndt@outlook.com\n"
                                + "* Ewerthon Ricardo Just \t| ewerthon.just@gmail.com");
        jOutputTextArea.requestFocusInWindow();
    }//GEN-LAST:event_jBtnSquadActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
               
        /*try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAnalyze;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnSquad;
    private javax.swing.JTextArea jInputTextArea;
    private javax.swing.JTextArea jOutputTextArea;
    private javax.swing.JPanel jPanelMainTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}