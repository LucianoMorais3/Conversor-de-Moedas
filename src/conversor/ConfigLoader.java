package conversor;

public class ConfigLoader {
    public static String getApiKey() {
        String apiKey = System.getenv("EXCHANGE_API_KEY");
        if (apiKey == null) {
            throw new RuntimeException("Erro: Chave da API não encontrada! Verifique se a variável EXCHANGE_API_KEY está configurada.");
        }
        return apiKey;
    }
}
