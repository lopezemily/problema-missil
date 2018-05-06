package missil;

import java.util.Scanner;

public class Missil {

    public static void main(String[] args) {
        //Declaração de variaveis
        float VelocidadeA, VelocidadeB, Distancia, LarguraA, LarguraB, AreaUtil;
        float TempoColisao, DistanciaA, DistanciaB, DistanciaSomada, ErroPossivel, ErroCalculado; 

        //Cria um leitor
        Scanner Leitor = new Scanner(System.in);

        //Pega infos
        System.out.println("Qual a velocidade do missil A em km/h?");
        VelocidadeA = Leitor.nextFloat() / 3.6f; //convertendo para metros/segundo

        System.out.println("Qual a velocidade do missil B em km/h?");
        VelocidadeB = Leitor.nextFloat() / 3.6f; 

        System.out.println("Agora me diga, qual a distância entre eles em km?");
        Distancia = Leitor.nextFloat() * 1000f;
        
        System.out.println("Qual a largura do missil A em metros?");
        LarguraA = Leitor.nextFloat();
        
        System.out.println("Qual a largura do missil B em metros?");
        LarguraB = Leitor.nextFloat();
                
        System.out.println("Qual a área util para colisão em porcentagem?");
        AreaUtil = Leitor.nextFloat();

        //Faz os cálculos
        TempoColisao = Distancia / (VelocidadeA + VelocidadeB);
        DistanciaA = VelocidadeA * TempoColisao;
        DistanciaB = VelocidadeB * TempoColisao;
        DistanciaSomada = DistanciaA + DistanciaB;
        ErroPossivel = AreaUtil / 100 * LarguraA;
        ErroCalculado = Distancia - DistanciaSomada;
                
        //Mostra a saida 
        System.out.println("O tempo de colisão é " + TempoColisao + "s");
        System.out.println("A distância do missil A até a colisão é " + DistanciaA + "m");
        System.out.println("A distância do missil B até a colisão é " + DistanciaB + "m");
        
        if (ErroCalculado > ErroPossivel){
            System.out.println("O missil B não atengirá a area util do missil A com a precisão desejada");
        }else{
            System.out.println("O missil B atingirá o missil A com a precisão desejada");
        }

    }
}
