package MGStrategy;

import Strategy.Veiculo;

public class MGSrategyVeiculoCarga extends MGStrategy {
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.03;
    }
}
