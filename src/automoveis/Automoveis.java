package automoveis;

public class Automoveis { //classe mãe - automóveis
    
    private String Nome;
    private String Fabricante;
    private int Ano;
    private int QtdPassageiros;
    private int Cilindradas;
    private double CapacidadeTanque;
    private double KmL;
    double NivelTanque;
    private double CapacidadeCarga;
    private char Tacografo;
    public double Kilometragem = 0;
    public double Autonomia;
    private boolean UmaPorta;
    private boolean TodasPortas;
    private boolean Cinto;
    private boolean Ligar;
    double KmAndados;
    double CombustivelConsumido;
    
    public Automoveis(){
        
    }
    
    public void Andar(double KmAndados){ //cálculo e verificação para o veículo andar
        if(Ligar == false)
            System.out.println("\nO veículo não está ligado!\n");
        
        else if(NivelTanque <= 0)
            System.out.println("\nO tanque está vazio!\n");
        
        else {
            setKmAndados(KmAndados);
            
            this.Kilometragem = this.Kilometragem + KmAndados;
            this.NivelTanque = this.NivelTanque - (KmAndados/KmL);
            
            System.out.printf("\n%.2f Kilometros rodados \tO nível atual do tanque é %.2f\n", this.Kilometragem, this.NivelTanque);
        } 
    }
    
    public String showDados(){ //mostrar dados finais
        return String.format("\nNivel do tanque atualizado: %.2f\nKilometragem final: %.2f\n",NivelTanque, Kilometragem);
    }
    
    public void Abastecer(double Combustivel){ //cálculo de abastecimento
        if(this.NivelTanque + Combustivel > this.CapacidadeTanque){
            
            System.out.printf("\nQuantidade acima da suportada pelo tanque\n"
            + "\nO Nivel atual do tanque e: %.2f e a capacidade maxima e: %.2f\n\n",this.NivelTanque,this.CapacidadeTanque);
            
        }else{
            this.NivelTanque = NivelTanque + Combustivel;
            
            System.out.printf("\nO nivel atual do tanque é %.2f", this.NivelTanque);
        }
    }
    
    public double VerificarAutonomia(){ //cálculo de autonomia
        return NivelTanque * KmL;
    }
    
    public String DadosAutonomia(){ //mostrar dados da autonomia
        return String.format("\n%.2f\n", VerificarAutonomia());
    }
    
    public void AbrirPorta(String Abrir){ 
        this.UmaPorta = false;
        this.TodasPortas = false;
        if(Abrir.equals("Uma") || Abrir.equals("uma"))
            setUmaPorta(true);
        else if(Abrir.equals("Todas") || Abrir.equals("todas"))
            setTodasPortas(true);
    }

    public String DadosAbrirPorta(){
        if(this.UmaPorta == true)
            return String.format("\nUma porta aberta.\n");
        if (this.TodasPortas == true)
            return String.format("\nTodas as portas abertas.\n");
        else
            return null;
    }
    
    public void FecharPorta(String Fechar){
        if(Fechar.equals("Uma") || Fechar.equals("uma"))
            this.UmaPorta = false;
        else if(Fechar.equals("Todas") || Fechar.equals("todas"))
            this.TodasPortas = false;
    }
    
    public String DadosFecharPorta(){
        if(this.UmaPorta == false)
            return String.format("\nUma porta fechada.\n");
        if (this.TodasPortas == false)
            return String.format("\nTodas as portas fechadas.\n");
        else
            return null;
    }
    
    public String DadosCinto(){
        return String.format("\nParabéns! Você colocou o cinto de segurança!\n");
    }
    
    public void LigarVeiculo(boolean Ligar){ //verificação para ligar o veículo
        if(this.Cinto == true && this.TodasPortas == false && this.UmaPorta == false)
            this.Ligar = true;
        else if(this.Cinto == false || this.TodasPortas == true || this.UmaPorta == true)
            this.Ligar = false;
    }
    
    public String DadosLigar(){ //mostrar dados ao ligar
        if(Ligar == true)
            return String.format("\nVeículo ligado!\n");
        else if (Ligar == false && TodasPortas == true || UmaPorta == true)
            return String.format("\nO veículo não pode ser ligado com uma ou mais portas abertas!\n");
        else if (Ligar == false && Cinto == false)
            return String.format("\nO veículo não pode ser ligado se você estiver sem cinto de segurança!\n");
        else
            return null;
    }
    
    public String DadosDesligar(){ //mostrar dados ao desligar
        if(Ligar == true)
            return String.format("\nVeículo desligado!\n");
        else
            return String.format("\nO veículo já se encontra desligado!\n");
    }
    
    //GETTERS E SETTERS
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getQtdPassageiros() {
        return QtdPassageiros;
    }

    public void setQtdPassageiros(int QtdPassageiros) {
        this.QtdPassageiros = QtdPassageiros;
    }

    public int getCilindradas() {
        return Cilindradas;
    }

    public void setCilindradas(int Cilindradas) {
        this.Cilindradas = Cilindradas;
    }

    public double getCapacidadeTanque() {
        return CapacidadeTanque;
    }

    public void setCapacidadeTanque(double CapacidadeTanque) {
        this.CapacidadeTanque = CapacidadeTanque;
    }

    public double getKmL() {
        return KmL;
    }

    public void setKmL(double KmL) {
        this.KmL = KmL;
    }

    public double getNivelTanque() {
        return NivelTanque;
    }

    public void setNivelTanque(double NivelTanque) {
        this.NivelTanque = NivelTanque;
    }

    public double getCapacidadeCarga() {
        return CapacidadeCarga;
    }

    public void setCapacidadeCarga(double CapacidadeCarga) {
        this.CapacidadeCarga = CapacidadeCarga;
    }

    public char getTacografo() {
        return Tacografo;
    }

    public void setTacografo(char Tacografo) {
        this.Tacografo = Tacografo;
    }

    public boolean isUmaPorta() {
        return UmaPorta;
    }

    public void setUmaPorta(boolean UmaPorta) {
        this.UmaPorta = UmaPorta;
    }

    public boolean isTodasPortas() {
        return TodasPortas;
    }

    public void setTodasPortas(boolean TodasPortas) {
        this.TodasPortas = TodasPortas;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

    public boolean isCinto() {
        return Cinto;
    }

    public void setCinto(boolean Cinto) {
        this.Cinto = false;
        this.Cinto = Cinto;
    }

    public boolean isLigar() {
        return Ligar;
    }

    public void setLigar(boolean Ligar) {
        this.Ligar = Ligar;
    }

    public double getKmAndados() {
        return KmAndados;
    }

    public void setKmAndados(double KmAndados) {
        this.KmAndados = KmAndados;
    }

}
