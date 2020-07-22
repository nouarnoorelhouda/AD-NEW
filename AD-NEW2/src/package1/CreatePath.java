package package1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreatePath extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdam;
	private JTextField txtFw;
	private JTextField txtSwingand;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JTextField txtFw_1;
	private JTextField txtTm;
	private JTextField txtIds;
	private JButton btnAddVnf;
	private JTextField textField_6;
	private JTextField txtSwingxor;
	private JPanel panel_2;
	private JLabel lblNewLabel_2;
	private JTextField txtIps;
	private JTextField txtThc;
	private JTextField txtVpn;
	private JButton btnAddVnf_1;
	private JTextField textField_11;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_3;
	private JTextField txtIdamSwingxorSwingand;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtIdamSwingxorFw;
	private JPanel panel_3;
	private JPanel panel_4;
	private JTextField txtSwingandIdstmIps;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_1;
	private JLabel lblNewLabel_8;
	private JPanel panel_5;
	private JTextField txtIpsSwingxorVpn;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField txtSwingorThcThm;
	private JLabel lblNewLabel_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePath frame = new CreatePath();
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
	public CreatePath() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy.PNG"));
		setTitle("AD-NEW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "1st Swing-XOR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(5, 15, 484, 153);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Swing-XOR");
		lblNewLabel.setBounds(192, 55, 100, 20);
		panel.add(lblNewLabel);
		
		txtIdam = new JTextField();
		txtIdam.setText("IDAM");
		txtIdam.setBounds(23, 22, 146, 26);
		panel.add(txtIdam);
		txtIdam.setColumns(10);
		
		txtFw = new JTextField();
		txtFw.setText("FW");
		txtFw.setBounds(315, 22, 146, 26);
		panel.add(txtFw);
		txtFw.setColumns(10);
		
		txtSwingand = new JTextField();
		txtSwingand.setText("Swing-AND");
		txtSwingand.setBounds(315, 75, 146, 26);
		panel.add(txtSwingand);
		txtSwingand.setColumns(10);
		
		JButton btnNewButton = new JButton(" Add VNF");
		btnNewButton.setBounds(378, 117, 100, 29);
		panel.add(btnNewButton);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(23, 75, 146, 26);
		panel.add(textField_6);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "2st Swing-AND", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(5, 183, 484, 153);
		contentPane.add(panel_1);
		
		lblNewLabel_1 = new JLabel("Swing-AND");
		lblNewLabel_1.setBounds(192, 55, 100, 20);
		panel_1.add(lblNewLabel_1);
		
		txtFw_1 = new JTextField();
		txtFw_1.setText("FW");
		txtFw_1.setColumns(10);
		txtFw_1.setBounds(23, 22, 146, 26);
		panel_1.add(txtFw_1);
		
		txtTm = new JTextField();
		txtTm.setText("TM, IPS");
		txtTm.setColumns(10);
		txtTm.setBounds(315, 22, 146, 26);
		panel_1.add(txtTm);
		
		txtIds = new JTextField();
		txtIds.setText("IDS,IPS");
		txtIds.setColumns(10);
		txtIds.setBounds(315, 75, 146, 26);
		panel_1.add(txtIds);
		
		btnAddVnf = new JButton("Add VNF");
		btnAddVnf.setBounds(378, 117, 100, 29);
		panel_1.add(btnAddVnf);
		
		txtSwingxor = new JTextField();
		txtSwingxor.setText("Swing-XOR");
		txtSwingxor.setColumns(10);
		txtSwingxor.setBounds(23, 75, 146, 26);
		panel_1.add(txtSwingxor);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "3st Swing-XOR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(5, 351, 484, 153);
		contentPane.add(panel_2);
		
		lblNewLabel_2 = new JLabel("Swing-XOR");
		lblNewLabel_2.setBounds(192, 55, 100, 20);
		panel_2.add(lblNewLabel_2);
		
		txtIps = new JTextField();
		txtIps.setText("IPS");
		txtIps.setColumns(10);
		txtIps.setBounds(23, 22, 146, 26);
		panel_2.add(txtIps);
		
		txtThc = new JTextField();
		txtThc.setText("ThC,ThM, VPN");
		txtThc.setColumns(10);
		txtThc.setBounds(315, 22, 146, 26);
		panel_2.add(txtThc);
		
		txtVpn = new JTextField();
		txtVpn.setText("VPN");
		txtVpn.setColumns(10);
		txtVpn.setBounds(315, 75, 146, 26);
		panel_2.add(txtVpn);
		
		btnAddVnf_1 = new JButton("Add VNF");
		btnAddVnf_1.setBounds(378, 117, 100, 29);
		panel_2.add(btnAddVnf_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(23, 75, 146, 26);
		panel_2.add(textField_11);
		
		btnNewButton_1 = new JButton("Finish");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 setVisible(false);
			}
		});
		btnNewButton_1.setBounds(857, 519, 115, 29);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Add path");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(374, 519, 115, 29);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_3 = new JLabel(">>");
		lblNewLabel_3.setBounds(494, 81, 69, 20);
		contentPane.add(lblNewLabel_3);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(568, 43, 404, 97);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		txtIdamSwingxorSwingand = new JTextField();
		txtIdamSwingxorSwingand.setBounds(117, 22, 281, 26);
		panel_3.add(txtIdamSwingxorSwingand);
		txtIdamSwingxorSwingand.setText("IDAM, Swing-XOR, Swing-AND");
		txtIdamSwingxorSwingand.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Active path");
		lblNewLabel_4.setBounds(6, 25, 96, 20);
		panel_3.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("passive path");
		lblNewLabel_5.setBounds(6, 67, 96, 20);
		panel_3.add(lblNewLabel_5);
		
		txtIdamSwingxorFw = new JTextField();
		txtIdamSwingxorFw.setBounds(117, 64, 281, 26);
		panel_3.add(txtIdamSwingxorFw);
		txtIdamSwingxorFw.setText("IDAM, Swing-XOR, FW, Swing-AND");
		txtIdamSwingxorFw.setColumns(10);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(568, 211, 404, 97);
		contentPane.add(panel_4);
		
		txtSwingandIdstmIps = new JTextField();
		txtSwingandIdstmIps.setText("Swing-AND, IDS:TM, IPS");
		txtSwingandIdstmIps.setColumns(10);
		txtSwingandIdstmIps.setBounds(117, 22, 281, 26);
		panel_4.add(txtSwingandIdstmIps);
		
		lblNewLabel_6 = new JLabel("Active path");
		lblNewLabel_6.setBounds(6, 25, 96, 20);
		panel_4.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("passive path");
		lblNewLabel_7.setBounds(6, 67, 96, 20);
		panel_4.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(117, 64, 281, 26);
		panel_4.add(textField_1);
		
		lblNewLabel_8 = new JLabel(">>");
		lblNewLabel_8.setBounds(494, 249, 69, 20);
		contentPane.add(lblNewLabel_8);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(568, 379, 404, 97);
		contentPane.add(panel_5);
		
		txtIpsSwingxorVpn = new JTextField();
		txtIpsSwingxorVpn.setText("IPS, Swing-XOR, VPN");
		txtIpsSwingxorVpn.setColumns(10);
		txtIpsSwingxorVpn.setBounds(117, 22, 281, 26);
		panel_5.add(txtIpsSwingxorVpn);
		
		lblNewLabel_9 = new JLabel("Active path");
		lblNewLabel_9.setBounds(6, 25, 96, 20);
		panel_5.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("passive path");
		lblNewLabel_10.setBounds(6, 67, 96, 20);
		panel_5.add(lblNewLabel_10);
		
		txtSwingorThcThm = new JTextField();
		txtSwingorThcThm.setText("Swing-OR, ThC, ThM, VPN");
		txtSwingorThcThm.setColumns(10);
		txtSwingorThcThm.setBounds(117, 64, 281, 26);
		panel_5.add(txtSwingorThcThm);
		
		lblNewLabel_11 = new JLabel(">>");
		lblNewLabel_11.setBounds(494, 417, 69, 20);
		contentPane.add(lblNewLabel_11);
	}

}
