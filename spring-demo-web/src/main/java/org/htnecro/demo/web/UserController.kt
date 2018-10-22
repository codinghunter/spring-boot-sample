package org.htnecro.demo.web

import org.htnecro.demo.meta.Order
import org.htnecro.demo.meta.User
import org.htnecro.demo.service.UserOrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@RestController
@RequestMapping("/users")
class UserController {

    @Inject
    private lateinit var userOrderService: UserOrderService

    @GetMapping
    fun list(): List<User> {
        return userOrderService.listAllUser()
    }

    @GetMapping("/{userId}/orders")
    fun listOrder(@PathVariable userId: Long): List<Order> {
        return userOrderService.listOrderByUser(userId)
    }

}