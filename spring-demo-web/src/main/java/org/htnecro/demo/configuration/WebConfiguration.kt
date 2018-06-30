package org.htnecro.demo.configuration

import org.htnecro.demo.interceptor.LoginInterceptor
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import javax.annotation.Resource

@Configuration
class WebConfiguration : WebMvcConfigurer {

    @Resource
    lateinit var loginInterceptor: LoginInterceptor

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(loginInterceptor)
    }

}