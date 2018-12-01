import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import java.awt.GridLayout;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DataEntry extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField utepid;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataEntry frame = new DataEntry();
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
	public DataEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 778);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Information");
		lblNewLabel.setBounds(30, 11, 599, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setBounds(30, 49, 599, 14);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(30, 74, 191, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("UTEP ID");
		lblNewLabel_2.setBounds(30, 105, 599, 14);
		contentPane.add(lblNewLabel_2);
		
		utepid = new JTextField();
		utepid.setBounds(30, 130, 191, 20);
		contentPane.add(utepid);
		utepid.setColumns(10);
		
		JPanel majorpanel = new JPanel();
		majorpanel.setBounds(30, 231, 599, 84);
		contentPane.add(majorpanel);
		majorpanel.setLayout(null);
		
		JLabel Major = new JLabel("Major");
		Major.setBounds(0, 0, 46, 14);
		majorpanel.add(Major);
		
		JComboBox Majorc = new JComboBox();
		Majorc.setBounds(0, 22, 261, 22);
		majorpanel.add(Majorc);
		
		JPanel major2panel = new JPanel();
		major2panel.setBounds(30, 326, 599, 84);
		contentPane.add(major2panel);
		major2panel.setLayout(null);
		
		JLabel Major2 = new JLabel("Major 2");
		Major2.setBounds(0, 0, 46, 14);
		//major2panel.add(Major2);
		
		JComboBox Major2c = new JComboBox();
		Major2c.setBounds(0, 22, 261, 22);
		//major2panel.add(Major2c);
		
		
		
		JLabel lblDoYouHave = new JLabel("Do you have a double major?");
		lblDoYouHave.setBounds(30, 161, 599, 14);
		contentPane.add(lblDoYouHave);
		
		JRadioButton yesButton = new JRadioButton("Yes");
		yesButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				major2panel.add(Major2);
				major2panel.add(Major2c);
				major2panel.repaint();
			}
		});
		yesButton.setBounds(30, 182, 87, 23);
		
		buttonGroup.add(yesButton);
		contentPane.add(yesButton);
		
		JRadioButton noButton = new JRadioButton("No");
		noButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.remove(major2panel);
				contentPane.repaint();
			}
		});
		noButton.setBounds(130, 182, 91, 23);
		
		buttonGroup.add(noButton);
		contentPane.add(noButton);
		

	

		
	}
}
