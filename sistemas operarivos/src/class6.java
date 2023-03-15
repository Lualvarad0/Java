import java.awt.Color;
import javax.swing.*;

public class class6 extends JFrame {
	private JButton button1;
	public class6() {
		setLayout(null);
		
		button1 = new JButton();
		button1.setBounds(10, 20, 200, 30);
		button1.setBackground(Color.BLUE);
		add(button1);
	}

	public static void main(String[] args) {
		class6 hojita = new class6();
		
		hojita.setBounds( 10, 10, 400, 400 );
		hojita.setVisible( true );
	}
	
}