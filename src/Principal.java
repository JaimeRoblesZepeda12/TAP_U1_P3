
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Principal extends javax.swing.JFrame {
    double total,totalH,extra;
    String turno;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        pnlRecibo.setVisible(false);
        tbtnMostrar.setEnabled(false);
        /*modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Sueldo");*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngBono = new javax.swing.ButtonGroup();
        btngHorario = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        tbtnMostrar = new javax.swing.JToggleButton();
        rbtnSi = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        cbtnMatutino = new javax.swing.JCheckBox();
        cbtnVespertino = new javax.swing.JCheckBox();
        cmbNivel = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pnlRecibo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecibo = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        lblNombre.setText("Nombre");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        tbtnMostrar.setText("Mostrar Recibo");
        tbtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnMostrarActionPerformed(evt);
            }
        });

        btngBono.add(rbtnSi);
        rbtnSi.setText("Si");
        rbtnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSiActionPerformed(evt);
            }
        });

        btngBono.add(rbtnNo);
        rbtnNo.setText("No");
        rbtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNoActionPerformed(evt);
            }
        });

        cbtnMatutino.setText("Matutino");

        cbtnVespertino.setText("Vespertino");

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nivel del empleado", "S", "A", "B" }));

        jLabel2.setText("Bono");

        jLabel3.setText("Horario");

        lblHoras.setText("Horas Trabajadas");

        jLabel5.setText("Nivel Del Empleado");

        pnlRecibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtRecibo.setEditable(false);
        txtRecibo.setColumns(20);
        txtRecibo.setRows(5);
        jScrollPane1.setViewportView(txtRecibo);

        javax.swing.GroupLayout pnlReciboLayout = new javax.swing.GroupLayout(pnlRecibo);
        pnlRecibo.setLayout(pnlReciboLayout);
        pnlReciboLayout.setHorizontalGroup(
            pnlReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        pnlReciboLayout.setVerticalGroup(
            pnlReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Este programa calcula el sueldo de un empleado dependiendo de su nivel, horas y si le dan un bono ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHoras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtHoras)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbtnVespertino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbtnMatutino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbtnNo)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnSi)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(tbtnMostrar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cbtnMatutino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbtnVespertino))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(validaNombre(txtNombre)){txtNombre.requestFocus(); lblNombre.setForeground(Color.red);txtNombre.setText(""); return;}
        else if(validaHoras(txtHoras)){txtHoras.requestFocus(); lblHoras.setForeground(Color.red);txtHoras.setText(""); return;}
        lblHoras.setForeground(Color.black);
        
        //JOptionPane.showMessageDialog(this,cmbNivel.getSelectedIndex());
        if(cmbNivel.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar el nivel del Empleado");
        }else if(cmbNivel.getSelectedIndex()==1){
            totalH=Double.parseDouble(txtHoras.getText())*600;
        try{
            if(btngBono.getSelection().isSelected()){
                if(rbtnSi.isSelected()){
                    extra=(totalH*12)/100;
                }else extra=0;
            }
        }catch(NullPointerException err){
            showMessageDialog(this,"Selecciona Si va tener bonos el empleado");
            return;
        }
        
        if(cbtnMatutino.isSelected())turno="Matutino";else turno="Vespertino";
            
        
            total=totalH+extra;
            txtRecibo.setText("Empleado: "+txtNombre.getText()+"\n"+"Turno: "+turno+"\n"+"Horas Trabajadas: "+txtHoras.getText()+"\n"+"Nivel del Empleado: "+cmbNivel.getSelectedItem()+"\n"+"Bonos: "+extra+"\n"+"Total: "+total);
            showMessageDialog(this,"Se calculo Correctamente \n selecciones mostrar recibo");
            tbtnMostrar.setEnabled(true);
        }else if(cmbNivel.getSelectedIndex()==2){
            totalH=Double.parseDouble(txtHoras.getText())*400;
        try{
            if(btngBono.getSelection().isSelected()){
                if(rbtnSi.isSelected()){
                    extra=(totalH*12)/100;
                }else extra=0;
            }
        }catch(NullPointerException err){
            showMessageDialog(this,"Selecciona Si va tener bonos el empleado");
            return;
        }
        
        if(cbtnMatutino.isSelected())turno="Matutino";else turno="Vespertino";
            
        
            total=totalH+extra;
            txtRecibo.setText("Empleado: "+txtNombre.getText()+"\n"+"Turno: "+turno+"\n"+"Horas Trabajadas: "+txtHoras.getText()+"\n"+"Nivel del Empleado: "+cmbNivel.getSelectedItem()+"\n"+"Bonos: "+extra+"\n"+"Total: "+total);
            showMessageDialog(this,"Se calculo Correctamente \n selecciones mostrar recibo");
            tbtnMostrar.setEnabled(true);
        }else if(cmbNivel.getSelectedIndex()==3){
            totalH=Double.parseDouble(txtHoras.getText())*200;
        try{
            if(btngBono.getSelection().isSelected()){
                if(rbtnSi.isSelected()){
                    extra=(totalH*12)/100;
                }else extra=0;
            }
        }catch(NullPointerException err){
            showMessageDialog(this,"Selecciona Si va tener bonos el empleado");
            return;
        }
        
        if(cbtnMatutino.isSelected())turno="Matutino";else turno="Vespertino";
            
        
            total=totalH+extra;
            txtRecibo.setText("Empleado: "+txtNombre.getText()+"\n"+"Turno: "+turno+"\n"+"Horas Trabajadas: "+txtHoras.getText()+"\n"+"Nivel del Empleado: "+cmbNivel.getSelectedItem()+"\n"+"Bonos: "+extra+"\n"+"Total: "+total);
            showMessageDialog(this,"Se calculo Correctamente \n selecciones mostrar recibo");
            tbtnMostrar.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rbtnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSiActionPerformed

    private void rbtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNoActionPerformed

    private void tbtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnMostrarActionPerformed
        pnlRecibo.setVisible(tbtnMostrar.isSelected());
    }//GEN-LAST:event_tbtnMostrarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        txtNombre.setText(txtNombre.getText().toUpperCase());
    }//GEN-LAST:event_txtNombreKeyReleased
//-----------Excepctions -----------
    public void cadenaVacia(String cad)throws Exception{
        if(cad.length()==0)throw new Exception("Campos Vacios");
    }
    private void validaNum(String d) throws Exception{
        if(!d.matches("[0-9]*")) throw new Exception("Solo Numeros");
        
    }
    private void validaLet(String d) throws Exception{
        if(!d.matches("[A-Z]*")) throw new Exception("Solo Letras");
        
    }
    private void validaNu(String d) throws Exception{
        if(!d.matches("[1-9]*")) throw new Exception("No validos \n *0 \n *letras \n *caracter especial \n *Negativos");
    }
    private void validaNeg(String num)throws Exception{
        if(Integer.parseInt(num)<0)throw new Exception("Solo positivos");
    }
    public boolean validaHoras(JTextField t){
        try {
            cadenaVacia(t.getText());
        }catch(Exception e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }try {
            validaNum(t.getText());
        }catch(Exception e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }try {
            validaNeg(t.getText());
        }catch(Exception e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }try {
            validaNu(t.getText());
        }catch(Exception e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }
        return false;
    }
    public boolean validaNombre(JTextField t){
        try {
            cadenaVacia(t.getText());
        }catch(Exception e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }try {
            validaLet(t.getText());
        }catch(Exception e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }
        return false;
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup btngBono;
    private javax.swing.ButtonGroup btngHorario;
    private javax.swing.JCheckBox cbtnMatutino;
    private javax.swing.JCheckBox cbtnVespertino;
    private javax.swing.JComboBox cmbNivel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlRecibo;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnSi;
    private javax.swing.JToggleButton tbtnMostrar;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtRecibo;
    // End of variables declaration//GEN-END:variables
}
