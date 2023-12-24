package Strategy;

public class CalculadoraIPVA {
    private Strategy strategy;

    public CalculadoraIPVA(Strategy strategy) {
        this.setStrategy(strategy);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calcular(Veiculo veiculo) {
        return strategy.calcularIPVA(veiculo);
    }

}
