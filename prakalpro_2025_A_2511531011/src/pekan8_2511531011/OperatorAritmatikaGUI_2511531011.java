package pekan8_2511531011;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OperatorAritmatikaGUI_2511531011 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531011 frame = new OperatorAritmatikaGUI_2511531011();
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
	public OperatorAritmatikaGUI_2511531011() {
		setBackground(new Color(255, 255, 255));
		setTitle("OPERATOR ARITMATIKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(157, 204, 184));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(70, 11, 170, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblBilangan = new JLabel("Bilangan 1");
		lblBilangan.setBounds(10, 36, 81, 17);
		lblBilangan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblBilangan);
		
		JLabel lblBilangan_4 = new JLabel("Bilangan 2");
		lblBilangan_4.setBounds(10, 64, 81, 17);
		lblBilangan_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblBilangan_4);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(10, 114, 81, 17);
		lblOperator.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblOperator);
		
		JLabel lblHasil = new JLabel("Hasil");
		lblHasil.setBounds(10, 180, 81, 17);
		lblHasil.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblHasil);
		
		txtBil1 = new JTextField();
		txtBil1.setBackground(new Color(255, 255, 255));
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(80, 35, 67, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(80, 63, 67, 18);
		contentPane.add(txtBil2);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(80, 109, 67, 22);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setBackground(new Color(255, 255, 255));
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setBounds(80, 177, 67, 20);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Input Bilangan 1");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Input Bilangan 2");
				} else if (txtBil2.getText().trim().startsWith("0")) {
					pesanPeringatan ("Bilangan 2 tidak boleh 0");
				}else {
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex();
						if (c==0) {
							hasil = a+b;
						}
						if (c==1) {
							hasil = a-b;
						}
						if (c==2) {
							hasil = a*b;
						}
						if (c==3) {
							hasil = a/b;
						}
						if (c==4) {
							hasil = a%b;
						}
						txtHasil.setText(String.valueOf(hasil));
						
					} catch (NumberFormatException ex) {
						pesanError ("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
				
				
			}
		});
		btnNewButton.setBounds(163, 108, 89, 23);
		contentPane.add(btnNewButton);

	}
}
