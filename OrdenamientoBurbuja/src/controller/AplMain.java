package controller;

import java.util.Random;

public class AplMain {

	public static void main(String[] args) {
		int arreglo[] = new int [4];
		Random randomNum = new Random();
		//arreglo sin ordenar
		System.out.println("Arreglo sin ordenar");
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = randomNum.nextInt(40);
			System.out.println(arreglo[i]);
		}
		ordenamientoB(arreglo, 4);
		//arreglo ordenado
		System.out.println("Arreglo ordenado");
		for(int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
	
	public static void ordenamientoB(int Arreglo[], int n) {
		int aux = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(Arreglo[i] > Arreglo[j]) {
					aux = Arreglo[i];
					Arreglo[i] = Arreglo[j];
					Arreglo[j] = aux;
				}
			}
		}
		
	}

}
