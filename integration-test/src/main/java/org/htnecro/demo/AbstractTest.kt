package org.htnecro.demo

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@SpringBootTest(classes = arrayOf(ApplicationTest::class))
class AbstractTest : AbstractTestNGSpringContextTests()