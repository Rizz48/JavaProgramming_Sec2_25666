import javax.swing.*;
import java.util.Random;

public class Withdrawal {

	public static void main(String[] args) {
		//using class Random for random money
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9)*100000;
		//JOptionPane.showMessageDialog(null, "You balance :"+balance);
		int moneywithdraw = Integer.parseInt(
				JOptionPane.showInputDialog("You balance : "+(balance)+"\nInput money to withdraw:"));
		if(moneywithdraw > 20000) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneywithdraw>balance) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneywithdraw % 100!=0){
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw "+ moneywithdraw % 100+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		int B1000 = moneywithdraw/1000;
		int B500 = moneywithdraw%1000/500;
		int B100 = moneywithdraw%1000%500/100;
		JOptionPane.showMessageDialog(null,"You withdraw"+moneywithdraw+"\n1000 = "+B1000+"\n500 = "+B500+"\n100 ="+B100);
			

	}

}
