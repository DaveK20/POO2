import ESStrategy.ESStrategyDemaisEstados;
import ESStrategy.ESStrategyOnibusCaminhaoMotocicleta;
import MGStrategy.MGSrategyMotocicletaTransportePublico;
import MGStrategy.MGSrategyVeiculoCarga;
import MGStrategy.MGStrategyDemaisVeiculos;
import MGStrategy.MGStrategyLocadoraOnibusCaminhao;
import RJStrategy.RJStrategyCaminhaoTratorTaxi;
import RJStrategy.RJStrategyGasHibrido;
import RJStrategy.RJStrategyMotosOnibusAlchool;
import RJStrategy.RJStrategyTransporteCarga;
import SPStrategy.SPStrategyCaminhao;
import SPStrategy.SPStrategyDemaisVeiculos;
import SPStrategy.SPStrategyLocadora;
import SPStrategy.SPStrategyMotocicletaOnibus;
import Strategy.CalculadoraIPVA;
import Strategy.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo();

        veiculo.setAnoFabricacao(1995);
        veiculo.setTipo("Transporte Carga");
        veiculo.setCombustivel("Gas");
        veiculo.setEstado("ES");
        veiculo.setPessoa("Juridica");
        veiculo.setValor(580000);

        CalculadoraIPVA calculadora;

        if (veiculo.getEstado().equals("RJ")) {
            if (2023 - veiculo.getAnoFabricacao() < 4 && veiculo.getPessoa().equals("Juridica")) {
                calculadora = new CalculadoraIPVA(new RJStrategyCaminhaoTratorTaxi());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Caminhao") || veiculo.getTipo().equals("Trator")
                    || veiculo.getTipo().equals("Taxi")) {
                calculadora = new CalculadoraIPVA(new RJStrategyCaminhaoTratorTaxi());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getCombustivel().equals("Gas") || veiculo.getTipo().equals("Hibrido")) {
                calculadora = new CalculadoraIPVA(new RJStrategyGasHibrido());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Motos") || veiculo.getTipo().equals("Onibus")
                    || veiculo.getCombustivel().equals("Alchool")) {
                calculadora = new CalculadoraIPVA(new RJStrategyMotosOnibusAlchool());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Transporte carga")) {
                calculadora = new CalculadoraIPVA(new RJStrategyTransporteCarga());
                System.out.println(calculadora.calcular(veiculo));
            } else if (!veiculo.getTipo().equals("Caminhao") &&
                    !veiculo.getTipo().equals("Trator") &&
                    !veiculo.getTipo().equals("Taxi") &&
                    !veiculo.getTipo().equals("Transporte carga") &&
                    !veiculo.getTipo().equals("Moto") &&
                    !veiculo.getTipo().equals("Onibus") &&
                    !veiculo.getCombustivel().equals("gas") &&
                    !veiculo.getCombustivel().equals("Hibrido") &&
                    (2023 - veiculo.getAnoFabricacao() > 3)) {
                calculadora = new CalculadoraIPVA(new SPStrategyDemaisVeiculos());
                System.out.println(calculadora.calcular(veiculo));
            }

        } else if (veiculo.getEstado().equals("SP")) {
            if (!veiculo.getTipo().equals("Locadora") &&
                    !veiculo.getTipo().equals("Caminhao") &&
                    !veiculo.getTipo().equals("Motocicleta") &&
                    !veiculo.getTipo().equals("Onibus")) {
                calculadora = new CalculadoraIPVA(new SPStrategyDemaisVeiculos());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Locadora")) {
                calculadora = new CalculadoraIPVA(new SPStrategyLocadora());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Caminhao")) {
                calculadora = new CalculadoraIPVA(new SPStrategyCaminhao());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Motocicleta") ||
                    veiculo.getTipo().equals("Onibus")) {
                calculadora = new CalculadoraIPVA(new SPStrategyMotocicletaOnibus());
                System.out.println(calculadora.calcular(veiculo));
            }

        } else if (veiculo.getEstado().equals("MG")) {
            if (!veiculo.getTipo().equals("Locadora") &&
                    !veiculo.getTipo().equals("Onibus") &&
                    !veiculo.getTipo().equals("Caminhao")
                    &&
                    !veiculo.getTipo().equals("Transporte publico")
                    &&
                    !veiculo.getTipo().equals("Transporte carga")) {
                calculadora = new CalculadoraIPVA(new MGStrategyDemaisVeiculos());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Locadora") ||
                    veiculo.getTipo().equals("Onibus") ||
                    veiculo.getTipo().equals("Caminhao")) {
                calculadora = new CalculadoraIPVA(new MGStrategyLocadoraOnibusCaminhao());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Motocicleta") ||
                    veiculo.getTipo().equals("Transporte publico")) {
                calculadora = new CalculadoraIPVA(new MGSrategyMotocicletaTransportePublico());
                System.out.println(calculadora.calcular(veiculo));
            } else if (veiculo.getTipo().equals("Veiculo carga")) {
                calculadora = new CalculadoraIPVA(new MGSrategyVeiculoCarga());
                System.out.println(calculadora.calcular(veiculo));
            }

        } else if (veiculo.getEstado().equals("ES")) {
            if (veiculo.getTipo().equals("Onibus") ||
                    veiculo.getTipo().equals("Caminhao") ||
                    veiculo.getTipo().equals("Motocicleta")) {
                calculadora = new CalculadoraIPVA(new ESStrategyOnibusCaminhaoMotocicleta());
                System.out.println(calculadora.calcular(veiculo));
            } else {
                calculadora = new CalculadoraIPVA(new ESStrategyDemaisEstados());
                System.out.println(calculadora.calcular(veiculo));
            }
        }

    }
}
