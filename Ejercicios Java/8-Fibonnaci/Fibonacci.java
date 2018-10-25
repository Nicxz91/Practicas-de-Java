/*
 * Fibonacci.java
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
 * El siguiente programa muestra la suceción de Fibonacci hasta un
 * número pedido por el usuario
 */

import java.util.Scanner;

public class Fibonacci {
	
	public static void main (String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0, caja1 = 0, caja2 = 1, caja3 = 0;
		
		System.out.println("¿Hasta qué número desea imprimir la suceción de Fibonacci?");
		numero = teclado.nextInt();
		
		for(int i = 0; i <= numero; i++){
			if(i == 1){
				System.out.print("1, ");
			}
			System.out.print(caja3 + ", ");
			caja3 = caja1 + caja2;
			caja1 = caja2;
			caja2 = caja3;
		}
		
	}
}

