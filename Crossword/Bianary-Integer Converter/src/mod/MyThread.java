package mod;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import viewcon.Controller;

public class MyThread extends Thread {
	private int i = 0;
	private Controller cnt = new Controller();
	private boolean f = true;
	
	
	
	public void run() {

			
			final JOptionPane pane = new JOptionPane(cnt.drawmap());
		    final JDialog d = pane.createDialog((JFrame)null, "Conversion table");
		    d.setLocation(800,300);
		    d.setVisible(true);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block

			}
			i++;
		}
		
	}
	

