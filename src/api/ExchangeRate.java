package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ExchangeRate {

	public static Double main(String base_code, String target_code) throws IOException, InterruptedException {
		
		String apiKey;
		String API_BASE_URL;

		apiKey = "YOUR-API-KEY"; // YOUR-API-KEY
		API_BASE_URL = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base_code + "/" + target_code;
		
		String apiUrl = API_BASE_URL;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String json = response.body();

                // Use Gson para converter o JSON em objetos Java
                Gson gson = new Gson();
                MyResponseObject responseObject = gson.fromJson(json, MyResponseObject.class);
                Double conversionRate = responseObject.getConversion_rate();
                
                return conversionRate;
            } else {
                System.err.println("Erro na resposta: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
		return null;
        
        
	}
}

