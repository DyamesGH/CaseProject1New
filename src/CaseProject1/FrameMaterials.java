package CaseProject1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class FrameMaterials extends JFrame {

	
	private JPanel contentPane;
	private JTable table;

	public FrameMaterials() {
		setAlwaysOnTop(true);
		setTitle("Materials");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 384);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaterials = new JLabel("Materials");
		lblMaterials.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaterials.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterials.setBounds(158, 11, 121, 14);
		contentPane.add(lblMaterials);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 47, 314, 253);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Material", "Quantity"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		scrollPane.setViewportView(table);
		
		JButton btnOrder = new JButton("Order Materials");
		btnOrder.setBounds(158, 311, 133, 23);
		contentPane.add(btnOrder);
	}

}