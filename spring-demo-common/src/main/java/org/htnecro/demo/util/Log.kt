package org.htnecro.demo.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
fun log(any: Any): Logger = LoggerFactory.getLogger(any.javaClass)