package application;

public class Program2 {
		
public static void main(String[] args) {
			
	int numero = 30,
	fibo1 = 0,
	fibo2 = 1,
	fibo3 = 0;
	
	while(numero >fibo3) {
		fibo3 = fibo1 + fibo2;
		fibo1 = fibo2;
		fibo2 = fibo3;
	}
	
	if(numero == 0 || numero == 1) {
		System.out.println("O número faz parte da sequência de Fibonacci.");
	} else if (numero == fibo3) {
		System.out.println("O número faz parte da sequência de Fibonacci.");
	} else {
		System.out.println("O número não faz parte da sequência de Fibonacci.");
	}
	
	
}
}

