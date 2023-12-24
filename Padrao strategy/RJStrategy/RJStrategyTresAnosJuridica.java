package RJStrategy;

import Strategy.Veiculo;

public class RJStrategyTresAnosJuridica extends RJStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.05;
    }
}
