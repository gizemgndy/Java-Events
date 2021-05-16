import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TestTabs extends JFrame {
	
	private JTabbedPane myTabs;
	private JPanel pnlOne, pnlTwo,pnlThree;
	
	public TestTabs() {
		// TODO Auto-generated constructor stub
		myTabs= new JTabbedPane();
		
		pnlOne= new JPanel();
		pnlOne.setBackground(Color.red);
		
		
		pnlTwo= new JPanel();
		pnlTwo.setBackground(Color.yellow);
		
		
		pnlThree= new JPanel();
		pnlThree.setBackground(Color.PINK);
		
		
		myTabs.add("Istanbul",pnlOne);
		myTabs.add("Ankara",pnlTwo);
		myTabs.add("Istanbul",pnlThree);
		
		add(myTabs);
		
		
		
		
		
		
		
		
		
		

		setSize(500, 400);
		setTitle("calculate");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new TestTabs();
	}

}
