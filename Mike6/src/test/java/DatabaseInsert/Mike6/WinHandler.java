package DatabaseInsert.Mike6;
import java.awt.event.*;

public class WinHandler implements WindowListener {

	public void windowOpened(WindowEvent e) {
		System.out.println("Hello!");
		
	}

	public void windowClosing(WindowEvent e) {
		try {
			EHandler.stmt.close();
			EHandler.conn.close();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		System.out.println("Goodbye!");
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowMaximized(WindowEvent e) {}
}
