package devpen.compile.web;

import devpen.compile.CompileMicroservice;
import devpen.compile.model.CompiledHtml;
import devpen.compile.model.RawHtml;
import devpen.compile.service.CompileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/compile")
public class CompileController {

    @Autowired private CompileService compileService;

    // TODO: figure out if 2 microservices which communicate should be sharing model (& if yes, how?)
    // https://blog.scottlogic.com/2016/06/13/code-reuse-in-microservices-architecture.html
    @PostMapping("/html")
    public CompiledHtml compileHtml(@RequestBody RawHtml rawHtml) {
        return compileService.compileHtml(rawHtml);
    }

    @PostMapping("stringTest")
    public String test(@RequestBody String request) {
        return "request received: " + request;
    }

}
