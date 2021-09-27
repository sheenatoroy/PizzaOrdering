import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Main extends JFrame {

	public JPanel contentPane;
	public final ButtonGroup flavorButtonGroup = new ButtonGroup();
	public final ButtonGroup sizeButtonGroup = new ButtonGroup();
	public JLabel lblSmallPrice;
	public JLabel lblMediumPrice;
	public JLabel lblLargePrice;
	public JRadioButton rdbtnHamAndCheese;
	public JRadioButton rdbtnPepperoni;
	public JRadioButton rdbtnMedium;
	public JRadioButton rdbtnSmall;
	public JRadioButton rdbtnLarge;
	public JButton btnOrder;
	public JButton btnCancel;
	public JRadioButton rdbtnHawaiian;
	public JPanel panel_1;
	public JLabel lblNewLabel_1;
	public JCheckBox chckbxCheese;
	public JCheckBox chckbxGreenPepper;
	public JCheckBox chckbxRedPepper;
	public JCheckBox chckbxOnion;
	public JLabel lblPayment;
	public JTextField txtPayment;
	public JLabel lblPayment_1;
	public JTextField txtBalance;
	public JPanel panel_2;
	public JLabel lblQuantity;
	public JTextField txtQuantity;
	public JTextArea txtOrderSummary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Pizza Ordering System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		txtOrderSummary = new JTextArea();
		txtOrderSummary.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtOrderSummary.setEditable(false);
		txtOrderSummary.setBounds(270, 55, 369, 330);
		contentPane.add(txtOrderSummary);
		
		JLabel lblNewLabel = new JLabel("SELECT FLAVOR:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(20, 16, 109, 25);
		contentPane.add(lblNewLabel);
		
		rdbtnHawaiian = new JRadioButton("HAWAIIAN");
		rdbtnHawaiian.setSelected(true);
		rdbtnHawaiian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(rdbtnHawaiian.isSelected() == true) {
					
					lblSmallPrice.setText("90.00");
					lblMediumPrice.setText("100.00");
					lblLargePrice.setText("150.00");
			
				}
			}
		});
		flavorButtonGroup.add(rdbtnHawaiian);
		rdbtnHawaiian.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnHawaiian.setBounds(20, 51, 109, 23);
		contentPane.add(rdbtnHawaiian);
		
		rdbtnHamAndCheese = new JRadioButton("HAM AND CHEESE");
		rdbtnHamAndCheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnHamAndCheese.isSelected() == true) {
					
					lblSmallPrice.setText("100.00");
					lblMediumPrice.setText("150.00");
					lblLargePrice.setText("200.00");
				}
			}
		});
		flavorButtonGroup.add(rdbtnHamAndCheese);
		rdbtnHamAndCheese.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnHamAndCheese.setBounds(20, 77, 147, 23);
		contentPane.add(rdbtnHamAndCheese);
		
		rdbtnPepperoni = new JRadioButton("PEPPERONI");
		rdbtnPepperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnPepperoni.isSelected() == true) {
					
					lblSmallPrice.setText("150.00");
					lblMediumPrice.setText("200.00");
					lblLargePrice.setText("250.00");
				}
			}
		});
		flavorButtonGroup.add(rdbtnPepperoni);
		rdbtnPepperoni.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPepperoni.setBounds(20, 103, 109, 23);
		contentPane.add(rdbtnPepperoni);
		
		JLabel lblSelectSize = new JLabel("SELECT SIZE:");
		lblSelectSize.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSelectSize.setBounds(20, 162, 109, 25);
		contentPane.add(lblSelectSize);
		
		rdbtnSmall = new JRadioButton("SMALL");
		rdbtnSmall.setSelected(true);
		sizeButtonGroup.add(rdbtnSmall);
		rdbtnSmall.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnSmall.setBounds(20, 197, 109, 23);
		contentPane.add(rdbtnSmall);
		
		rdbtnMedium = new JRadioButton("MEDIUM");
		sizeButtonGroup.add(rdbtnMedium);
		rdbtnMedium.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnMedium.setBounds(20, 223, 147, 23);
		contentPane.add(rdbtnMedium);
		
		rdbtnLarge = new JRadioButton("LARGE");
		sizeButtonGroup.add(rdbtnLarge);
		rdbtnLarge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnLarge.setBounds(20, 249, 109, 23);
		contentPane.add(rdbtnLarge);
		
		lblSmallPrice = new JLabel("0.0");
		lblSmallPrice.setBounds(188, 202, 72, 14);
		contentPane.add(lblSmallPrice);
		
		lblMediumPrice = new JLabel("0.0");
		lblMediumPrice.setBounds(188, 228, 72, 14);
		contentPane.add(lblMediumPrice);
		
		lblLargePrice = new JLabel("0.0");
		lblLargePrice.setBounds(188, 254, 72, 14);
		contentPane.add(lblLargePrice);
		
		btnOrder = new JButton("ORDER");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			Hawaiian();
				
			}
			});
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOrder.setBounds(32, 580, 97, 23);
		contentPane.add(btnOrder);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(149, 580, 97, 23);
		contentPane.add(btnCancel);
		
		JLabel lblOrderSummary = new JLabel("ORDER SUMMARY");
		lblOrderSummary.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOrderSummary.setBounds(394, 16, 133, 25);
		contentPane.add(lblOrderSummary);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(10, 16, 244, 124);
		contentPane.add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(10, 147, 244, 139);
		contentPane.add(panel_1);
		
		lblNewLabel_1 = new JLabel("SELECT ADD ONS:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(20, 304, 133, 25);
		contentPane.add(lblNewLabel_1);
		
		chckbxCheese = new JCheckBox("Extra Cheese");
		chckbxCheese.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxCheese.setBounds(20, 336, 122, 23);
		contentPane.add(chckbxCheese);
		
		chckbxGreenPepper = new JCheckBox("Green Pepper");
		chckbxGreenPepper.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxGreenPepper.setBounds(20, 362, 133, 23);
		contentPane.add(chckbxGreenPepper);
		
		chckbxRedPepper = new JCheckBox("Red Pepper");
		chckbxRedPepper.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxRedPepper.setBounds(20, 390, 97, 23);
		contentPane.add(chckbxRedPepper);
		
		chckbxOnion = new JCheckBox("Onion");
		chckbxOnion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxOnion.setBounds(20, 416, 97, 23);
		contentPane.add(chckbxOnion);
		
		lblPayment = new JLabel("PAYMENT:");
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPayment.setBounds(283, 400, 109, 25);
		contentPane.add(lblPayment);
		
		txtPayment = new JTextField();
		txtPayment.setColumns(10);
		txtPayment.setBounds(283, 437, 234, 34);
		contentPane.add(txtPayment);
		
		lblPayment_1 = new JLabel("BALANCE:");
		lblPayment_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPayment_1.setBounds(283, 476, 109, 25);
		contentPane.add(lblPayment_1);
		
		txtBalance = new JTextField();
		txtBalance.setColumns(10);
		txtBalance.setBounds(283, 513, 234, 34);
		contentPane.add(txtBalance);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.BLACK));
		panel_2.setBounds(10, 297, 244, 157);
		contentPane.add(panel_2);
		
		lblQuantity = new JLabel("QUANTITY:");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblQuantity.setBounds(20, 476, 109, 25);
		contentPane.add(lblQuantity);
		
		txtQuantity = new JTextField();
		txtQuantity.setText("1");
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(20, 513, 234, 34);
		contentPane.add(txtQuantity);
		
		JButton btnBillOut = new JButton("BILL OUT");
		btnBillOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBillOut.setBounds(319, 580, 147, 23);
		contentPane.add(btnBillOut);
	}
	
