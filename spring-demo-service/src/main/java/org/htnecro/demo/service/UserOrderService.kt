package org.htnecro.demo.service

import org.htnecro.demo.meta.Order
import org.htnecro.demo.meta.User

interface UserOrderService {

    fun listAllUser(): List<User>

    fun listOrderByUser(userId: Long): List<Order>

}