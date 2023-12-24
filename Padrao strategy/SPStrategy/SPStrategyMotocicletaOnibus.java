package SPStrategy;

import Strategy.Veiculo;

public class SPStrategyMotocicletaOnibus extends SPStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.02;
    }
}
