package aeroporto;
public class Assento {
    private char letra;
    private int numero;

    public Assento(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }  
}
