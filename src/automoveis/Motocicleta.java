package automoveis;

public class Motocicleta extends Automoveis{
    
    private boolean Capacete;
    private boolean LigarMoto;
    
    public Motocicleta(){
    
    }
    
     public String ImprimirDadosMotocicleta(){ //imprimir dados particulares desse tipo de veículo
        return String.format("\nNome: %s\t Fabricante: %s\t Ano: %d\n"
                + "Quantidade de passageiros: %d\t Cilindradas: %d\n"
                + "Capacidade do tanque: %.2f\t Km/Litro: %.2f\t Nivel atual: %.2f\n"
                + "Capacidade de carga: %.2f\t Possui tacógrafo? %c\n", 
                this.getNome(), this.getFabricante(), this.getAno(), this.getQtdPassageiros(),
                this.getCilindradas(), this.getCapacidadeTanque(), this.getKmL(),
                this.getNivelTanque(), this.getCapacidadeCarga(), this.getTacografo());
    }
    
    public void LigarMoto(boolean Ligar){ //verificação particular para ligar a moto
        if(this.Capacete == true)
            this.LigarMoto = Ligar;
        else if(this.Capacete == false)
            this.LigarMoto = false;
    }
    
    public String DadosLigarMoto(){ //msotrar dados ao ligar a moto
        if(LigarMoto == true)
            return String.format("\nVeículo ligado!\n\n");
        else if (LigarMoto == false && Capacete == false)
            return String.format("\nO veículo não pode ser ligado se você estiver sem o capacete!\n\n");
        else
            return null;
    }
    
    public String DadosDesligarMoto(){ //mostrar dados ao desligar
        if(LigarMoto == true)
            return String.format("\nVeículo desligado!\n\n");
        else
            return String.format("\nO veículo já se encontra desligado!\n\n");
    }
    
    public String DadosCapacete(){ //confirmação de que o usuário colocou o capacete
        return String.format("\nVocê colocou o capacete!\n\n");
    }
    
    //GETTERS E SETTERS

    public boolean isCapacete() {
        return Capacete;
    }

    public void setCapacete(boolean Capacete) {
        this.Capacete = Capacete;
    }
    
}
