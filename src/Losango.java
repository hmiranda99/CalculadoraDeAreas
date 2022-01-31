import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Losango extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cx2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Losango frame = new Losango();
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
	public Losango() {
		setTitle("\u00C1rea do losango");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 518);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 69, 0));
		panel_1.setBounds(0, 0, 826, 80);
		contentPane.add(panel_1);
		
		JLabel lblLosango = new JLabel("Losango");
		lblLosango.setHorizontalAlignment(SwingConstants.CENTER);
		lblLosango.setForeground(Color.WHITE);
		lblLosango.setFont(new Font("Poppins", Font.BOLD, 20));
		lblLosango.setBounds(305, 10, 204, 60);
		panel_1.add(lblLosango);
		
		JButton btnNewButton = new JButton("In\u00EDcio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial janela = new TelaInicial();
				Losango.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(25, 25, 112));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Poppins", Font.BOLD, 20));
		btnNewButton.setBounds(0, 0, 156, 80);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Como calcular:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 105, 769, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Digite a diagonal (D)");
		lblNewLabel_3.setFont(new Font("Poppins", Font.BOLD, 16));
		lblNewLabel_3.setBounds(398, 187, 202, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Digite a diagonal (d)");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Poppins", Font.BOLD, 16));
		lblNewLabel_4.setBounds(398, 237, 183, 30);
		contentPane.add(lblNewLabel_4);
		
		cx1 = new JTextField();
		cx1.setFont(new Font("Poppins", Font.BOLD, 20));
		cx1.setColumns(10);
		cx1.setBounds(610, 184, 205, 40);
		contentPane.add(cx1);
		
		cx2 = new JTextField();
		cx2.setFont(new Font("Poppins", Font.BOLD, 20));
		cx2.setColumns(10);
		cx2.setBounds(610, 234, 205, 40);
		contentPane.add(cx2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(386, 166, 2, 158);
		contentPane.add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(0, 362, 825, 80);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_5 = new JLabel("\u00C1rea");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Poppins", Font.BOLD, 18));
		lblNewLabel_5.setBounds(248, 10, 133, 60);
		panel_3.add(lblNewLabel_5);
		
		resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setForeground(Color.WHITE);
		resultado.setFont(new Font("Poppins", Font.BOLD, 24));
		resultado.setEditable(false);
		resultado.setColumns(10);
		resultado.setBackground(Color.BLACK);
		resultado.setBounds(391, 9, 223, 60);
		panel_3.add(resultado);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 69, 0));
		panel_1_1.setBounds(0, 441, 825, 40);
		contentPane.add(panel_1_1);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double area, diagonal1, diagonal2;
				final int DIVISOR = 2;
				
				if((cx1.getText().equals("") || cx2.getText().equals("")) ||
						(cx1.getText().equals(" ") || cx2.getText().equals(" "))) {
					JOptionPane.showMessageDialog(null, "Campo vazio.", "ERRO: Campo vazio.",
							JOptionPane.ERROR_MESSAGE);
				} else {
					diagonal1 = Double.parseDouble(cx1.getText());
					diagonal2 = Double.parseDouble(cx2.getText());
					area = diagonal1 * diagonal2/DIVISOR;
					resultado.setText(String.valueOf(area));
				}
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Poppins", Font.BOLD, 16));
		btnNewButton_1.setBounds(610, 284, 205, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cx1.setText(" ");
				cx2.setText(" ");
				resultado.setText(" ");
				
				//voltar cursor do mouse
				cx1.requestFocus();
			}
		});
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setBackground(new Color(105, 105, 105));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Poppins", Font.BOLD, 16));
		btnNewButton_2.setBounds(395, 284, 205, 40);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(Losango.class.getResource("/img/Losango.png")));
		lblNewLabel.setBounds(10, 166, 366, 158);
		contentPane.add(lblNewLabel);
	}
}
