package RJStrategy;

import Strategy.Veiculo;

public class RJStrategyMotosOnibusAlchool extends RJStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.02;
    }
}
