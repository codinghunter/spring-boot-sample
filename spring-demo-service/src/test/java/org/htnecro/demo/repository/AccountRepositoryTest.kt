package org.htnecro.demo.repository

import org.htnecro.demo.AbstractTest
import org.htnecro.demo.meta.Account
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import javax.inject.Inject

class AccountRepositoryTest : AbstractTest() {
    @Inject
    private lateinit var accountRepository: AccountRepository

    @BeforeMethod
    fun init() {
        val account = Account()
        account.name = "测试"
        account.available = true
        accountRepository.save(account)
    }

    @Test
    fun test() {
        val account = accountRepository.findById(1)
        if (account.isPresent) {
            val a = account.get()
            a.name = "test"
            accountRepository.save(a)
        }
    }

}