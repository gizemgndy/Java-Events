import java.awt.GridLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class TestJavaMenu  extends JFrame implements ActionListener{
	
	private JMenuBar menuBar;
	private JMenu menuFile,menuHelp;
	private JMenuItem itmCalculate, itmReset,itmExit,itmHelp, itmInfo;
	
	public TestJavaMenu() {
		// TODO Auto-generated constructor stub
		
		menuBar= new JMenuBar();
		menuFile= new JMenu("File");
		menuHelp= new JMenu("Help");
		
		itmCalculate= new JMenuItem("calculate");
		itmReset= new JMenuItem("reset");
		itmExit= new JMenuItem("Exit");
		
		
		itmHelp= new JMenuItem("help");
		itmInfo= new JMenuItem("info");
		
		menuFile.add(itmCalculate);
		menuFile.add(itmReset);
		menuFile.add(itmExit);
		
		menuHelp.add(itmHelp);
		menuHelp.add(itmInfo);
		
		
		
		menuBar.add(menuFile);
		menuBar.add(menuHelp);
		
		menuBar.setLayout(new GridLayout(0,1));
		
		setJMenuBar(menuBar); // 
		
		itmCalculate.addActionListener(this);
		itmReset.addActionListener(this);
		itmExit.addActionListener(this);
		itmHelp.addActionListener(this);
		itmInfo.addActionListener(this);
		
		

		setSize(500, 400);
		setTitle("calculate");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new TestJavaMenu();
	}
	
	
	public void calculate() {
		System.out.println("calculate");
	}

 
	public void reset() {
		System.out.println("reset");
	}
	

	public void exit() {
		System.out.println("exit");
	}
	

	public void help() {
		System.out.println("help");
	}
	

	public void info() {
		System.out.println("info");
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==itmCalculate)
			calculate();
		else if(e.getSource()==itmReset)
			reset();
		else if(e.getSource()==itmExit)
			exit();
		else if(e.getSource()==itmHelp)
			help();
		else 
			info();
		
	}
}
