package org.htnecro.demo

import org.htnecro.demo.mapper.OrderMapper
import org.testng.annotations.Test
import javax.annotation.Resource


class ApplicationTests : AbstractTest() {

	@Resource
	private lateinit var orderMapper : OrderMapper

	@Test
	fun contextLoads() {
        println(orderMapper)
	}

}
