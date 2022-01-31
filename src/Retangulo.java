

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Retangulo extends JFrame {

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
					Retangulo frame = new Retangulo();
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
	public Retangulo() {
		setResizable(false);
		setTitle("\u00C1rea do ret\u00E2ngulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 825, 482);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 69, 0));
		panel_1.setBounds(0, 441, 825, 40);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 69, 0));
		panel_2.setBounds(0, 0, 825, 80);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ret\u00E2ngulo");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Poppins", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 10, 562, 60);
		panel_2.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("In\u00EDcio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial janela = new TelaInicial();
				Retangulo.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setBackground(new Color(25, 25, 112));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Poppins", Font.BOLD, 20));
		btnNewButton_2.setBounds(0, 0, 156, 80);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Como calcular:");
		lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 105, 766, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Retangulo.class.getResource("/img/retangulo.png")));
		lblNewLabel_2.setBounds(10, 158, 366, 126);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Digite a base (b)");
		lblNewLabel_3.setFont(new Font("Poppins", Font.BOLD, 16));
		lblNewLabel_3.setBounds(398, 186, 163, 30);
		panel.add(lblNewLabel_3);
		
		cx1 = new JTextField();
		cx1.setFont(new Font("Poppins", Font.BOLD, 20));
		cx1.setBounds(610, 184, 205, 40);
		panel.add(cx1);
		cx1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Digite a altura (h)");
		lblNewLabel_4.setFont(new Font("Poppins", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(398, 236, 163, 30);
		panel.add(lblNewLabel_4);
		
		cx2 = new JTextField();
		cx2.setFont(new Font("Poppins", Font.BOLD, 20));
		cx2.setBounds(610, 234, 205, 40);
		panel.add(cx2);
		cx2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(0, 362, 825, 80);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("\u00C1rea");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Poppins", Font.BOLD, 18));
		lblNewLabel_5.setBounds(248, 10, 133, 60);
		panel_3.add(lblNewLabel_5);
		
		resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEditable(false);
		resultado.setBackground(new Color(0, 0, 0));
		resultado.setForeground(Color.WHITE);
		resultado.setFont(new Font("Poppins", Font.BOLD, 24));
		resultado.setBounds(391, 9, 223, 60);
		panel_3.add(resultado);
		resultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double area, base, altura;
				
				if((cx1.getText().equals("") || cx2.getText().equals("")) ||
						(cx1.getText().equals(" ") || cx2.getText().equals(" "))) {
					JOptionPane.showMessageDialog(null, "Campo vazio.", "ERRO: Campo vazio.",
							JOptionPane.ERROR_MESSAGE);
				} else {
					base = Double.parseDouble(cx1.getText());
					altura = Double.parseDouble(cx2.getText());
					area = base*altura;
					
					resultado.setText(String.valueOf(area));
				}
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Poppins", Font.BOLD, 16));
		btnNewButton.setBounds(610, 284, 205, 40);
		panel.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(386, 166, 2, 158);
		panel.add(separator);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cx1.setText(" ");
				cx2.setText(" ");
				resultado.setText(" ");
				
				//voltar cursor do mouse
				cx1.requestFocus();
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Poppins", Font.BOLD, 16));
		btnNewButton_1.setBounds(395, 284, 205, 40);
		panel.add(btnNewButton_1);
	}
}
