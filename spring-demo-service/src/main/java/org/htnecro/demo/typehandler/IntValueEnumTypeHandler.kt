package org.htnecro.demo.typehandler

import org.apache.ibatis.type.BaseTypeHandler
import org.apache.ibatis.type.JdbcType
import org.htnecro.demo.constant.IntValueEnum
import java.sql.CallableStatement
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException
import java.util.HashMap

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
class IntValueEnumTypeHandler<E : Enum<E>>(type: Class<E>?) : BaseTypeHandler<E>() {

    private val map = HashMap<Int, E>()

    init {
        if (type == null) throw IllegalArgumentException("Type argument cannot be null")

        val enums = type.enumConstants ?: throw IllegalArgumentException(type.simpleName + " does not represent an enum type.")
        for (e in enums) {
            val intValueEnum = e as IntValueEnum
            map.put(intValueEnum.intValue(), e)
        }
    }

    @Throws(SQLException::class)
    override fun setNonNullParameter(ps: PreparedStatement, i: Int, parameter: E?, jdbcType: JdbcType?) {
        val valuedEnum = parameter as IntValueEnum
        ps.setInt(i, valuedEnum.intValue())
    }

    @Throws(SQLException::class)
    override fun getNullableResult(rs: ResultSet, columnName: String): E? {
        val value = rs.getInt(columnName)
        return if (rs.wasNull()) {
            null
        } else {
            map[value]
        }
    }

    @Throws(SQLException::class)
    override fun getNullableResult(rs: ResultSet, columnIndex: Int): E? {
        val value = rs.getInt(columnIndex)
        return if (rs.wasNull()) {
            null
        } else {
            map[value]
        }
    }

    @Throws(SQLException::class)
    override fun getNullableResult(cs: CallableStatement, columnIndex: Int): E? {
        val value = cs.getInt(columnIndex)
        return if (cs.wasNull()) {
            null
        } else {
            map[value]
        }
    }

}