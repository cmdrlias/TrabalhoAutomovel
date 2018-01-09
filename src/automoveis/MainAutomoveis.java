package automoveis;

import java.util.*;

public class MainAutomoveis {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int TipoVeiculo = 0, MenuResp = 0;
    
        System.out.println("Tipo de Veículo:\n1. PASSEIO\t2. CAMINHÃO\n3. ONIBUS\t4. MOTOCICLETA\n");
        TipoVeiculo = input.nextInt();
        
        switch(TipoVeiculo){ //swtich case para cada tipo de veículo
            
            case 1: //passeio
                Passeio VeiculoPasseio = new Passeio();
                
                System.out.println("Nome: ");
                VeiculoPasseio.setNome(input.next());
                
                System.out.println("\nFabricante: ");
                VeiculoPasseio.setFabricante(input.next());
                
                System.out.println("\nAno: ");
                VeiculoPasseio.setAno(input.nextInt());
                
                System.out.println("\nQuantidade de portas: ");
                VeiculoPasseio.setQtdPortas(input.nextInt());
                        
                System.out.println("\nQuantidade de passageiros: ");
                VeiculoPasseio.setQtdPassageiros(input.nextInt());
                
                System.out.println("\nCilindradas: ");
                VeiculoPasseio.setCilindradas(input.nextInt());
                
                System.out.println("\nCapacidade em litros do tanque: ");
                VeiculoPasseio.setCapacidadeTanque(input.nextDouble());
                
                System.out.println("\nKilômetros por litro: ");
                VeiculoPasseio.setKmL(input.nextDouble());
                
                System.out.println("\nNivel atual do tanque: ");
                VeiculoPasseio.setNivelTanque(input.nextDouble());
                
                System.out.println("\nCapacidade de carga: ");
                VeiculoPasseio.setCapacidadeCarga(input.nextDouble());
                
                System.out.println("\nPossui tacógrafo? (S)im ou (N)ão");
                VeiculoPasseio.setTacografo(input.next().charAt(0));
                
                System.out.println("\nPossui TV? (S)im ou (N)ão");
                VeiculoPasseio.setTv(input.next().charAt(0));
                
                System.out.printf(VeiculoPasseio.ImprimirDadosPasseio());
                
                System.out.println("\n// ~ INSTRUÇÕES ~ //\n");
                    
                do { //menu de seleção de instruções para o veículo

                    System.out.println("\nO que deseja fazer?\n"
                            + "1. Andar\t2. Abastecer\t3. Verificar Autonomia\n"
                            + "4. Abrir portas\t5. Fechar portas\t6. Colocar cinto de segurança\n"
                            + "7. Ligar\t 8. Desligar\n");
                    MenuResp = input.nextInt();

                    switch(MenuResp){

                        case 1:
                            System.out.println("\nQuantos KMs deseja andar?");
                            VeiculoPasseio.Andar(input.nextDouble());

                            break;

                        case 2:
                            System.out.println("\nQuantos Litros deseja abastecer?");
                            VeiculoPasseio.Abastecer(input.nextDouble());

                            break;

                        case 3:
                            VeiculoPasseio.VerificarAutonomia();
                            System.out.printf(VeiculoPasseio.DadosAutonomia());

                            break;

                        case 4:
                            System.out.println("\nDeseja abrir (uma) ou (todas) as portas?");
                            VeiculoPasseio.AbrirPorta(input.next());

                            System.out.printf(VeiculoPasseio.DadosAbrirPorta());

                            break;

                        case 5:
                            System.out.println("\nDeseja fechar (uma) ou (todas) as portas?");
                            VeiculoPasseio.FecharPorta(input.next());

                            System.out.printf(VeiculoPasseio.DadosFecharPorta());

                            break;

                        case 6:
                            VeiculoPasseio.setCinto(true);
                            System.out.printf(VeiculoPasseio.DadosCinto());

                            break;

                        case 7:
                            VeiculoPasseio.LigarVeiculo(true);
                            System.out.printf(VeiculoPasseio.DadosLigar());

                            break;

                        case 8:
                            System.out.printf(VeiculoPasseio.DadosDesligar());

                    }

                } while(MenuResp != 8);

                System.out.printf(VeiculoPasseio.showDados());
            
                break;
                
            case 2: //caminhão
                Caminhao VeiculoCaminhao = new Caminhao();
                
                System.out.println("Nome: ");
                VeiculoCaminhao.setNome(input.next());
                
                System.out.println("\nFabricante: ");
                VeiculoCaminhao.setFabricante(input.next());
                
                System.out.println("\nAno: ");
                VeiculoCaminhao.setAno(input.nextInt());
                
                System.out.println("\nQuantidade de portas: ");
                VeiculoCaminhao.setQtdPortas(input.nextInt());
                        
                System.out.println("\nQuantidade de passageiros: ");
                VeiculoCaminhao.setQtdPassageiros(input.nextInt());
                
                System.out.println("\nCilindradas: ");
                VeiculoCaminhao.setCilindradas(input.nextInt());
                
                System.out.println("\nCapacidade em litros do tanque: ");
                VeiculoCaminhao.setCapacidadeTanque(input.nextDouble());
                
                System.out.println("\nKilômetros por litro: ");
                VeiculoCaminhao.setKmL(input.nextDouble());
                
                System.out.println("\nNivel atual do tanque: ");
                VeiculoCaminhao.setNivelTanque(input.nextDouble());
                
                System.out.println("\nCapacidade de carga: ");
                VeiculoCaminhao.setCapacidadeCarga(input.nextDouble());
                
                System.out.println("\nPossui tacógrafo? (S)im ou (N)ão");
                VeiculoCaminhao.setTacografo(input.next().charAt(0));
                
                System.out.println("\nPossui TV? (S)im ou (N)ão");
                VeiculoCaminhao.setTv(input.next().charAt(0));
                
                System.out.println("\nÉ Bitrem? (S)im ou (N)ão");
                VeiculoCaminhao.setBitrem(input.next().charAt(0));
                
                System.out.println("\nTipo de Carroceria: ");
                VeiculoCaminhao.setTipoCarroceria(input.next());
                
                System.out.printf(VeiculoCaminhao.ImprimirDadosCaminhao());
                
                System.out.println("\n// ~ INSTRUÇÕES ~ //\n");
                    
                do { //menu de seleção de instruções para o veículo

                    System.out.println("\nO que deseja fazer?\n"
                            + "1. Andar\t2. Abastecer\t3. Verificar Autonomia\n"
                            + "4. Abrir portas\t5. Fechar portas\t6. Colocar cinto de segurança\n"
                            + "7. Ligar\t 8. Desligar\n");
                    MenuResp = input.nextInt();

                    switch(MenuResp){

                        case 1:
                            System.out.println("\nQuantos KMs deseja andar?");
                            VeiculoCaminhao.Andar(input.nextDouble());

                            break;

                        case 2:
                            System.out.println("\nQuantos Litros deseja abastecer?");
                            VeiculoCaminhao.Abastecer(input.nextDouble());

                            break;

                        case 3:
                            VeiculoCaminhao.VerificarAutonomia();
                            System.out.printf(VeiculoCaminhao.DadosAutonomia());

                            break;

                        case 4:
                            System.out.println("\nDeseja abrir (uma) ou (todas) as portas?");
                            VeiculoCaminhao.AbrirPorta(input.next());

                            System.out.printf(VeiculoCaminhao.DadosAbrirPorta());

                            break;

                        case 5:
                            System.out.println("\nDeseja fechar (uma) ou (todas) as portas?");
                            VeiculoCaminhao.FecharPorta(input.next());

                            System.out.printf(VeiculoCaminhao.DadosFecharPorta());

                            break;

                        case 6:
                            VeiculoCaminhao.setCinto(true);
                            System.out.printf(VeiculoCaminhao.DadosCinto());

                            break;

                        case 7:
                            VeiculoCaminhao.LigarVeiculo(true);
                            System.out.printf(VeiculoCaminhao.DadosLigar());

                            break;

                        case 8:
                            System.out.printf(VeiculoCaminhao.DadosDesligar());

                    }

                } while(MenuResp != 8);

                System.out.printf(VeiculoCaminhao.showDados());
            
                break;
                
            case 3: //ônibus
                Onibus VeiculoOnibus = new Onibus();
                
                System.out.println("Nome: ");
                VeiculoOnibus.setNome(input.next());
                
                System.out.println("\nFabricante: ");
                VeiculoOnibus.setFabricante(input.next());
                
                System.out.println("\nAno: ");
                VeiculoOnibus.setAno(input.nextInt());
                
                System.out.println("\nQuantidade de portas: ");
                VeiculoOnibus.setQtdPortas(input.nextInt());
                        
                System.out.println("\nQuantidade de passageiros: ");
                VeiculoOnibus.setQtdPassageiros(input.nextInt());
                
                System.out.println("\nCilindradas: ");
                VeiculoOnibus.setCilindradas(input.nextInt());
                
                System.out.println("\nCapacidade em litros do tanque: ");
                VeiculoOnibus.setCapacidadeTanque(input.nextDouble());
                
                System.out.println("\nKilômetros por litro: ");
                VeiculoOnibus.setKmL(input.nextDouble());
                
                System.out.println("\nNivel atual do tanque: ");
                VeiculoOnibus.setNivelTanque(input.nextDouble());
                
                System.out.println("\nCapacidade de carga: ");
                VeiculoOnibus.setCapacidadeCarga(input.nextDouble());
                
                System.out.println("\nPossui tacógrafo? (S)im ou (N)ão");
                VeiculoOnibus.setTacografo(input.next().charAt(0));
                
                System.out.println("\nPossui TV? (S)im ou (N)ão");
                VeiculoOnibus.setTv(input.next().charAt(0));
                
                System.out.println("\nPossui segundo andar? (S)im ou (N)ão");
                VeiculoOnibus.setSegundoAndar(input.next().charAt(0));
                
                System.out.printf(VeiculoOnibus.ImprimirDadosOnibus());
                
                System.out.println("\n// ~ INSTRUÇÕES ~ //\n");
                    
                do { //menu de seleção de instruções para o veículo

                    System.out.println("\nO que deseja fazer?\n"
                            + "1. Andar\t2. Abastecer\t3. Verificar Autonomia\n"
                            + "4. Abrir portas\t5. Fechar portas\t6. Colocar cinto de segurança\n"
                            + "7. Ligar\t 8. Desligar\n");
                    MenuResp = input.nextInt();

                    switch(MenuResp){

                        case 1:
                            System.out.println("\nQuantos KMs deseja andar?");
                            VeiculoOnibus.Andar(input.nextDouble());

                            break;

                        case 2:
                            System.out.println("\nQuantos Litros deseja abastecer?");
                            VeiculoOnibus.Abastecer(input.nextDouble());

                            break;

                        case 3:
                            VeiculoOnibus.VerificarAutonomia();
                            System.out.printf(VeiculoOnibus.DadosAutonomia());

                            break;

                        case 4:
                            System.out.println("\nDeseja abrir (uma) ou (todas) as portas?");
                            VeiculoOnibus.AbrirPorta(input.next());

                            System.out.printf(VeiculoOnibus.DadosAbrirPorta());

                            break;

                        case 5:
                            System.out.println("\nDeseja fechar (uma) ou (todas) as portas?");
                            VeiculoOnibus.FecharPorta(input.next());

                            System.out.printf(VeiculoOnibus.DadosFecharPorta());

                            break;

                        case 6:
                            VeiculoOnibus.setCinto(true);
                            System.out.printf(VeiculoOnibus.DadosCinto());

                            break;

                        case 7:
                            VeiculoOnibus.LigarVeiculo(true);
                            System.out.printf(VeiculoOnibus.DadosLigar());

                            break;

                        case 8:
                            System.out.printf(VeiculoOnibus.DadosDesligar());

                    }

                } while(MenuResp != 8);

                System.out.printf(VeiculoOnibus.showDados());
            
                break;
                
            case 4: //motocicleta
                Motocicleta VeiculoMotocicleta = new Motocicleta();
                
                System.out.println("Nome: ");
                VeiculoMotocicleta.setNome(input.next());
                
                System.out.println("\nFabricante: ");
                VeiculoMotocicleta.setFabricante(input.next());
                
                System.out.println("\nAno: ");
                VeiculoMotocicleta.setAno(input.nextInt());
     
                System.out.println("\nQuantidade de passageiros: ");
                VeiculoMotocicleta.setQtdPassageiros(input.nextInt());
                
                System.out.println("\nCilindradas: ");
                VeiculoMotocicleta.setCilindradas(input.nextInt());
                
                System.out.println("\nCapacidade em litros do tanque: ");
                VeiculoMotocicleta.setCapacidadeTanque(input.nextDouble());
                
                System.out.println("\nKilômetros por litro: ");
                VeiculoMotocicleta.setKmL(input.nextDouble());
                
                System.out.println("\nNivel atual do tanque: ");
                VeiculoMotocicleta.setNivelTanque(input.nextDouble());
                
                System.out.println("\nCapacidade de carga: ");
                VeiculoMotocicleta.setCapacidadeCarga(input.nextDouble());
                
                System.out.println("\nPossui tacógrafo? (S)im ou (N)ão");
                VeiculoMotocicleta.setTacografo(input.next().charAt(0));

                System.out.printf(VeiculoMotocicleta.ImprimirDadosMotocicleta());
                
                System.out.println("\n// ~ INSTRUÇÕES ~ //\n");
                
                do { //menu de seleção de instruções para o veículo

                    System.out.println("\nO que deseja fazer?\n"
                            + "1. Andar\t2. Abastecer\t3. Verificar Autonomia\n"
                            + "4. Colocar capacete\t5. Ligar\t 6. Desligar\n");
                    MenuResp = input.nextInt();

                    switch(MenuResp){

                        case 1:
                            System.out.println("\nQuantos KMs deseja andar?");
                            VeiculoMotocicleta.Andar(input.nextDouble());

                            break;

                        case 2:
                            System.out.println("\nQuantos Litros deseja abastecer?");
                            VeiculoMotocicleta.Abastecer(input.nextDouble());

                            break;

                        case 3:
                            VeiculoMotocicleta.VerificarAutonomia();
                            System.out.printf(VeiculoMotocicleta.DadosAutonomia());

                            break;

                        case 4:
                            VeiculoMotocicleta.setCapacete(true);
                            System.out.printf(VeiculoMotocicleta.DadosCapacete());

                            break;

                        case 5:
                            VeiculoMotocicleta.LigarMoto(true);
                            System.out.printf(VeiculoMotocicleta.DadosLigarMoto());

                            break;

                        case 6:
                            System.out.printf(VeiculoMotocicleta.DadosDesligarMoto());

                            break;
                    }

                } while(MenuResp != 6);

                System.out.printf(VeiculoMotocicleta.showDados());
            
                break;
                
        }
  
    }
       
}