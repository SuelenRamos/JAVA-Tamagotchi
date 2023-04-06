package Bichinho;

public class Animais {
	private String nome;
	private String classe;
	private String familia;
	private int idade;
	private boolean estado;
	private int caloria;
	private int forca;
	
	
	//Nascimento
	Animais(){
		
	}
	
	Animais(String nome, String classe, String familia){
		this.nome=nome;
		this.classe=classe;
		this.familia=familia;
		idade=1;
		estado=true;
		caloria=10;
		forca=10;
	}
	
	//Confirmação de nascimento
	void nascer() {
		System.out.println("O animal se chama "+nome+" é da classe "+classe+" da família "+familia+". O animal possui força de "+ forca+", caloria de "+ caloria+" e idade de "+idade+" dias.");
	}
	
	//Sinalização de morte
	void morrer() {
		estado=false;
		System.out.println("O animal morreu! x-x");
	}
	
	//métodos do animal
	
	//comer
	
	void comer() {
		
		if(caloria<90) {
			caloria+=10;
		}
		else{
			caloria=100;
		}
		forca-=2;
		System.out.println("Nham...nham...\n\n\nO animal comeu e agora sua forca é de "+forca+" e suas calorias valem "+caloria);
		
		if(forca==0) {
			morrer();
		}
				
	}//FIM DE COMER
	
	
	//correr
	
	void correr() {
		
			forca-=5;
			caloria-=5;
			
			System.out.println("O animal está correndo!! Agora dua forca é de "+ forca+" e suas calorias valem "+caloria);
			
			if(forca==0 || caloria ==0) {
				morrer();
			}
		}//FIM DE CORRER
	
	
	//Dormir
	
	void dormir() {
		
		if(forca<90) {
			forca+=10;
		}
		else {
			forca=100;
		}
		caloria-=2;
		
		System.out.println("O animal esta dormindo agora! Sua forca aumentou para "+forca+" e suas calorias diminuiram para "+caloria);
		
		if(caloria<=0) {
			morrer();
		}
	}//FIM DE DORMIR
	
	
	//Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getCaloria() {
		return caloria;
	}

	public void setCaloria(int caloria) {
		this.caloria = caloria;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}
	
}
