package conversor;

import com.google.gson.Gson;
import modelos.ApiResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConversorDeMoedas {

    public void conversaoDolarParaPesoArgentino(double valor) throws IOException, InterruptedException {
        double taxa = obterTaxaDeCambio("USD", "ARS");
        System.out.println("Coversão de Dólar para Peso argentino: " + (valor * taxa) + " ARS");
    }

    public void conversaoPesoArgentinoParaDolar(double valor) throws IOException, InterruptedException {
        double taxa = obterTaxaDeCambio("ARS", "USD");
        System.out.println("Conversão de Peso argentino para Dólar: " + (valor * taxa) + " USD");
    }

    public void conversaoDolarParaReal(double valor) throws IOException, InterruptedException {
        double taxa = obterTaxaDeCambio("USD", "BRL");
        System.out.println("Conversão de Dólar para Real: " + (valor * taxa) + " BRL");
    }

    public void conversaoRealParaDolar(double valor) throws IOException, InterruptedException {
        double taxa = obterTaxaDeCambio("BRL", "USD");
        System.out.println("Conversão de Real para Dólar: " + (valor * taxa) + " USD");
    }

    public void conversaoDolarParaPesoColombiano(double valor) throws IOException, InterruptedException {
        double taxa = obterTaxaDeCambio("USD", "COP");
        System.out.println("Conversão de Dólar para Peso colombiano: " + (valor * taxa) + " COP");
    }

    public void conversaoPesoColombianoParaDolar(double valor) throws IOException, InterruptedException {
        double taxa = obterTaxaDeCambio("COP", "USD");
        System.out.println("Conversão de Peso colombiano para Dólar: " + (valor * taxa) + " USD");
    }

    public double obterTaxaDeCambio(String moedaOrigem, String moedaDestino) throws IOException, InterruptedException {
        String apiKey = ConfigLoader.getApiKey();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey +"/latest/" + moedaOrigem))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);

        switch (moedaDestino) {
            case "ARS": return apiResponse.conversion_rates.ARS;
            case "BRL": return apiResponse.conversion_rates.BRL;
            case "COP": return apiResponse.conversion_rates.COP;
            case "USD": return apiResponse.conversion_rates.USD;
            default:
                System.out.println("Moeda não suportada!");
                return 0.0;
        }
    }
}