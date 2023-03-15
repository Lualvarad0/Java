import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;

public class Tabla extends JFrame {
void Aleatorio() {
	Random num=new Random();
	int Valor=num.nextInt(15)+1;
}
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla frame = new Tabla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 5, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 139, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 474, SpringLayout.WEST, contentPane);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(2);
		flowLayout.setHgap(2);
		contentPane.add(panel);
		

		JButton button = new JButton("New button");
		button.getText();
		panel.add(button);
		
		JButton button_1 = new JButton("New button");
		panel.add(button_1);
		
		JButton button_2 = new JButton("New button");
		panel.add(button_2);
		
		JButton button_3 = new JButton("New button");
		panel.add(button_3);
		
		JButton button_4 = new JButton("New button");
		panel.add(button_4);
		
		JButton button_5 = new JButton("New button");
		panel.add(button_5);
		
		JButton button_6 = new JButton("New button");
		panel.add(button_6);
		
		JButton button_7 = new JButton("New button");
		panel.add(button_7);
		
		JButton button_8 = new JButton("New button");
		panel.add(button_8);
		
		JButton button_9 = new JButton("New button");
		panel.add(button_9);
		
		JButton button_10 = new JButton("New button");
		panel.add(button_10);
		
		JButton button_11 = new JButton("New button");
		panel.add(button_11);
		
		JButton button_12 = new JButton("New button");
		panel.add(button_12);
		
		JButton button_13 = new JButton("New button");
		panel.add(button_13);
		
		JButton button_14 = new JButton("New button");
		panel.add(button_14);
		
		JButton button_15 = new JButton("New button");
		panel.add(button_15);
		
		JButton button_16 = new JButton("New button");
		panel.add(button_16);
		
		JButton button_17 = new JButton("New button");
		panel.add(button_17);
		
		JButton button_18 = new JButton("New button");
		panel.add(button_18);
		
		JButton button_19 = new JButton("New button");
		panel.add(button_19);
		
		JButton button_20 = new JButton("New button");
		panel.add(button_20);
		
		JButton button_21 = new JButton("New button");
		panel.add(button_21);
		
		JButton button_22 = new JButton("New button");
		panel.add(button_22);
		
		JButton button_23 = new JButton("New button");
		panel.add(button_23);
		
		JButton button_24 = new JButton("New button");
		panel.add(button_24);
		
		JButton btnNewButton = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -189, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			
			
			//arraylist
			//matrices de 2 dimensiones
			//mover algo en la pantalla
			//pixeles en la pantalla
			}
		});
	}

}
