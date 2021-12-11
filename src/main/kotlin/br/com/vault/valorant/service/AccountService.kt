package br.com.vault.valorant.service

import br.com.vault.valorant.domain.Account

interface AccountService {

    fun getAllAccounts(): List<Account>
}