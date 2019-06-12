package Calculator.Mike2;
import java.awt.*;
import java.awt.event.*;
public class OperationListener implements ActionListener{
	
	TextField t;
	int no1=0;
	String operation = "";
	
	public OperationListener(TextField text) {
		t = text;
	}

	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		String op = btn.getLabel();
		if(op.equals("c")) {
			t.setText("");
		} else if(op.equals("+") || op.equals("-") || op.equals("/") || op.equals("x")) {
			no1 = Integer.parseInt(t.getText());
			t.setText("");
			operation = op;
		} else if(op.equals("=") && !operation.equals("")) {
			int result=no1;
			if(operation.equals("+")) {
				result = result + Integer.parseInt(t.getText());
				t.setText(Integer.toString(result));
			}
			if(operation.equals("-")) {
				result = result - Integer.parseInt(t.getText());
				t.setText(Integer.toString(result));
			}
			if(operation.equals("/")) {
				double result2 = result;
				result2 = (double) result2 / Integer.parseInt(t.getText());
				t.setText(Double.toString(result2));
			}
			if(operation.equals("x")) {
				result = result * Integer.parseInt(t.getText());
				t.setText(Integer.toString(result));
			}
			no1=0;
			operation = "";
		}
	}
	

}