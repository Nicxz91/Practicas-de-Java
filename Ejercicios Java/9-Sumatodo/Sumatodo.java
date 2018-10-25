/*
 * Sumatodo.java
 * 
 * Copyright 2018 Nicxon Márquez <nicxz91@gmail.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * El siguiente programa pide números aleatorios al usuario, pregunta si
 * desea agregar más, luego muestra la suma de los pares, los impares,
 * positivos y negativos, cantidad de pares e impares y la media de 
 * todos los números
 * 
 */

import java.util.Scanner;

public class Sumatodo {
	
	public static void main (String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int[100]; // Memoria predeterminada de 100 números
		int sumapar = 0, sumaimpar = 0, sumapo = 0, sumane = 0, media = 0; //Variables de cada una de las sumas
		int par = 0, impar = 0, positivos = 0, negativos = 0;
		int ind = 0;
		String decision = "s";
		
		do{
			System.out.println("Por favor ingresa un número entero: ");
			numeros[ind] = teclado.nextInt();
			System.out.println("¿Deseas agregar otro número?");
			decision = teclado.next();
			
			if(numeros[ind] % 2 == 0){
				sumapar = sumapar + numeros[ind];
				par = par + 1;
			} else {
				sumaimpar = sumaimpar + numeros[ind];
				impar = impar + 1;
			}
			
			if(numeros[ind] >= 0){
				sumapo = sumapo + numeros[ind];
				positivos = positivos + 1;
			} else{
				sumane = sumane + numeros[ind];
				negativos = negativos + 1;
			}
			
			ind++;
		} while(decision.equals("Si") || decision.equals("SI") || decision.equals("si") || decision.equals("s") || decision.equals("S"));
		
		for(int i = 0; i <= ind; i++){
			media = media + numeros[i];
		}
		
		media = media / ind;
		System.out.println("La suma de los números positivos es: " + sumapo + " y hay " + positivos + " números positivos");
		System.out.println("La suma de los números negativos es: " + sumane + " y hay " + negativos + " números negativos");
		System.out.println("La suma de los números pares es: " + sumapar + " y hay " + par + " números pares");
		System.out.println("La suma de los números impares es: " + sumaimpar + " y hay " + impar + " números impares");
		System.out.println("La media de todos los números ingresados es : " + media);
	}
}

