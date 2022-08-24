import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import E06.VetorDeReais;
public class Andre {

	private JFrame MainFrame;
	private JTextField tfTamanho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Andre window = new Andre();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Andre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainFrame = new JFrame();
		MainFrame.getContentPane().setBackground(Color.DARK_GRAY);
		MainFrame.setBounds(100, 100, 1020, 800);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setResizable(false);
		MainFrame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(21, 68, 30, 22);
		MainFrame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Indique o tamanho:");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(21, 39, 101, 18);
		MainFrame.getContentPane().add(lblNewLabel);
		
		tfTamanho = new JTextField();
		tfTamanho.setBounds(195, 38, 45, 20);
		MainFrame.getContentPane().add(tfTamanho);
		tfTamanho.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Qual o nome do objeto?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(21, 11, 164, 18);
		MainFrame.getContentPane().add(lblNewLabel_1);
		
		JTextField tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(195, 9, 45, 20);
		MainFrame.getContentPane().add(tfNome);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamanho = Integer.parseInt(tfTamanho.toString());
				E06.VetorDeReais vetor = new E06.VetorDeReais(tamanho, tfNome.getText());
			}
		});
		btnNewButton.setBounds(250, 8, 89, 23);
		MainFrame.getContentPane().add(btnNewButton);
		
	
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
