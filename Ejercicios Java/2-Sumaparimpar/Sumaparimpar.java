/*
 * Sumaparimpar.java
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
 * 
 * El siguiente programa realizar la suma de los números pares y impares
 * hasta un número pedido por el usuario
 * 
 */

import java.util.Scanner;

public class Sumaparimpar {
	
	public static void main (String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int sumapar = 0;
		int sumaimpar = 1;
		
		System.out.println("Introduce un número entero positivo: ");
		numero = teclado.nextInt();
		
		for(int i = 2; i <= numero; i += 2){
			sumapar = sumapar + i;
			if(i < numero){
			sumaimpar = sumaimpar + (i + 1);
			}
		}
		
		System.out.println("El resultado de la suma de números pares desde 0 hasta " + numero + " es: " + sumapar);
		System.out.println("El resultado de la suma de números impares desde 0 hasta " + numero + " es: " + sumaimpar);
		
	}
}

