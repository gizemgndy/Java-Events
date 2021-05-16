import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class TestKeyEvents extends Calculate implements KeyListener{
	
	public TestKeyEvents() {
		// TODO Auto-generated constructor stub
		//getTextOne().addKeyListener(this);
		getTextTwo().addKeyListener(this);
		
	}
	
	
	
	public static void main(String[] args) {
		new TestKeyEvents();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println(e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_ENTER) {
			//System.out.println("enter is typed");
			calculate();
			getTexResult().setText(totol+"");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyChar());
		
	}

}
