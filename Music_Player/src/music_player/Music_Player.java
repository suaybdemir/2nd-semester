/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music_player;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author PC
 */
public class Music_Player {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        File file = new File("Beat It.waw");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        /*Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        String response = input.next();
        
        clip.start();*/
        
        
        
    }
    
}
