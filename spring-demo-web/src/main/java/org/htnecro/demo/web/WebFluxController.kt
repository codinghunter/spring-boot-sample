package org.htnecro.demo.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@RestController
class WebFluxController {

    @RequestMapping("/flux/hello")
    fun webFlux(): Mono<String> {
        return Mono.just("Hello WebFlux")
    }

}