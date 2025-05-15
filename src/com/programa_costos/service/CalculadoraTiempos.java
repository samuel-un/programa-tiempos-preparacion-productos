package com.programa_costos.service;

import com.programa_costos.model.Molde;

public class CalculadoraTiempos {

	public static int calcularTiempoPreparacion(int largo, int ancho, int grueso, int numPiezas) {
		if (largo >= 10 && largo <= 30 && ancho >= 10 && ancho <= 30 && grueso <= 10 && numPiezas == 5) {
			return 30;
		} else if (largo >= 31 && largo <= 60 && ancho >= 10 && ancho <= 60 && grueso <= 10 && numPiezas >= 6) {
			return 45;
		} else if (largo >= 61 && largo <= 90 && ancho >= 10 && ancho <= 60 && grueso <= 10 && numPiezas == 5) {
			return 75;
		} else {
			return 60;
		}
	}

	public static int calcularTiempoMecanizado(int largo, int ancho, int grueso, int numPiezas) {
		if (largo >= 10 && largo <= 30 && ancho >= 10 && ancho <= 30 && grueso <= 10 && numPiezas == 5) {
			return 45;
		} else if (largo >= 31 && largo <= 60 && ancho >= 10 && ancho <= 60 && grueso <= 10 && numPiezas >= 6) {
			return 60;
		} else if (largo >= 61 && largo <= 90 && ancho >= 10 && ancho <= 60 && grueso <= 10) {
			return 90;
		} else {
			return 60;
		}
	}

	public static int calcularTiempoPegado(int numCapas) {
		return (numCapas <= 1) ? 0 : (numCapas - 1) * 15;
	}
}
