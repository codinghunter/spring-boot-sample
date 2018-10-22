package org.htnecro.demo.service.impl

import org.htnecro.demo.mapper.OrderMapper
import org.htnecro.demo.mapper.UserMapper
import org.htnecro.demo.meta.Order
import org.htnecro.demo.meta.User
import org.htnecro.demo.service.UserOrderService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.inject.Inject

@Service
class UserOrderServiceImpl : UserOrderService {

    @Inject
    private lateinit var userMapper: UserMapper

    @Inject
    private lateinit var orderMapper: OrderMapper

    @Transactional
    override fun listAllUser(): List<User> {
        return userMapper.listAll()
    }

    @Transactional
    override fun listOrderByUser(userId: Long): List<Order> {
        return orderMapper.listByUserId(userId)
    }

}