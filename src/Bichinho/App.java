package Bichinho;
import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		
		int op=0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Bem vindo!!");
		System.out.println("Como vai se chamar seu bichinho?");
		String name = input.next();
		String classe = "Mamifero";
		String familia = "Canidae";
		
		Animais a = new Animais(name, classe, familia);
		a.nascer();
		
		while(op!=4 && a.isEstado()) {
			System.out.println("Digite uma opção:\n1-Comer\n2-Correr\n3-Dormir\n4-Sair do programa");
			op=input.nextInt();
			
			//opções possíveis
			
			//escolheu comer
			
			if(op==1) {
				//condição de execução
				if(a.getCaloria()<100 && a.getForca()>=2) {
					a.comer();
				}else if(a.getForca()>=2) {
					System.out.println(name+" esta cheio");
				}else {
					System.out.println("O animal esta muito cansado...");
				}	
			}
			//FIM DE COMER//
			
			
			//escolheu correr
			
			else if(op==2){
				if(a.getForca()>=5 && a.getCaloria()>=5) {
					a.correr();
				}
				else if(a.getForca()<5) {
					System.out.println(name+" esta exausto!");
				}
				else {
					System.out.println(name+ " esta com fome.");
				}
			}
			//FIM DE CORRER//
			
			
			//escolheu dormir
			else if(op==3) {
				if(a.isEstado()) {
					a.dormir();
				}
			}
			//FIM DE DORMIR//
			
		}
		//FIM DO LOOP//
		
		System.out.println("Encerrando o programa...");
			
	}

}
