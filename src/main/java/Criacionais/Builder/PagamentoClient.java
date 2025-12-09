package Criacionais.Builder;

import java.util.HashMap;
import java.util.Map;

public class PagamentoClient {

    public void criarPagamento() {

        // Headers hard coded
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer TOKEN_123");
        headers.put("Content-Type", "application/json");
        headers.put("X-Request-Id", "abc-123");

        // Query params hard coded
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("origem", "mobile");
        queryParams.put("versao", "2");

        // Body simulado (JSON)
        String body = """
            {
               "valor": 199.90,
               "moeda": "BRL",
               "clienteId": 42,
               "parcelas": 3
            }
        """;


        HttpRequest request = new HttpRequest.BuilderClass().setUrl("https://api.externa.com/v1/pagamentos").setBody(body).build();
        enviar(request);




    }

    private void enviar(HttpRequest request) {
        System.out.println("Enviando request HTTP...");
        // Simulação de envio
    }

}
