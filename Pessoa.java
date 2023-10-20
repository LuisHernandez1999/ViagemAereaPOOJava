package aeroporto;
public class Pessoa {
	private String nome;
	private String cpf;
	private String sexo;
	public Pessoa (String nome, String cpf, String sexo){
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;}
        public String getNome(){
			return nome;
	}
		private void setNome(String nome) {
		this.nome=nome;
	}
		public String getCpf(){
			return cpf;
	}
		private void setCpf(String cpf) {
			this.cpf=cpf;
	}
		public String getSexo(){
			return sexo;
	}
			private void setSexo(String sexo) {
				this.sexo=sexo;
			
	}
	}
