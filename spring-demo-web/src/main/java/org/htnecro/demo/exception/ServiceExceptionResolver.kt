package org.htnecro.demo.exception

import org.springframework.stereotype.Component
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@Component
class ServiceExceptionResolver : AbstractHandlerExceptionResolver() {

    override fun doResolveException(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception): ModelAndView {
        // TODO do resolve
        return ModelAndView()
    }

}