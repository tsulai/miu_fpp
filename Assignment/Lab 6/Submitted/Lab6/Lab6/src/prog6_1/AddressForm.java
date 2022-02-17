package prog6_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AddressForm extends JFrame implements ActionListener{
	
	JButton button;
	JTextField txtName;
	JTextField txtStreet;
	JTextField txtCity;
	JTextField txtState;
	JTextField txtZip;
	int lblWidthMin = 130;
	int lblHeight = 25;
	
	AddressForm(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Address Form");
		this.setSize(620,500);
		centerFrameOnDesktop(this);
		//this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setVisible(true);	
		//Border border = BorderFactory.createLineBorder(Color.green, 3);		
		
		JLabel lblName = new JLabel();
		lblName.setText("Name");		
		lblName.setPreferredSize(new Dimension(lblWidthMin, lblHeight));	
		
		JLabel lblStreet = new JLabel();
		lblStreet.setText("Street");
		lblStreet.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		JLabel lblCity = new JLabel();
		lblCity.setText("City");
		lblCity.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		JLabel lblState = new JLabel();
		lblState.setText("State");
		lblState.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		JLabel lblZip = new JLabel();
		lblZip.setText("Zip");
		lblZip.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtName = new JTextField();
		txtName.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtStreet = new JTextField();
		txtStreet.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtCity = new JTextField();
		txtCity.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtCity = new JTextField();
		txtCity.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtCity = new JTextField();
		txtCity.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtState = new JTextField();
		txtState.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtZip = new JTextField();
		txtZip.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		button = new JButton("Submit");
		button.addActionListener(evt -> {
			System.out.println(txtName.getText() + "\n" + txtStreet.getText() + "\n" + txtCity.getText() + ", " + txtState.getText() + " " + txtZip.getText());
		});		
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(500, 50));
		northPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(300, 50));
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
		
		JPanel westPanel = new JPanel();
		westPanel.setPreferredSize(new Dimension(100, 50));
		westPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		westPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(100, 50));
		eastPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		eastPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(100, 80));
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
		southPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		northPanel.add(lblName);
		northPanel.add(lblStreet);
		northPanel.add(lblCity);		
		northPanel.add(txtName);
		northPanel.add(txtStreet);
		northPanel.add(txtCity);
		centerPanel.add(lblState);
		centerPanel.add(lblZip);
		centerPanel.add(txtState);	
		centerPanel.add(txtZip);
		southPanel.add(button);
		
		
		this.add(northPanel,BorderLayout.NORTH);
		this.add(centerPanel,BorderLayout.CENTER);
		this.add(eastPanel, BorderLayout.EAST);
		this.add(westPanel,BorderLayout.WEST);
		this.add(southPanel,BorderLayout.SOUTH);		
		//
		this.pack();
		
	}

	
	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		int xpos = (width - frameWidth) / 2;
		int ypos = (height - frameHeight) / 3;
		f.setLocation(xpos, ypos);
	}

	public static void main(String[] args) {
		
		AddressForm form1 = new AddressForm();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
