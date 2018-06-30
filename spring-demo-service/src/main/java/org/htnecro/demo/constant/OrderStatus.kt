package org.htnecro.demo.constant

/**
 *
 *
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
enum class OrderStatus(
        private val value: Int,
        private val display: String
) : IntValueEnum {

    NEW(100, "新建"),
    PRINT_LIST(200, "打单"),
    PICKING_COMPLETE(300, "拣货"),
    PACKAGING_COMPLETE(400, "打包"),
    WEIGHING_COMPLETE(500, "称重"),
    CANCELED(999, "取消");

    override fun intValue(): Int {
        return value
    }

    override fun toString(): String {
        return display
    }

}