public class CalculadoraJurosCompostosTempo {

    public static void main(String[] args) {
        double valorAcumulado = 10000.0;
        double taxaJurosMenasl = 0.8;
        int periodoEmMeses = 12;

        for(int mes = 1; mes <= periodoEmMeses; mes++){
            valorAcumulado += valorAcumulado * taxaJurosMenasl / 100;

            System.out.println("Mês : " + mes + " Valor acumulado: " + valorAcumulado);
        }
        System.out.println("Valor acumulado total: " + valorAcumulado);
    }
}
