package ESStrategy;

import Strategy.Veiculo;

public class ESStrategyOnibusCaminhaoMotocicleta extends ESStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.01;
    }
}
