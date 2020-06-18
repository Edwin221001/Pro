package calculo_masa;
public class calculo_masa extends javax.swing.JFrame {
    public calculo_masa() {
           initComponents();       
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        peso = new javax.swing.JTextField();
        estatura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jlabel = new javax.swing.JLabel();
        masaCorporal = new javax.swing.JLabel();
        estatus = new javax.swing.JLabel();
        masa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        sexo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CALCULAR");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 150, 40));

        peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 150, 30));

        estatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estaturaActionPerformed(evt);
            }
        });
        getContentPane().add(estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 150, 30));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>CALCULADORA DE MASA CORPORAL <html>");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PESO");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 170, 30));

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ESTATURA");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 170, 30));

        Jlabel.setBackground(new java.awt.Color(204, 0, 0));
        Jlabel.setForeground(new java.awt.Color(51, 0, 0));
        Jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlabel.setText("ESTADO FISICO");
        Jlabel.setOpaque(true);
        getContentPane().add(Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 90, 40));

        masaCorporal.setBackground(new java.awt.Color(204, 0, 0));
        masaCorporal.setForeground(new java.awt.Color(51, 0, 0));
        masaCorporal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masaCorporal.setText("Masa corporal");
        masaCorporal.setOpaque(true);
        getContentPane().add(masaCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 90, 40));

        estatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estatus.setOpaque(true);
        getContentPane().add(estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 160, 40));

        masa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masa.setOpaque(true);
        getContentPane().add(masa, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 160, 40));

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NOMBRE COMPLETO\n");
        jLabel5.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 30));

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDAD");
        jLabel6.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 170, 30));

        jLabel9.setBackground(new java.awt.Color(204, 0, 0));
        jLabel9.setForeground(new java.awt.Color(51, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SEXO  (Masculino/Femenino)");
        jLabel9.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 30));

        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 150, 30));

        edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, 30));

        sexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 30));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estaturaActionPerformed
   
    }//GEN-LAST:event_estaturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nom, sex;
    Double pes, altura, imc;
    int age;
    nom=nombre.getText();
    nombre.setText(nom);
    sex=sexo.getText();
    sexo.setText(sex);
    age=Integer.parseInt(edad.getText());
    edad.setText(String.valueOf(age));
    pes=Double.parseDouble(peso.getText());
    peso.setText(String.valueOf(pes));
    altura=Double.parseDouble(estatura.getText());
    estatura.setText(String.valueOf(altura));
    
    imc=pes/(altura*altura);
    masa.setText(String.valueOf(imc));
      if(imc<18.5){
        estatus.setText("PESO BAJO");
        }else if(imc>=18.5 && imc<24.9){
        estatus.setText("SALUDABLE");
        }else if(imc>=25 && imc <29.9){
        estatus.setText("SOBREPESO");
        }else if(imc>30){
        estatus.setText("OBESIDAD");
        }    
    }//GEN-LAST:event_jButton1ActionPerformed
 public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculo_masa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField estatura;
    private javax.swing.JLabel estatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel masa;
    private javax.swing.JLabel masaCorporal;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField sexo;
    // End of variables declaration//GEN-END:variables
}
