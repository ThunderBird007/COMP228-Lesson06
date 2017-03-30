import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class ExampleFrame extends JFrame {

	//private JPanel _contentPanel;
	//private EmptyBorder _myEmptyBorder;
	//private BorderLayout _myBorderLayout;
	private JLabel _firstNameLabel;
	private ImageIcon _cube;
	
	// Constructor
	public ExampleFrame() {
		super("My Example Frame");
		this._Initialize();
	}

	private void _Initialize() {
		/*this._myEmptyBorder = new EmptyBorder(5, 5, 5, 5);
		this._myBorderLayout = new BorderLayout(0, 0);
		*/
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FlowLayout());
		/*this._contentPanel = new JPanel();
		this._contentPanel.setBorder(this._myEmptyBorder);
		this._contentPanel.setLayout(this._myBorderLayout);
		setContentPane(this._contentPanel);
		*/
		
		this._cube = new ImageIcon(getClass().getResource("/Assets/cube.png"));
		this._firstNameLabel = new JLabel("First...Name", SwingConstants.CENTER);
		this._firstNameLabel.setIcon(this._cube);
		//this._contentPanel.add(this._firstNameLabel, BorderLayout.NORTH);
		getContentPane().add(this._firstNameLabel, BorderLayout.NORTH);
	}

}
