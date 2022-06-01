package mod;
import viewcon.Controller;
import javax.swing.JOptionPane;

public class Overseer {

	private boolean loop = false;
	private Controller cnt;
	private String map;
	private int[] numArr = {128, 64,32,16,8,4,2,1};
	private int[] bit = new int[8];
	private int sum;
	private String option;
	private int test = 0%10;
	private String sum3;
	private String sum2;
	private int sum4;
	private int descision = 0;
	private boolean loop2 = true;
	
	
	public Overseer() {
		System.out.print(test);
		cnt = new Controller();
		while(loop2) {
		sum3 ="";
		sum2 ="";
		sum4 =0;
		sum =0;
		loop = false;
		descision = 0;
		option = JOptionPane.showInputDialog("type exit to close", "Enter a number,a binary, or random");
		for(int i = 0; i< option.length(); i++) {
			if((!option.substring(i, i+1).equals("0")&&!option.substring(i, i+1).equals("1")) || option.length()<8) {
				descision = 1;
			}
		
		}
		if(option.equals("exit")) {
			loop2 = false;
		}
		if(option.equals("random")) {
			descision =2;
		}
		if(descision == 0) {
			sum2 = option;
			JOptionPane.showMessageDialog(null, "\n" +"\n" + sum2 + "\n" + bitToNum(sum2) + "\n" + returnFromula(getBinarySum(sum2,0)) + getBinarySum(sum2));
		}
		else if(descision == 1) {
			sum = Integer.parseInt(option);
			JOptionPane.showMessageDialog( null, "number inputed " + sum +"\n" + bitToNum(numToBit(sum)) + "\n"+ numToBit(sum)+ "\n" );
		}
		else if(descision == 2) {
			boolean choose = false;
			sum3 = random();
			System.out.println(sum3);
			for(int i = 0; i< sum3.length()-1; i++) {
				if((!sum3.substring(i, i+1).equals("0")&&!sum3.substring(i, i+1).equals("1")) || sum3.length()<9) {
					choose = true;
				}
			}
			if(choose) {
		
				JOptionPane.showMessageDialog(null, "\n" +"\n" + sum3 + "\n" + bitToNum(sum3) + "\n" + returnFromula(getBinarySum(sum3,0)) + getBinarySum(sum3));
			}
			else if(!choose) {
				sum4 = Integer.parseInt(sum3);
				JOptionPane.showMessageDialog( null, "number inputed " + sum4 +"\n" + bitToNum(numToBit(sum4)) + "\n"+ numToBit(sum4)+ "\n" );
			}
			
		}
		}
		
	}
	
	
	
	
	
	public String bitToNum(String num) {
		int hu =0;
		String ret = "";
		int number = Integer.parseInt(num);
		for(int i =0; i< num.length(); i++) {
			if(num.substring(i, i+1).equals("1")) {
				ret+= numArr[i]; 
			}
			else {
				ret += "0";
			}
			number = number/10;
		}
		return ret;
		
	}
	
	public String random() {
		boolean binOrNum = false;
		String cnt ="";
		String turner = "";
		int temp = 0;
		
		if(Math.random()>1) {
			binOrNum = true;
		}
		if(binOrNum) {
			temp = (int)Math.random()*200;
			turner = (temp +1) +"";
			return turner;
		}
		else {
			for(int i =0; i<8; i++ ) {
				if(Math.random()>.5) {
					cnt +="1";
				}
				else {
					cnt+= "0";
				}
			}
		}
		return cnt;
	}
	
	public String returnFromula(String k) {
		return k;
	}
	
	public int getBinarySum(String num) {
		int sum =0;
		int cnt = 0;
		String follow = "";
		for(int i =0; i<num.length(); i++) {
			if(num.substring(i,i+1).equals("1")) {
				if(cnt == 0) {
					sum+= 128;
					follow += "128 + ";
				}
				else if(cnt == 1) {
					sum+= 64;
					follow += "64 + ";
				}
				else if(cnt == 2) {
					sum+= 32;
					follow += "32 + ";
				}
				else if(cnt == 3) {
					sum+= 16;
					follow += "16 + ";
				}
				else if(cnt == 4) {
					sum+= 8;
					follow += "8 + ";
				}
				else if(cnt == 5) {
					sum+= 4;
					follow += "4 + ";
				}
				else if(cnt == 6) {
					sum+= 2;
					follow += "2 + ";
				}
				else if(cnt == 7) {
					sum+= 1;
					follow += "1 + ";
				}
				
			}
			cnt++;
		}
		follow += "= ";
		return sum;
		
	}
	
	public String getBinarySum(String num,int useless) {
		int sum =0;
		int cnt2 = 0;
		int cnt = 0;
		String follow = "";
		for(int i =0; i<num.length(); i++) {
			if(num.substring(i,i+1).equals("1")) {
				cnt2++;
			}
		}
		for(int i =0; i<num.length(); i++) {
			if(num.substring(i,i+1).equals("1")) {
				if(cnt == 0) {
					sum+= 128;
					if(cnt2 != 1 ) {
						follow += "128 + ";
					}
					else {
						follow += "128 ";
					}
				}
				else if(cnt == 1) {
					sum+= 64;
					if(cnt2 != 1 ) {
						follow += "64 + ";
					}
					else {
						follow += "64 ";
					}
				}
				else if(cnt == 2) {
					sum+= 32;
					if(cnt2 != 1 ) {
						follow += "32 + ";
					}
					else {
						follow += "32 ";
					}
				}
				else if(cnt == 3) {
					sum+= 16;
					if(cnt2 != 1 ) {
						follow += "16 + ";
					}
					else {
						follow += "16 ";
					}
				}
				else if(cnt == 4) {
					sum+= 8;
					if(cnt2 != 1 ) {
						follow += "8 + ";
					}
					else {
						follow += "8 ";
					}
				}
				else if(cnt == 5) {
					sum+= 4;
					if(cnt2 != 1 ) {
						follow += "4 + ";
					}
					else {
						follow += "4 ";
					}
				}
				else if(cnt == 6) {
					sum+= 2;
					if(cnt2 != 1 ) {
						follow += "2 + ";
					}
					else {
						follow += "2 ";
					}
				}
				else if(cnt == 7) {
					sum+= 1;
					if(cnt2 != 1 ) {
						follow += "1 + ";
					}
					else {
						follow += "1 ";
					}
				}
				cnt2--;
			}
			cnt++;
			
		}
		follow += "= ";
		return follow;
		
	}
	
	public String bitToNum(int num) {
		int hu =0;
		String ret = "";
		int number = num;
		for(int i =0; i<8; i++) {
			hu = number%10;
			if(hu== 1) {
				ret+= numArr[7-i]; 
			}
			else {
				ret += "0";
			}
			number = number/10;
		}
		return ret;
		
	}
	public String numToBit(int num) {
		String strt = Integer.toBinaryString(num);
		String ret = "";
		for(int i = strt.length(); i< 8; i++) {
			ret += 0;
			
		}
		ret += strt;
		return ret;
	}
	
	

	
	
	
	
	
	
}
