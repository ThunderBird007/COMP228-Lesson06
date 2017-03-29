import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalityType;
import javax.swing.JLabel;

public class MyDialog extends JDialog {

	private final JPanel _contentPanel = new JPanel();

	public MyDialog() {
		
		_initialize();
	}

	private void _initialize() {
		setTitle("My Dialog");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setBounds(100, 100, 450, 300);
		
		getContentPane().setLayout(new BorderLayout());
		this._contentPanel.setLayout(new FlowLayout());
		this._contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this._contentPanel, BorderLayout.CENTER);
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setToolTipText("Error");
			_contentPanel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
