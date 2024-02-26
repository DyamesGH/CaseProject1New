package CaseProject1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrameAddMaterial extends JFrame {

	
	private JPanel contentPane;
	private JTextField txtMaterial;
	private FrameJobCreation frmJobCreation;
	private JTextField txtCost;
	private JSpinner spinner;

	
	public FrameAddMaterial() {
		setTitle("Add Material");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 285, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaterial = new JLabel("Material:");
		lblMaterial.setBounds(22, 46, 83, 14);
		contentPane.add(lblMaterial);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(22, 113, 83, 14);
		contentPane.add(lblQuantity);
		
		txtMaterial = new JTextField();
		txtMaterial.setBounds(137, 43, 122, 20);
		contentPane.add(txtMaterial);
		txtMaterial.setColumns(10);
		
		spinner = new JSpinner();
		spinner.setBounds(203, 110, 56, 20);
		contentPane.add(spinner);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setBounds(22, 81, 73, 14);
		contentPane.add(lblCost);
		
		txtCost = new JTextField();
		txtCost.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
				
			}
		});
		txtCost.setColumns(10);
		txtCost.setBounds(137, 74, 122, 20);
		contentPane.add(txtCost);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] rowData = new Object[4];
				rowData[0] = txtMaterial.getText();
				rowData[1] = txtCost.getText();
				rowData[2] = spinner.getValue();
				Double totalCost = Double.parseDouble(txtCost.getText()) * ((Integer) spinner.getValue()).intValue();
				rowData[3] = totalCost;
				FrameJobCreation.addMaterial(rowData);
				clearControls();
				dispose();
				
			}
		});
		btnConfirm.setBounds(22, 162, 89, 23);
		contentPane.add(btnConfirm);
		
		JLabel lblTitle = new JLabel("Add Material");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(91, 11, 89, 14);
		contentPane.add(lblTitle);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearControls();
				dispose();
			}
		});
		btnCancel.setBounds(170, 162, 89, 23);
		contentPane.add(btnCancel);	
	}
	
	public void clearControls() {
		txtMaterial.setText(null);
		txtCost.setText(null);
		spinner.setValue(0);
	}
}
