package RJStrategy;

import Strategy.Veiculo;

public class RJStrategyLocadora extends RJStrategy {
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.01;
    }
}
