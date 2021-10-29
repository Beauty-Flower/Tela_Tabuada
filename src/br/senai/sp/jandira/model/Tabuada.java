package br.senai.sp.jandira.model;

public class Tabuada {
	
	private int multiplicando, multiplicador;
	
	public int getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}

	public int getMultiplcador() {
		return multiplicador;
	}

	public void setMultiplcador(int multiplcador) {
		this.multiplicador = multiplcador;
	}
	
	public String[] calcular() {
		
		String[] tabuada = new String[multiplicador + 1];
		
		for(int index = 0; index <= multiplicador; index++) {
			int resultado = multiplicando * index;
			tabuada[index] = multiplicando + " X " + index + " = " + resultado;
		}
		
		return tabuada;
	}

}
