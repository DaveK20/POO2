package RJStrategy;

import Strategy.Strategy;
import Strategy.Veiculo;

public abstract class RJStrategy implements Strategy {
    public double calcularIPVA(Veiculo veiculo) {
        if (2023 - veiculo.getAnoFabricacao() > 14) {
            return calcularImposto(veiculo);
        }
        return 0;
    }

    public abstract double calcularImposto(Veiculo veiculo);
}
