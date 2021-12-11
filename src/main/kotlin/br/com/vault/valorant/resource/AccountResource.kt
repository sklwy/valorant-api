package br.com.vault.valorant.resource

import br.com.vault.valorant.domain.Account
import br.com.vault.valorant.service.AccountServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(name = "/v1/api/account")
class AccountResource(private val accountService: AccountServiceImpl) {

    @GetMapping
    fun getAllAccounts(): List<Account> {
        return accountService.getAllAccounts()
    }
}