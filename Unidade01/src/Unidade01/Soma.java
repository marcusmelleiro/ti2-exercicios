package Unidade01;

import java.util.*;

    class Soma {
	
    	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num1 = leitor.nextDouble();
		
		System.out.print("Digite outro número: ");
		double num2 = leitor.nextDouble();
		
		double num3 = num1 + num2;
		
		System.out.println("A soma de " + num1 + " e " + num2 + " é : " + num3);
		
		}
		
	}


