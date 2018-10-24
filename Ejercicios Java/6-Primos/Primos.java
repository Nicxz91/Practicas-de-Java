/*
 * 	Primos.java
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
 * El siguiente programa comprueba si un número introducido por el
 * usuario es primo o no y pregunta al usuario si desea introducir más
 * números
 */

import java.util.Scanner;

public class Primos {
	
	public static void main (String args[]) {
	
	Scanner teclado = new Scanner(System.in);
	int numero = 0, resultado = 0;
	boolean primo = true;
	String respuesta = "";
	
	do{
		System.out.println("Introduce un número cualquiera: ");
		numero = teclado.nextInt();
		for(int i = 2; i < numero; i++){
		resultado = numero % i;
		if(resultado == 0){
			primo = false;
		}
		}
		if(primo == true){
			System.out.println("El número " + numero + " es un número primo");
		} else if(primo == false) {
			System.out.println("El número " + numero + " no es un número primo");
		}
		
		primo = true;
		
		System.out.println("¿Desea introducir otro número para la comprobación?");
		System.out.println("Continuar (S)");
		System.out.println("Terminar (N)");
		respuesta = teclado.next();
	} while(respuesta.equals("S") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("si") || respuesta.equals("s"));
	}
}

