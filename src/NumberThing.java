import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class NumberThing {

	private JFrame frame;
	private int calcWidth = 350;
	private int calcHeight = 500;
	private int buttonWidth = calcWidth / 4;
	private int buttonHeight = buttonWidth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberThing window = new NumberThing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumberThing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, calcWidth, calcHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		int counter = 1;
		// Loop 9 times, create new button
		for(int i = 0;i<3;i++) {
			for(int j= 0; j< 3; j++) {
				addButton(Integer.toString(counter), j * buttonWidth, i * buttonHeight);	
						
				counter++;
			}
		}
	}
	
	private void addButton(String text, int x, int y) {
		JButton btn_1 = new JButton(text);
		btn_1.setBounds(x, 184, buttonWidth, buttonHeight);
		frame.getContentPane().add(btn_1);	
	}
}
