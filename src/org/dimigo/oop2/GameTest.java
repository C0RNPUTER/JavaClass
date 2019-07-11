package org.dimigo.oop2;

public class GameTest {
    public static void main(String[] args) {
        MediaPlayer mp = MediaPlayer.getInstance();
        System.out.println(mp.getInstance());

        new Player().play();
        System.out.println(mp.getVolume());
        new Enemy().play();
        System.out.println(mp.getVolume());
    }
}
