
package mycompani.eggcoperation.com;

import java.util.Scanner;



public class Suma {

	public static void main(String[] args) {
		
	Scanner reader = new Scanner(System.in);
	
	int a=0,b=0,c=0,m=0;
	
	System.out.println("Escribe el primer numero");
	
	a=reader.nextInt();
	
	System.out.println("Escribe tu segundo numero");
	
	b=reader.nextInt();
	
	c=a+b;
	
	m=a*b;
	
	System.out.println("El resultado de tu suma es: " + c + " " + "El resultado de la multiplicación es: " + m);
	}

}
