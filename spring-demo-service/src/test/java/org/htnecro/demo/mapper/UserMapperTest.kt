package org.htnecro.demo.mapper

import org.htnecro.demo.AbstractTest
import org.htnecro.demo.meta.User
import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import javax.inject.Inject

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
class UserMapperTest : AbstractTest() {

    @Inject
    private lateinit var userMapper: UserMapper

    @BeforeMethod
    fun init(){
        val user = User()
        user.name = "测试"
        user.isAvailable = true
        userMapper.insert(user)
    }

    @Test
    fun insert() {
        val user = User()
        user.name = "测试1"
        user.isAvailable = true
        userMapper.insert(user)

        val exist = userMapper.findById(user.id!!)
        Assert.assertNotNull(exist)
        Assert.assertEquals(exist.name, "测试1")
        Assert.assertEquals(exist.isAvailable, true)
    }

    @Test
    fun listAll(){
        val users = userMapper.listAll()
        Assert.assertEquals(users.size, 1)
    }
}