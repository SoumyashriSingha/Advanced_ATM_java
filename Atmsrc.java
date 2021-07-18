package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class Atmsrc {

	private JFrame frame;
	private JTextField jlblDisplay;
	private JTextField jtxtEnter;
	private JTextField jtxtnumberofyears;
	private JTextField jtxtEnterloanamount;
	private JTextField jlblmonthlyPayment;
	private JTextField jlbltotalPayment;
	
	private JButton btnExit;
	private JButton btnReset;
	private JButton btnLoan;
	private JButton btnReceipt;
	
	private JButton jbtnLoan, jbtnBalance, jbtnWithdrawal, jbtnDeposit;
	private JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5, jbtn6, jbtn7, jbtn8, jbtn9, jbtn0;
	private JTextField jtxtValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atmsrc window = new Atmsrc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Atmsrc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(148, 11, 98, 113);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtnBalance = new JButton("");
		jbtnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pin = Integer.parseInt(jlblDisplay.getText());
				if(pin==1234) {
				     jlblDisplay.setText("55546\t");	}
				else if(pin==2345) {
					jlblDisplay.setText("155546\t");	
				}
				else if(pin==3456) {
					jlblDisplay.setText("255546\t");	
				}
				else if(pin==4567) {
					jlblDisplay.setText("355546\t");	
				}
				else {
					jlblDisplay.setText("please enter correct pin\t");
				}
			}
		});
		jbtnBalance.setEnabled(false);
		jbtnBalance.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/arrow_left1.png")));
		jbtnBalance.setBounds(10, 11, 80, 46);
		panel.add(jbtnBalance);
		
		JButton jbtnWithdrawal = new JButton("");
		jbtnWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("Enter Amount\t");
				int pin = Integer.parseInt(jlblDisplay.getText());
				
			}
		});
		jbtnWithdrawal.setEnabled(false);
		jbtnWithdrawal.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/arrow_left1.png")));
		jbtnWithdrawal.setBounds(10, 68, 80, 46);
		panel.add(jbtnWithdrawal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(256, 11, 179, 113);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel jlblBalance = new JLabel("Balance");
		jlblBalance.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlblBalance.setBounds(10, 11, 58, 20);
		panel_1.add(jlblBalance);
		
		JLabel jlblLoan = new JLabel("Loan");
		jlblLoan.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlblLoan.setBounds(129, 11, 40, 20);
		panel_1.add(jlblLoan);
		
		JLabel jlblWithdrawal = new JLabel("Withdrawal");
		jlblWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlblWithdrawal.setBounds(10, 82, 83, 20);
		panel_1.add(jlblWithdrawal);
		
		JLabel jlblDeposit = new JLabel("Deposit");
		jlblDeposit.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlblDeposit.setBounds(111, 82, 58, 20);
		panel_1.add(jlblDeposit);
		
		jlblDisplay = new JTextField();
		jlblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		jlblDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblDisplay.setBounds(20, 42, 138, 29);
		panel_1.add(jlblDisplay);
		jlblDisplay.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(445, 11, 98, 113);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jbtnLoan = new JButton("");
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit.setEnabled(true);
				btnReset.setEnabled(true);
				btnLoan.setEnabled(true);
				btnReceipt.setEnabled(true);
			}
		});
		jbtnLoan.setEnabled(false);
		jbtnLoan.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/arrow_left.png")));
		jbtnLoan.setBounds(10, 11, 80, 46);
		panel_2.add(jbtnLoan);
		
		JButton jbtnDeposit = new JButton("");
		jbtnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("Enter Amount\t");
				int pin = Integer.parseInt(jlblDisplay.getText());
				
			}
		});
		jbtnDeposit.setEnabled(false);
		jbtnDeposit.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/arrow_left.png")));
		jbtnDeposit.setBounds(10, 68, 80, 46);
		panel_2.add(jbtnDeposit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(147, 135, 396, 280);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton jbtn1 = new JButton("");
		jbtn1.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad1.jpg")));
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "1";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn1.setBounds(10, 11, 80, 55);
		panel_3.add(jbtn1);
		
		JButton jbtn2 = new JButton("");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "2";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn2.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad2.jpg")));
		jbtn2.setBounds(100, 11, 80, 55);
		panel_3.add(jbtn2);
		
		JButton jbtn3 = new JButton("");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "3";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn3.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad3.jpg")));
		jbtn3.setBounds(190, 11, 80, 55);
		panel_3.add(jbtn3);
		
		JButton jbtnCancel = new JButton("");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnCancel.setBackground(new Color(255, 255, 255));
		jbtnCancel.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/CANCEL1.png")));
		jbtnCancel.setBounds(280, 11, 106, 46);
		panel_3.add(jbtnCancel);
		
		JButton jbtn4 = new JButton("");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "4";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn4.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad4.jpg")));
		jbtn4.setBounds(10, 79, 80, 57);
		panel_3.add(jbtn4);
		
		JButton jbtn5 = new JButton("");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "5";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn5.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad5.jpg")));
		jbtn5.setBounds(100, 79, 80, 57);
		panel_3.add(jbtn5);
		
		JButton jbtn6 = new JButton("");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "6";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn6.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad6.jpg")));
		jbtn6.setBounds(190, 79, 80, 55);
		panel_3.add(jbtn6);
		
		JButton jbtnClear = new JButton("");
		jbtnClear.setBackground(new Color(255, 255, 255));
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("");
			}
			
		});
		jbtnClear.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/clear.jpg")));
		jbtnClear.setBounds(280, 79, 106, 46);
		panel_3.add(jbtnClear);
		
		JButton jbtn7 = new JButton("");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "7";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn7.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad7.jpg")));
		jbtn7.setBounds(10, 147, 80, 53);
		panel_3.add(jbtn7);
		
		JButton jbtn8 = new JButton("");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "8";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn8.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad8.jpg")));
		jbtn8.setBounds(100, 147, 80, 53);
		panel_3.add(jbtn8);
		
		JButton jbtn9 = new JButton("");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "9";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn9.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad9.jpg")));
		jbtn9.setBounds(190, 147, 80, 55);
		panel_3.add(jbtn9);
		
		JButton jbtnEnter = new JButton("");
		jbtnEnter.setBackground(new Color(255, 255, 255));
		jbtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pin1 = Integer.parseInt(jlblDisplay.getText());
				int pin2 = Integer.parseInt(jlblDisplay.getText());
				int pin3 = Integer.parseInt(jlblDisplay.getText());
				int pin4 = Integer.parseInt(jlblDisplay.getText());
				
				if(pin1 == 1234) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblLoan.setVisible(true);
					jlblBalance.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
				}
				else if(pin2 == 2345) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblLoan.setVisible(true);
					jlblBalance.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
				}
				else if(pin3 == 3456) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblLoan.setVisible(true);
					jlblBalance.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
				}
				else if(pin4 == 4567) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblLoan.setVisible(true);
					jlblBalance.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
				}

				else
				{
					
					jlblDisplay.setText("Invalid pin");
				}
			}
		});
		jbtnEnter.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/enter.jpg")));
		jbtnEnter.setBounds(280, 147, 106, 46);
		panel_3.add(jbtnEnter);
		
		JButton jbtnEmpty = new JButton("");
		jbtnEmpty.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad_empty.jpg")));
		jbtnEmpty.setBounds(10, 211, 80, 55);
		panel_3.add(jbtnEmpty);
		
		JButton jbtn0 = new JButton("");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jlblDisplay.getText() + "0";
				jlblDisplay.setText(EnterNumber);
			}
		});
		jbtn0.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad0.jpg")));
		jbtn0.setBounds(100, 211, 80, 55);
		panel_3.add(jbtn0);
		
		JButton jbtnWd = new JButton("DONE");
		jbtnWd.setBackground(new Color(245, 222, 179));
		jbtnWd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					jlblDisplay.setText("Enter pin again");
					
					
			}
		});
		jbtnWd.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnWd.setBounds(190, 211, 80, 55);
		panel_3.add(jbtnWd);
		
		JButton jbtnEmpty2 = new JButton("");
		jbtnEmpty2.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/keypad_empty.jpg")));
		jbtnEmpty2.setBounds(280, 211, 106, 46);
		panel_3.add(jbtnEmpty2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(602, 11, 673, 390);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Interest Rate");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(24, 22, 145, 33);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("No. of Years");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(24, 81, 145, 33);
		panel_4.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Monthly Payment");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(24, 184, 165, 33);
		panel_4.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total payment");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(24, 228, 145, 33);
		panel_4.add(lblNewLabel_1_3);
		
		jtxtEnter = new JTextField();
		jtxtEnter.setBounds(208, 27, 86, 29);
		panel_4.add(jtxtEnter);
		jtxtEnter.setColumns(10);
		
		jtxtnumberofyears = new JTextField();
		jtxtnumberofyears.setColumns(10);
		jtxtnumberofyears.setBounds(208, 81, 86, 29);
		panel_4.add(jtxtnumberofyears);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Amt. of Loan");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(24, 131, 145, 33);
		panel_4.add(lblNewLabel_1_1_1);
		
		jtxtEnterloanamount = new JTextField();
		jtxtEnterloanamount.setColumns(10);
		jtxtEnterloanamount.setBounds(208, 136, 86, 29);
		panel_4.add(jtxtEnterloanamount);
		
		jlblmonthlyPayment = new JTextField();
		jlblmonthlyPayment.setColumns(10);
		jlblmonthlyPayment.setBounds(208, 189, 86, 29);
		panel_4.add(jlblmonthlyPayment);
		
		jlbltotalPayment = new JTextField();
		jlbltotalPayment.setColumns(10);
		jlbltotalPayment.setBounds(208, 233, 86, 29);
		panel_4.add(jlbltotalPayment);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(317, 29, 346, 231);
		panel_4.add(jtxtReceipt);
		
		JButton btnLoan = new JButton("Loan");
		btnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double annualInterestRate = Double.parseDouble(jtxtEnter.getText());
				double monthlyInterestRate = annualInterestRate/1200;
				int numberofYears = Integer.parseInt(jtxtnumberofyears.getText());
				double loanAmount = Double.parseDouble(jtxtEnterloanamount.getText());
				//-------------------------------------------------------------------
				double monthlyPayment = loanAmount * monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate
						, numberofYears*12));
				String imonthlyPayment;
				imonthlyPayment = Double.toString(monthlyPayment);
				imonthlyPayment = String.format("Rs%.2f", monthlyPayment);
				jlblmonthlyPayment.setText(imonthlyPayment);
				//------------------------------------------------------------------
				double totalPayment = monthlyPayment * numberofYears * 12;
				String itotalPayment;
				itotalPayment = String.format("Rs%.2f", totalPayment);
				jlbltotalPayment.setText(itotalPayment);
			}
		});
		btnLoan.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLoan.setBounds(24, 333, 106, 46);
		panel_4.add(btnLoan);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String annualInterestRate = String.format(jtxtEnter.getText());
				String numberofYears = String.format(jtxtnumberofyears.getText());
				String loanAmount = String.format(jtxtEnterloanamount.getText());
				
				String monthlyPayment = String.format(jlblmonthlyPayment.getText());
				String totalPayment = String.format(jlbltotalPayment.getText());
				
				int refs= 1325 + (int)(Math.random()*4238);
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd:MMM:yyyy");
				tDate.format(timer.getTime());
				
				jtxtReceipt.append("\tLoan Management Systems\n"+
				"Reference:\t\t\t"+refs+
				"\n==========================================\t"+
				"\nInterest Rate:\t\t\t"+annualInterestRate+
				"\nRepayment years:\t\t\t"+numberofYears+
				"\nAmount of Loan:\t\t\t"+"Rs"+loanAmount+
				"\nMonthly Payment:\t\t\t"+monthlyPayment+
				"\nTotal Payment:\t\t\t"+totalPayment+
				
				"\n==========================================\t"+
				"\nDate: "+tDate.format(timer.getTime())+
				"\t\tTime: "+tTime.format(timer.getTime())+
				"\n\n\t\tThank You\n");
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReceipt.setBounds(168, 333, 106, 46);
		panel_4.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtEnter.setText(null);
				jtxtnumberofyears.setText(null);
				jtxtEnterloanamount.setText(null);
				jlblmonthlyPayment.setText(null);
				jlbltotalPayment.setText(null);
				jtxtReceipt.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(312, 333, 106, 46);
		panel_4.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "ATM systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(466, 333, 106, 46);
		panel_4.add(btnExit);
		
		JButton btnTick = new JButton("");
		btnTick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pin = Integer.parseInt(jlblDisplay.getText());
				if(pin==1234) {
					double val = Double.parseDouble(jtxtValue.getText());
					double value=55546+val;
					String s;
					s=Double.toString(value);
					jtxtReceipt.append("\n Balance ="+ s+"\n=======Transaction successful....========\n"
							+ "=====Thank You!!!======\n======= do visit again======\n");}
				else if(pin==2345) {
					double val = Double.parseDouble(jtxtValue.getText());
					double value=155546+val;
					String s;
					s=Double.toString(value);
					jtxtReceipt.append("\n Balance ="+ s+"\n=======Transaction successful....========\n"
							+ "=====Thank You!!!======\n======= do visit again======\n");
				}
				else if(pin==3456) {
					double val = Double.parseDouble(jtxtValue.getText());
					double value=255546+val;
					String s;
					s=Double.toString(value);
					jtxtReceipt.append("\n Balance ="+ s+"\n=======Transaction successful....========\n"
							+ "=====Thank You!!!======\n======= do visit again======\n");
				}
				else if(pin==4567) {
					double val = Double.parseDouble(jtxtValue.getText());
					double value=355546+val;
					String s;
					s=Double.toString(value);
					jtxtReceipt.append("\n Balance ="+ s+"\n=======Transaction successful....========\n"
							+ "=====Thank You!!!======\n======= do visit again======\n");
				}
				else {
					jlblDisplay.setText("");
				}
				//double val = Double.parseDouble(jtxtValue.getText());
				//double value=55546+val;
				//String s;
				//s=Double.toString(value);
				
				//jtxtReceipt.append("\n Balance ="+ s+"\n=======Transaction successful....========\n"
						//+ "=====Thank You!!!======\n======= do visit again======\n");
			}
		});
		btnTick.setIcon(new ImageIcon(Atmsrc.class.getResource("/ATM/tick.jpg")));
		btnTick.setBounds(606, 333, 57, 46);
		panel_4.add(btnTick);
		
		JLabel lblNewLabel = new JLabel("Value");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(24, 272, 86, 23);
		panel_4.add(lblNewLabel);
		
		jtxtValue = new JTextField();
		jtxtValue.setColumns(10);
		jtxtValue.setBounds(208, 273, 86, 29);
		panel_4.add(jtxtValue);
	}
}
