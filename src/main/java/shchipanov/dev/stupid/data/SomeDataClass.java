package shchipanov.dev.stupid.data;

import lombok.Data;
import reactor.core.publisher.Mono;

@Data
public class SomeDataClass {

    private String dummy;

    Mono<String> getSome() {
        return Mono.empty();
    }
}
