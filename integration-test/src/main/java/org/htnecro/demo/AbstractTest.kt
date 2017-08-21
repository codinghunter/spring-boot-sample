package org.htnecro.demo

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@SpringBootTest(classes = arrayOf(IntegrationTest::class))
@ActiveProfiles("integration-test")
class AbstractTest : AbstractTransactionalTestNGSpringContextTests()