package planodevoo;
public class Aeroporto {
    public static void main(String[] args) {
        Assento assento1 = new Assento('A', 1);
        Assento assento2 = new Assento('B', 2);

    Passageiro passageiro1 = new Passageiro("Alice", null, null, null, assento1);
    Passageiro passageiro2 = new Passageiro("Bob", null, null, null, assento2);

        Tripulacao tripulacao1 = new Tripulacao("Piloto1", "CoPiloto1", null, null, null);
        tripulacao1.adicionarAeromoca("Aeromoça1");

        Aviao aviao1 = new Aviao(null);
        aviao1.adicionarPassageiro(passageiro1);
        aviao1.adicionarPassageiro(passageiro2);

        Voo voo1 = new Voo("Voo123", "Nome do Piloto", aviao1, tripulacao1, null, null);

      
    Passageiro passageiro3 = new Passageiro("Carol", null, null, null, new Assento('C', 3));
        voo1.adicionarPassageiro(passageiro3);

        System.out.println("Número do Voo: " + voo1.getNumeroVoo());
        System.out.println("Nome do Piloto: " + voo1.getNomePiloto());
        System.out.println("Tripulação: Piloto - " + voo1.getTripulacao().getPiloto() +
         ", Co-Piloto - " + voo1.getTripulacao().getnomeCopiloto() +
         ", Aeromoças - " + voo1.getTripulacao().getAeromocas());
        System.out.println("Quantidade de Passageiros a bordo: " + voo1.getQuantidadePassageiros());}}
    

