package org.htnecro.demo.mapper

import org.htnecro.demo.AbstractTest
import org.htnecro.demo.constant.OrderStatus
import org.htnecro.demo.meta.Order
import org.testng.annotations.Test
import java.util.*
import javax.annotation.Resource

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
class OrderMapperTest : AbstractTest() {

    @Resource
    private lateinit var orderMapper: OrderMapper

    @Test
    fun insert() {
        val order = Order()
        order.userId = 1
        order.orderNo = "201708210001"
        order.orderTime = Calendar.getInstance().time
        order.status = OrderStatus.NEW
        orderMapper.insert(order)
    }

    @Test
    fun findById() {

    }

    @Test
    fun findAll() {

    }

}