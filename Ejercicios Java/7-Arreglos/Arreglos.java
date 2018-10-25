/*
 * Arreglos.java
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
 * El siguiente programa solicita al usuario 5 números, y muestra el
 * resultado de la suma y finalmente muestra los números en orden inver-
 * so
 */

import java.util.Scanner;

public class Arreglos {
	
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[5];
		int resultado = 0;
		
		for(int i = 0; i <= 4; i++){
			System.out.println("Introduce el número " + (i + 1));
			numeros[i] = entrada.nextInt();
			resultado = resultado + numeros[i];
		}
		
		System.out.println("El resultado de la suma de los 5 números es: " + resultado);
		
		for(int i = 4; i >= 0; i--){
			System.out.print("[" + numeros[i] + "]");
		}
	}
}

