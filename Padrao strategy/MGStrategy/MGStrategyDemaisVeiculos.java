package MGStrategy;

import Strategy.Veiculo;

public class MGStrategyDemaisVeiculos extends MGStrategy {
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.04;
    }
}
