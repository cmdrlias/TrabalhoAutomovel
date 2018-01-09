package automoveis;

public class Caminhao extends Passeio{
    
    private char Bitrem;
    private String TipoCarroceria;
    
    public Caminhao(){
    
    }
    
    public String ImprimirDadosCaminhao(){ //imprimir dados particulares desse tipo de veículo
        return String.format("\nNome: %s\t Fabricante: %s\t Ano: %d\n"
                + "Quantidade de passageiros: %d\t Quantidade de Portas: %d\t Cilindradas: %d\n"
                + "Capacidade do tanque: %.2f\t Km/Litro: %.2f\t Nivel atual: %.2f\n"
                + "Capacidade de carga: %.2f\t Possui tacógrafo? %c\t Possui Tv? %c\n"
                + "Tipo de carroceria: %s\t É bitrem? %c\n", 
                this.getNome(), this.getFabricante(), this.getAno(), this.getQtdPassageiros(),
                this.getQtdPortas(), this.getCilindradas(), this.getCapacidadeTanque(), this.getKmL(),
                this.getNivelTanque(), this.getCapacidadeCarga(), this.getTacografo(), this.getTv(),
                this.getTipoCarroceria(), this.getBitrem());
    }
    
    //GETTERS E SETTERS

    public char getBitrem() {
        return Bitrem;
    }

    public void setBitrem(char Bitrem) {
        this.Bitrem = Bitrem;
    }

    public String getTipoCarroceria() {
        return TipoCarroceria;
    }

    public void setTipoCarroceria(String TipoCarroceria) {
        this.TipoCarroceria = TipoCarroceria;
    }
}
