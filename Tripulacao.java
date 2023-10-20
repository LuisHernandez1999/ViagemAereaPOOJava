package aeroporto;
import java.util.List;
import java.util.ArrayList;
public class Tripulção extends Pessoa {
    private String nomePiloto;
    private String nomeCopiloto;
    private List<String> aeromocas;
    public Tripulção(String nome, String cpf, String sexo,String nomePiloto,String nomeCopiloto) {
        super(nome, cpf, sexo);
        this.nomePiloto=nomePiloto;
        this.nomeCopiloto= nomeCopiloto;
        this.aeromocas = new ArrayList<>();
    }

    
    
}
