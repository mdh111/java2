package Nationwide.Mike;

import java.awt.*;
import java.awt.event.*;

public class DivHandler implements ActionListener {

	TextField no1,no2,result;
	
	public DivHandler(TextField a, TextField b, TextField c) {
		no1 = a;
		no2 = b;
		result = c;
	}

	public void actionPerformed(ActionEvent e) {
		int a,b;
		a=b=0;
		double c = 0;
		try {
		a = Integer.parseInt(no1.getText());
		b = Integer.parseInt(no2.getText());
		c = (double) a/b;
		result.setText(Double.toString(c));
		} catch (NumberFormatException ex) {
			System.out.println("Digits only");
		}
		
	}

}