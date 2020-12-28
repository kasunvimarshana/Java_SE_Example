/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mymariogame;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Sound {
    private String filename;
    private Player player;

    public Sound(String filename)
    {
        this.filename = filename;
    }
    public void close() { if (player != null) player.close(); }

    public void play() {
        try {
            FileInputStream fis     = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
        }

        // run in new thread to play in background
        new Thread() {
            public void run() {
                try { player.play(); }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();
}

     public static void main(String[] args) {
        String filename = args[0];
        Sound sound = new Sound(filename);
        sound.play();

        // do whatever computation you like, while music plays
        int N = 4000;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum += Math.sin(i + j);
            }
        }
        System.out.println(sum);

        // when the computation is done, stop playing it
        sound.close();

        // play from the beginning
        sound = new Sound(filename);
        sound.play();

    }
}
