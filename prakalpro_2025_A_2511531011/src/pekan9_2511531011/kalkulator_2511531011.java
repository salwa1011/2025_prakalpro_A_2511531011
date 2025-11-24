package pekan9_2511531011;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class kalkulator_2511531011 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	double num1=0,num2=0,result=0;
	char operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator_2511531011 frame = new kalkulator_2511531011();
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
	public kalkulator_2511531011() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btndel = new JButton("<-");
		btndel.setFont(new Font("Snap ITC", Font.BOLD, 11));
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string = textField.getText();
				textField.setText("");
				for (int i=0; i<string.length()-1;i++) {
					textField.setText(textField.getText()+string.charAt(i));
				}
			}
		});
		btndel.setBounds(10, 88, 55, 45);
		contentPane.add(btndel);
		
		JButton btnclear = new JButton("C");
		btnclear.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnclear.setBounds(68, 88, 55, 45);
		contentPane.add(btnclear);
		
		JButton btnKoma = new JButton(".");
		btnKoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat("."));
			}
		});
		
		btnKoma.setBounds(68, 275, 55, 45);
		contentPane.add(btnKoma);
		
		JButton btnNumber00 = new JButton("00");
		btnNumber00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber00.getText());
			}
		});
		btnNumber00.setBounds(126, 88, 55, 45);
		contentPane.add(btnNumber00);

		JButton btnNumber0 = new JButton("0");
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber0.getText());
			}
		});
		btnNumber0.setBounds(10, 275, 55, 45);
		contentPane.add(btnNumber0);

		JButton btnNumber1 = new JButton("1");
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber1.getText());
			}
		});
		btnNumber1.setBounds(10, 135, 55, 45);
		contentPane.add(btnNumber1);
		
		JButton btnNumber2 = new JButton("2");
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber2.getText());
			}
		});
		btnNumber2.setBounds(68, 135, 55, 45);
		contentPane.add(btnNumber2);

		JButton btnNumber3 = new JButton("3");
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber3.getText());
			}
		});
		btnNumber3.setBounds(126, 135, 55, 45);
		contentPane.add(btnNumber3);
		
		JButton btnNumber4 = new JButton("4");
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber4.getText());
			}
		});
		btnNumber4.setBounds(10, 181, 55, 45);
		contentPane.add(btnNumber4);

		JButton btnNumber5 = new JButton("5");
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber5.getText());
			}
		});
		btnNumber5.setBounds(68, 181, 55, 45);
		contentPane.add(btnNumber5);
		
		JButton btnNumber6 = new JButton("6");
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber6.getText());
			}
		});
		btnNumber6.setBounds(126, 181, 55, 45);
		contentPane.add(btnNumber6);
		
		
		JButton btnNumber7 = new JButton("7");
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber7.getText());
			}
		});
		btnNumber7.setBounds(10, 228, 55, 45);
		contentPane.add(btnNumber7);
		
		JButton btnNumber8 = new JButton("8");
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber8.getText());
			}
		});
		btnNumber8.setBounds(68, 228, 55, 45);
		contentPane.add(btnNumber8);
		
		JButton btnNumber9 = new JButton("9");
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btnNumber9.getText());
			}
		});
		btnNumber9.setBounds(126, 228, 55, 45);
		contentPane.add(btnNumber9);
		
		
		JButton btnPlus_2511531011 = new JButton("+");
		btnPlus_2511531011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = '+';
				textField.setText("");
			}
		});
		btnPlus_2511531011.setBounds(184, 88, 55, 45);
		contentPane.add(btnPlus_2511531011);
		
		JButton btnMinus_2511531011 = new JButton("-");
		btnMinus_2511531011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = '-';
				textField.setText("");
			}
		});
		btnMinus_2511531011.setBounds(184, 135, 55, 45);
		contentPane.add(btnMinus_2511531011);
		
		JButton btnKali_2511531011 = new JButton("*");
		btnKali_2511531011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = '*';
				textField.setText("");
			}
		});
		btnKali_2511531011.setBounds(184, 181, 55, 45);
		contentPane.add(btnKali_2511531011);
		
		JButton btnBagi_2511531011 = new JButton("/");
		btnBagi_2511531011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = '/';
				textField.setText("");
			}
		});
		btnBagi_2511531011.setBounds(184, 228, 55, 45);
		contentPane.add(btnBagi_2511531011);
		
		JButton btnMod_2511531011 = new JButton("%");
		btnMod_2511531011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = '%';
				textField.setText("");
			}
		});
		btnMod_2511531011.setBounds(184, 275, 55, 45);
		contentPane.add(btnMod_2511531011);
		
		textField = new JTextField();
		textField.setBounds(10, 27, 229, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSD = new JButton("=");
		btnSD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				
				switch (operator) {
				case'+':
					result=num1+num2;
					break;
					
				case'-':
					result=num1-num2;
					break;
					
				case'*':
					result=num1*num2;
					break;
					
				case'/':
					result=num1/num2;
					break;
					
				case'%':
					result=num1%num2;
					break;
				}
				textField.setText(String.valueOf(result));
				num1=result;
			}
		});
		btnSD.setBounds(126, 275, 55, 45);
		contentPane.add(btnSD);
		
		

	}
}
