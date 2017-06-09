/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftedge;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author yangy
 */
public class LeftEdgeUI extends javax.swing.JFrame {

    private ArrayList<JTextField> upperFields = new ArrayList();
    private ArrayList<JTextField> lowerFields = new ArrayList();
    private NetList nl;
    //ChannelRouter cv;
    
    /**
     * Creates new form LeftEdgeUI
     */
    public LeftEdgeUI() {
        nl = new NetList();
        initComponents();
        connectComponents();
        
        //cv = new ChannelRouter(nl);
    }
    
    private void connectComponents(){
            upperFields.add(Text1);
            lowerFields.add(Text11);
            upperFields.add(Text2);
            lowerFields.add(Text12);
            upperFields.add(Text3);
            lowerFields.add(Text13);
            upperFields.add(Text4);
            lowerFields.add(Text14);
            upperFields.add(Text5);
            lowerFields.add(Text15);
            upperFields.add(Text6);
            lowerFields.add(Text16);
            upperFields.add(Text7);
            lowerFields.add(Text17);
            upperFields.add(Text8);
            lowerFields.add(Text18);
            upperFields.add(Text9);
            lowerFields.add(Text19);
            upperFields.add(Text10);
            lowerFields.add(Text20);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text1 = new javax.swing.JTextField();
        Text2 = new javax.swing.JTextField();
        Text3 = new javax.swing.JTextField();
        Text4 = new javax.swing.JTextField();
        Text5 = new javax.swing.JTextField();
        Text6 = new javax.swing.JTextField();
        Text7 = new javax.swing.JTextField();
        Text8 = new javax.swing.JTextField();
        Text9 = new javax.swing.JTextField();
        Text11 = new javax.swing.JTextField();
        Text12 = new javax.swing.JTextField();
        Text13 = new javax.swing.JTextField();
        Text14 = new javax.swing.JTextField();
        Text15 = new javax.swing.JTextField();
        Text16 = new javax.swing.JTextField();
        Text18 = new javax.swing.JTextField();
        Text19 = new javax.swing.JTextField();
        Text20 = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        routeButton = new javax.swing.JButton();
        Text10 = new javax.swing.JTextField();
        jPanel1 = new ChannelRouter(nl);
        Text17 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clearButton.setText("Clear Nets");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        routeButton.setText("Route Nets");
        routeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jMenu1.setText("The Left Edge Algorithm");

        about.setText("About");
        about.setToolTipText("");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu1.add(about);
        about.getAccessibleContext().setAccessibleName("jMenuItem1");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(clearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(routeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Text11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text13, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text8)
                    .addComponent(Text9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text20)
                    .addComponent(Text18)
                    .addComponent(Text19)
                    .addComponent(Text17)
                    .addComponent(Text16)
                    .addComponent(Text11)
                    .addComponent(Text15)
                    .addComponent(Text13)
                    .addComponent(Text12)
                    .addComponent(Text14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeButton)
                    .addComponent(clearButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutActionPerformed
    //clear all net fields//
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        for(int i=0; i<NetList.NUM_COLS;i++){
        upperFields.get(i).setText("");
        lowerFields.get(i).setText("");
        }
        scanFieldsAndRoute();
        jPanel1.repaint();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void routeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeButtonActionPerformed
        // TODO add your handling code here:
        scanFieldsAndRoute();
        jPanel1.repaint();
    }//GEN-LAST:event_routeButtonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /** Scan the terminal fields for each column and build up the netlist data structure*/ 
  private void scanFieldsAndRoute() {
    nl.clear();
    for (int i = 0; i < NetList.NUM_COLS; i++) {
      String uname = upperFields.get(i).getText().trim();
      String lname = lowerFields.get(i).getText().trim();
      Terminal term;
      Net nt;
      // process upper terminal of column i
      if (!uname.equals("")) {
        nt = nl.findNet(uname);
        if (nt == null) {
          nt = new Net(uname);
          nl.addNet(nt);
          }
        term = nl.getTerminal(i, Terminal.TOP);
        nt.addTerminal(term);
      }
      // now process lower terminal of column i
      if (!lname.equals("")) {
        nt = nl.findNet(lname);
        if (nt == null) {
          nt = new Net(lname);
          nl.addNet(nt);
        }
        term = nl.getTerminal(i, Terminal.BOTTOM);
        nt.addTerminal(term);
      }
    }
    // n.write(System.out);
    nl.leftEdgeAlgorithm();
    // n.write(System.out);
  }
    
public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeftEdgeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text10;
    private javax.swing.JTextField Text11;
    private javax.swing.JTextField Text12;
    private javax.swing.JTextField Text13;
    private javax.swing.JTextField Text14;
    private javax.swing.JTextField Text15;
    private javax.swing.JTextField Text16;
    private javax.swing.JTextField Text17;
    private javax.swing.JTextField Text18;
    private javax.swing.JTextField Text19;
    private javax.swing.JTextField Text2;
    private javax.swing.JTextField Text20;
    private javax.swing.JTextField Text3;
    private javax.swing.JTextField Text4;
    private javax.swing.JTextField Text5;
    private javax.swing.JTextField Text6;
    private javax.swing.JTextField Text7;
    private javax.swing.JTextField Text8;
    private javax.swing.JTextField Text9;
    private javax.swing.JMenuItem about;
    private javax.swing.JButton clearButton;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton routeButton;
    // End of variables declaration//GEN-END:variables
}
