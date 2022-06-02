package Mod;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

import javax.sound.sampled.*;

//runs microphone connected to computer and records the volume of all incoming sound and sends it to the sleep class
//to be analyzed.
public class testMic extends Thread{


	public static boolean setB = false;


	//sets setB to true or false which will start or stop the microphone. This is what lets the start/stop button in
	//the sleep class work.
	public void setBB(boolean h) {
		setB = h;
	}


	//Takes microphone input as volume values and sends them and the times at which they happened to the sleep class.
    public void run() {


    	
        ByteArrayOutputStream byteArrayOutputStream;
        TargetDataLine targetDataLine;
        int cnt;
        boolean stopCapture = setB;
        byte tempBuffer[] = new byte[8000];
        int countzero, countdownTimer;
        int time, timeMin;
        short convert[] = new short[tempBuffer.length];
        Sleep k = new Sleep(1);

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            stopCapture = false;
            countdownTimer = 0;
            time = 0;
            timeMin = 0;
            while (!stopCapture) {
            	stopCapture = setB;
                AudioFormat audioFormat = new AudioFormat(8000.0F, 16, 1, true, false);
                DataLine.Info dataLineInfo = new DataLine.Info(TargetDataLine.class, audioFormat);
                targetDataLine = (TargetDataLine) AudioSystem.getLine(dataLineInfo);
                targetDataLine.open(audioFormat);
                targetDataLine.start();
                cnt = targetDataLine.read(tempBuffer, 0, tempBuffer.length);
                byteArrayOutputStream.write(tempBuffer, 0, cnt);
                try {
                    countzero = 0;
                    for (int i = 0; i < tempBuffer.length; i++) {
                        convert[i] = tempBuffer[i];
                        if (convert[i] == 0) {
                            countzero++;
                            
                        }
                    }

                    countdownTimer++;
                    System.out.println(countzero + " " + countdownTimer);
                    k.addIntegers(countzero);
                    Calendar.getInstance(TimeZone.getTimeZone("EDT"));
                    time = LocalDateTime.now().getHour();
                    timeMin = LocalDateTime.now().getMinute();
                    k.addTimes(time);
                    k.addTimesMin(timeMin);
                    
                    
                    

                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
                Thread.sleep(0);
                targetDataLine.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


