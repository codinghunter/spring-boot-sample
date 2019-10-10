package org.htnecro.demo.meta

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var name: String? = null
    var password: String? = null
    var available: Boolean? = null
    var createTime: Date? = null
    var updateTime: Date? = null
}