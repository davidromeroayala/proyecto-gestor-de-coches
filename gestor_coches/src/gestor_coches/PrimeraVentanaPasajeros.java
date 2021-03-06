/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor_coches;

import Objetos.Conductor;
import Objetos.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author alumno
 */
public class PrimeraVentanaPasajeros extends javax.swing.JFrame {

    /**
     * Creates new form primeraVentanaPasajeros
     */
    private ArrayList<Persona> vPersonas;
    private ArrayList<Persona> vPersonasVan;
    private DefaultListModel<String> mListaPersona;
    private DefaultListModel<String> mListaPersonaVan;

    private void actualizar() {
        mListaPersona.clear();
        mListaPersonaVan.clear();
        for (Persona per : vPersonas) {
            mListaPersona.addElement(per.toString());
        }
        for (Persona per : vPersonasVan) {
            mListaPersonaVan.addElement(per.toString());
        }
    }

    /*public PrimeraVentanaPasajeros() {
        initComponents();
        DefaultListModel<Object> mListaPersona = new DefaultListModel<>();
        //jLpersonas.setModel(mLista);

    }*/

    public PrimeraVentanaPasajeros(ArrayList<Persona> vPersonas) {
        initComponents();
        this.vPersonas = (ArrayList<Persona>) vPersonas.clone();
        this.vPersonasVan = new ArrayList<>();
        mListaPersona = new DefaultListModel<String>();
        mListaPersonaVan = new DefaultListModel<String>();
        jLpersonas.setModel(mListaPersona);
        jLgenteVa.setModel(mListaPersonaVan);

       actualizar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsiguiente = new javax.swing.JButton();
        jBañadir = new javax.swing.JButton();
        jBquitar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLpersonas = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jRBvehiculo = new javax.swing.JRadioButton();
        jTFapellido = new javax.swing.JTextField();
        jTFtelefono = new javax.swing.JTextField();
        jBañadirnuevo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLgenteVa = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBsiguiente.setText("siguiente");
        jBsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBsiguienteMouseClicked(evt);
            }
        });

        jBañadir.setText("añadir");
        jBañadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBañadirMouseClicked(evt);
            }
        });

        jBquitar.setText("quitar");
        jBquitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBquitarMouseClicked(evt);
            }
        });

        jLabel1.setText("Dni:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Vehiculo:");

        jLpersonas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLpersonas);

        jLabel5.setText("Telefono:");

        jBañadirnuevo.setText("Añadir Nuevo");
        jBañadirnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBañadirnuevoActionPerformed(evt);
            }
        });

        jLgenteVa.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jLgenteVa);

        jLabel6.setText("Listado de Gente que va");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBañadirnuevo)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5)
                                    .addGap(1, 1, 1)
                                    .addComponent(jTFtelefono))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel1)
                                    .addGap(22, 22, 22)
                                    .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 25, Short.MAX_VALUE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFapellido))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBvehiculo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFnombre)))))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBañadir)
                            .addComponent(jBquitar))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBsiguiente)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jBañadir)
                                .addGap(32, 32, 32)
                                .addComponent(jBquitar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRBvehiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBañadirnuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                                .addComponent(jBsiguiente)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBañadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBañadirMouseClicked
        String p = jLpersonas.getSelectedValue();

       Iterator itr = vPersonas.iterator();     
        while (itr.hasNext()) {
            Persona persona = (Persona) itr.next();
            if (persona.getNombre().equalsIgnoreCase(p)) {
                vPersonasVan.add(persona);
                itr.remove();
            }
        }
     

        actualizar();
    }//GEN-LAST:event_jBañadirMouseClicked

    private void jBquitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBquitarMouseClicked
        String p = jLgenteVa.getSelectedValue();
        Iterator itr = vPersonasVan.iterator();     
        while (itr.hasNext()) {
            Persona persona = (Persona) itr.next();
            if (persona.getNombre().equalsIgnoreCase(p)) {
                vPersonas.add(persona);
                itr.remove();
            }
        }
     

        actualizar();
    }//GEN-LAST:event_jBquitarMouseClicked

    private void jBañadirnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBañadirnuevoActionPerformed
       if(jRBvehiculo.isSelected()){
        Conductor per=new Conductor (jTFdni.getText(), jTFnombre.getText(), jTFapellido.getText(), jRBvehiculo.isSelected(), jTFtelefono.getText());
       vPersonasVan.add(per);
       }else{
           Persona per=new Persona(jTFdni.getText(), jTFnombre.getText(), jTFapellido.getText(), jRBvehiculo.isSelected(), jTFtelefono.getText());
       vPersonasVan.add(per);
       }
        jTFapellido.setText("");
       jTFdni.setText("");
       jTFnombre.setText("");
       jTFtelefono.setText("");
       jRBvehiculo.setSelected(false);
      
        
        System.out.println(vPersonasVan);
        actualizar();
        
    }//GEN-LAST:event_jBañadirnuevoActionPerformed

    private void jBsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsiguienteMouseClicked
        SegundaVentanaConductores segunda = new SegundaVentanaConductores(vPersonasVan);

            segunda.setLocationRelativeTo(null);
            segunda.setVisible(true);

            this.dispose();
    }//GEN-LAST:event_jBsiguienteMouseClicked

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrimeraVentanaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeraVentanaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeraVentanaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeraVentanaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeraVentanaPasajeros().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBañadir;
    private javax.swing.JButton jBañadirnuevo;
    private javax.swing.JButton jBquitar;
    private javax.swing.JButton jBsiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jLgenteVa;
    private javax.swing.JList<String> jLpersonas;
    private javax.swing.JRadioButton jRBvehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFnombre;
    private javax.swing.JTextField jTFtelefono;
    // End of variables declaration//GEN-END:variables
}
