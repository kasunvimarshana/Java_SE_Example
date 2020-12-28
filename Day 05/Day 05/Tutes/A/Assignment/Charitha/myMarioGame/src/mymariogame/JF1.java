
package mymariogame;

import java.awt.event.KeyEvent;

public class JF1 extends javax.swing.JFrame {

    boolean b = true;
    public boolean runMario = false;
    public int mario = 2;
    Sound sound;
    public int count =0;
    public JF1() {
        initComponents();
        myForward();
        myScore();
        new Thread(new Runnable() {

            public void run() {
                while(b){

                   try {
                        
                        sound = new Sound("mario.mp3");
                        sound.play();


                        Thread.sleep(141000);
                    } catch (Exception e) {
                    }
                }
            }
        }).start();
    }


    public void myScore()
    {
        new Thread(new Runnable() {

            public void run() {
                while(lblmario.getY()<30)
                {
                   try{
                   Thread.sleep(1000);
                   lblscore.setText(""+count);
                   count++;
                   }
                   catch(Exception e){}

                }
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        }).start();
    }

   public void myForward()
   {
           new Thread(new Runnable()
           {
             public void run()
             {
               while(!runMario)
                {
                    try
                    {
                    Thread.sleep(50);
                    if(lblback3.getX()>=getWidth())
                    {
                        lblback3.setLocation((lblback1.getX()+mario)-(lblback3.getWidth()), lblback3.getY());
                    }
                    else
                    {
                        lblback3.setLocation(lblback3.getX()+mario, lblback3.getY());
                    }
                    if(lblback1.getX()>=getWidth())
                    {
                        lblback1.setLocation((lblback2.getX()+mario)-(lblback1.getWidth()), lblback1.getY());
                    }
                    else
                    {
                        lblback1.setLocation(lblback1.getX()+mario, lblback1.getY());
                    }
                    if(lblback2.getX()>=getWidth())
                    {
                        lblback2.setLocation((lblback3.getX()+mario)-(lblback2.getWidth()), lblback2.getY());
                    }
                    else
                    {
                        lblback2.setLocation(lblback2.getX()+mario, lblback2.getY());
                    }
                    /*lblsharp*/

                    if(lblsharp1.getX()>=getWidth())
                    {
                        lblsharp1.setLocation((lblsharp2.getX()+mario)-(lblsharp1.getWidth()), lblsharp1.getY());
                    }
                    else
                    {
                        lblsharp1.setLocation(lblsharp1.getX()+mario, lblsharp1.getY());
                    }
                    if(lblsharp2.getX()>=getWidth())
                    {
                        lblsharp2.setLocation((lblsharp3.getX()+mario)-(lblsharp2.getWidth()), lblsharp2.getY());
                    }
                    else
                    {
                        lblsharp2.setLocation(lblsharp2.getX()+mario, lblsharp2.getY());
                    }
                    if(lblsharp3.getX()>=getWidth())
                    {
                        lblsharp3.setLocation((lblsharp1.getX()+mario)-(lblsharp3.getWidth()), lblsharp1.getY());
                    }
                    else
                    {
                        lblsharp3.setLocation(lblsharp1.getX()+mario, lblsharp1.getY());
                    }
                    
                   
                    }
                    catch(Exception e)
                    {

                    }
                }
             }
           }).start();
           
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmute = new javax.swing.JLabel();
        lblbexit = new javax.swing.JLabel();
        lblsharp3 = new javax.swing.JLabel();
        lblsharp2 = new javax.swing.JLabel();
        lblsharp1 = new javax.swing.JLabel();
        lblgameover = new javax.swing.JLabel();
        lbldeathcoopa = new javax.swing.JLabel();
        lblmario = new javax.swing.JLabel();
        lblback1 = new javax.swing.JLabel();
        lblback2 = new javax.swing.JLabel();
        lblback3 = new javax.swing.JLabel();
        lblscore = new javax.swing.JLabel();
        lblscorename = new javax.swing.JLabel();
        lblaboutus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/soundmuteimage.png"))); // NOI18N
        lblmute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmuteMouseClicked(evt);
            }
        });
        getContentPane().add(lblmute, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        lblbexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/exit1.png"))); // NOI18N
        lblbexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbexitMouseClicked(evt);
            }
        });
        getContentPane().add(lblbexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 30));

        lblsharp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/sharp1.png"))); // NOI18N
        getContentPane().add(lblsharp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 740, 40));

        lblsharp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/sharp1.png"))); // NOI18N
        getContentPane().add(lblsharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-740, 30, 740, 40));

        lblsharp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/sharp1.png"))); // NOI18N
        getContentPane().add(lblsharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 740, 40));

        lblgameover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/gameover.png"))); // NOI18N
        getContentPane().add(lblgameover, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 250, 250));

        lbldeathcoopa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/deathcoopa.png"))); // NOI18N
        getContentPane().add(lbldeathcoopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 90, 160));

        lblmario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/mario1.png"))); // NOI18N
        getContentPane().add(lblmario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 110, 150));

        lblback1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/marioback.png"))); // NOI18N
        getContentPane().add(lblback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 740, 450));

        lblback2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/marioback.png"))); // NOI18N
        getContentPane().add(lblback2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-740, 30, 740, 450));

        lblback3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/marioback.png"))); // NOI18N
        getContentPane().add(lblback3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 740, 450));

        lblscore.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 60, 30));

        lblscorename.setFont(new java.awt.Font("Times New Roman", 3, 14));
        lblscorename.setText("Score");
        getContentPane().add(lblscorename, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 30));

        lblaboutus.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblaboutus.setForeground(new java.awt.Color(51, 0, 255));
        lblaboutus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblaboutus.setText("Super Mario - Made by Charitha Athukorala");
        getContentPane().add(lblaboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 4, 420, 20));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-752)/2, (screenSize.height-521)/2, 752, 521);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                 mario++;
                 break;
            case KeyEvent.VK_RIGHT:
                mario--;
                break;
            case KeyEvent.VK_UP:
                lblmario.setLocation(lblmario.getX(), lblmario.getY()-5); break;
            case KeyEvent.VK_DOWN:
                lblmario.setLocation(260, 300);
                break;
            
        }
        if(lblmario.getY()<170 && lblmario.getY()>20)
        {
        lblmario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/mario2.png")));
        }
        else //if(lblmario.getY()>170 && lblmario.getY()<300)
        {
        lblmario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/mario1.png")));
        }
        /*else if(lblmario.getY()<30)
        {
        lblmario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/deathmario1.png")));
        //lblmario.setLocation(260, 420);
        }*/

        if(lblmario.getY()<70)
        {
        lblgameover.setLocation(260, 120);
        lblgameover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/gameover.png")));
       
        }


        if(mario<35)
        {
        lbldeathcoopa.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        else
        {
        lbldeathcoopa.setLocation(470, 290);
        lbldeathcoopa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/deathcoopa.png")));
        }
        /*else
        {
        lblmario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymariogame/deathcoopa.png")));
        }*/
        
    }//GEN-LAST:event_formKeyPressed

    private void lblmuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmuteMouseClicked
        int a = 0;
        if(a == 1)
        {
            sound.play(); //it doesn't work :(
        }
        else
        {
            sound.close();
            //a = 1;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_lblmuteMouseClicked

    private void lblbexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbexitMouseClicked
       System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblbexitMouseClicked
    

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblaboutus;
    private javax.swing.JLabel lblback1;
    private javax.swing.JLabel lblback2;
    private javax.swing.JLabel lblback3;
    private javax.swing.JLabel lblbexit;
    private javax.swing.JLabel lbldeathcoopa;
    private javax.swing.JLabel lblgameover;
    private javax.swing.JLabel lblmario;
    private javax.swing.JLabel lblmute;
    private javax.swing.JLabel lblscore;
    private javax.swing.JLabel lblscorename;
    private javax.swing.JLabel lblsharp1;
    private javax.swing.JLabel lblsharp2;
    private javax.swing.JLabel lblsharp3;
    // End of variables declaration//GEN-END:variables


}
