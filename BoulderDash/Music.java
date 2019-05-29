package InsaneVehicles;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.*;

import panneau.Panneau;

public class Music {
    private AudioFormat format;
    private byte[] samples;
    /**
     * 
     * @param filename le lien vers le fichier song (URL ou absolute path)
     */
    public static void Play(String sonFile, int compteur) { //la méthode importante qui sert à jouer le son à chaque fois qu'on l'appelle en y passant l'URL du fichier...
 SourceDataLine soundLine = null;
 int BUFFER_SIZE = 64 * 1024; // 64 KB


 try {
 File soundFile = new File(sonFile);
 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
 AudioFormat audioFormat = audioInputStream.getFormat();
 DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
 soundLine = (SourceDataLine) AudioSystem.getLine(info);
 soundLine.open(audioFormat);
 soundLine.start();
 int nBytesRead = 0;
 byte[] sampledData = new byte[BUFFER_SIZE];
 while (nBytesRead != -1 && compteur == InsaneVehicles.compteur) {
 nBytesRead = audioInputStream.read(sampledData, 0,
 sampledData.length);
 if (nBytesRead >= 0) {
 soundLine.write(sampledData, 0, nBytesRead);
 }
 }
 } catch (UnsupportedAudioFileException ex) {
 ex.printStackTrace();
 } catch (IOException ex) {
 ex.printStackTrace();
 } catch (LineUnavailableException ex) {
 ex.printStackTrace();
 } finally {
 soundLine.drain();
 soundLine.close();
 }
    }
}