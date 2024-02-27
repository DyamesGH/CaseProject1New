package CaseProject1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class MainFrame extends JFrame {

	
	private JPanel contentPane;
	private FrameJobCreation frmJobCreation;
	private FrameMaterials frmMaterials;
	private JTable tblIncomingJobs;
	private JTable tblOngoingJobs;
	private String[] columns1 = {"Job Number", "Estimated Time", "Date of Start"};
	private String[] columns2 = {"Job Number", "Date of Start"};
	private DefaultTableModel modelIncomingJobs = new DefaultTableModel();
	private DefaultTableModel modelOngoingJobs = new DefaultTableModel();
	private ArrayList<Job> incomingJob = new ArrayList<Job>();
	private ArrayList<Job> ongoingJob = new ArrayList<Job>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setResizable(false);
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		JLabel lblTitle = new JLabel("Tool and Die Job Processing System");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(278, 11, 274, 23);
		contentPane.add(lblTitle);
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnJobHistory = new JButton("View Jobs History");
		btnJobHistory.setBounds(10, 13, 143, 23);
		contentPane.add(btnJobHistory);
		
		JLabel lblIncomingJob = new JLabel("Incoming Job Issues");
		lblIncomingJob.setHorizontalAlignment(SwingConstants.CENTER);
		lblIncomingJob.setBounds(169, 109, 121, 14);
		contentPane.add(lblIncomingJob);
		
		JLabel lblOngoingJobs = new JLabel("Ongoing Jobs");
		lblOngoingJobs.setHorizontalAlignment(SwingConstants.CENTER);
		lblOngoingJobs.setBounds(559, 109, 93, 14);
		contentPane.add(lblOngoingJobs);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(65, 130, 324, 266);
		contentPane.add(scrollPane1);
		
		tblIncomingJobs = new JTable(modelIncomingJobs);
		tblIncomingJobs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelIncomingJobs.setColumnIdentifiers(columns1);
		scrollPane1.setViewportView(tblIncomingJobs);
		
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(441, 130, 324, 266);
		contentPane.add(scrollPane2);
		
		tblOngoingJobs = new JTable(modelOngoingJobs);
		tblOngoingJobs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelOngoingJobs.setColumnIdentifiers(columns2);
		scrollPane2.setViewportView(tblOngoingJobs);
		
		
		JButton btnAddJob = new JButton("Add Job");
		btnAddJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				Job job = new Job();
				frmJobCreation = new FrameJobCreation(job);
				frmJobCreation.setVisible(true);			
			}
		});
		btnAddJob.setBounds(32, 416, 121, 23);
		contentPane.add(btnAddJob);
		
		JButton btnEditJob = new JButton("Edit Job");
		btnEditJob.setBounds(190, 416, 121, 23);
		contentPane.add(btnEditJob);
		
		JButton btnRemoveJob = new JButton("Remove Job");
		btnRemoveJob.setBounds(354, 416, 121, 23);
		contentPane.add(btnRemoveJob);
		
		JButton btnReschedJob = new JButton("Resched Job");
		btnReschedJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReschedJob.setBounds(508, 416, 128, 23);
		contentPane.add(btnReschedJob);
		
		JButton btnJobFinish = new JButton("Job Finish");
		btnJobFinish.setBounds(661, 416, 121, 23);
		contentPane.add(btnJobFinish);
		
		
	}
}