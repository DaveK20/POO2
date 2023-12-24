package MGStrategy;

import Strategy.Veiculo;

public class MGSrategyMotocicletaTransportePublico extends MGStrategy{
    public double calcularImposto(Veiculo veiculo){
        return veiculo.getValor() * 0.02;
    }
}
