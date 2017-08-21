package org.htnecro.demo.web

import org.htnecro.demo.mapper.OrderMapper
import org.htnecro.demo.mapper.UserMapper
import org.htnecro.demo.meta.Order
import org.htnecro.demo.meta.User
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@RestController
@RequestMapping("/users")
class UserController {

    @Resource
    private lateinit var userMapper: UserMapper

    @Resource
    private lateinit var orderMapper: OrderMapper

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun list(): List<User> {
        return userMapper.listAll()
    }
    
    @RequestMapping("/{userId}/orders", method = arrayOf(RequestMethod.GET))
    fun listOrder(@PathVariable userId: Long): List<Order> {
        return orderMapper.listByUserId(userId)
    }

}