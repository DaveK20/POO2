package RJStrategy;

import Strategy.Veiculo;

public class RJStrategyGasHibrido extends RJStrategy {
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.015;
    }
}
