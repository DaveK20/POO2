package RJStrategy;

import Strategy.Veiculo;

public class RJStrategyTransporteCarga extends RJStrategy {
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.03;
    }
}
