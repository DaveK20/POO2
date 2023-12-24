package MGStrategy;

import Strategy.Veiculo;

public class MGStrategyLocadoraOnibusCaminhao  extends MGStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.01;
    }
}
