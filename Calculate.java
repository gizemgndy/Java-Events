import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculate extends JFrame implements ActionListener{
	private JLabel lblOne,lblTwo,lblInfo;
	private JTextField txtOne, txtTwo, txtResult;
	private JButton btnCalculate, btnReset, btnExit;
	private JLabel lblResult;
	private Calculations calculations;
	
	private JRadioButton rdAdd, rdMul,rdSub,rdDiv;
	private ButtonGroup grpCalculate;
	
	private JCheckBox chInfo; // diplay information
	
	public int totol;
	
	public Calculate() {
		// TODO Auto-generated constructor stub
		
		init(); // call the method
		calculations= new Calculations();
		
		
		// set size window
		
		setSize(500, 400);
		setTitle("calculate");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);
	}
	
	// initialize GUI items
	
	private void init() {
		
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(0,2));
		
		lblOne = new JLabel(" Fist Number");
		lblTwo = new JLabel(" Fist Second");
		lblInfo = new JLabel();
		
		txtOne = new JTextField();
		txtOne.setColumns(10);
		

		txtTwo = new JTextField();
		txtTwo.setColumns(10);
		
		

		txtResult = new JTextField();
		txtResult.setColumns(10);
		txtResult.setEditable(false);
		
		lblResult = new JLabel("Result");
		
		btnCalculate = new JButton("Calculate");
		btnReset= new JButton("Reset");
		btnExit= new JButton("Exit");
		
		add(lblOne);
		add(txtOne);
		add(lblTwo);
		add(txtTwo);
		add(lblResult);
		add(txtResult);
		
		// add buttons
		JPanel pnlButtons= new JPanel();
		pnlButtons.setLayout(new FlowLayout());
		pnlButtons.add(btnCalculate);
		pnlButtons.add(btnReset);
		pnlButtons.add(btnExit);
		
		add(pnlButtons); // add to grid layout
		
		// register buttons to handle actions
		btnCalculate.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
		
		// initialize radio buttons
		rdAdd= new JRadioButton("Add");
		rdSub= new JRadioButton("Sub");
		rdMul= new JRadioButton("Mul");
		rdDiv= new JRadioButton("Div");
		
		// JPanle for radio buttons
		JPanel pnlRadioJPanel= new JPanel();
		
		pnlRadioJPanel.add(rdAdd);
		pnlRadioJPanel.add(rdSub);
		pnlRadioJPanel.add(rdMul);
		pnlRadioJPanel.add(rdDiv);
		
		// ad radioPanle to gridLayout
		add(pnlRadioJPanel);
		
		// make radioo groups
		grpCalculate= new ButtonGroup();
		grpCalculate.add(rdSub);
		grpCalculate.add(rdAdd);
		grpCalculate.add(rdMul);
		grpCalculate.add(rdDiv);
		rdAdd.setSelected(true); // default option
		
		
		//initialize check box
		chInfo= new JCheckBox("Show Info");
		// add this item to grid layout (user interface)
		add(chInfo);
		add(lblInfo);
		
		// set default option
		chInfo.setSelected(true);
		lblInfo.setForeground(Color.RED);
		lblInfo.setBackground(Color.yellow);
		lblInfo.setOpaque(true);
		
	}
	
	public static void main(String[] args) {
		new Calculate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(btnCalculate))
			calculate();
		else if(e.getSource().equals(btnReset))
			reset();
		else
			exit();
		
	}
	
	
	// helper methods for buttons...
	
	public void calculate() {
		int result=0;
		
		try {
			int one= Integer.parseInt( txtOne.getText().trim());
			int two= Integer.parseInt( txtTwo.getText().trim());
			
			// int sum= one+two;
			//int sum= calculations.add(one, two);
			if(rdAdd.isSelected())
				
				result=calculations.add(one, two);
			else if(rdSub.isSelected())
				result= calculations.sub(one, two);
			
			else if(rdMul.isSelected())
				result= calculations.mul(one, two);
			else
				result= calculations.div(one, two);
			
			// txtResult.setText(sum +"");
			totol= result ; // we add this variable to test KeyListner......
			txtResult.setText(result+"");
			
			if(chInfo.isSelected()) {
				lblInfo.setText("Result is: "+ result);
			}
			else {
				lblInfo.setText("");
				lblInfo.setOpaque(false);
			}
			
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(this, "INterger data", "Number Fomart", JOptionPane.ERROR_MESSAGE);
		}
	}
	

	private void reset() {
		txtOne.setText("");
		txtTwo.setText("");
		txtResult.setText("");
		rdAdd.setSelected(true);
		chInfo.setSelected(true);
		chInfo.setOpaque(true);
	}
	
	
	

	private void exit() {
		int k= JOptionPane.showConfirmDialog(this, "Do you want to exit","Exit",JOptionPane.YES_NO_OPTION);
		if(k== JOptionPane.YES_OPTION) {
			System.exit(1); // terminate the applications
		}
	}
	
	
	
	public JButton getBtnCalculate() {
		return btnCalculate;
	}
	
	
	public JTextField getTextOne() {
		return txtOne;
	}

	

	public JTextField getTextTwo() {
		return txtTwo;
	}
	



	public JTextField getTexResult() {
		return txtResult;
	}
}
