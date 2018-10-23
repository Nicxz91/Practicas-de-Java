/*
 * Sumados.java
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
 * El siguiente programa permite realizar la suma simple de dos numeros 
 * que es usuario ingrese en pantalla
 */

import java.util.Scanner;

public class Sumados {
	
	public static void main (String args[]) {
		
	Scanner teclado = new Scanner(System.in);
	int numero_uno = 0, numero_dos = 0, resultado = 0;
	
	System.out.println("Para realizar una suma debes introducir dos números");
	System.out.println("Introduce un número: ");
	numero_uno = teclado.nextInt();
	System.out.println("Introduce otro número: ");
	numero_dos = teclado.nextInt();
	resultado = numero_uno + numero_dos;
	System.out.println("El resultado de tu suma es igual a: " + resultado);
	}
}

