package org.htnecro.demo.mapper

import org.apache.ibatis.annotations.Mapper
import org.htnecro.demo.meta.User

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@Mapper
interface UserMapper {

    fun findById(id: Long): User

    fun listAll(): List<User>
}