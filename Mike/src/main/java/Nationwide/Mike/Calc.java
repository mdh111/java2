package Nationwide.Mike;
import java.awt.*;

public class Calc {

	public static void main(String[] args) {
		Frame f = new Frame("Calculator");
		TextField t1,t2,t3;
		Label l1,l2,l3;
		Button bAdd = new Button("+");
		Button bSubtract = new Button("-");
		Button bDivide = new Button("/");
		Button bMultiply = new Button("x");
		l1 = new Label("First no:");
		l2= new Label("Second no:");
		l3 = new Label("Result:");
		t1 = new TextField(5);
		t2 = new TextField(5);
		t3 = new TextField(5);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//AddHandler a = new AddHandler(t1,t2,t3);
		//SubHandler s = new SubHandler(t1,t2,t3);
		//DivHandler d = new DivHandler(t1,t2,t3);
		//MulHandler m = new MulHandler(t1,t2,t3);
		//bAdd.addActionListener(a);
		//bSubtract.addActionListener(s);
		//bDivide.addActionListener(d);
		//bMultiply.addActionListener(m);
		EHandler e = new EHandler(t1,t2,t3);
		bAdd.addActionListener(e);
		bSubtract.addActionListener(e);
		bDivide.addActionListener(e);
		bMultiply.addActionListener(e);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(bAdd);
		f.add(bSubtract);
		f.add(bDivide);
		f.add(bMultiply);
		f.add(l3);
		f.add(t3);
		f.setSize(600,100);
		f.setVisible(true);
	}

}
