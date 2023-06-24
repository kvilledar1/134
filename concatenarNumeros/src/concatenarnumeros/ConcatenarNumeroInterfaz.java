
package concatenarnumeros;


public class ConcatenarNumeroInterfaz extends javax.swing.JFrame {

    hija hija= new hija("kim", "n123abc", "negro");// despues de agregar las cosas en hija nos vamos a la interfaz agregar esto 
    
    public ConcatenarNumeroInterfaz() {
        initComponents();
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        resultado = new javax.swing.JTextField();
        body = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        limpiarbt = new javax.swing.JButton();
        concatenarbt = new javax.swing.JButton();
        concatenarbt1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 204));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setBackground(new java.awt.Color(153, 153, 153));
        resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultado.setToolTipText("");
        header.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, 510, 60));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 110));

        body.setBackground(new java.awt.Color(204, 255, 204));
        body.setToolTipText("1");
        body.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Concatenar Numeros");
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 360, 50));

        txt1.setBackground(new java.awt.Color(204, 204, 204));
        body.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 90, 50));

        txt2.setBackground(new java.awt.Color(204, 204, 204));
        body.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 90, 50));

        txt3.setBackground(new java.awt.Color(204, 204, 204));
        txt3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        body.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 80, 50));

        limpiarbt.setBackground(new java.awt.Color(255, 0, 51));
        limpiarbt.setText("CE");
        limpiarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtActionPerformed(evt);
            }
        });
        body.add(limpiarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 70, 40));

        concatenarbt.setBackground(new java.awt.Color(255, 204, 204));
        concatenarbt.setText("concatenar  numero");
        concatenarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concatenarbtActionPerformed(evt);
            }
        });
        body.add(concatenarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 50));

        concatenarbt1.setBackground(new java.awt.Color(255, 102, 153));
        concatenarbt1.setText("concatenar texto");
        concatenarbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concatenarbt1ActionPerformed(evt);
            }
        });
        body.add(concatenarbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 160, 50));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        body.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        body.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, 50));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("*");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        body.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, 50));

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setText("/");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        body.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 50, 50));

        jButton5.setBackground(new java.awt.Color(204, 255, 204));
        jButton5.setText("potencia ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        body.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setText("primo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        body.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        bg.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 540, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed
  resultado.setText("");
  txt1.setText("");
  txt2.setText("");
  txt3.setText("");
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void concatenarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concatenarbtActionPerformed
        double num1 = Double.parseDouble(txt1.getText()); 
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());   //texto//  //string num4=txt1.getTex();
        
      String concatenarNumero = String.valueOf (num1)+", "+String.valueOf(num2)+", "+String.valueOf(num3);
      
      resultado.setText(concatenarNumero);
    }//GEN-LAST:event_concatenarbtActionPerformed

    private void concatenarbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concatenarbt1ActionPerformed
        String  text1= txt1.getText(); 
        String  text2= txt1.getText(); 
       String  text3= txt1.getText() ;   //texto//  //string num4=txt1.getTex();
        
      String concatenartexto = text1+", "+text2+", "+text3;
      
      resultado.setText(concatenartexto);
    }//GEN-LAST:event_concatenarbt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double num1 = Double.parseDouble(txt1.getText()); 
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());   //texto//  //string num4=txt1.getTex();
        
      String suma = String.valueOf (num1+num2+num3);
      
      resultado.setText(suma);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double num1 = Double.parseDouble(txt1.getText()); 
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());   //texto//  //string num4=txt1.getTex();
        
      String resta = String.valueOf (num1-num2-num3);
      
      resultado.setText(resta);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double num1 = Double.parseDouble(txt1.getText()); 
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());   //texto//  //string num4=txt1.getTex();
        
      String multiplicar = String.valueOf (num1*num2*num3);
      
      resultado.setText(multiplicar);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double num1 = Double.parseDouble(txt1.getText()); 
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());   //texto//  //string num4=txt1.getTex();
        
      String division = String.valueOf (num1/num2/num3);
      
      resultado.setText(division);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         double num1 = Double.parseDouble(txt1.getText()); 
        double num2 = Double.parseDouble(txt2.getText());
     
        double potencia=hija.calcularPotencia(num1, num2);
        resultado.setText(String.valueOf(potencia));
        
       // booleanverdaderp o falso
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        double num1 = Double.parseDouble(txt1.getText()); 
        boolean primo = hija.esPrimo((int)num1);
        resultado.setText(String.valueOf(primo));
    }//GEN-LAST:event_jButton6ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel body;
    private javax.swing.JButton concatenarbt;
    private javax.swing.JButton concatenarbt1;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
