/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CarGame.java
 *
 * Created on Mar 6, 2011, 1:21:28 AM
 */
package gameex;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nuwan
 */
public class CarGame extends javax.swing.JFrame {

    int speed = 0;
    boolean crashed = false;

    public CarGame() {
        initComponents();
        Runnable r1= new Runnable() {

            public void run() {
                while (!crashed) {
                    if (lblRoad.getY() >= getHeight()) {
                        lblRoad.setBounds(lblRoad.getX(), (lblRoad1.getY() + speed) -lblRoad.getHeight(), 800, 600);
                    } else {
                        lblRoad.setBounds(lblRoad.getX(), lblRoad.getY() + speed, 800, 600);
                    }
                    if(lblRoad1.getY()>=getHeight()){
                        lblRoad1.setBounds(lblRoad1.getX(), (lblRoad.getY() + speed)-lblRoad1.getHeight(), 800, 600);
                    }else{
                        lblRoad1.setBounds(lblRoad1.getX(), lblRoad1.getY() + speed, 800, 600);
                    }
                    

                    System.out.println(speed);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CarGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        new Thread(r1).start();

        Runnable r2 = new Runnable() {

            public void run() {
                
            }
        };

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCar = new javax.swing.JLabel();
        lblRoad = new javax.swing.JLabel();
        lblRoad1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameex/car.png"))); // NOI18N
        getContentPane().add(lblCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 80, -1));

        lblRoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameex/road.png"))); // NOI18N
        getContentPane().add(lblRoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 600));

        lblRoad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameex/road.png"))); // NOI18N
        getContentPane().add(lblRoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -600, 750, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode();
        switch (key) {
            case 37:
                //to Left
                lblCar.setBounds(lblCar.getX() - 1, lblCar.getY(), 83, 150);
                break;
            case 38:
                //To Up
                //lblCar.setBounds(lblCar.getX(), lblCar.getY()-5, 83, 150);
                speed++;
                break;
            case 39:
                //To Right
                lblCar.setBounds(lblCar.getX() + 1, lblCar.getY(), 83, 150);
                break;
            case 40:
                //To Down
                //lblCar.setBounds(lblCar.getX(), lblCar.getY()+1, 83, 150);
                speed--;
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CarGame().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCar;
    private javax.swing.JLabel lblRoad;
    private javax.swing.JLabel lblRoad1;
    // End of variables declaration//GEN-END:variables
}
