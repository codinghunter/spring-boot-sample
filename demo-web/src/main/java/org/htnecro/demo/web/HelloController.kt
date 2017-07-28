package org.htnecro.demo.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@RestController
class HelloController {

    @RequestMapping("/hello")
    fun say(): String {
        return "Hello Spring Boot!"
    }
}