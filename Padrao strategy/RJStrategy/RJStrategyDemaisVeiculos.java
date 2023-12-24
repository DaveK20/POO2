package RJStrategy;

import Strategy.Veiculo;

public class RJStrategyDemaisVeiculos extends RJStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.04;
    }
}
