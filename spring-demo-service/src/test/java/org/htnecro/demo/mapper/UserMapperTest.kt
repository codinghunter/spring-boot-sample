package org.htnecro.demo.mapper

import org.htnecro.demo.AbstractTest
import org.htnecro.demo.meta.User
import org.testng.annotations.Test
import javax.annotation.Resource

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
class UserMapperTest : AbstractTest() {

    @Resource
    private lateinit var userMapper: UserMapper

    @Test
    fun insert() {
        val user = User()
        user.name = "测试"
        user.available = true
        userMapper.insert(user)
    }
}