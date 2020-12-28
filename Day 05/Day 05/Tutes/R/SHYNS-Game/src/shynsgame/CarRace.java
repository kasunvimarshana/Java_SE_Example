
package shynsgame;

import java.awt.event.KeyEvent;


public class CarRace extends javax.swing.JFrame {

    public boolean crashed = false;
    public int carSpeed = 1;
    public CarRace() {
        initComponents();
        myForward();
    }

    public void myForward(){
        new Thread(new Runnable() {

            public void run() {
                while (!crashed) {
                    try {
                        Thread.sleep(100);
                        if (lblRoad.getY() >= getHeight() - 34) {
                            lblRoad.setLocation(lblRoad.getX(), (lblRoad1.getY() + carSpeed) - lblRoad.getHeight());
                        } else {
                            lblRoad.setLocation(lblRoad.getX(), lblRoad.getY() + carSpeed);
                        }
                        if (lblRoad1.getY() >= getHeight() - 34) {
                            lblRoad1.setLocation(lblRoad1.getX(), (lblRoad.getY() + carSpeed) -( lblRoad1.getHeight()));
                        } else {
                            lblRoad1.setLocation(lblRoad1.getX(), (lblRoad1.getY() + carSpeed));
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCar = new javax.swing.JLabel();
        lblRoad1 = new javax.swing.JLabel();
        lblRoad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shynsgame/car.png"))); // NOI18N
        getContentPane().add(lblCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 80, 150));

        lblRoad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shynsgame/road.png"))); // NOI18N
        getContentPane().add(lblRoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -600, 800, 600));

        lblRoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shynsgame/road.png"))); // NOI18N
        getContentPane().add(lblRoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                lblCar.setLocation(lblCar.getX() - 5, lblCar.getY()); break;
            case KeyEvent.VK_RIGHT:
                lblCar.setLocation(lblCar.getX() + 5, lblCar.getY()); break;
            case KeyEvent.VK_UP:
                carSpeed++; break;
            case KeyEvent.VK_DOWN:
                carSpeed--; break;
        }
    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarRace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCar;
    private javax.swing.JLabel lblRoad;
    private javax.swing.JLabel lblRoad1;
    // End of variables declaration//GEN-END:variables

}
