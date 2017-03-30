import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Program {

	public static void main(String[] args) {
		ExampleFrame myFrame = new ExampleFrame();
		myFrame.setVisible(true);
		
		
		/*String firstName;
		String lastName;
		Integer messageReturn;
		*/
		Dimension dialogDimension = new Dimension(320,320);
		
		/*firstName = JOptionPane.showInputDialog("Enter your first name");
		lastName = JOptionPane.showInputDialog("Enter your last name");
		
		JOptionPane.showMessageDialog(null, 
                "First name: " + firstName + "\n" + "Last name: " + lastName,
                "Your full name",
                JOptionPane.PLAIN_MESSAGE
                );
                */
		/*messageReturn = 
		JOptionPane.showConfirmDialog(null, 
				                     "Error",
				                      "Error?",
				                      JOptionPane.OK_CANCEL_OPTION,
				                      JOptionPane.ERROR_MESSAGE
			                      
				                      );
				                      */
		//System.out.println("First name: " + firstName + "\n" + "Last name: " + lastName);
		//System.out.println(messageReturn);
		
		MyDialog myDialog = new MyDialog();
		myDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		myDialog.setSize(dialogDimension);
		myDialog.setMinimumSize(dialogDimension);
		myDialog.setMaximumSize(dialogDimension);
		//myDialog.setVisible(true);
		
		myFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		myFrame.setSize(dialogDimension);
		myFrame.setMinimumSize(dialogDimension);
		myFrame.setMaximumSize(dialogDimension);
		myFrame.setVisible(true);
	}

}
