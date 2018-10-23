/*
 * Factorial!.java
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
 * El siguiente Programa cumple la función de calcular el factorial
 * de un número solicitado al usuario y muestra el resultado en pantalla
 */

import java.util.Scanner;

public class Factorial {
	
	public static void main (String args[]) {
	
	Scanner teclado = new Scanner(System.in);
	int numero = 0;
	int resultado = 1;
	
	System.out.println("Introduce un numero entero: ");
	numero = teclado.nextInt();
	
	for(int i = 1; i <= numero; i++){
		resultado = resultado * i;
	}
	System.out.println("El factorial del número " + numero + " es : " + resultado);	
	}
}

