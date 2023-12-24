package SPStrategy;
import Strategy.Strategy;
import Strategy.Veiculo;

public abstract class SPStrategy implements Strategy {

    @Override
    public double calcularIPVA(Veiculo veiculo) {
        if(2023 - veiculo.getAnoFabricacao() >19){
            return calcularImposto(veiculo);
        }
        return 0;
    }

    public abstract double calcularImposto(Veiculo veiculo);
    
}
