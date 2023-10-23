package devpen.app.client;

import devpen.app.model.CompiledHtml;
import devpen.app.model.RawHtml;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class CompileServiceClient {

    private final String compilerServiceUri;
    private final RestTemplate restTemplate;

    public CompileServiceClient(final String compilerServiceUri,
                                final RestTemplate restTemplate) {

        this.compilerServiceUri = compilerServiceUri;
        this.restTemplate = restTemplate;
    }

    public CompiledHtml compileHtml(RawHtml htmlInput) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<RawHtml> request = new HttpEntity<>(htmlInput, headers);

        return restTemplate.postForObject(compilerServiceUri + "/html", request, CompiledHtml.class);
    }

    public String stringTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>("ayo", headers);

        return restTemplate.postForObject(compilerServiceUri + "/stringTest", request, String.class);
    }

}
