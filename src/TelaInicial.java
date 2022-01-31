import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setTitle("Calculando as \u00E1reas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 386, 613);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 51, 0));
		panel_1.setBounds(0, 0, 386, 80);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculando as \u00E1reas");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Poppins", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 366, 60);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha a forma geom\u00E9trica para \r\n");
		lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 104, 366, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("calcular a sua \u00E1rea");
		lblNewLabel_2.setFont(new Font("Poppins", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(19, 133, 356, 30);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ret\u00E2ngulo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retangulo janela = new Retangulo();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(25, 25, 112));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Poppins", Font.BOLD, 14));
		btnNewButton.setBounds(108, 188, 179, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tri\u00E2ngulo");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(25, 25, 112));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Triangulo janela = new Triangulo();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBackground(new Color(25, 25, 112));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Poppins", Font.BOLD, 14));
		btnNewButton_1.setBounds(108, 245, 179, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Trap\u00E9zio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Trapezio janela = new Trapezio();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setBackground(new Color(25, 25, 112));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Poppins", Font.BOLD, 14));
		btnNewButton_2.setBounds(108, 303, 179, 40);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Losango");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Losango janela = new Losango();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setOpaque(true);
		btnNewButton_3.setBackground(new Color(25, 25, 112));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Poppins", Font.BOLD, 14));
		btnNewButton_3.setBounds(108, 363, 179, 40);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("C\u00EDrculo");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Circulo janela = new Circulo();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setOpaque(true);
		btnNewButton_4.setBackground(new Color(25, 25, 112));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Poppins", Font.BOLD, 14));
		btnNewButton_4.setBounds(108, 423, 179, 40);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Quadrado");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quadrado janela = new Quadrado();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setOpaque(true);
		btnNewButton_5.setBackground(new Color(25, 25, 112));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Poppins", Font.BOLD, 14));
		btnNewButton_5.setBounds(108, 484, 179, 40);
		panel.add(btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 51, 0));
		panel_2.setBounds(0, 573, 386, 40);
		panel.add(panel_2);
	}
}
