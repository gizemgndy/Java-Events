import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TestMouseEvents extends Calculate implements MouseListener {
	
	public TestMouseEvents() {
		// TODO Auto-generated constructor stub
		
		getTextOne().addMouseListener(this);
		
		getBtnCalculate().removeActionListener(this); // remove action listner
		
		getBtnCalculate().addMouseListener(this); // handle mouse events
		
		
	}
	
	
	public static void main(String[] args) {
		new TestMouseEvents();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(getBtnCalculate())) {
			System.out.println("calculate");
		}
		else {
			System.out.println("text filed");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println(" Mouse is entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
