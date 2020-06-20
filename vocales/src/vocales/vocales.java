package vocales;
public class vocales extends javax.swing.JFrame {
    public vocales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instruccion = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        ventana = new javax.swing.JTextField();
        res = new javax.swing.JLabel();
        todo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        instruccion.setBackground(new java.awt.Color(204, 0, 0));
        instruccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        instruccion.setForeground(new java.awt.Color(51, 0, 0));
        instruccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruccion.setText("INSERTE  EL TEXTO");
        getContentPane().add(instruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 60));

        calcular.setBackground(new java.awt.Color(204, 0, 0));
        calcular.setForeground(new java.awt.Color(102, 0, 0));
        calcular.setText("CALCULAR");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        ventana.setBackground(new java.awt.Color(204, 0, 0));
        ventana.setForeground(new java.awt.Color(0, 0, 0));
        ventana.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 250, 150));

        res.setBackground(new java.awt.Color(204, 0, 0));
        res.setFont(new java.awt.Font("Dosis", 1, 14)); // NOI18N
        res.setForeground(new java.awt.Color(0, 0, 0));
        res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        res.setOpaque(true);
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 290, 80));

        todo.setBackground(new java.awt.Color(255, 51, 51));
        todo.setForeground(new java.awt.Color(204, 0, 0));
        todo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
           int vocal=0;
      String frase;          
        frase=ventana.getText();
        ventana.setText(frase);
        
        for(int i=0; i<frase.length(); i++){
            
            if((frase.charAt(i)=='a') || (frase.charAt(i)=='e')|| 
               (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u') ||
                    (frase.charAt(i)=='A') || (frase.charAt(i)=='E') || (frase.charAt(i)=='I') ||
                    (frase.charAt(i)=='O') || (frase.charAt(i)=='U')){
                
                vocal++;
            } 
        }
         res.setText("<html>El texto contiene "+vocal+" vocales<html>");
    }//GEN-LAST:event_calcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
   
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vocales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JLabel instruccion;
    private javax.swing.JLabel res;
    private javax.swing.JLabel todo;
    private javax.swing.JTextField ventana;
    // End of variables declaration//GEN-END:variables
}
