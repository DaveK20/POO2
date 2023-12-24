package ESStrategy;

import Strategy.Veiculo;

public class ESStrategyDemaisEstados extends ESStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.02;
    }
}
