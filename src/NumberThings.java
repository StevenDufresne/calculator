import java.awt.EventQueue;

import javax.swing.JFrame;

public class NumberThings {

	private JFrame frame;
	private int winWidth = 400;
	private int winHeight = 700;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberThings window = new NumberThings();
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
	public NumberThings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, winWidth, winHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
