package Calculator.Mike2;
import java.awt.*;
import java.awt.event.*;
public class NumberListener implements ActionListener{
	
	TextField t;
	
	public NumberListener(TextField text) {
		t = text;
	}

	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		t.setText(t.getText() + btn.getLabel());
	}
	

}
