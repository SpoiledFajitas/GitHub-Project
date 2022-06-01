package Main;

import mod.MyThread;
import mod.MythreadDos;


import javax.swing.*;

public class main {

	public static void main(String[] args0) throws InterruptedException {
		MyThread thread1 = new MyThread();
		MythreadDos thread2 = new MythreadDos();
		ImageIcon start = new ImageIcon("startMOM.png");
		thread1.setDaemon(true);
		thread1.start();
		thread1.join(1000);
		thread2.start();

	}
}