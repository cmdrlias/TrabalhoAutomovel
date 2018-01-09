package automoveis;

public class Onibus extends Passeio{
    
    private char Banheiro;
    private char SegundoAndar;
    
    public Onibus(){
    
    }
    
     public String ImprimirDadosOnibus(){ //imprimir dados particulares desse tipo de veículo
        return String.format("\nNome: %s\t Fabricante: %s\t Ano: %d\n"
                + "Quantidade de passageiros: %d\t Quantidade de Portas: %d\t Cilindradas: %d\n"
                + "Capacidade do tanque: %.2f\t Km/Litro: %.2f\t Nivel atual: %.2f\n"
                + "Capacidade de carga: %.2f\t Possui tacógrafo? %c\n "
                + "Possui Tv? %c\tPossui banheiro? %c\tPossui segundo andar? %c\n", 
                this.getNome(), this.getFabricante(), this.getAno(), this.getQtdPassageiros(),
                this.getQtdPortas(), this.getCilindradas(), this.getCapacidadeTanque(), this.getKmL(),
                this.getNivelTanque(), this.getCapacidadeCarga(), this.getTacografo(), 
                this.getTv(), this.getBanheiro(), this.getSegundoAndar());
    }

    //GETTERS E SETTERS 
     
    public char getBanheiro() {
        return Banheiro;
    }

    public void setBanheiro(char Banheiro) {
        this.Banheiro = Banheiro;
    }

    public char getSegundoAndar() {
        return SegundoAndar;
    }

    public void setSegundoAndar(char SegundoAndar) {
        this.SegundoAndar = SegundoAndar;
    }
}
