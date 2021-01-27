package navita.navitaTest;

import java.util.Scanner;

public class NavitaClass {
	
	public static int solution(int n) {
		char numeros[] = (""+n).toCharArray();
		char temp;
		
		for(int i =1; i<numeros.length; i++) {
			for(int j =0; j<i; j++) {
				if(numeros[i]>=numeros[j]) {
					temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
		
		int numeroIrmao = Integer.parseInt(new String(numeros));
		return (numeroIrmao > 100000000) ? -1 : numeroIrmao;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		System.out.println("Saida " + solution(entrada.nextInt()));
	}
}
