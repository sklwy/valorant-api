package br.com.vault.valorant.service

import br.com.vault.valorant.domain.Account
import br.com.vault.valorant.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountServiceImpl(private val accountRepository: AccountRepository) : AccountService {

    override fun getAllAccounts(): List<Account> {
        return accountRepository.findAll()
    }
}