package pekan8_2511531011;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tugasAlproPekan8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtbil1;
	private JTextField txtbil2;
	private JTextField txthasil;
	
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
					tugasAlproPekan8 frame = new tugasAlproPekan8();
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
	public tugasAlproPekan8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbjudul = new JLabel("OPERATOR ASSIGNMENT");
		lbjudul.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lbjudul.setBounds(86, 11, 169, 25);
		contentPane.add(lbjudul);
		
		JLabel bil1 = new JLabel("Bilangan 1");
		bil1.setFont(new Font("Serif", Font.PLAIN, 13));
		bil1.setBounds(21, 47, 77, 25);
		contentPane.add(bil1);
		
		JLabel bil2 = new JLabel("Bilangan 2");
		bil2.setFont(new Font("Serif", Font.PLAIN, 13));
		bil2.setBounds(21, 83, 77, 25);
		contentPane.add(bil2);
		
		JLabel operator = new JLabel("Operator");
		operator.setFont(new Font("Serif", Font.PLAIN, 13));
		operator.setBounds(21, 133, 77, 25);
		contentPane.add(operator);
		
		JLabel hasil = new JLabel("Hasil");
		hasil.setFont(new Font("Serif", Font.PLAIN, 13));
		hasil.setBounds(21, 169, 77, 25);
		contentPane.add(hasil);
		
		txtbil1 = new JTextField();
		txtbil1.setBounds(96, 50, 67, 20);
		contentPane.add(txtbil1);
		txtbil1.setColumns(10);
		
		txtbil2 = new JTextField();
		txtbil2.setColumns(10);
		txtbil2.setBounds(96, 86, 67, 20);
		contentPane.add(txtbil2);
		
		txthasil = new JTextField();
		txthasil.setEditable(false);
		txthasil.setColumns(10);
		txthasil.setBounds(96, 172, 67, 20);
		contentPane.add(txthasil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		comboBox.setBounds(96, 135, 67, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int a;
				if (txtbil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan input bilangan 1");
				} else if (txtbil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan input bilangan 2");
				} else if (txtbil2.getText().trim().startsWith("0")) {
					pesanPeringatan ("Bilangan 2 tidak boleh 0");
				} else {
					try {
						a = Integer.parseInt(txtbil1.getText());
						int b = Integer.parseInt(txtbil2.getText());
						String c = (String) comboBox.getSelectedItem();
						
						switch (c) {
						case "+=":
							a+=b;
							break;
						case "-=":
							a-=b;
							break;
						case "*=":
							a*=b;
							break;
						case "/=":
							a/=b;
							break;
						case "%=":
							a%=b;
							break;
						}
						txthasil.setText(String.valueOf(a));
						txtbil1.setText(String.valueOf(a));
						
					} catch (NumberFormatException ex) {
						pesanError ("Bilangan 1 dan Bilangan 2 harus angka");
					} 
				}
			}
		});
		btnNewButton.setBounds(182, 135, 89, 23);
		contentPane.add(btnNewButton);

	}
}
