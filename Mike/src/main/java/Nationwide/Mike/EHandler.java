package Nationwide.Mike;

import java.awt.*;
import java.awt.event.*;

public class EHandler implements ActionListener {

	TextField no1,no2,result;
	
	public EHandler(TextField a, TextField b, TextField c) {
		no1 = a;
		no2 = b;
		result = c;
	}

	public void actionPerformed(ActionEvent e) {
		int a=0;
		int b=0;
		double c=0;
		a = Integer.parseInt(no1.getText());
		b = Integer.parseInt(no2.getText());
		Button btn = (Button) e.getSource();
		String ctrl = btn.getLabel();
		if(ctrl.equals("+")) {
			c = a+b;
		}
		if(ctrl.equals("-")) {
			c = a-b;
		}
		if(ctrl.equals("/")) {
			c = (double) a/b;
		}
		if(ctrl.equals("x")) {
			c = a*b;
		}
		result.setText(Double.toString(c));
	}
}