package com.programa_costos.view;

import com.programa_costos.service.CalculadoraTiempos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

	private JTextField largoField, anchoField, altoField, numPiezasField, gruesoTotalField, profundidadField,
			numCapasField;
	private JTextArea resultadoArea;

	public VentanaPrincipal() {
		setTitle("Tiempo Estimado de Preparación");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240, 240, 240));
		add(panel);

		JLabel titulo = new JLabel("TIEMPO ESTIMADO DE PREPARACION");
		titulo.setFont(new Font("SansSerif", Font.BOLD, 20));
		titulo.setForeground(new Color(0, 180, 180));
		titulo.setBounds(30, 20, 500, 30);
		panel.add(titulo);

		ImageIcon logoIcon = new ImageIcon("src/img/logo.png");
		JLabel logo = new JLabel(logoIcon);
		logo.setBounds(650, 10, 120, 60);
		panel.add(logo);

		// Campos de entrada
		largoField = crearCampo(panel, "Largo:", 30, 70);
		anchoField = crearCampo(panel, "Ancho:", 280, 70);
		altoField = crearCampo(panel, "Alto:", 530, 70);

		numPiezasField = crearCampo(panel, "Num Piezas:", 30, 130);
		gruesoTotalField = crearCampo(panel, "Grueso total:", 280, 130);
		profundidadField = crearCampo(panel, "Profundidad de mecanizado:", 530, 130);

		numCapasField = crearCampo(panel, "Número de capas:", 30, 190);

		// Botón
		JButton calcularBtn = new JButton("CALCULAR TIEMPO");
		calcularBtn.setBackground(new Color(0, 180, 180));
		calcularBtn.setForeground(Color.BLACK);
		calcularBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
		calcularBtn.setBounds(30, 250, 180, 40);
		panel.add(calcularBtn);

		// Área de resultados
		resultadoArea = new JTextArea();
		resultadoArea.setEditable(false);
		resultadoArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
		resultadoArea.setBackground(Color.DARK_GRAY);
		resultadoArea.setForeground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane(resultadoArea);
		scrollPane.setBounds(30, 310, 720, 180);
		panel.add(scrollPane);

		calcularBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcularTiempos();
			}
		});
	}

	private JTextField crearCampo(JPanel panel, String texto, int x, int y) {
		JLabel label = new JLabel(texto);
		label.setBounds(x, y, 200, 25);
		panel.add(label);

		JTextField campo = new JTextField();
		campo.setBounds(x, y + 25, 200, 30);
		panel.add(campo);

		return campo;
	}

	private void calcularTiempos() {
		try {
			int largo = Integer.parseInt(largoField.getText());
			int ancho = Integer.parseInt(anchoField.getText());
			int grueso = Integer.parseInt(altoField.getText());
			int numPiezas = Integer.parseInt(numPiezasField.getText());
			int gruesoTotal = Integer.parseInt(gruesoTotalField.getText());
			int profundidad = Integer.parseInt(profundidadField.getText());
			int numCapas = Integer.parseInt(numCapasField.getText());

			int tiempoPreparacion = CalculadoraTiempos.calcularTiempoPreparacion(largo, ancho, grueso, numPiezas);
			int tiempoMecanizado = CalculadoraTiempos.calcularTiempoMecanizado(largo, ancho, grueso, numPiezas);
			int tiempoPegado = CalculadoraTiempos.calcularTiempoPegado(numCapas);
			int total = tiempoPreparacion + tiempoMecanizado + tiempoPegado;

			resultadoArea.setText(
					"Preparación de máquina: " + tiempoPreparacion + " min\n" +
							"Mecanizado: " + tiempoMecanizado + " min\n" +
							"Pegado total: " + tiempoPegado + " min\n\n" +
							"Tiempo total: " + total + " min");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Por favor, introduce todos los valores numéricos correctamente.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new VentanaPrincipal().setVisible(true);
		});
	}
}
