//create path
package package1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JInternalFrame;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.event.MouseAdapter;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class AD_NEW_Maker extends JFrame implements MouseListener{

	private JPanel contentPane;
    Boolean drawpathenabled = false;

	private Component target;
	int xorclick = 1;
	  Graphics2D g2d;
	    Line2D line;
	    Rectangle bounds;
	    Point startPoint;
	    Point endPoint;
	    private Component pressComponent;
	    private Component releaseComponent;
		int i = 0;
		public class TablePoint {
		    Point Start;
		    Point End;
		    TablePoint(Point Start,Point End){  
		    	   this.Start=Start;  
		    	   this.End=End;  
		    	  }  
		}
	public List<TablePoint> table= new ArrayList<TablePoint>();
	Iterator<TablePoint> iter = table.iterator();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
  
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
					e.printStackTrace();
				}
				AD_NEW_Maker frame = new AD_NEW_Maker();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AD_NEW_Maker() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy.PNG"));
		setTitle("AD-NEW");
		ConnectTheDots dots = new ConnectTheDots();
        setGlassPane(dots);
        dots.setVisible(true);
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		contentPane.addMouseListener(this);
		JInternalFrame internalFrame = new JInternalFrame("Elements");
		internalFrame.setFrameIcon(new ImageIcon("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy - Copy.PNG"));
		internalFrame.setBounds(15, 9, 244, 600);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(null, "Operative VNFs", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2_1.setBounds(15, 16, 201, 387);
		internalFrame.getContentPane().add(panel_2_1);
		
		JButton IPS = new JButton("IPS");
		IPS.setBounds(43, 22, 115, 29);
		panel_2_1.add(IPS);
		
		JButton FW = new JButton("FW");
		FW.setBounds(43, 67, 115, 29);
		panel_2_1.add(FW);
		
		JButton IDS = new JButton("IDS");
		IDS.setBounds(43, 112, 115, 29);
		panel_2_1.add(IDS);
		
		JButton IDAM = new JButton("IDAM");
		IDAM.setBounds(43, 157, 115, 29);
		panel_2_1.add(IDAM);
		
		JButton TM = new JButton("TM");
		TM.setBounds(43, 206, 115, 29);
		panel_2_1.add(TM);
		
		JButton ThC = new JButton("ThC");
		ThC.setBounds(43, 251, 115, 29);
		panel_2_1.add(ThC);
		
		JButton ThM = new JButton("ThM");
		ThM.setBounds(43, 296, 115, 29);
		panel_2_1.add(ThM);
		
		JButton VPN = new JButton("VPN");
		VPN.setBounds(43, 341, 115, 29);
		panel_2_1.add(VPN);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Swing VNFs", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(15, 406, 202, 143);
		internalFrame.getContentPane().add(panel_3);
		
		JButton SwingAND = new JButton("Swing-AND");
		SwingAND.setBounds(45, 109, 115, 29);
		panel_3.add(SwingAND);
		
		JButton SwingOR = new JButton("Swing-OR");
		SwingOR.setBounds(45, 68, 115, 29);
		panel_3.add(SwingOR);
		
		JButton SwingXOR = new JButton("Swing-XOR");
		SwingXOR.setBounds(45, 27, 115, 29);
		panel_3.add(SwingXOR);
		
		JInternalFrame internalFrame_2 = new JInternalFrame("Properties");
		internalFrame_2.setFrameIcon(new ImageIcon("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy - Copy.PNG"));
		internalFrame_2.setBounds(605, 16, 281, 600);
		contentPane.add(internalFrame_2);
		internalFrame_2.getContentPane().setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(null, "Functional properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(15, 16, 234, 234);
		internalFrame_2.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("VNF type:");
		lblNewLabel_4.setBounds(6, 37, 88, 20);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Operations:");
		lblNewLabel_5.setBounds(6, 74, 107, 20);
		panel_1_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contents:");
		lblNewLabel_6.setBounds(6, 116, 107, 20);
		panel_1_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Techniques:");
		lblNewLabel_7.setBounds(6, 157, 107, 20);
		panel_1_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Standards");
		lblNewLabel_8.setBounds(6, 196, 107, 20);
		panel_1_1.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(100, 34, 128, 26);
		panel_1_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 71, 128, 26);
		panel_1_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 113, 128, 26);
		panel_1_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 154, 128, 26);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 193, 128, 26);
		panel_1_1.add(textField_4);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new TitledBorder(null, "Non-Functional properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1_1.setBounds(15, 265, 234, 202);
		internalFrame_2.getContentPane().add(panel_1_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("Price:");
		lblNewLabel_9.setBounds(6, 28, 69, 20);
		panel_1_1_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("CPU:");
		lblNewLabel_10.setBounds(6, 73, 69, 20);
		panel_1_1_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Memory:");
		lblNewLabel_11.setBounds(6, 118, 69, 20);
		panel_1_1_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Storage:");
		lblNewLabel_12.setBounds(6, 163, 69, 20);
		panel_1_1_1.add(lblNewLabel_12);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(100, 25, 128, 26);
		panel_1_1_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(100, 70, 128, 26);
		panel_1_1_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(100, 115, 128, 26);
		panel_1_1_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(100, 160, 128, 26);
		panel_1_1_1.add(textField_8);
		
		JButton search = new JButton("Search");
		search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VNFlist vnfl= new VNFlist();
				vnfl.setVisible(true);
				vnfl.ListvnfType(textField.getText());
			}
		});
		search.setBounds(109, 472, 139, 29);
		internalFrame_2.getContentPane().add(search);
		
		JButton btnNewButton = new JButton("Define Paths");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CreatePath path= new CreatePath();
				path.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(109, 514, 140, 29);
		internalFrame_2.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_13 = new JLabel("IDAM");