public void Hawaiian() {
		
		double hawaiianSmall = 90.00;
		double hawaiianMedium = 100.00;
		double hawaiianLarge = 150.00;
		double extraCheese = 5.00;
		double extraGreenPepper = 10.00;
		double extraRedPepper = 15.00;
		double extraOnion = 20.00;
		double quantity = Double.parseDouble(txtQuantity.getText());
	

		//Hawaiian Small
	
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected()) {
		
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity));
		}
	
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected()) {
		
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblMediumPrice.getText() + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianMedium * quantity));
		}
		
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected()) {
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblLargePrice.getText() + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianLarge * quantity));
		}
	
	
		//Cheese only
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxCheese.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese));
		}	
		
	
		//Green Pepper only
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxGreenPepper.isSelected()) {
					
						
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper));
		}	
	
		//Red Pepper only
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxRedPepper.isSelected()) {
							
								
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraRedPepper));
		}	
	
		//Onion only
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxOnion.isSelected()) {
									
										
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxOnion.getText() + " ---- " + extraOnion + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraOnion));
		}	
		
		//Cheese and Green Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxCheese.isSelected() && chckbxGreenPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraGreenPepper));
		}	
			
		//Cheese and Red Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxCheese.isSelected() && chckbxRedPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraRedPepper));
		}
		
		//Cheese and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxCheese.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraOnion));
		}	
		
		//Green Pepper and Red Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxGreenPepper.isSelected() && chckbxRedPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +  "\n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper + extraRedPepper));
		}	
		
		//Green Pepper and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxGreenPepper.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper + extraOnion));
		}	
		
		//Red Pepper and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnSmall.isSelected() && chckbxRedPepper.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnSmall.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraRedPepper + extraOnion));
		}	
		
		//Medium
		//Cheese only
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxCheese.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese));
		}	
		
	
		//Green Pepper only
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxGreenPepper.isSelected()) {
					
						
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper));
		}	
	
		//Red Pepper only
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxRedPepper.isSelected()) {
							
								
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraRedPepper));
		}	
	
		//Onion only
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxOnion.isSelected()) {
									
										
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxOnion.getText() + " ---- " + extraOnion + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraOnion));
		}	
		
		//Cheese and Green Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxCheese.isSelected() && chckbxGreenPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraGreenPepper));
		}	
			
		//Cheese and Red Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxCheese.isSelected() && chckbxRedPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraRedPepper));
		}
		
		//Cheese and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxCheese.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraOnion));
		}	
		
		//Green Pepper and Red Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxGreenPepper.isSelected() && chckbxRedPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +  "\n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper + extraRedPepper));
		}	
		
		//Green Pepper and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxGreenPepper.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper + extraOnion));
		}	
		
		//Red Pepper and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnMedium.isSelected() && chckbxRedPepper.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnMedium.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraRedPepper + extraOnion));
		}	
		
		//Large
		//Cheese only
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxCheese.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese));
		}	
		
	
		//Green Pepper only
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxGreenPepper.isSelected()) {
					
						
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper));
		}	
	
		//Red Pepper only
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxRedPepper.isSelected()) {
							
								
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraRedPepper));
		}	
	
		//Onion only
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxOnion.isSelected()) {
									
										
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxOnion.getText() + " ---- " + extraOnion + 
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraOnion));
		}	
		
		//Cheese and Green Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxCheese.isSelected() && chckbxGreenPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraGreenPepper));
		}	
			
		//Cheese and Red Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxCheese.isSelected() && chckbxRedPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraRedPepper));
		}
		
		//Cheese and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxCheese.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxCheese.getText() + " ---- " + extraCheese +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraCheese + extraOnion));
		}	
		
		//Green Pepper and Red Pepper
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxGreenPepper.isSelected() && chckbxRedPepper.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +  "\n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper + extraRedPepper));
		}	
		
		//Green Pepper and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxGreenPepper.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxGreenPepper.getText() + " ---- " + extraGreenPepper +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraGreenPepper + extraOnion));
		}	
		
		//Red Pepper and Onion
		if(rdbtnHawaiian.isSelected() && rdbtnLarge.isSelected() && chckbxRedPepper.isSelected() && chckbxOnion.isSelected()) {
			
			
			txtOrderSummary.setText("PIZZA FLAVOR: " + rdbtnHawaiian.getText() + 
				"\n\n" + "PIZZA SIZE: " + rdbtnLarge.getText() + " ---- " + lblSmallPrice.getText() + 
				"\n\nADD ONS: \n" + chckbxRedPepper.getText() + " ---- " + extraRedPepper +  "\n" + chckbxOnion.getText() + " ---- " + extraOnion +
				"\n\nQUANTITY: " + txtQuantity.getText() + "\n\nTOTAL PRICE: " + (hawaiianSmall * quantity + extraRedPepper + extraOnion));
		}	
		
}
	
}
	
