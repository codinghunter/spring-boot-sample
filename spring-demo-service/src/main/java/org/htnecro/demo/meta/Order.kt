package org.htnecro.demo.meta

import org.htnecro.demo.constant.OrderStatus
import java.util.*

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
class Order {
    var id: Long? = null
    var userId: Long? = null
    var orderNo: String? = null
    var orderTime: Date? = null
    var status: OrderStatus? = null
    var createTime: Date? = null
    var updateTime: Date? = null
}