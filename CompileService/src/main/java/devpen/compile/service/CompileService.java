package devpen.compile.service;

import ch.qos.logback.classic.Logger;
import devpen.compile.model.CompiledHtml;
import devpen.compile.model.RawHtml;
import org.springframework.stereotype.Service;

@Service
public class CompileService {

    public CompiledHtml compileHtml(RawHtml rawHtml) {
        // TODO: compile here & return
        System.out.println("Compiling raw html");
        return new CompiledHtml();
    }

}
