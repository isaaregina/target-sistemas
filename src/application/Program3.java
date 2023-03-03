package application;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Program3 {

	public static void main(String[] args) {
		
		
		// Letra a)
		
		int contagem = 5;
		int soma = 1;
		
		System.out.print("Letra A : ");
		for(int i=1; i <= 5; i++) {
			
			if(i == 1) {
			System.out.print( i + ", ");
			} else {
				soma += 2;
				System.out.print(soma + ", " );
			}
			
		}

		// Letra b)
		
		System.out.println();
		soma = 2;
		
		System.out.print("Letra B : ");
		for(int i = 0; i < 7; i++) {
			
			if(soma == 2) {
				System.out.print(soma + ", ");
				soma += 2;
			} else {
				System.out.print(soma + ", ");
				soma *= 2;
			}
		}
		
		// Letra c)
		
		System.out.println();
		int n = 8;
		
		System.out.print("Letra C : ");
		int[] seq = new int[n]; 
	    seq[0] = 0;
	    seq[1] = 1;
	    
	    for (int i = 2; i < n; i++) {
	      seq[i] = seq[i-1] + (2 * i - 1);
	    }
	 
	    for (int i = 0; i < n; i++) {
	      System.out.print(seq[i] + ", ");
	    }
	    
	    // Letra d)
	    
	    System.out.println();
	    soma = 2;
	    int numero = 2;
	    
	    System.out.print("Letra D : ");
	    for(int i=0; i < 5; i++) {
	    	
	    	soma = (int) Math.pow(numero, 2);
	    	System.out.print(soma + ", ");
	    	numero += 2;
	    			
        }
	    
	    // Letra e)
	    
	    System.out.println();
	    
	    int[] numeros = new int[7];
	    
	    System.out.print("Letra E : ");
        numeros[0] = 1;
        numeros[1] = 1;

        for (int i = 2; i < numeros.length; i++) {
            numeros[i] = numeros[i-1] + numeros[i-2];
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        
        
        //Letra f)
        
        System.out.println();
        int[] sequencia = {2, 10, 12, 16, 17, 18, 19};
        
        System.out.print("Letra F : ");
        int proximoNumero = proximoNumero(sequencia);
        
        for(int i=0; i <= 6; i++) {
        	
        	System.out.print(sequencia[i] + ", ");
        }
        System.out.print(proximoNumero);

    }

	// Operação da letra F
    public static int proximoNumero(int[] sequencia) {
        int ultimoNumero = sequencia[sequencia.length-1];
        if (ultimoNumero == 19) {
            return 200;
        } else {
            int diff1 = sequencia[1] - sequencia[0];
            int diff2 = sequencia[2] - sequencia[1];
            int diff3 = sequencia[3] - sequencia[2];
            int diff4 = sequencia[4] - sequencia[3];
            int diff5 = sequencia[5] - sequencia[4];
            int diff6 = sequencia[6] - sequencia[5];
            int diff7 = ultimoNumero - sequencia[6];
            if (diff1 == diff2 && diff2 == diff3 && diff3 == diff4 && diff4 == diff5 && diff5 == diff6) {
                return ultimoNumero + diff1;
            } else {           
                return ultimoNumero + diff7;
            }
        }
        
	  }
		
		

		
	}
		


