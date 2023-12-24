package SPStrategy;

import Strategy.Veiculo;

public class SPStrategyDemaisVeiculos extends SPStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.04;
    }
}
