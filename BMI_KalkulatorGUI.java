import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JLayeredPane;
import javax.swing.DropMode;


public class BMI_KalkulatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField tfTezina;
	private JTextField tfVisina;
	private JTextField tfBMI;
	private JTextField tfKategorija;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI_KalkulatorGUI frame = new BMI_KalkulatorGUI();
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
	public BMI_KalkulatorGUI() {
		setResizable(false);
		setTitle("BMI Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Indeks telesne mase (engl. Body Mass Index, BMI) je metoda prora\u010Duna uhranjenosti. ");
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 11, 417, 51);
		contentPane.add(lblNewLabel);
		
		JButton btnIzracunajBmi = new JButton("Izracunaj BMI");
		btnIzracunajBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BMIKalkulator b = new BMIKalkulator();
				
				double visina = Double.parseDouble(tfVisina.getText());
				double tezina = Double.parseDouble(tfTezina.getText());
				//preuzimanje unetih podataka	
				double bmi = b.izracunajBMI(visina, tezina);
				String a = b.odredi(bmi);
				//
				
				
				
				
			tfBMI.setText( "" + bmi);
			tfKategorija.setText(a + " osoba");
				
				
			}
		});
		btnIzracunajBmi.setBackground(Color.blue);
		btnIzracunajBmi.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnIzracunajBmi.setBounds(300, 156, 113, 38);
		contentPane.add(btnIzracunajBmi);
		
		JLabel lblUnesiteTezinu = new JLabel("Unesite tezinu (30-200kg)");
		lblUnesiteTezinu.setBackground(Color.WHITE);
		lblUnesiteTezinu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUnesiteTezinu.setBounds(20, 73, 161, 28);
		contentPane.add(lblUnesiteTezinu);
		
		JLabel lblUnesiteVisinuu = new JLabel("Unesite visinu (1.2-2.4m)");
		lblUnesiteVisinuu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUnesiteVisinuu.setBounds(20, 112, 149, 28);
		contentPane.add(lblUnesiteVisinuu);
		
		tfTezina = new JTextField();
		tfTezina.setToolTipText("");
		tfTezina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfTezina.setBounds(217, 77, 86, 20);
		contentPane.add(tfTezina);
		tfTezina.setColumns(10);
		
		tfVisina = new JTextField();
		tfVisina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfVisina.setBounds(217, 116, 86, 20);
		contentPane.add(tfVisina);
		tfVisina.setColumns(10);
		
		JLabel lblVasBmi = new JLabel("Vas BMI:");
		lblVasBmi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVasBmi.setBounds(20, 249, 76, 20);
		contentPane.add(lblVasBmi);
		
		tfBMI = new JTextField();
		tfBMI.setToolTipText("hjghjfj");
		tfBMI.setEditable(false);
		tfBMI.setBounds(140, 250, 136, 19);
		contentPane.add(tfBMI);
		tfBMI.setColumns(12);
		
		JLabel lblNewLabel_1 = new JLabel("I pripadate grupi:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 280, 136, 28);
		contentPane.add(lblNewLabel_1);
		
		tfKategorija = new JTextField();
		tfKategorija.setEditable(false);
		tfKategorija.setBounds(140, 285, 136, 20);
		contentPane.add(tfKategorija);
		tfKategorija.setColumns(10);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, btnIzracunajBmi, lblUnesiteTezinu, lblUnesiteVisinuu, tfTezina, tfVisina, lblVasBmi}));
	}
}
