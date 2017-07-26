package org.htnecro.demo.web.restful

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@RestController
class Hello {

    @RequestMapping("/hello")
    fun say(): String {
        return "Hello SpringBoot!"
    }
}