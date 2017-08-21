package org.htnecro.demo

import org.htnecro.demo.interceptor.LoginInterceptor
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.transaction.annotation.EnableTransactionManagement
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import javax.annotation.Resource

@EnableAsync
@EnableTransactionManagement
@SpringBootApplication
class Application : WebMvcConfigurerAdapter() {

    @Resource
    lateinit var loginInterceptor: LoginInterceptor

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(loginInterceptor)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
