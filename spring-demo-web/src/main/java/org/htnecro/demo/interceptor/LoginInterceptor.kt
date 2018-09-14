package org.htnecro.demo.interceptor

import org.htnecro.demo.util.log
import org.springframework.stereotype.Component
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@Component
class LoginInterceptor : HandlerInterceptorAdapter() {

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        log(this).info("Login interceptor")
        return super.preHandle(request, response, handler)
    }

}