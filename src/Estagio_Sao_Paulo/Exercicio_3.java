package Estagio_Sao_Paulo;

/* Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;*/

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio_3 {

    public static List<Double> carregarDados(String caminhoArquivo) {
        List<Double> faturamento = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(caminhoArquivo));

            JSONArray faturamentoDiario = (JSONArray) jsonObject.get("faturamento_diario");
            for (Object o : faturamentoDiario) {
                JSONObject diaFaturamento = (JSONObject) o;
                Double valor = (Double) diaFaturamento.get("faturamento");
                if (valor > 0) {
                    faturamento.add(valor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return faturamento;
    }

    public static void calcularFaturamento(List<Double> faturamento) {

        Double menorFaturamento = Collections.min(faturamento);
        Double maiorFaturamento = Collections.max(faturamento);

        Double soma = faturamento.stream().mapToDouble(Double::doubleValue).sum();
        Double mediaMensal = soma / faturamento.size();

        long diasAcimaMedia = faturamento.stream().filter(valor -> valor > mediaMensal).count();

        System.out.println("Menor faturamento: R$ " + String.format("%.2f", menorFaturamento));
        System.out.println("Maior faturamento: R$ " + String.format("%.2f", maiorFaturamento));
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }

    public static void main(String[] args) {

        String caminhoArquivo = "Dados.json";

        List<Double> faturamento = carregarDados(caminhoArquivo);

        calcularFaturamento(faturamento);
    }
}
