public class CalculadoraJurosCompostosMeta {

    public static void main(String[] args) {
        double valorAcumulado = 10000.0;
        double taxaJurosMenasl = 0.8;
        double valorMeta = 20000.0;
        int mes = 0;

        while (valorAcumulado < valorMeta){
            mes++;

            valorAcumulado += valorAcumulado * taxaJurosMenasl / 100;
            System.out.println("Mês : " + mes + " Valor acumulado: " + valorAcumulado);
        }

    }
}
