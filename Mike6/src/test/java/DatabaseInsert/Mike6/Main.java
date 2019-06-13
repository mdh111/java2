package DatabaseInsert.Mike6;
import java.awt.*;

public class Main {

	static TextField textRegno,textName,textMarks;
	
	public static void main(String[] args) {
		Frame f = new Frame("Db insert");
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,2));
		
		WinHandler we = new WinHandler();
		f.addWindowListener(we);
		
		p.add(new Label("Registration number:"));
		 textRegno = new TextField("",20);
		p.add(textRegno);
		p.add(new Label("Name:"));
		 textName = new TextField("",20);
		p.add(textName);
		p.add(new Label("Marks:"));
		 textMarks = new TextField("",20);
		p.add(textMarks);
		p.add(new Label(""));
		Button btnInsert = new Button("Insert");
		p.add(btnInsert);
		
		EHandler e = new EHandler();
		btnInsert.addActionListener(e);
		
		f.add(p,BorderLayout.CENTER);
		f.setSize(300,300);
		f.setVisible(true);
	}

}
