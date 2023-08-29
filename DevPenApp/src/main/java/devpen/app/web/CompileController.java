package devpen.app.web;

import devpen.app.client.CompileServiceClient;
import devpen.app.model.CompiledHtml;
import devpen.app.model.RawHtml;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/compile")
public class CompileController {

    private CompileServiceClient compileServiceClient = new CompileServiceClient("http://localhost/8081");

    @PostMapping("/html")
    public CompiledHtml compileHtml(@RequestBody RawHtml rawHtml) {
        return compileServiceClient.compileHtml(rawHtml);
    }

}
