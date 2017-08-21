package org.htnecro.demo.mapper

import org.apache.ibatis.annotations.Mapper
import org.htnecro.demo.meta.Order

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@Mapper
interface OrderMapper {

    fun insert(order: Order)

    fun findById(id: Long): Order

    fun listByUserId(userId: Long): List<Order>
}