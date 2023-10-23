package devpen.app.web;

import devpen.app.client.CompileServiceClient;
import devpen.app.model.CompiledHtml;
import devpen.app.model.RawHtml;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/compile")
public class CompileController {

    private final CompileServiceClient compileServiceClient;

    public CompileController(final CompileServiceClient compileServiceClient) {
        this.compileServiceClient = compileServiceClient;
    }

    @PostMapping("/html")
    public CompiledHtml compileHtml(@RequestBody RawHtml rawHtml) {
        return compileServiceClient.compileHtml(rawHtml);
    }

    @GetMapping("/test")
    public CompiledHtml comp() {
        return compileHtml(new RawHtml());
    }

    @GetMapping("/stringTest")
    public String stringTest() {
        return compileServiceClient.stringTest();
    }

}
