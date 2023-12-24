package ESStrategy;

import Strategy.Strategy;
import Strategy.Veiculo;

public abstract class ESStrategy implements Strategy {
    public double calcularIPVA(Veiculo veiculo) {
        return calcularImposto(veiculo);
    }

    public abstract double calcularImposto(Veiculo veiculo);
}
