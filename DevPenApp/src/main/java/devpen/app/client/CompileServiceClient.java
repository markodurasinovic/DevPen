package devpen.app.client;

import devpen.app.model.CompiledHtml;
import devpen.app.model.RawHtml;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class CompileServiceClient {

    private final String URI;

    public CompileServiceClient(String URI) {
        this.URI = URI;
    }

    public CompiledHtml compileHtml(RawHtml htmlInput) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URI + "/html", CompiledHtml.class);
    }

}
