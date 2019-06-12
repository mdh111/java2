package Calculator2.Mike3;

import java.awt.event.*;
import java.awt.*;

public class EHandler implements ActionListener {
	
	TextField no1,no2,answer;
	CheckboxGroup checkbox;
	
	public EHandler(TextField a, TextField b, TextField res, CheckboxGroup c) {
		no1 = a;
		no2 = b;
		answer = res;
		checkbox = c;
	}

	public void actionPerformed(ActionEvent e) {
		int a=0;
		int b=0;
		int result=0;
		String c = "";
		a = Integer.parseInt(no1.getText());
		b = Integer.parseInt(no2.getText());
		c = checkbox.getSelectedCheckbox().getLabel();
		if(c.equals("Addition")) {
			result = a+b;
		} else if(c.equals("Subtraction")) {
			result = a-b;
		}
		answer.setText(Integer.toString(result));
	}

}
