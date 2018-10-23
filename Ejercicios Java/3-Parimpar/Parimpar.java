/*
 * Parimpar.java
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
 * El siguiente programa indica si un numero introducido por el usuario 
 * es par o impar y además indica si es positivo o negativo
 */

import java.util.Scanner;

public class Parimpar {
	
	public static void main (String args[]) {
		
	Scanner teclado = new Scanner(System.in);
	int numero = 0;
	int resultado = 0;
	
	System.out.println("Por favor introduce un número entero: ");
	numero = teclado.nextInt();
	resultado = numero % 2;
	
	if(resultado == 0 && numero > 0){
		System.out.println("El número " + numero + " es positivo y es par");
	} else if(resultado == 0 && numero < 0){
		System.out.println("El número " + numero + " es negativo y es par");
	} else if(resultado != 0 && numero > 0){
		System.out.println("El número " + numero + " es positivo y es impar");
	} else {
		System.out.println("El número " + numero + " es negativo y es impar");
	}
				
	}
}

