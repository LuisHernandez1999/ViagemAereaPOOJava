package aeroporto;
public class Voo {
    private String numeroVoo;
    private String nomePiloto; 
    private String cidadeSaida;
    private String cidadeDestino;
    private Aviao aviao;
    private Tripulacao tripulacao;
    

    public Voo(String numeroVoo, String nomePiloto, Aviao aviao, Tripulacao tripulacao,String cidadeSaida,String cidadeDestino) {
        this.numeroVoo = numeroVoo;
        this.nomePiloto = nomePiloto;
        this.aviao = aviao;
        this.tripulacao = tripulacao;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Tripulacao getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(Tripulacao tripulacao) {
        this.tripulacao = tripulacao;
    }
}
    

