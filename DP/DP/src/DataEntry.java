import java.awt.Container;
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
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class DataEntry extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField utepid;
	private final ButtonGroup buttonGroupMaj = new ButtonGroup();
	private final ButtonGroup buttonGroupMin = new ButtonGroup();
	private JTextField gradyear;

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
		setBounds(100, 100, 1280, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel studentinfotitle = new JLabel("Student Information");
		studentinfotitle.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		studentinfotitle.setHorizontalAlignment(SwingConstants.LEFT);
		studentinfotitle.setBounds(64, 11, 599, 14);
		contentPane.add(studentinfotitle);
		
		JLabel fullname = new JLabel("Full Name");
		fullname.setHorizontalAlignment(SwingConstants.LEFT);
		fullname.setBounds(63, 49, 1201, 14);
		contentPane.add(fullname);
		
		name = new JTextField();
		name.setBounds(63, 74, 191, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel utepidtitle = new JLabel("UTEP ID");
		utepidtitle.setBounds(63, 105, 1201, 14);
		contentPane.add(utepidtitle);
		
		utepid = new JTextField();
		utepid.setBounds(63, 130, 191, 20);
		contentPane.add(utepid);
		utepid.setColumns(10);
		
		JPanel majorpanel = new JPanel();
		majorpanel.setBounds(63, 226, 599, 84);
		contentPane.add(majorpanel);
		majorpanel.setLayout(null);
		
		JLabel Major = new JLabel("Major");
		Major.setBounds(0, 0, 46, 14);
		majorpanel.add(Major);
		
		JComboBox Majorc = new JComboBox();
		Majorc.setBounds(0, 22, 261, 22);
		Majorc.addItem("Electrical Engineering");
		Majorc.addItem("Microbiology");
		majorpanel.add(Majorc);
		
		JPanel major2panel = new JPanel();
		major2panel.setBounds(63, 321, 1234, 84);
		contentPane.add(major2panel);
		major2panel.setLayout(null);
		
		JLabel Major2 = new JLabel("Major 2");
		Major2.setBounds(0, 0, 46, 14);
		//major2panel.add(Major2);
		
		JComboBox Major2c = new JComboBox();
		Major2c.setBounds(0, 22, 261, 22);
		Major2c.addItem("Electrical Engineering");
		Major2c.addItem("Microbiology");
		//major2panel.add(Major2c);
		
		
		
		JLabel lblDoYouHave = new JLabel("Do you have a double major?");
		lblDoYouHave.setBounds(63, 161, 1201, 14);
		contentPane.add(lblDoYouHave);
		
		JRadioButton yesMajorButton = new JRadioButton("Yes");
		yesMajorButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				major2panel.add(Major2);
				major2panel.add(Major2c);
				major2panel.repaint();
			}
		});
		yesMajorButton.setBounds(63, 182, 87, 23);
		
		buttonGroupMaj.add(yesMajorButton);
		contentPane.add(yesMajorButton);
		
		JRadioButton noMajorButton = new JRadioButton("No");
		noMajorButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				major2panel.remove(Major2);
				major2panel.remove(Major2c);
				major2panel.repaint();
			}
		});
		noMajorButton.setBounds(163, 182, 91, 23);
		
		buttonGroupMaj.add(noMajorButton);
		contentPane.add(noMajorButton);
		
		JLabel lblDoYouHave_1 = new JLabel("Do you have a minor or concentration?");
		lblDoYouHave_1.setBounds(63, 421, 1234, 14);
		contentPane.add(lblDoYouHave_1);
		
		JRadioButton yesMinButton = new JRadioButton("Yes");
		yesMinButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});

		buttonGroupMin.add(yesMinButton);
		yesMinButton.setBounds(63, 442, 87, 23);
		contentPane.add(yesMinButton);
		
		JRadioButton noMinButton = new JRadioButton("No");
		buttonGroupMin.add(noMinButton);
		noMinButton.setBounds(163, 442, 91, 23);
		contentPane.add(noMinButton);
		
		JPanel minpanel = new JPanel();
		minpanel.setBounds(63, 483, 1234, 104);
		contentPane.add(minpanel);
		minpanel.setLayout(null);
		
		JComboBox Minorc = new JComboBox();
		Minorc.setBounds(0, 23, 261, 22);
		minpanel.add(Minorc);
		
		JLabel Concentration = new JLabel("Concentration");
		Concentration.setBounds(0, 56, 599, 14);
		minpanel.add(Concentration);
		
		JComboBox Concenc = new JComboBox();
		Concenc.setBounds(0, 81, 261, 22);
		minpanel.add(Concenc);
		
		JLabel lblMinor = new JLabel("Minor");
		lblMinor.setBounds(0, 0, 599, 14);
		minpanel.add(lblMinor);
		
		JLabel gradyeartitle = new JLabel("Desired graduation rate");
		gradyeartitle.setBounds(63, 599, 1234, 14);
		contentPane.add(gradyeartitle);
		
		gradyear = new JTextField();
		gradyear.setBounds(64, 617, 190, 20);
		contentPane.add(gradyear);
		gradyear.setColumns(10);
		

	

		
	}
}
