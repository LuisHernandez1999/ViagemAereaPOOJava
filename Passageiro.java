package aeroporto;

public class Passagiero extends Pessoa {
    private String numeroPassporte; 
    private Assento assento ;
    public Passagiero(String nome, String cpf, String sexo,String numeroPassporte,Assento assento) {
        super(nome, cpf, sexo);
        this.numeroPassporte=numeroPassporte;
        this.assento=assento;
    }
    public String getNumeroPassaporte() {
        return numeroPassporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassporte= numeroPassaporte;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}

