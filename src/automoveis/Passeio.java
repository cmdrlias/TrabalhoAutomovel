package automoveis;

public class Passeio extends Automoveis{
    
    private int QtdPortas;
    private char Tv;
    
    public Passeio(){
    
    }
    
    public String ImprimirDadosPasseio(){ //imprimir dados particulares desse tipo de veículo
        return String.format("\nNome: %s\t Fabricante: %s\t Ano: %d\n"
                + "Quantidade de passageiros: %d\t Quantidade de Portas: %d\t Cilindradas: %d\n"
                + "Capacidade do tanque: %.2f\t Km/Litro: %.2f\t Nivel atual: %.2f\n"
                + "Capacidade de carga: %.2f\t Possui tacógrafo? %c\t Possui Tv? %c\n", 
                this.getNome(), this.getFabricante(), this.getAno(), this.getQtdPassageiros(),
                this.getQtdPortas(), this.getCilindradas(), this.getCapacidadeTanque(), this.getKmL(),
                this.getNivelTanque(), this.getCapacidadeCarga(), this.getTacografo(), this.getTv());
    }
    
    //GETTERS E SETTERS

    public int getQtdPortas() {
        return QtdPortas;
    }

    public void setQtdPortas(int QtdPortas) {
        this.QtdPortas = QtdPortas;
    }

    public char getTv() {
        return Tv;
    }

    public void setTv(char Tv) {
        this.Tv = Tv;
    }

}
