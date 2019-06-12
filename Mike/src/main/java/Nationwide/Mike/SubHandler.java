package Nationwide.Mike;

import java.awt.*;
import java.awt.event.*;

public class SubHandler implements ActionListener {

	TextField no1,no2,result;
	
	public SubHandler(TextField a, TextField b, TextField c) {
		no1 = a;
		no2 = b;
		result = c;
	}

	public void actionPerformed(ActionEvent e) {
		int a,b,c;
		a=b=c=0;
		try {
		a = Integer.parseInt(no1.getText());
		b = Integer.parseInt(no2.getText());
		c = a-b;
		result.setText(Integer.toString(c));
		} catch (NumberFormatException ex) {
			System.out.println("Digits only");
		}
		
	}

}