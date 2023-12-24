package SPStrategy;

import Strategy.Veiculo;

public class SPStrategyLocadora extends SPStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.01;
    }
}
