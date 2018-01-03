package org.htnecro.demo.interceptor

import org.springframework.stereotype.Component
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@Component
class LoginInterceptor : HandlerInterceptorAdapter()