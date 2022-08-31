package ativrodrigo;

import java.util.Scanner;

public class ExerRodrigo {

	public static void main(String[] args) {
		
		Scanner bimestre = new Scanner(System.in);
		
		double bimestre1, bimestre2, medianota;
		
		System.out.println("Digite a nota  do Primeiro Bimestre: ");
		bimestre1 = bimestre.nextDouble();
		
		System.out.println("Digite a nota  do Segundo Bimestre: ");
		bimestre2 = bimestre.nextDouble();
		
		medianota = (bimestre1*2 + bimestre2*3)/5;
		
		System.out.println("A Media do Aluno e: "+medianota);

	}

}
