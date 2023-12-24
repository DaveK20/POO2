package SPStrategy;

import Strategy.Veiculo;

public class SPStrategyCaminhao extends SPStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.015;
    }
}
