package CaseProject1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class FrameJobCreation extends JFrame {


	private JPanel contentPane;
	private JTextField txtJobNumber;
	private JTextField txtJobDescription;
	private JTextField txtEstimatedCompletion;
	private JTextField txtCustomerName;
	private static JTable tblMaterials;
	private String[] columns = {"Material", "Quantity", "Cost", "Total Cost"};
	private DefaultTableModel modelMaterials = new DefaultTableModel();
	private FrameAddMaterial frmAddMaterial;
	private Job job;
	
	public FrameJobCreation(Job job) {
		
		this.job = job;	
		setAlwaysOnTop(true);
		setTitle("Job Creation");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 458, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Job Information");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(154, 11, 142, 22);
		contentPane.add(lblTitle);
		
		JLabel lblJobNumber = new JLabel("Job Number:");
		lblJobNumber.setBounds(24, 68, 80, 14);
		contentPane.add(lblJobNumber);
		
		JLabel lblJobDescription = new JLabel("Job Description:");
		lblJobDescription.setBounds(22, 108, 94, 14);
		contentPane.add(lblJobDescription);
		
		JLabel lblEstimatedCompletion = new JLabel("Estimated Job's Time of Completion:");
		lblEstimatedCompletion.setBounds(24, 186, 218, 14);
		contentPane.add(lblEstimatedCompletion);
		
		JLabel lblJobStartDate = new JLabel("Job Start Date:");
		lblJobStartDate.setBounds(24, 220, 106, 14);
		contentPane.add(lblJobStartDate);
		
		JLabel lblCustomerName = new JLabel("Customer Name:");
		lblCustomerName.setBounds(24, 149, 106, 14);
		contentPane.add(lblCustomerName);
		
		txtJobNumber = new JTextField();
		txtJobNumber.setBounds(242, 65, 171, 20);
		contentPane.add(txtJobNumber);
		txtJobNumber.setColumns(10);
		
		txtJobDescription = new JTextField();
		txtJobDescription.setBounds(242, 105, 171, 20);
		contentPane.add(txtJobDescription);
		txtJobDescription.setColumns(10);
		
		txtEstimatedCompletion = new JTextField();
		txtEstimatedCompletion.setBounds(242, 183, 171, 20);
		contentPane.add(txtEstimatedCompletion);
		txtEstimatedCompletion.setColumns(10);
		
		txtCustomerName = new JTextField();
		txtCustomerName.setBounds(242, 146, 171, 20);
		contentPane.add(txtCustomerName);
		txtCustomerName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Materials");
		lblNewLabel.setBounds(47, 367, 65, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Material");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddMaterial = new FrameAddMaterial(job);
				frmAddMaterial.setVisible(true);
			}
		});
		btnNewButton.setBounds(270, 363, 121, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(47, 392, 344, 250);
		contentPane.add(scrollPane);
		
		tblMaterials = new JTable(modelMaterials);
		tblMaterials.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelMaterials.setColumnIdentifiers(columns);
		scrollPane.setViewportView(tblMaterials);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(51, 653, 121, 23);
		contentPane.add(btnConfirm);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(254, 653, 121, 23);
		contentPane.add(btnCancel);
	}
	
	public static void addMaterial(Object[] rowData) {
		DefaultTableModel model = (DefaultTableModel) tblMaterials.getModel();
		model.addRow(rowData);
	}
}