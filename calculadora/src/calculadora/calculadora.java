package calculadora ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 370);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAgregar = new JMenu("view");
		menuBar.add(mnAgregar);
		
		JMenu menu_1 = new JMenu("New menu");
		mnAgregar.add(menu_1);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo vehiculo");
		menu_1.add(mntmNuevo);
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		
		JMenu mnmHelp = new JMenu("Edit");
		menuBar.add(mnmHelp);
		
		JMenu mnNewMenu_1 = new JMenu("Comand");
		mnmHelp.add(mnNewMenu_1);
		
		JMenu mnEliminar = new JMenu("help");
		menuBar.add(mnEliminar);
		
		JMenu mnNewMenu = new JMenu("acerca de");
		mnEliminar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 261, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("MC");
		btnNewButton_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2.setBounds(10, 67, 54, 24);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("MR");
		btnNewButton.setBounds(74, 69, 54, 23);
		panel.add(btnNewButton);
		
		JButton btnMs = new JButton("MS");
		btnMs.setBounds(138, 69, 54, 23);
		panel.add(btnMs);
		
		JButton btnM = new JButton("M+");
		btnM.setBounds(202, 69, 54, 23);
		panel.add(btnM);
		
		JButton btnM_1 = new JButton("M-");
		btnM_1.setBounds(267, 69, 54, 23);
		panel.add(btnM_1);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(74, 103, 54, 23);
		panel.add(btnCe);
		
		JButton button_4 = new JButton("\u2190");
		button_4.setBounds(10, 102, 54, 23);
		panel.add(button_4);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(138, 103, 54, 23);
		panel.add(btnC);
		
		JButton button_6 = new JButton("\u00B1");
		button_6.setBounds(202, 103, 54, 23);
		panel.add(button_6);
		
		JButton button_7 = new JButton("\u221A");
		button_7.setBounds(267, 103, 54, 23);
		panel.add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		button_8.setBounds(10, 136, 54, 23);
		panel.add(button_8);
		
		JButton button_9 = new JButton("4");
		button_9.setBounds(10, 170, 54, 23);
		panel.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setBounds(10, 204, 54, 23);
		panel.add(button_10);
		
		JButton button_11 = new JButton("8");
		button_11.setBounds(74, 137, 54, 23);
		panel.add(button_11);
		
		JButton button_12 = new JButton("5");
		button_12.setBounds(74, 170, 54, 23);
		panel.add(button_12);
		
		JButton button_13 = new JButton("2");
		button_13.setBounds(74, 204, 54, 23);
		panel.add(button_13);
		
		JButton button_14 = new JButton("9");
		button_14.setBounds(138, 137, 54, 23);
		panel.add(button_14);
		
		JButton button_15 = new JButton("6");
		button_15.setBounds(138, 170, 54, 23);
		panel.add(button_15);
		
		JButton button_16 = new JButton("3");
		button_16.setBounds(138, 204, 54, 23);
		panel.add(button_16);
		
		JButton button_17 = new JButton("/");
		button_17.setBounds(202, 137, 54, 23);
		panel.add(button_17);
		
		JButton button_18 = new JButton("*");
		button_18.setBounds(202, 170, 54, 23);
		panel.add(button_18);
		
		JButton button_19 = new JButton("-");
		button_19.setBounds(202, 204, 54, 23);
		panel.add(button_19);
		
		JButton button_20 = new JButton("%");
		button_20.setBounds(267, 137, 54, 23);
		panel.add(button_20);
		
		JButton button_21 = new JButton("New button");
		button_21.setBounds(267, 170, 54, 23);
		panel.add(button_21);
		
		JButton button_22 = new JButton("=");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_22.setBounds(267, 204, 54, 57);
		panel.add(button_22);
		
		JButton button_23 = new JButton("0");
		button_23.setBounds(10, 238, 118, 23);
		panel.add(button_23);
		
		JButton button_24 = new JButton(".");
		button_24.setBounds(138, 238, 54, 23);
		panel.add(button_24);
		
		JButton button_25 = new JButton("+");
		button_25.setBounds(202, 238, 54, 23);
		panel.add(button_25);
	}
}