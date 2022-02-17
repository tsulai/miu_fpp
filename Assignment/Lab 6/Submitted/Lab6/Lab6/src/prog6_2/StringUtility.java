package prog6_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StringUtility extends JFrame implements ActionListener {

	int widthBtn = 180;
	int HeightBtn = 30;	
	int widthTxt = 180;
	int heightTxt = 25;	
	int widthLbl = 180;
	int heightLbl = 20;
	int heightPanel = 170;
	
	JButton btnCount;
	JButton btnReverse;
	JButton btnRmvDup;
	
	JTextField txtInput;
	JTextField txtOutput;
	
	StringUtility(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("String Utility");
		this.setSize(500,heightPanel);
		centerFrameOnDesktop(this);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		btnCount = new JButton("Count Letters");
		btnCount.setPreferredSize(new Dimension(widthBtn, HeightBtn));
		btnCount.addActionListener(evt -> {
			txtOutput.setText(Integer.toString(getCharCount(txtInput.getText())));
		});	
		
		btnReverse = new JButton("Reverse Letters");
		btnReverse.setPreferredSize(new Dimension(widthBtn, HeightBtn));
		btnReverse.addActionListener(evt -> {
			txtOutput.setText(reverseLetter(txtInput.getText()));
		});
		
		btnRmvDup = new JButton("Remove Duplicates");
		btnRmvDup.setPreferredSize(new Dimension(widthBtn, HeightBtn));
		btnRmvDup.addActionListener(evt -> {
			txtOutput.setText(removeDuplicate(txtInput.getText()));
		});
		
		JLabel spacer = new JLabel("");
		spacer.setPreferredSize(new Dimension(widthLbl, heightLbl));	
				
		JLabel lblInput = new JLabel();
		lblInput.setText("Input");		
		lblInput.setPreferredSize(new Dimension(widthLbl, heightLbl));	
		
		JLabel lblOutput = new JLabel();
		lblOutput.setText("Output");
		lblOutput.setPreferredSize(new Dimension(widthLbl, heightLbl));
		
		txtInput = new JTextField();
		txtInput.setPreferredSize(new Dimension(widthTxt, heightTxt));
		
		txtOutput = new JTextField();
		txtOutput.setPreferredSize(new Dimension(widthTxt, heightTxt));
		
		JPanel westPanel = new JPanel();
		westPanel.setPreferredSize(new Dimension(250, heightPanel));
		westPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10,10));
		//westPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(250, heightPanel));
		eastPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10,0));
		//eastPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 0));
		
		westPanel.add(btnCount);
		westPanel.add(btnReverse);
		westPanel.add(btnRmvDup);
		
		eastPanel.add(spacer);
		eastPanel.add(lblInput);
		eastPanel.add(txtInput);
		eastPanel.add(lblOutput);
		eastPanel.add(txtOutput);
		
		this.add(eastPanel,BorderLayout.EAST);
		this.add(westPanel,BorderLayout.WEST);
		
		this.pack();
	}
	public int getCharCount(String str) {
		return (int) str.chars().filter(ch -> ch != ' ').count();
	}
	
	public String reverseLetter(String str) {
		String output = "";		
		int len = str.length();
		for(int i = len-1; i >= 0; i--){
			output += str.charAt(i);
		}
		return output;
	}
	
	public String removeDuplicate(String str) {		
			int len = str.length();
			StringBuilder nodups = new StringBuilder();
			nodups.append(str.charAt(0));
			for(int i = 1; i < len; ++i) {
				boolean dupFound = false;
				for(int j = 0; j < i; ++j)                                                                                                                                  {
					if(str.charAt(j) == str.charAt(i)) {
						dupFound = true;
						break;
					}
				}
				if(!dupFound) {
					nodups.append(str.charAt(i));
				}
			}
			return nodups.toString();
			
		
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
		StringUtility myUtil = new StringUtility();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
