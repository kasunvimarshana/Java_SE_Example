/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carex;

/**
 *
 * @author KASUN
 */
public class MyGame extends javax.swing.JFrame {

    boolean crash = false;
    int speed = 0;
    /**
     * Creates new form MyGame
     */
    public MyGame() {
        initComponents();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                gameRun();
            }
        };
        new Thread(r).start();
    }
    
    public void gameRun(){
        while(!crash){
            lblRoad.setLocation(lblRoad.getX(), lblRoad.getY()+speed);
            lblRoad1.setLocation(lblRoad1.getX(), lblRoad1.getY()+speed);
            
            if(lblRoad.getY() > 600){
                lblRoad.setLocation(lblRoad.getX(), lblRoad1.getY()-600);
            }
            if(lblRoad1.getY() > 600){
                lblRoad1.setLocation(lblRoad1.getX(), lblRoad.getY()-600);
            }
            
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carex/car.png"))); // NOI18N
        getContentPane().add(lblCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        lblRoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carex/road.png"))); // NOI18N
        getContentPane().add(lblRoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        lblRoad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carex/road.png"))); // NOI18N
        getContentPane().add(lblRoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -600, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        //System.out.println(key);
        if(key == 38){
        //up
            //lblRoad.setLocation(lblRoad.getX(), lblRoad.getY()+2);
            speed++;
        }
        if(key == 40){
        //down
            //lblRoad.setLocation(lblRoad.getX(), lblRoad.getY()-2);
            speed--;
        }
        if(key == 37){
        //left
            lblCar.setLocation(lblCar.getX()-2, lblCar.getY());
            if(lblCar.getX() < 290){
                crash = true;
                lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carex/car-crashed.png"))); 
            }
        }
        if(key == 39){
        //right
            lblCar.setLocation(lblCar.getX()+2, lblCar.getY());
            if(lblCar.getX() > 490){
                crash = true;
                lblCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carex/car-crashed.png")));
            }
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(MyGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCar;
    private javax.swing.JLabel lblRoad;
    private javax.swing.JLabel lblRoad1;
    // End of variables declaration//GEN-END:variables
}