//		lblNewLabel_13.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				//textField.setText("IDAM");
//				
//				
//			}
//		});
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(386, 45, 69, 20);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_21 = new JLabel("Swing-XOR");
//		lblNewLabel_21.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//textField.setText("Swing-XOR");
//			}
//		});
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(379, 110, 83, 20);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("FW");
//		lblNewLabel_22.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//textField.setText("FW");
//			}
//		});
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setBounds(274, 175, 69, 20);
		contentPane.add(lblNewLabel_22);
		
		JButton btnNewButton_11 = new JButton("Finish");
		btnNewButton_11.setBounds(605, 620, 281, 29);
		contentPane.add(btnNewButton_11);
		
		JLabel lblNewLabel = new JLabel("Swing-AND");
//		lblNewLabel.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//textField.setText("Swing-AND");
//				
//			}
//		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(379, 240, 83, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IDS");
//		lblNewLabel_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//textField.setText("IDS");
//			}
//		});
//		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(274, 305, 69, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TM");
//		lblNewLabel_2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//textField.setText("TM");
//			}
//		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(493, 305, 69, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IPS");
//		lblNewLabel_3.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//textField.setText("IPS");
//			}
//		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(386, 370, 69, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_14 = new JLabel("Swing-XOR");
//		lblNewLabel_14.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField.setText("Swing-XOR");
//			}
//		});
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(379, 435, 83, 20);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("ThC");
//		lblNewLabel_15.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField.setText("ThC");
//			}
//		});
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(274, 500, 69, 20);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("ThM");
//		lblNewLabel_16.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField.setText("ThM");
//			}
//		});
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setBounds(274, 565, 69, 20);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("VPN");
//		lblNewLabel_17.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField.setText("VPN");
//			}
//		});
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(386, 630, 69, 20);
		contentPane.add(lblNewLabel_17);
		contentPane.repaint();
		
	
		internalFrame_2.setVisible(true);
		internalFrame.setVisible(true);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override

	public void mousePressed(MouseEvent e) {
		 pressComponent = contentPane.getComponentAt(new Point(e.getX(), e.getY()));
		
	}
	
	public void mouseDragged(MouseEvent e) {
		/*
		 * if (target != null) { target.setBounds(e.getX(), e.getY(), target.getWidth(),
		 * target.getHeight()); e.getComponent().repaint(); }
		 */
    }

	@Override
	public void mouseReleased(MouseEvent e) {
		 releaseComponent = contentPane.getComponentAt(new Point(e.getX(), e.getY()));
	        joinTheDots();
  
		
	}
	
	public class ConnectTheDots extends JPanel {

        private Point startPoint;
        private Point endPoint;

        public ConnectTheDots() {
            setOpaque(false);
        }

        public void drawLine(Point startPoint, Point endPoint) {
            this.startPoint = startPoint;
            this.endPoint = endPoint;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Point p1,p2;
            for (int j = 0; j < table.size(); j ++) {
            	
            	p1 = table.get(j).Start;
                p2 = table.get(j).End;
                if (p1 != null && p2 != null) {
                    g2d = (Graphics2D) g.create();
                    line = new Line2D.Double(p1, p2);
                    g2d.setColor(Color.BLACK);
                    g2d.draw(line);
                    g2d.dispose();
                
                    
               
			}     
 
            }i++;
            
        }

    }
    protected void joinTheDots() {

        bounds = pressComponent.getBounds();       
        startPoint = centerOf(bounds);
        bounds = releaseComponent.getBounds();
        endPoint = centerOf(bounds);
        TablePoint s1 = new TablePoint(startPoint, endPoint);
        table.add(s1);
        //System.out.println("Start table element "+ table.get(i).Start);
        //System.out.println("End table element "+ table.get(i).End);
        //System.out.println("table size "+ table.size());
        ((ConnectTheDots) getGlassPane()).drawLine(startPoint, endPoint);

    }

    protected Point centerOf(Rectangle bounds) {

        return new Point(
                        bounds.x + (bounds.width / 2),
                        bounds.y + (bounds.height / 2));

    }
}
